/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class Acceuil extends javax.swing.JFrame {

   
    public Acceuil() {
        initComponents();
     Image i = new ImageIcon(ClassLoader.getSystemResource("images/logo.png")).getImage();
setIconImage(i);


         this.setSize(1500,800);

         this.setLocationRelativeTo(null);
         this.setVisible(true);
    Puser.setVisible(false);
      Plogout.setVisible(false);
     Home ho = new miniprojet.Home();
  Pmain.setLayout(new java.awt.BorderLayout());
Pmain.removeAll();
Pmain.add(ho);
Pmain.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        Paside = new javax.swing.JPanel();
        Pacceuil = new javax.swing.JPanel();
        Liconhome = new javax.swing.JLabel();
        Lhome = new javax.swing.JLabel();
        Plogin = new javax.swing.JPanel();
        Liconlogin = new javax.swing.JLabel();
        Llogin = new javax.swing.JLabel();
        Pregister = new javax.swing.JPanel();
        Liconregister = new javax.swing.JLabel();
        Lregister = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Ltitle = new javax.swing.JLabel();
        Puser = new javax.swing.JPanel();
        Liconregister1 = new javax.swing.JLabel();
        Luser = new javax.swing.JLabel();
        Plogout = new javax.swing.JPanel();
        Liconregister5 = new javax.swing.JLabel();
        Luser4 = new javax.swing.JLabel();
        Pcontent = new javax.swing.JPanel();
        Pimage = new javax.swing.JPanel();
        Liconregister2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Pmain = new javax.swing.JPanel();

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setText("Home");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(246, 246, 246));

        Paside.setBackground(new java.awt.Color(249, 91, 12));
        Paside.setToolTipText("");
        Paside.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pacceuil.setBackground(new java.awt.Color(249, 141, 6));
        Pacceuil.setToolTipText("");
        Pacceuil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PacceuilMouseClicked(evt);
            }
        });

        Liconhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-page-50.png"))); // NOI18N

        Lhome.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        Lhome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lhome.setText("Home");

        javax.swing.GroupLayout PacceuilLayout = new javax.swing.GroupLayout(Pacceuil);
        Pacceuil.setLayout(PacceuilLayout);
        PacceuilLayout.setHorizontalGroup(
            PacceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PacceuilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Liconhome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lhome, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        PacceuilLayout.setVerticalGroup(
            PacceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PacceuilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PacceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Liconhome, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addGroup(PacceuilLayout.createSequentialGroup()
                        .addComponent(Lhome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        Paside.add(Pacceuil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 300, -1));

        Plogin.setBackground(new java.awt.Color(249, 141, 6));
        Plogin.setToolTipText("");
        Plogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PloginMouseClicked(evt);
            }
        });

        Liconlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-login-rounded-50.png"))); // NOI18N

        Llogin.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        Llogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Llogin.setText("Login");

        javax.swing.GroupLayout PloginLayout = new javax.swing.GroupLayout(Plogin);
        Plogin.setLayout(PloginLayout);
        PloginLayout.setHorizontalGroup(
            PloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PloginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Liconlogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Llogin, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        PloginLayout.setVerticalGroup(
            PloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PloginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Liconlogin, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addGroup(PloginLayout.createSequentialGroup()
                        .addComponent(Llogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        Paside.add(Plogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 300, -1));

        Pregister.setBackground(new java.awt.Color(249, 141, 6));
        Pregister.setToolTipText("");
        Pregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PregisterMouseClicked(evt);
            }
        });

        Liconregister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-user-male-50.png"))); // NOI18N

        Lregister.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        Lregister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lregister.setText("Register");

        javax.swing.GroupLayout PregisterLayout = new javax.swing.GroupLayout(Pregister);
        Pregister.setLayout(PregisterLayout);
        PregisterLayout.setHorizontalGroup(
            PregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PregisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Liconregister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lregister, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        PregisterLayout.setVerticalGroup(
            PregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PregisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Liconregister, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addGroup(PregisterLayout.createSequentialGroup()
                        .addComponent(Lregister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        Paside.add(Pregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 300, -1));

        jPanel4.setBackground(new java.awt.Color(249, 91, 12));

        Ltitle.setFont(new java.awt.Font("Script MT Bold", 0, 36)); // NOI18N
        Ltitle.setForeground(new java.awt.Color(240, 240, 240));
        Ltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ltitle.setText("ESTE VOYAGE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Ltitle)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        Paside.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 30, 540, -1));

        Puser.setBackground(new java.awt.Color(249, 141, 6));
        Puser.setToolTipText("");
        Puser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PuserMouseClicked(evt);
            }
        });

        Liconregister1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Liconregister1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-50.png"))); // NOI18N

        Luser.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        Luser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Luser.setText("user");

        javax.swing.GroupLayout PuserLayout = new javax.swing.GroupLayout(Puser);
        Puser.setLayout(PuserLayout);
        PuserLayout.setHorizontalGroup(
            PuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PuserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Liconregister1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Luser, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        PuserLayout.setVerticalGroup(
            PuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PuserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Liconregister1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Luser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Paside.add(Puser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 300, 70));

        Plogout.setBackground(new java.awt.Color(249, 141, 6));
        Plogout.setToolTipText("");
        Plogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlogoutMouseClicked(evt);
            }
        });

        Liconregister5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Liconregister5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-logout-rounded-50 (1).png"))); // NOI18N

        Luser4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        Luser4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Luser4.setText("log out");

        javax.swing.GroupLayout PlogoutLayout = new javax.swing.GroupLayout(Plogout);
        Plogout.setLayout(PlogoutLayout);
        PlogoutLayout.setHorizontalGroup(
            PlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Liconregister5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Luser4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        PlogoutLayout.setVerticalGroup(
            PlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Liconregister5, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addGroup(PlogoutLayout.createSequentialGroup()
                        .addComponent(Luser4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        Paside.add(Plogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 300, -1));

        Pcontent.setBackground(new java.awt.Color(246, 246, 246));

        Pimage.setBackground(new java.awt.Color(40, 240, 240));
        Pimage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Liconregister2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Liconregister2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-cancel-50.png"))); // NOI18N
        Liconregister2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Liconregister2MouseClicked(evt);
            }
        });
        Pimage.add(Liconregister2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, -1, 57));
        Pimage.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bus2.png"))); // NOI18N
        Pimage.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 140));

        Pmain.setBackground(new java.awt.Color(255, 255, 255));
        Pmain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pmain.setToolTipText("");

        javax.swing.GroupLayout PmainLayout = new javax.swing.GroupLayout(Pmain);
        Pmain.setLayout(PmainLayout);
        PmainLayout.setHorizontalGroup(
            PmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PmainLayout.setVerticalGroup(
            PmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PcontentLayout = new javax.swing.GroupLayout(Pcontent);
        Pcontent.setLayout(PcontentLayout);
        PcontentLayout.setHorizontalGroup(
            PcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PcontentLayout.createSequentialGroup()
                .addGroup(PcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pimage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PcontentLayout.setVerticalGroup(
            PcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PcontentLayout.createSequentialGroup()
                .addComponent(Pimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(Paside, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pcontent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Paside, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
            .addComponent(Pcontent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PacceuilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PacceuilMouseClicked
        // TODO add your handling code here:
     
     Home ho = new miniprojet.Home();
  Pmain.setLayout(new java.awt.BorderLayout());
Pmain.removeAll();
Pmain.add(ho);
Pmain.revalidate();
 
    }//GEN-LAST:event_PacceuilMouseClicked

    private void PloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PloginMouseClicked
        // TODO add your handling code here:
    
  Pmain.setLayout(new java.awt.BorderLayout());
Pmain.removeAll();
Pmain.add(login1);
Pmain.revalidate();
login1.blogin.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });

 

    }//GEN-LAST:event_PloginMouseClicked
        
     private void bloginActionPerformed(java.awt.event.ActionEvent evt) {
    user=login1.nomuser;
    System.out.println("nom"+user);
if(user!="non"){
    Luser.setText(user);
       Puser.setVisible(true);
         Plogout.setVisible(true);
         Pmain.setLayout(new java.awt.BorderLayout());
              Home ho = new miniprojet.Home();
Pmain.removeAll();
Pmain.add(ho);
Pmain.revalidate();
}

  }
    
    private void PregisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PregisterMouseClicked
        // TODO add your handling code here:
          Register Register = new miniprojet.Register();
  Pmain.setLayout(new java.awt.BorderLayout());
Pmain.removeAll();
Pmain.add(Register);
Pmain.revalidate();
    }//GEN-LAST:event_PregisterMouseClicked

    private void PuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PuserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PuserMouseClicked

    private void PlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlogoutMouseClicked
        // TODO add your handling code here:
         Puser.setVisible(false);
          Plogout.setVisible(false);
    }//GEN-LAST:event_PlogoutMouseClicked

    private void Liconregister2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Liconregister2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Liconregister2MouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil().setVisible(true);
            }
        });
    }
           Login login1 = new miniprojet.Login();
         
          
public String user="non";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lhome;
    private javax.swing.JLabel Liconhome;
    private javax.swing.JLabel Liconlogin;
    private javax.swing.JLabel Liconregister;
    private javax.swing.JLabel Liconregister1;
    private javax.swing.JLabel Liconregister2;
    private javax.swing.JLabel Liconregister5;
    private javax.swing.JLabel Llogin;
    private javax.swing.JLabel Lregister;
    private javax.swing.JLabel Ltitle;
    private javax.swing.JLabel Luser;
    private javax.swing.JLabel Luser4;
    private javax.swing.JPanel Pacceuil;
    private javax.swing.JPanel Paside;
    private javax.swing.JPanel Pcontent;
    private javax.swing.JPanel Pimage;
    private javax.swing.JPanel Plogin;
    private javax.swing.JPanel Plogout;
    private javax.swing.JPanel Pmain;
    private javax.swing.JPanel Pregister;
    private javax.swing.JPanel Puser;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
