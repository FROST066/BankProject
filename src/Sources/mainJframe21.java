/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sources;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
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
        initComponents();
        init0();
        c=retraitButton.getBackground();
        initMenu();
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
        virementButton = new javax.swing.JButton();
        depotButton = new javax.swing.JButton();
        retraitButton = new javax.swing.JButton();
        typeCompteLabel = new javax.swing.JLabel();
        soldeIntLabel = new javax.swing.JLabel();
        soldeLabel = new javax.swing.JLabel();
        interetLabel = new javax.swing.JLabel();
        interetIntLabel = new javax.swing.JLabel();
        empruntLabel = new javax.swing.JLabel();
        intEmpruntLabel = new javax.swing.JLabel();
        empruntButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Utilisateur");
        setBackground(new java.awt.Color(51, 153, 255));
        setForeground(new java.awt.Color(51, 153, 255));
        setLocation(new java.awt.Point(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank-icon.png"))); // NOI18N

        userComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userComboBoxActionPerformed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Liberation Sans", 1, 17)); // NOI18N
        usernameLabel.setText("Nom");

        compteLabel.setFont(new java.awt.Font("Liberation Sans", 1, 17)); // NOI18N
        compteLabel.setText("Compte");

        compteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compteComboBoxActionPerformed(evt);
            }
        });

        virementButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mobile_banking_credit_card_icon_205086.png"))); // NOI18N
        virementButton.setText("Virement");

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
        empruntLabel.setText("Nombre d'emprunt: ");

        intEmpruntLabel.setText("0");

        empruntButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emprunt.png"))); // NOI18N
        empruntButton.setText("Emprunt");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeCompteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(interetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(interetIntLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(soldeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(soldeIntLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(retraitButton))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(empruntLabel)
                                .addGap(31, 31, 31)
                                .addComponent(intEmpruntLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(depotButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(empruntButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(virementButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(compteLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(compteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel)
                    .addComponent(compteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(typeCompteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(retraitButton)
                        .addComponent(depotButton)
                        .addComponent(virementButton)
                        .addComponent(soldeIntLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(soldeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(interetIntLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empruntLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intEmpruntLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empruntButton))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_compteComboBoxActionPerformed

    private void userComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userComboBoxActionPerformed
        try {
            initComboxCompte();
            initTableau();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_userComboBoxActionPerformed

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
    private javax.swing.JComboBox<String> compteComboBox;
    private javax.swing.JLabel compteLabel;
    private javax.swing.JButton depotButton;
    private javax.swing.JButton empruntButton;
    private javax.swing.JLabel empruntLabel;
    private javax.swing.JLabel intEmpruntLabel;
    private javax.swing.JLabel interetIntLabel;
    private javax.swing.JLabel interetLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton retraitButton;
    private javax.swing.JLabel soldeIntLabel;
    private javax.swing.JLabel soldeLabel;
    private javax.swing.JLabel typeCompteLabel;
    private javax.swing.JComboBox<String> userComboBox;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JButton virementButton;
    // End of variables declaration//GEN-END:variables

    private ArrayList<String> userList;
    private Connection conn;
    private ArrayList<String> actuAccounIDtList;
    private Color  c;
    private int actuAccountSolde;
    
    public void allActivate(boolean a) {
        typeCompteLabel.setEnabled(a);
        soldeLabel.setEnabled(a);
        soldeIntLabel.setEnabled(a);
        depotButton.setEnabled(a);
        retraitButton.setEnabled(a);
        virementButton.setEnabled(a);
         interetLabel.setEnabled(a);
        interetIntLabel.setEnabled(a);
        empruntLabel.setEnabled(a);
        intEmpruntLabel.setEnabled(a);
        empruntButton.setEnabled(a);
        if (!a) {
            typeCompteLabel.setText("");
            soldeIntLabel.setText("");
            interetIntLabel.setText("");
            intEmpruntLabel.setText("");
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
                empruntButton.setEnabled(false);
                empruntLabel.setEnabled(false);
                intEmpruntLabel.setEnabled(false);
            } else {
                typeCompteLabel.setText("Compte Epargne");
            }
            actuAccountSolde=rst.getInt("solde");
            soldeIntLabel.setText(rst.getString("solde"));
            interetIntLabel.setText(rst.getString("interet"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void closeConn() throws SQLException {
        this.conn.close();
        System.out.println("Fermeture de la connection");
    }

    public void initMenu() {
        JMenu utilisateur = new JMenu("Utilisateur");
        JMenuItem createUser = new JMenuItem("Nouveau Utilisateur");
        utilisateur.add(createUser);
        createUser.addActionListener((ActionEvent e) -> {
            createUser();
        });
        utilisateur.addSeparator();
        JMenuItem searchUser = new JMenuItem("Rechercher Utilisateur");
        utilisateur.add(searchUser);
        utilisateur.addSeparator();
        JMenuItem dropUser = new JMenuItem("Supprimer Utilisateur");
        utilisateur.add(dropUser);
        utilisateur.addSeparator();
        JMenuItem updateUser = new JMenuItem("Modifier Utilisateur");
        utilisateur.add(updateUser);
        jMenuBar1.add(utilisateur);
        
        JMenu compte = new JMenu("Compte");
        JMenuItem searchAccount = new JMenuItem("Rechercher un compte");
        compte.add(searchAccount);
        utilisateur.add(searchUser);
        jMenuBar1.add(compte);
    }

    public void createUser() {
        try {
            String query = "insert into user(name) values (\"" + (String) JOptionPane.showInputDialog(null, "Entrez un nom ", "Nouvel utilisateur", 1, new ImageIcon(""), null, "") + "\")";
            PreparedStatement ps = conn.prepareStatement(query);
            System.out.println(query);
            int rst = 0;
            rst = ps.executeUpdate();
            if (rst != 0) {
                System.out.println("Compte cree");
                init0();
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
        initcomboxUser();
        initComboxCompte();
        initTableau();
    }

}
