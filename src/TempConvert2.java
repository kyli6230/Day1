
import javax.swing.JOptionPane;

public class TempConvert2 extends javax.swing.JFrame {
    double cel, far; 
 TempConvert2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fbox = new javax.swing.JTextField();
        cbox = new javax.swing.JTextField();
        ftocbtn = new javax.swing.JButton();
        ctofbtn = new javax.swing.JButton();
        answerbox = new javax.swing.JLabel();
        resetbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Enter Degrees Fahrenheit");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Enter Degrees Celsius");

        fbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fboxActionPerformed(evt);
            }
        });

        ftocbtn.setText(">>>>");
        ftocbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftocbtnActionPerformed(evt);
            }
        });

        ctofbtn.setText("<<<<");
        ctofbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctofbtnActionPerformed(evt);
            }
        });

        answerbox.setBackground(new java.awt.Color(204, 255, 255));
        answerbox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        answerbox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        answerbox.setOpaque(true);

        resetbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(fbox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(ftocbtn)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(ctofbtn))
                                    .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(answerbox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(resetbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fbox)
                    .addComponent(cbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftocbtn)
                    .addComponent(ctofbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answerbox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetbtn)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ftocbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftocbtnActionPerformed
        // TODO add your handling code here:
        //read farenheit
        try{
            far = Double.parseDouble(fbox.getText());
        }catch(Exception e){
            //what to do if error is thrown
            JOptionPane.showMessageDialog(this, "Error - must be a number");
            return;  //leave right away
        }
        //calculate celsius
        cel = (far - 32) * 5.0/9.0;
        //display answer
        cbox.setText(String.format("%.2f C",cel));
        answerbox.setText(String.format("%.2f F = %.2f C",far,cel));
    }//GEN-LAST:event_ftocbtnActionPerformed

    private void fboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fboxActionPerformed

    private void ctofbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctofbtnActionPerformed
        // TODO add your handling code here:
        try{
            cel = Double.parseDouble(cbox.getText());
            }catch(Exception e){
            //what to do if error is thrown
            JOptionPane.showMessageDialog(this, "Error - must be a number");
            return; //leave right away
        }
        //calculate celsius
        far = (cel - 32) * 9.0/5.0;
        //display answer
        fbox.setText(String.format("%.2f F",far));
        answerbox.setText(String.format("%.2f C = %.2f F",cel,far));
                          
    }//GEN-LAST:event_ctofbtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        fbox.setText("");
        cbox.setText("");
        answerbox.setText("");
    }//GEN-LAST:event_resetbtnActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TempConvert2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TempConvert2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TempConvert2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TempConvert2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TempConvert2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerbox;
    private javax.swing.JTextField cbox;
    private javax.swing.JButton ctofbtn;
    private javax.swing.JTextField fbox;
    private javax.swing.JButton ftocbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton resetbtn;
    // End of variables declaration//GEN-END:variables
}
