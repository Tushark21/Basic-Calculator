package matrixmultiplication;

import java.util.Scanner;

class MatrixMultiplication extends Thread {

    static int matrix1[][];
    static int matrix2[][];
    static int result[][];
    static int n = 3;
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

    public static void main(String args[]) {

        int i, j;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the order of Matrix:\n");
        n = input.nextInt();

        matrix1 = new int[n][n];
        matrix2 = new int[n][n];
        result = new int[n][n];

        System.out.println("Enter the First Matrix:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the Second Matrix:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        MatrixMultiplication mat[] = new MatrixMultiplication[n];

        long tim;
        tim = System.currentTimeMillis();

        try {
            for (i = 0; i < n; i++) {
                mat[i] = new MatrixMultiplication(i);
                mat[i].join();
            }
        } catch (InterruptedException e) {
        }

        String output;

        System.out.println("Multiplication of Matrices (Threads):");
        for (i = 0; i < n; i++) {
            output = "";
            for (j = 0; j < n; j++) {
                output += result[i][j] + "  ";
            }
            System.out.println(output);
        }
        System.out.println("Time Required for Multiplication (Threads): " + (System.currentTimeMillis() - tim) + " miliseconds.\n");

        tim = System.currentTimeMillis();

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                result[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    result[i][j] = result[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Multiplication of Matrices (Normal):");
        for (i = 0; i < n; i++) {
            output = "";
            for (j = 0; j < n; j++) {
                output += result[i][j] + "  ";
            }
            System.out.println(output);
        }
        System.out.println("Time Required for Multiplication (Normal): " + (System.currentTimeMillis() - tim) + " miliseconds.");
    }
}
