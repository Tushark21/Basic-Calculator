package typing.tutor;


import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tushar
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    //Color bgColor=new Color(245, 245, 245);//light yellow(252, 231, 125);//light grey (245, 245, 245);//light blue(63, 193, 201);
    
    public MainFrame() {
        this.getContentPane().setBackground(Color.white);
        String path="C:\\Users\\Tushar\\Neatbeans Projects\\Typing Tutor\\src\\typing\\tutor\\background.jpg";
        Image img=Toolkit.getDefaultToolkit().getImage(path).getScaledInstance(480, 480, Image.SCALE_DEFAULT);
        ImageIcon image=new ImageIcon(img);
        this.setContentPane(new JLabel(image));
        
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Tushar\\Neatbeans Projects\\Typing Tutor\\src\\typing\\tutor\\icon.png"));
        
        practiceButton.setBackground(new Color(179, 0, 0));
        tutorialButton.setBackground(new Color(179, 0, 0));
        
        displayProgress();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        titleLabel1 = new javax.swing.JLabel();
        wordLabel = new javax.swing.JLabel();
        tutorialButton = new javax.swing.JButton();
        practiceButton = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        avgSpeedLabel = new javax.swing.JLabel();
        lastSpeedLabel = new javax.swing.JLabel();
        testLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Progress");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setForeground(new java.awt.Color(58, 128, 132));
        setLocation(new java.awt.Point(100, 20));
        setMaximumSize(new java.awt.Dimension(480, 480));
        setMinimumSize(new java.awt.Dimension(480, 480));
        setPreferredSize(new java.awt.Dimension(480, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(480, 480));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TYPING GURU");

        nameLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Hello User");

        titleLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        titleLabel1.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel1.setText("Your Progress:");

        wordLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        wordLabel.setForeground(new java.awt.Color(255, 255, 255));
        wordLabel.setText("Words");
        wordLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        tutorialButton.setBackground(new java.awt.Color(153, 0, 0));
        tutorialButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tutorialButton.setForeground(new java.awt.Color(255, 255, 255));
        tutorialButton.setText("Tutorials");
        tutorialButton.setBorder(null);
        tutorialButton.setBorderPainted(false);
        tutorialButton.setFocusPainted(false);
        tutorialButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tutorialButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tutorialButtonMouseExited(evt);
            }
        });
        tutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorialButtonActionPerformed(evt);
            }
        });

        practiceButton.setBackground(new java.awt.Color(255, 51, 0));
        practiceButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        practiceButton.setForeground(new java.awt.Color(255, 255, 255));
        practiceButton.setText("Practice");
        practiceButton.setBorder(null);
        practiceButton.setFocusPainted(false);
        practiceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                practiceButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                practiceButtonMouseExited(evt);
            }
        });
        practiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practiceButtonActionPerformed(evt);
            }
        });

        timeLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setText("Time");
        timeLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        avgSpeedLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        avgSpeedLabel.setForeground(new java.awt.Color(255, 255, 255));
        avgSpeedLabel.setText("Average Speed");
        avgSpeedLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lastSpeedLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lastSpeedLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastSpeedLabel.setText("Last Speed");
        lastSpeedLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        testLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        testLabel.setForeground(new java.awt.Color(255, 255, 255));
        testLabel.setText("Total Tests");
        testLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(wordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lastSpeedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(avgSpeedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                                    .addComponent(testLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(titleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 209, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tutorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(practiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(titleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(testLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastSpeedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avgSpeedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(practiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tutorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void practiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_practiceButtonActionPerformed
        // TODO add your handling code here:
        PracticeForm pF=new PracticeForm();
        pF.printPara();
        pF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_practiceButtonActionPerformed

    private void tutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorialButtonActionPerformed
        // TODO add your handling code here:
        
        Tutorials pF=new Tutorials();
        pF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tutorialButtonActionPerformed

    private void practiceButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_practiceButtonMouseEntered
        // TODO add your handling code here:
        practiceButton.setBackground(new Color(210, 0, 0));
    }//GEN-LAST:event_practiceButtonMouseEntered

    private void practiceButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_practiceButtonMouseExited
        // TODO add your handling code here:
        practiceButton.setBackground(new Color(179, 0, 0));
    }//GEN-LAST:event_practiceButtonMouseExited

    private void tutorialButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tutorialButtonMouseEntered
        // TODO add your handling code here:
        tutorialButton.setBackground(new Color(210, 0, 0));
    }//GEN-LAST:event_tutorialButtonMouseEntered

    private void tutorialButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tutorialButtonMouseExited
        // TODO add your handling code here:
        tutorialButton.setBackground(new Color(179, 0, 0));
    }//GEN-LAST:event_tutorialButtonMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
    
    void displayProgress(){
        Properties p=new Properties();
        
        FileReader reader = null;  
        try {
            reader = new FileReader("info.properties");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try { 
            p.load(reader);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        nameLabel.setText("Hello "+p.getProperty("name"));
        //System.out.println("namep"+p.getProperty("name"));
        //System.out.println(p.getProperty("name"));
        
        float avgSpeed=(float) 0.0;
        if(!p.getProperty("time").equals("0")){
            
            float timeTaken=(float) 0.0;
            String tempTime=formatTime(Long.parseLong(p.getProperty("time")));
            if(tempTime.length()>5){
                timeTaken=(float)Integer.parseInt(tempTime.substring(0,2))*60;
                timeTaken+=(float)Integer.parseInt(tempTime.substring(3,5));
                timeTaken+=(float)Integer.parseInt(tempTime.substring(6,8))/60;
            }
            else{
                timeTaken+=(float)Integer.parseInt(tempTime.substring(0,2));
                timeTaken+=(float)Integer.parseInt(tempTime.substring(3,5))/60;
            }
            //System.out.println("timeF="+tempTime);
            //System.out.println("time="+timeTaken);
            avgSpeed=((int)((float)Long.parseLong(p.getProperty("wordsN"))/timeTaken)*100)/100;
        }
        
        wordLabel.setText("Total Correct Words: "+p.getProperty("wordsN"));
        timeLabel.setText("Total Time: "+formatTime(Long.parseLong(p.getProperty("time"))));
        testLabel.setText("Total Tests: "+p.getProperty("testNum"));
        lastSpeedLabel.setText("Last Test Speed: "+p.getProperty("lastSpeed")+" wpm");
        avgSpeedLabel.setText("Average Speed: "+String.valueOf(avgSpeed)+" wpm");
        
        /*
        p.setProperty("wordsN", String.valueOf(0));
        p.setProperty("time", String.valueOf(0));
        p.setProperty("testNum", String.valueOf(0));
        p.setProperty("lastSpeed", String.valueOf(0));
        */
    }
    
    private String formatTime(long millis){
        long seconds=TimeUnit.MILLISECONDS.toSeconds(millis)%60;
        long minutes=TimeUnit.MILLISECONDS.toMinutes(millis)%60;
        long hours=TimeUnit.MILLISECONDS.toHours(millis)%60;
        
        String time="";
        
        if(hours>0){
            if(hours<10){
                time+="0"+hours+":";
            }
            else{
                time+=""+hours+":";
            }
        }
        
        if(minutes<10){
            time+="0"+minutes;
        }
        else{
            time+=""+minutes;
        }
        if(seconds<10){
            time+=":0"+seconds;
        }
        else{
            time+=":"+seconds;
        }
        
        return time;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avgSpeedLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lastSpeedLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton practiceButton;
    private javax.swing.JLabel testLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JButton tutorialButton;
    private javax.swing.JLabel wordLabel;
    // End of variables declaration//GEN-END:variables
}