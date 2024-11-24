
import javax.swing.JOptionPane;
// Walay Database 
//Correct Username : Ivan
//Correct Password:jason

public class loginsystem extends javax.swing.JFrame {

  
    public loginsystem() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtuser = new javax.swing.JTextField();
        jtpass = new javax.swing.JPasswordField();
        blogin = new javax.swing.JButton();
        breset = new javax.swing.JButton();
        bexit = new javax.swing.JButton();
        jtshow = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102,60));

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("LOGIN");

        jLabel3.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");

        jtuser.setBackground(new java.awt.Color(0, 0, 0));
        jtuser.setForeground(new java.awt.Color(255, 255, 255));

        jtpass.setBackground(new java.awt.Color(0, 0, 0));
        jtpass.setForeground(new java.awt.Color(255, 255, 255));

        blogin.setBackground(new java.awt.Color(51, 51, 51));
        blogin.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        blogin.setForeground(new java.awt.Color(0, 204, 204));
        blogin.setText("LOGIN");
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });

        breset.setBackground(new java.awt.Color(51, 51, 51));
        breset.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        breset.setForeground(new java.awt.Color(0, 204, 204));
        breset.setText("RESET");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });

        bexit.setBackground(new java.awt.Color(51, 51, 51));
        bexit.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        bexit.setForeground(new java.awt.Color(0, 204, 204));
        bexit.setText("EXIT");
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });

        jtshow.setBackground(new java.awt.Color(255, 255, 255));
        jtshow.setForeground(new java.awt.Color(0, 204, 204));
        jtshow.setText("Show Password");
        jtshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtshowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(blogin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(breset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(bexit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtshow)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtuser)
                                .addComponent(jtpass, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtshow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blogin)
                    .addComponent(breset)
                    .addComponent(bexit))
                .addGap(81, 81, 81))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 310, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\def80a0867bc6e5c3aeddc8307bdf6d9.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, -1));

        setSize(new java.awt.Dimension(695, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
       
       if (jtuser.getText(). equals("")){
            JOptionPane.showMessageDialog(null,"Must Enter a Username!");
        }
        else if (jtpass.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Must Enter a Password!");
        }
        else if (jtuser.getText().contains("Ivan")&& jtpass.getText().contains("jason")){
            JOptionPane.showMessageDialog(null,"Successfully Login 💖");
          Welcomeback reg = new Welcomeback ();
        reg.setVisible(true);
        this.setVisible(false);
        }
        else {
             JOptionPane.showMessageDialog(null,"Wrong username or password!!","Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bloginActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_bexitActionPerformed

    private void jtshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtshowActionPerformed
       
        if (jtshow.isSelected()){
            jtpass.setEchoChar((char)0);
        }
        else {
            jtpass.setEchoChar('*');
        }
    }//GEN-LAST:event_jtshowActionPerformed

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
       
        jtuser.setText(null);
        jtpass.setText(null);
    }//GEN-LAST:event_bresetActionPerformed

  
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(loginsystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginsystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginsystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginsystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginsystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bexit;
    private javax.swing.JButton blogin;
    private javax.swing.JButton breset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jtpass;
    private javax.swing.JCheckBox jtshow;
    private javax.swing.JTextField jtuser;
    // End of variables declaration//GEN-END:variables
}
