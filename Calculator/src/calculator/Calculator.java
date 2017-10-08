package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends Frame implements ActionListener {
    
    public int f=0,k=0;
    public long o[] = {0,0},r;
    public String c = "",r1 = "";
    public JTextField t1;
    public JButton a[][] = new JButton[4][4];
    java.net.URL logoUrl = getClass().getResource("logo.jpg");
    Font font = new Font("verdana", Font.PLAIN, 20);
    
    public Calculator() {
        
        setResizable(false);
        setTitle("CALCULATOR");
        setSize(220,280);
        setLayout(null);
        setLocation(100,100);
        setIconImage(Toolkit.getDefaultToolkit().getImage(logoUrl));

        t1 = new JTextField();
        t1.setBounds(10,28,200,40);
        t1.setFont(font);
        
        add(t1);
        
        a[0][3] = new JButton("C");
        a[1][3] = new JButton("0");
        a[2][3] = new JButton("/");
        a[3][3] = new JButton("=");
        
        a[3][0] = new JButton("+");
        a[3][1] = new JButton("-");
        a[3][2] = new JButton("X");   
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                
                if(j==0 && i!=3){
                a[i][j] = new JButton(""+(i+1));                
                }
                
                else if(j==1 && i!=3){
                a[i][j] = new JButton(""+(i+4));    
                }
                
                else if(j==2 && i!=3){
                a[i][j] = new JButton(""+(i+7));
                }       
                
                a[i][j].setBounds(10+(i*50),70+(j*50),50,50);
                add(a[i][j]);                
                
                a[i][j].addActionListener(this);
        
                addWindowListener(new WindowAdapter()
                {
                    @Override
                    public void windowClosing(WindowEvent we)
                    {
                        System.exit(0);
                    } 
                });
        
            }
        }               
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){                       
                //
                if(j==0 && i!=3){
                    
                    if(e.getSource() == a[i][j])
                    {                              
                        o[k] = (o[k]*10)+(i+1);                                        
                        t1.setText(""+c+o[k]);                        
                    }
                                
                }
                
                else if(j==1 && i!=3){
            
                    if(e.getSource() == a[i][j])
                    {                              
                        o[k] = (o[k]*10)+(i+4);                                        
                        t1.setText(""+c+o[k]);                        
                    }
                    
                }
                
                else if(j==2 && i!=3){
                  
                    if(e.getSource() == a[i][j])
                    {                              
                        o[k] = (o[k]*10)+(i+7);                                        
                        t1.setText(""+c+o[k]);                        
                    }                   
                }
                //
            }
        }
       
        if(e.getSource() == a[1][3]){            
            o[k] = (o[k]*10);                                        
            t1.setText(""+c+o[k]);                        
        }  
        
        //Del
        else if(e.getSource() == a[0][3]){            
            o[k]=o[k]/10;
            t1.setText(""+c+o[k]);                        
        }       
        
        else if(e.getSource() == a[3][0]){            
            
            a[3][0].setEnabled(false);
            a[3][1].setEnabled(false);
            a[3][2].setEnabled(false);
            a[2][3].setEnabled(false);
            
            t1.setText(""+o[0]+"+");  
            c = t1.getText();
            k=1;
            f=1; 
            o[k]=0;
        }
        
        else if(e.getSource() == a[3][1]){
            
            a[3][0].setEnabled(false);
            a[3][1].setEnabled(false);
            a[3][2].setEnabled(false);
            a[2][3].setEnabled(false);
            
            t1.setText(""+o[0]+"-");  
            c = t1.getText();
            k=1;
            f=2; 
            o[k]=0;
        }
        
        else if(e.getSource() == a[3][2]){
            
            a[3][0].setEnabled(false);
            a[3][1].setEnabled(false);
            a[3][2].setEnabled(false);
            a[2][3].setEnabled(false);
            
            t1.setText(""+o[0]+"x");  
            c = t1.getText();
            k=1;
            f=3; 
            o[k]=0;
        }
        
        else if(e.getSource() == a[2][3]){
            
            a[3][0].setEnabled(false);
            a[3][1].setEnabled(false);
            a[3][2].setEnabled(false);
            a[2][3].setEnabled(false);
            
            t1.setText(""+o[0]+"/");  
            c = t1.getText();
            k=1;
            f=4; 
            o[k]=0;
        }
        
        else if(e.getSource() == a[3][3]){
            
            a[3][0].setEnabled(true);
            a[3][1].setEnabled(true);
            a[3][2].setEnabled(true);
            a[2][3].setEnabled(true);

            switch (f) {
                case 1:                                                        
                    r = o[0]+o[1];                    
                    break;
                case 2:                            
                    r = o[0]-o[1];
                    break;
                case 3:                    
                    r = o[0]*o[1];
                    break;
                case 4:    
                    if(o[1] == 0){
                      
                        r1 = "Math Error";
                    }
                    
                    else{
                        r = o[0]/o[1];
                    }
                    break;
                default:
                    break;
            }
            
            t1.setText(""+((r1=="")?r:r1));
                        
            c = "";
            r1 = "";
            k = 0;
            f = 0;
            
            o[0] = 0;
            o[1] = 0;
            r=0;            
        }
                
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public static void main(String args[])
    {
        new Calculator().setVisible(true);
        
    }
}