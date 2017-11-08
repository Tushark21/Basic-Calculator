package matrixmultiplication;

import java.util.Scanner;

public class MatrixMultiplication extends Thread {

    static int matrix1[][];
    static int matrix2[][];
    static int result[][];
    static int n = 3;
    static Scanner input = new Scanner(System.in);

    int row;

    MatrixMultiplication(int i) {
        row = i;
        this.start();

    }

    @Override
    public void run() {
        int i, j;
        for (i = 0; i < n; i++) {
            result[row][i] = 0;
            for (j = 0; j < n; j++) {
                result[row][i] = result[row][i] + matrix1[row][j] * matrix2[j][i];
            }
        }
    }

    //Generate Matrix Automatically
    private static void generate() {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = (int) (Math.random() * 10);
            }
        }

    }

    //Input Matrix Manually
    private static void inputManually() {

        System.out.println("\nEnter the First Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("\nEnter the Second Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
    }

    public static void main(String args[]) {

        int i, j;
        System.out.print("Enter the order of Matrix:\n");
        n = input.nextInt();

        matrix1 = new int[n][n];
        matrix2 = new int[n][n];
        result = new int[n][n];

        System.out.println("\n1.Generate Matrices Automatically\n2.Input Matrices Manually");
        int sel = input.nextInt();

        switch (sel) {
            case 1:
                generate();
                break;
            case 2:
                inputManually();
                break;
            default:
                System.out.println("Wrong Selection\n");
        }

        long tim;
        tim = System.currentTimeMillis();

        MatrixMultiplication mat[] = new MatrixMultiplication[n];

        try {
            for (i = 0; i < n; i++) {
                mat[i] = new MatrixMultiplication(i);
                mat[i].join();
            }
        } catch (InterruptedException e) {
        }

        String output;

        System.out.println("\nMultiplication of Matrices (Threads):");
        for (i = 0; i < n; i++) {
            output = "";
            for (j = 0; j < n; j++) {
                output += result[i][j] + "  ";
            }
            System.out.println(output);
        }

        long threadTime = System.currentTimeMillis() - tim;

        tim = System.currentTimeMillis();

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                result[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    result[i][j] = result[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("\nMultiplication of Matrices (Normal):");
        for (i = 0; i < n; i++) {
            output = "";
            for (j = 0; j < n; j++) {
                output += result[i][j] + "  ";
            }
            System.out.println(output);
        }
        
        long normalTime = System.currentTimeMillis() - tim;

        System.out.println("\nTime Required for Multiplication (Thread): " + threadTime + " milliseconds.");
        System.out.println("Time Required for Multiplication (Normal): " + normalTime + " milliseconds.");
    }
}
