package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class InterfaceAdministrateur extends JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;

    public InterfaceAdministrateur() {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jButton4 = new JButton();
        this.setDefaultCloseOperation(3);
        this.jLabel1.setFont(new Font("Segoe UI", 1, 24));
        this.jLabel1.setForeground(new Color(0, 51, 153));
        this.jLabel1.setText("Bienvenue mr admin");
        this.jButton1.setBackground(new Color(0, 51, 153));
        this.jButton1.setFont(new Font("Segoe UI", 1, 16));
        this.jButton1.setForeground(new Color(255, 255, 255));
        this.jButton1.setText("créer chambre");
        this.jButton1.setFocusable(false);
        this.jButton2.setBackground(new Color(0, 51, 153));
        this.jButton2.setFont(new Font("Segoe UI", 1, 16));
        this.jButton2.setForeground(new Color(255, 255, 255));
        this.jButton2.setText("modifier chambre");
        this.jButton2.setFocusable(false);
        this.jButton3.setBackground(new Color(0, 51, 153));
        this.jButton3.setFont(new Font("Segoe UI", 1, 16));
        this.jButton3.setForeground(new Color(255, 255, 255));
        this.jButton3.setText("supprimer chambre");
        this.jButton3.setFocusable(false);
        this.jButton4.setBackground(new Color(0, 51, 153));
        this.jButton4.setFont(new Font("Segoe UI", 1, 16));
        this.jButton4.setForeground(new Color(255, 255, 255));
        this.jButton4.setText("accéder aux demandes");
        this.jButton4.setFocusable(false);

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(85, 85, 85).addComponent(this.jLabel1, -2, 259, -2)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jButton1, -2, 421, -2))).addGap(0, 1, 32767)).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jButton3, -1, -1, 32767).addComponent(this.jButton2, -1, -1, 32767).addComponent(this.jButton4, -1, -1, 32767)))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(26, 26, 26).addComponent(this.jLabel1, -2, 38, -2).addGap(18, 18, 18).addComponent(this.jButton1).addGap(18, 18, 18).addComponent(this.jButton3).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jButton2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jButton4).addContainerGap(61, 32767)));
        this.pack();
        this.setVisible(true);
    }
}
