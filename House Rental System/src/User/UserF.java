
package User;
import Admin.AdminLogin;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class UserF extends javax.swing.JFrame {

    public UserF() {
        initComponents();
        Cities();
       
    }
    private void Cities()
    {
         try {
            Scanner scan = new Scanner(new File("database/Properties.txt")); 
            while(scan.hasNextLine() ) {
                   String[] line = scan.nextLine().split(",");
                   
                   String a = line[2].trim();
                   citySelection.addItem(a);

                }
            } catch(IOException e) {
           System.out.println(e);
        }

    }
    private void Search()
    {
        String citi, range, rm;
       
        if(checkName() && checkCnic()){
            
             String name = NameField.getText().trim() , cnic = cnicField.getText().trim();
            if( NameField.getText() == "" && cnicField.getText() == "")
            {
                    JOptionPane.showMessageDialog(null, "Fields Empty");
            }else
            {
            citi = citySelection.getSelectedItem().toString();
           
            
            View v = new View(citySelection.getSelectedItem().toString() ,NameField.getText().trim(),
            cnicField.getText().trim());

            v.setVisible(true);
            this.dispose();
            }
        }else
        {
            if(!checkName())
                NameCheck.setText("Name must not contain numbers");
        }
        if(!checkCnic())
        {
            CnicCheck.setText("Cnic must be 13 digit numbers without dash(-)!");
        }
        
    }
    
    private boolean checkCnic()
    {
        String checkCnic = cnicField.getText().trim(); 
        boolean resultC = checkCnic.matches("[a-zA-Z]+");
        boolean flag = false;
        if(checkCnic.length()== 13 && !resultC)
        {
            resultC = true;
        }
        else
        {
            resultC = false;
        }
        
        return resultC;
    }
    
     private boolean checkName()
    {
        String a = NameField.getText().trim();
        boolean resultN = true;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i) == '0' || a.charAt(i) == '1' || a.charAt(i) == '2' || 
                    a.charAt(i) == '3' || a.charAt(i) == '4' || a.charAt(i) == '5' || 
                    a.charAt(i) == '6'|| a.charAt(i) == '7' || a.charAt(i) == '8' || 
                    a.charAt(i) == '9'){
                resultN = false;
            }
        }
        
        return resultN;
    }
   
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Range = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        citySelection = new javax.swing.JComboBox<>();
        countryLabel = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cnicField = new javax.swing.JTextField();
        admin = new javax.swing.JButton();
        booking = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        CnicCheck = new javax.swing.JLabel();
        NameCheck = new javax.swing.JLabel();
        newProp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        jLabel2.setText("Select City:");

        citySelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel6.setText("Enter your Name:");

        jLabel4.setText("Enter your Cnic:");

        cnicField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnicFieldActionPerformed(evt);
            }
        });

        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin.png"))); // NOI18N
        admin.setText("Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        booking.setText("Search Booking");
        booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        CnicCheck.setForeground(new java.awt.Color(255, 0, 0));

        NameCheck.setForeground(new java.awt.Color(255, 0, 0));

        newProp.setText("New Property Registration");
        newProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPropActionPerformed(evt);
            }
        });

        jButton1.setText("About");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(citySelection, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(countryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Search)
                .addGap(366, 366, 366))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(booking)
                .addGap(38, 38, 38)
                .addComponent(admin)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cnicField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CnicCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newProp)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(newProp))
                    .addComponent(jButton1))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(citySelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(countryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cnicField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CnicCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(Search)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(admin)
                            .addComponent(booking))
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit)
                        .addGap(31, 31, 31))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        Search();
    }//GEN-LAST:event_SearchActionPerformed

    private void bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingActionPerformed
        // TODO add your handling code here:
        SearchBooking b = new SearchBooking();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bookingActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
                 AdminLogin a = new AdminLogin();
                 a.setVisible(true);
                 this.dispose();
    }//GEN-LAST:event_adminActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
//        this.dispose();
      System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void cnicFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnicFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cnicFieldActionPerformed

    private void newPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPropActionPerformed
        // TODO add your handling code here:
       Owner.OwnerF on = new Owner.OwnerF();
       on.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_newPropActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "House Rental System\n\nDSA LAB PROJECT\nFA21-BSSE-3A\n\nMembers:\n\nHashir Kayani 070\nAmmar Bin Shahzad 009\nMuhammad Umar 032");
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CnicCheck;
    private javax.swing.JLabel NameCheck;
    private javax.swing.JTextField NameField;
    private javax.swing.ButtonGroup Range;
    private javax.swing.JButton Search;
    private javax.swing.JButton admin;
    private javax.swing.JButton booking;
    private javax.swing.JComboBox<String> citySelection;
    private javax.swing.JTextField cnicField;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton newProp;
    // End of variables declaration//GEN-END:variables
}
