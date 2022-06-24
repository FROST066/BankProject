/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sources;

import GUI.createAccount;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.WindowConstants;

/**
 *
 * @author spmy
 */
public final class mainJframe21 extends javax.swing.JFrame {

    public mainJframe21(Connection conn) throws SQLException {
        setVisible(false);
        setBackground(new Color(51, 133, 255));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.conn = conn;

        userList = new ArrayList<>();
        actuAccounIDtList = new ArrayList<>();
        actuLoanIDtList = new ArrayList<>();
        initComponents();
        init0();
        c = retraitButton.getBackground();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        userComboBox = new javax.swing.JComboBox<>();
        usernameLabel = new javax.swing.JLabel();
        compteLabel = new javax.swing.JLabel();
        compteComboBox = new javax.swing.JComboBox<>();
        depotButton = new javax.swing.JButton();
        retraitButton = new javax.swing.JButton();
        typeCompteLabel = new javax.swing.JLabel();
        soldeIntLabel = new javax.swing.JLabel();
        soldeLabel = new javax.swing.JLabel();
        interetLabel = new javax.swing.JLabel();
        interetIntLabel = new javax.swing.JLabel();
        empruntLabel = new javax.swing.JLabel();
        addUserButton = new javax.swing.JButton();
        addAccountButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        ownerNameEditButton = new javax.swing.JButton();
        editInteretButton1 = new javax.swing.JButton();
        loanComboBox = new javax.swing.JComboBox<>();
        addLoanButton = new javax.swing.JButton();
        manageLoanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Utilisateur");
        setBackground(new java.awt.Color(51, 153, 255));
        setForeground(new java.awt.Color(51, 153, 255));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setNextFocusableComponent(usernameLabel);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank-icon.png"))); // NOI18N

        userComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userComboBoxActionPerformed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Liberation Sans", 1, 17)); // NOI18N
        usernameLabel.setText("Proprietaire");

        compteLabel.setFont(new java.awt.Font("Liberation Sans", 1, 17)); // NOI18N
        compteLabel.setText("Compte");

        compteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compteComboBoxActionPerformed(evt);
            }
        });

        depotButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/depot2.png"))); // NOI18N
        depotButton.setText("  Depot");
        depotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depotButtonActionPerformed(evt);
            }
        });

        retraitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retrait2.png"))); // NOI18N
        retraitButton.setText(" Retrait");
        retraitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        retraitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                retraitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                retraitButtonMouseExited(evt);
            }
        });
        retraitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retraitButtonActionPerformed(evt);
            }
        });

        typeCompteLabel.setFont(new java.awt.Font("Sahadeva", 0, 24)); // NOI18N
        typeCompteLabel.setText("type de compte");

        soldeIntLabel.setText("0");

        soldeLabel.setFont(new java.awt.Font("Likhan", 0, 18)); // NOI18N
        soldeLabel.setText("Solde:");

        interetLabel.setFont(new java.awt.Font("Likhan", 0, 18)); // NOI18N
        interetLabel.setText("Interet: ");

        interetIntLabel.setText("0");

        empruntLabel.setFont(new java.awt.Font("Likhan", 0, 18)); // NOI18N
        empruntLabel.setText("Les prets");

        addUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        addUserButton.setText("Ajouter");
        addUserButton.setToolTipText("Ajouter un nouvel utilisateur");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        addAccountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        addAccountButton.setText("Ajouter");
        addAccountButton.setToolTipText("Ajouter un compte");
        addAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAccountButtonActionPerformed(evt);
            }
        });

        ownerNameEditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        ownerNameEditButton.setText("Modifier");
        ownerNameEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownerNameEditButtonActionPerformed(evt);
            }
        });

        editInteretButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        editInteretButton1.setText("Modifier");
        editInteretButton1.setToolTipText("Modifier l'interet du compte");
        editInteretButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editInteretButton1ActionPerformed(evt);
            }
        });

        loanComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanComboBoxActionPerformed(evt);
            }
        });

        addLoanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        addLoanButton.setText("Ajouter");
        addLoanButton.setToolTipText("Faire un pret");
        addLoanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLoanButtonActionPerformed(evt);
            }
        });

        manageLoanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion.png"))); // NOI18N
        manageLoanButton.setText("Gerer");
        manageLoanButton.setToolTipText("Afficher et modifier le pret");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compteLabel)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(empruntLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addLoanButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manageLoanButton))
                    .addComponent(typeCompteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(compteComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(addUserButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ownerNameEditButton))
                            .addComponent(addAccountButton)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(soldeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(soldeIntLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(interetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(interetIntLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editInteretButton1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(retraitButton)
                                .addGap(19, 19, 19)
                                .addComponent(depotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addUserButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ownerNameEditButton)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameLabel)
                                    .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(compteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(typeCompteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(retraitButton)
                        .addComponent(depotButton)
                        .addComponent(soldeIntLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(soldeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(interetIntLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editInteretButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empruntLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addLoanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageLoanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            closeConn();
        } catch (SQLException ex) {
            Logger.getLogger(mainJframe21.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void retraitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retraitButtonActionPerformed
        try {
            System.out.println("Entrer dans la fonction retrait");
            SpinnerNumberModel sModel = new SpinnerNumberModel(1, 1, actuAccountSolde, 1);
            JSpinner spinner = new JSpinner(sModel);
            int option = JOptionPane.showOptionDialog(null, spinner, "Entrer le montant a retirer", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(""), null, null);
            if (option == JOptionPane.OK_OPTION) {
                actuAccountSolde = actuAccountSolde - (int) spinner.getValue();
            }
            String query = "UPDATE account SET solde =" + actuAccountSolde + " WHERE accountID=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, actuAccounIDtList.get(compteComboBox.getSelectedIndex()));
            ps.executeUpdate();
            initTableau();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_retraitButtonActionPerformed

    private void retraitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retraitButtonMouseExited
        retraitButton.setBackground(c);
    }//GEN-LAST:event_retraitButtonMouseExited

    private void retraitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retraitButtonMouseEntered
        retraitButton.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_retraitButtonMouseEntered

    private void depotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depotButtonActionPerformed
        try {
            System.out.println("Entrer dans la fonction depot");
            SpinnerNumberModel sModel = new SpinnerNumberModel(1, 1, 1000000, 1);
            JSpinner spinner = new JSpinner(sModel);
            int option = JOptionPane.showOptionDialog(null, spinner, "Entrer le montant a deposer", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(""), null, null);
            if (option == JOptionPane.OK_OPTION) {
                actuAccountSolde = actuAccountSolde + (int) spinner.getValue();
            }
            
            String query = "UPDATE account SET solde =" + actuAccountSolde + " WHERE accountID=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, actuAccounIDtList.get(compteComboBox.getSelectedIndex()));
            ps.executeUpdate();
            initTableau();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_depotButtonActionPerformed

    private void compteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compteComboBoxActionPerformed
        try {
            initTableau();
            initLoan();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_compteComboBoxActionPerformed

    private void userComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userComboBoxActionPerformed
        try {
            initComboxCompte();
            initTableau();
            initLoan();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_userComboBoxActionPerformed

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed

        createUser();
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void addAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAccountButtonActionPerformed
        try {
            addAccount();
            init0();
        } catch (SQLException ex) {
            Logger.getLogger(mainJframe21.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addAccountButtonActionPerformed

    private void loanComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loanComboBoxActionPerformed

    private void addLoanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLoanButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addLoanButtonActionPerformed

    private void ownerNameEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownerNameEditButtonActionPerformed
        editOwnerName();
    }//GEN-LAST:event_ownerNameEditButtonActionPerformed

    private void editInteretButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editInteretButton1ActionPerformed
        try {
            SpinnerNumberModel sModel = new SpinnerNumberModel(1, 1, 100, 1);
            JSpinner spinner = new JSpinner(sModel);
            int option = JOptionPane.showOptionDialog(null, spinner, "Entrer le montant a deposer", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(""), null, null);
            if (option == JOptionPane.OK_OPTION) {
                String query = "UPDATE account SET interet =" + (double) spinner.getValue() + " WHERE accountID=?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, actuAccounIDtList.get(compteComboBox.getSelectedIndex()));
                ps.executeUpdate();
                initTableau();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_editInteretButton1ActionPerformed

    /*public static void main(String args[]) throws UnsupportedLookAndFeelException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainJframe21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainJframe21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainJframe21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainJframe21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    mainJframe21 j=new mainJframe21(this.conn);
                           j.setVisible(true);
                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null,ex);
                }
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAccountButton;
    private javax.swing.JButton addLoanButton;
    private javax.swing.JButton addUserButton;
    private javax.swing.JComboBox<String> compteComboBox;
    private javax.swing.JLabel compteLabel;
    private javax.swing.JButton depotButton;
    private javax.swing.JButton editInteretButton1;
    private javax.swing.JLabel empruntLabel;
    private javax.swing.JLabel interetIntLabel;
    private javax.swing.JLabel interetLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> loanComboBox;
    private javax.swing.JButton manageLoanButton;
    private javax.swing.JButton ownerNameEditButton;
    private javax.swing.JButton retraitButton;
    private javax.swing.JLabel soldeIntLabel;
    private javax.swing.JLabel soldeLabel;
    private javax.swing.JLabel typeCompteLabel;
    private javax.swing.JComboBox<String> userComboBox;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

    private ArrayList<String> userList;
    private Connection conn;
   private ArrayList<String> actuLoanIDtList;
    private ArrayList<String> actuAccounIDtList;
    private Color c;
    private int actuAccountSolde;

    public void allActivate(boolean a) {
        typeCompteLabel.setEnabled(a);
        soldeLabel.setEnabled(a);
        soldeIntLabel.setEnabled(a);
        depotButton.setEnabled(a);
        retraitButton.setEnabled(a);
        interetLabel.setEnabled(a);
        interetIntLabel.setEnabled(a);
        editInteretButton1.setEnabled(a);
        empruntLabel.setEnabled(a);
        loanComboBox.setEnabled(a);
        addLoanButton.setEnabled(a);
        if (!a) {
            typeCompteLabel.setText("");
            soldeIntLabel.setText("");
            interetIntLabel.setText("");
        }

    }

    public void initcomboxUser() throws SQLException {
        System.out.println("Entre dans la fonction initUser");
        userComboBox.removeAllItems();
        userComboBox.removeAll();
        userList.clear();
        try {
            String query = "select * from user";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rst = ps.executeQuery();
            while (rst.next()) {
                userComboBox.addItem(rst.getString("name"));
                userList.add(rst.getString("userid"));

            }
            System.out.println("Initialisation User");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void initComboxCompte() throws SQLException {
        compteComboBox.removeAll();
        compteComboBox.removeAllItems();
        actuAccounIDtList.clear();
        // System.err.println("=zz "+ userComboBox.getSelectedIndex());
        if (!userList.isEmpty())  try {
            String query = "select accountID from account where userID=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, userList.get(userComboBox.getSelectedIndex()));
            ResultSet rst = ps.executeQuery();
            while (rst.next()) {
                actuAccounIDtList.add(rst.getString("accountID"));
                compteComboBox.addItem("" + actuAccounIDtList.size());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void initTableau() throws SQLException {
        if (compteComboBox.getItemCount() <= 0) {
            allActivate(false);
        } else
            try {
            allActivate(true);
            String query = "select * from account where accountID=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, actuAccounIDtList.get(compteComboBox.getSelectedIndex()));
            ResultSet rst = ps.executeQuery();
            if (rst.getInt("isNormal") == 0) {
                typeCompteLabel.setText("Compte Epargne");
                empruntLabel.setEnabled(false);
                loanComboBox.setEnabled(false);
                addLoanButton.setEnabled(false);

            } else {
                typeCompteLabel.setText("Compte Courant");
            }
            actuAccountSolde = rst.getInt("solde");
            soldeIntLabel.setText(rst.getString("solde"));
            interetIntLabel.setText(rst.getString("interet"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    private void initLoan() {
        System.out.println("Entrer dans la fonction initComboLoan");
        actuLoanIDtList.clear();
        loanComboBox.removeAll();
        loanComboBox.removeAllItems();
        if (compteComboBox.getItemCount() > 0) try {
            String query = "select loanID from loan where courantID=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, actuAccounIDtList.get(compteComboBox.getSelectedIndex()));
            ResultSet rst = ps.executeQuery();
            while (rst.next()) {
                actuLoanIDtList.add(rst.getString("loanID"));
                loanComboBox.addItem("" + actuLoanIDtList.size());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        System.out.println("la fonction initComboLoan fini");
    }
    
    public void closeConn() throws SQLException {
        this.conn.close();
        System.out.println("Fermeture de la connection");
    }

    public void createUser() {
        try {
            String name = (String) JOptionPane.showInputDialog(null, "Entrez un nom ", "Nouvel utilisateur", 1, new ImageIcon(""), null, "");
            if (!(name == null)) {
                String query = "insert into user(name) values (?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, name);
                if (ps.executeUpdate() == 1) init0();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void addAccount() {
        try {
            System.out.println("ENtrer dans la fonctiion addAccount");
            JCheckBox courantCheck = new JCheckBox("Compte courant");
            JCheckBox epargneCheck = new JCheckBox("Compte epargne");

            courantCheck.addActionListener((java.awt.event.ActionEvent evt) -> {
                epargneCheck.setSelected(!courantCheck.isSelected());
            });
            epargneCheck.addActionListener((java.awt.event.ActionEvent evt) -> {
                courantCheck.setSelected(!epargneCheck.isSelected());
            });
            JLabel lab = new JLabel("Choisissez le type du compte\n");
            lab.setFont(new Font("Liberation Sans", 1, 24));
            Object[] obj = {lab, courantCheck, "", epargneCheck};
            int n = JOptionPane.showConfirmDialog(null, obj, "Nouveau compte", 2, 0, new ImageIcon(getClass().getResource("/account.png")));
            if (n == 0 && (courantCheck.isSelected() || epargneCheck.isSelected())) {
                String query = "insert into account(solde,interet,isNormal,userID) values (0,10,?,?)";
                PreparedStatement ps = conn.prepareStatement(query);
                if (courantCheck.isSelected()) {
                    ps.setInt(1, 1);
                } else {
                    ps.setInt(1, 0);
                }
                ps.setString(2, userList.get(userComboBox.getSelectedIndex()));
                int rst = ps.executeUpdate();
                if (rst != 0) {
                    System.out.println("Compte cree avec succes");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    
    private void editOwnerName(){
    try {
            String name = (String) JOptionPane.showInputDialog(null, "Entrez le nouveau nom du proprietaire ", "Modifier nom du Proprietaire", 1, new ImageIcon(""), null, "");
            if (!(name == null)) {
                String query = "update user set name=? where userid="+userList.get(userComboBox.getSelectedIndex());
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, name);
                if (ps.executeUpdate() == 1) init0();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void init0() throws SQLException {
        userList.clear();
        actuAccounIDtList.clear();
        compteComboBox.removeAllItems();
        compteComboBox.removeAll();
        userComboBox.removeAllItems();
        userComboBox.removeAll();
        actuLoanIDtList.clear();
        loanComboBox.removeAll();
        loanComboBox.removeAllItems();
        initcomboxUser();
        initComboxCompte();
        initTableau();
        initLoan();
    }

}
