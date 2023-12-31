/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package buildGUI;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author john clarence
 */
public class GUIpizza extends javax.swing.JFrame {

    /**
     * Creates new form GUIpizza
     */
     
    
    public GUIpizza() {
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        popupMenu1 = new java.awt.PopupMenu();
        jPanel5 = new javax.swing.JPanel();
        optionField = new javax.swing.JTextField();
        calculateField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        deluxePizza = new javax.swing.JRadioButton();
        promoPizza = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        calculate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        specialPizza = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        check1 = new javax.swing.JCheckBox();
        check2 = new javax.swing.JCheckBox();
        check5 = new javax.swing.JCheckBox();
        check4 = new javax.swing.JCheckBox();
        check3 = new javax.swing.JCheckBox();
        check6 = new javax.swing.JCheckBox();
        check7 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        popupMenu1.setLabel("popupMenu1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 155, 80));
        setForeground(new java.awt.Color(255, 155, 80));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        optionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionFieldActionPerformed(evt);
            }
        });
        getContentPane().add(optionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 455, 152, 37));

        calculateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateFieldActionPerformed(evt);
            }
        });
        getContentPane().add(calculateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 510, 152, 35));

        jLabel4.setText("Number of orders");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 465, 106, -1));

        jLabel20.setText("Total");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 519, 43, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("PRICE: ₱185");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 183, 90, 28));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("PRICE: ₱250  ");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 165, -1, 36));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("PRICE: ₱290");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 183, -1, -1));

        deluxePizza.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        deluxePizza.setText("Deluxe Pizza");
        deluxePizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deluxePizzaActionPerformed(evt);
            }
        });
        getContentPane().add(deluxePizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 141, 120, 30));

        promoPizza.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        promoPizza.setText("Promo Pizza");
        promoPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promoPizzaActionPerformed(evt);
            }
        });
        getContentPane().add(promoPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 141, 120, -1));

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 525, 90, 40));

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        getContentPane().add(calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 425, 90, 40));

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 475, 90, 40));

        specialPizza.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        specialPizza.setText("Special Pizza");
        specialPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialPizzaActionPerformed(evt);
            }
        });
        getContentPane().add(specialPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 131, 130, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(226, 94, 62));
        jLabel3.setText("MENU");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 94, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel7.setText("• Ingredients •");

        check1.setText("Bacon");
        check1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check1ActionPerformed(evt);
            }
        });

        check2.setText("Cheese");

        check5.setText("Ham");

        check4.setText("Pepper");

        check3.setText("Muhsroom");
        check3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check3ActionPerformed(evt);
            }
        });

        check6.setText("Chili");

        check7.setText("Onions");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check1)
                    .addComponent(check2))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check3)
                    .addComponent(check4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(check5)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check7)
                            .addComponent(check6)))
                    .addComponent(jLabel7))
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(check6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(check1)
                            .addComponent(check5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(check2)
                            .addComponent(check4)
                            .addComponent(check7))))
                .addGap(18, 18, 18)
                .addComponent(check3)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 229, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(216, 63, 49));
        jLabel1.setText(" - RENCE PIZZA SHOP - ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 32, 260, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 6, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deluxePizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deluxePizzaActionPerformed
        // TODO add your handling code here:
  
        if(deluxePizza.isSelected()){
          promoPizza.setSelected(false);                                        //By putting the value to false it will make the remaining value uncheked
        specialPizza.setSelected(false);                                        // else it will checked the valued if it were true 
        check1.setSelected(true);                                                //each set to true will automatically selected.
        check2.setSelected(true);
        check5.setSelected(true);
        check6.setSelected(true);
        check7.setSelected(true);
        check3.setSelected(false);
        check4.setSelected(false);
       
        }
    }//GEN-LAST:event_deluxePizzaActionPerformed

    private void specialPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialPizzaActionPerformed
        // TODO add your handling code here:
        if(specialPizza.isSelected()){
        deluxePizza.setSelected(false);
        promoPizza.setSelected(false);
        check1.setSelected(true);
         check2.setSelected(true);
         check4.setSelected(true);
         check5.setSelected(true);
         check3.setSelected(true);
         check6.setSelected(true);
         check7.setSelected(true);
         
        }
    }//GEN-LAST:event_specialPizzaActionPerformed

    private void promoPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promoPizzaActionPerformed
        // TODO add your handling code here:
        if(promoPizza.isSelected()){
           deluxePizza.setSelected(false);
        specialPizza.setSelected(false); 
        check1.setSelected(true);
        check2.setSelected(true);
        check3.setSelected(true);
        check4.setSelected(true);
        check5.setSelected(true);
        check6.setSelected(true);
        check7.setSelected(true);
        }
        
    }//GEN-LAST:event_promoPizzaActionPerformed

    private void check1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check1ActionPerformed

    private void check3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        optionField.setText("");
        calculateField.setText("");
        deluxePizza.setSelected(false);
        specialPizza.setSelected(false);
        promoPizza.setSelected(false);
        check1.setSelected(false);
        check2.setSelected(false);
        check3.setSelected(false);
        check4.setSelected(false);
        check5.setSelected(false);
        check6.setSelected(false);
        check7.setSelected(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        
        DecimalFormat decimalFormat = new DecimalFormat("#,###");                                                             // create a new instance to use the decimalFormat
        
        int option;                                                                                                                 //create a int and don't store any value for optionField to handle it
        int optionFieldText;

        optionFieldText = Integer.parseInt(optionField.getText());                                                                // create a handler to get the optionField output
        

        if(deluxePizza.isSelected()){
            
        
        option = optionFieldText * 185;                                                                                             // the price to be calculated
        int total =+ option;                                                                                                        // create a new place holder to store the total amount 
        String title = "Customer Receipt";                                                                                          // declare string because we modify our JOption
        String message = "Customer total: " + "₱ "+ decimalFormat.format(total) + "\n" + "Ordered Pizza: " + optionFieldText;  // use the decimalFormat her just to handle number with 1,000, 2,000 and so forth
           calculateField.setText("₱ " + decimalFormat.format(total));                                                         //here to we use decimal format 1,000 2,000 and so forth
            
            JOptionPane.showMessageDialog(rootPane, message, title, JOptionPane.INFORMATION_MESSAGE);          //call the title and Message by order the JOption is alredy to use beacuse it bundle with JOptionPane libraries  
            
        optionField.setText("");
        calculateField.setText("");
        deluxePizza.setSelected(false);
        check1.setSelected(false);
        check2.setSelected(false);
        check3.setSelected(false);
        check4.setSelected(false);
        check5.setSelected(false);
        check6.setSelected(false);
        check7.setSelected(false);

        } else if(specialPizza.isSelected()){
            option = optionFieldText * 250;
            int total =+ option;
            String title = "Customer Receipt";
           String message = "Customer total: " + "₱ "+ decimalFormat.format(total) + "\n" + "Ordered Pizza: " + optionFieldText;
            calculateField.setText("₱ " + decimalFormat.format(total));
            
            JOptionPane.showMessageDialog(rootPane, message, title, JOptionPane.INFORMATION_MESSAGE);  
            
            
            optionField.setText("");
        calculateField.setText("");
        specialPizza.setSelected(false);
         check1.setSelected(false);
        check2.setSelected(false);
        check3.setSelected(false);
        check4.setSelected(false);
        check5.setSelected(false);
        check6.setSelected(false);
        check7.setSelected(false);

        } else if (promoPizza.isSelected()){
        option = optionFieldText * 290;
        int total =+ option;
        String title = "Customer Receipt";
        String message = "Customer total: " + "₱ "+ decimalFormat.format(total) + "\n" + "Ordered Pizza: " + optionFieldText;
        calculateField.setText("₱ " + decimalFormat.format(total));
            
         JOptionPane.showMessageDialog(rootPane, message, title, JOptionPane.INFORMATION_MESSAGE);  
         optionField.setText("");
            
        calculateField.setText("");
        promoPizza.setSelected(false);
        check1.setSelected(false);
        check2.setSelected(false);
        check3.setSelected(false);
        check4.setSelected(false);
        check5.setSelected(false);
        check6.setSelected(false);
        check7.setSelected(false);

        }
    }//GEN-LAST:event_calculateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void calculateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calculateFieldActionPerformed

    private void optionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionFieldActionPerformed

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
            java.util.logging.Logger.getLogger(GUIpizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIpizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIpizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIpizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIpizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JTextField calculateField;
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox check3;
    private javax.swing.JCheckBox check4;
    private javax.swing.JCheckBox check5;
    private javax.swing.JCheckBox check6;
    private javax.swing.JCheckBox check7;
    private javax.swing.JRadioButton deluxePizza;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField optionField;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JRadioButton promoPizza;
    private javax.swing.JRadioButton specialPizza;
    // End of variables declaration//GEN-END:variables
}
