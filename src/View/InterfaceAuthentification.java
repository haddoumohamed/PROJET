package View;

<<<<<<< HEAD
import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class InterfaceAuthentification extends JFrame{
	 private JButton jButton1;
	    private JLabel jLabel1;
	    private JLabel jLabel2;
	    private JLabel jLabel4;
	    private JPasswordField jPasswordField1;
	    private JTextField jTextField1;

	    public InterfaceAuthentification() {
	        this.initComponents();
	    }

	    private void initComponents() {
	        this.jLabel1 = new JLabel();
	        this.jLabel2 = new JLabel();
	        this.jTextField1 = new JTextField();
	        this.jLabel4 = new JLabel();
	        this.jPasswordField1 = new JPasswordField();
	        this.jButton1 = new JButton();
	        this.setDefaultCloseOperation(3);
	        this.setBackground(new Color(255, 255, 255));
	        this.jLabel1.setBackground(new Color(51, 255, 0));
	        this.jLabel1.setFont(new Font("Segoe UI", 1, 24));
	        this.jLabel1.setForeground(new Color(0, 51, 153));
	        this.jLabel1.setText("se connecter");
	        this.jLabel2.setFont(new Font("Segoe UI", 1, 16));
	        this.jLabel2.setForeground(new Color(0, 51, 153));
	        this.jLabel2.setText("mot de passe ");
	        this.jTextField1.setFont(new Font("Segoe UI", 1, 16));
	        this.jTextField1.setForeground(new Color(0, 51, 153));
	        this.jTextField1.setText(" ");
	        this.jLabel4.setFont(new Font("Segoe UI", 1, 16));
	        this.jLabel4.setForeground(new Color(0, 51, 153));
	        this.jLabel4.setText("nom d'utilisateur");
	        this.jPasswordField1.setForeground(new Color(0, 51, 153));
	        this.jButton1.setBackground(new Color(0, 51, 153));
	        this.jButton1.setFont(new Font("Segoe UI", 1, 16));
	        this.jButton1.setForeground(new Color(255, 255, 255));
	        this.jButton1.setText("se connecter");
	        this.jButton1.setFocusable(false);
	        GroupLayout layout = new GroupLayout(this.getContentPane());
	        this.getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(109, 109, 109).addComponent(this.jLabel1, -2, 173, -2)).addGroup(layout.createSequentialGroup().addGap(23, 23, 23).addComponent(this.jTextField1, -2, 345, -2)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel4)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel2))).addGroup(layout.createSequentialGroup().addGap(21, 21, 21).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton1).addComponent(this.jPasswordField1, -2, 347, -2)))).addContainerGap(32, 32767)));
	        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(36, 36, 36).addComponent(this.jLabel1, -2, 36, -2).addGap(18, 18, 18).addComponent(this.jLabel4, -2, 22, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jTextField1, -2, 33, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel2, -2, 22, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jPasswordField1, -2, 35, -2).addGap(18, 18, 18).addComponent(this.jButton1).addContainerGap(33, 32767)));
	        this.pack();
	        this.setVisible(true);
	    }
}
=======
import javax.swing.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;

public class InterfaceAuthentification extends JFrame {
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JPasswordField jPasswordField1;
    private JTextField jTextField1;

    public InterfaceAuthentification() {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jLabel4 = new JLabel();
        this.jPasswordField1 = new JPasswordField();
        this.jButton1 = new JButton();
        this.setDefaultCloseOperation(3);
        this.setBackground(new Color(255, 255, 255));
        this.jLabel1.setBackground(new Color(51, 255, 0));
        this.jLabel1.setFont(new Font("Segoe UI", 1, 24));
        this.jLabel1.setForeground(new Color(0, 51, 153));
        this.jLabel1.setText("se connecter");
        this.jLabel2.setFont(new Font("Segoe UI", 1, 16));
        this.jLabel2.setForeground(new Color(0, 51, 153));
        this.jLabel2.setText("mot de passe ");
        this.jTextField1.setFont(new Font("Segoe UI", 1, 16));
        this.jTextField1.setForeground(new Color(0, 51, 153));
        this.jTextField1.setText(" ");
        this.jLabel4.setFont(new Font("Segoe UI", 1, 16));
        this.jLabel4.setForeground(new Color(0, 51, 153));
        this.jLabel4.setText("nom d'utilisateur");
        this.jPasswordField1.setForeground(new Color(0, 51, 153));
        this.jButton1.setBackground(new Color(0, 51, 153));
        this.jButton1.setFont(new Font("Segoe UI", 1, 16));
        this.jButton1.setForeground(new Color(255, 255, 255));
        this.jButton1.setText("se connecter");
        this.jButton1.setFocusable(false);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(109, 109, 109).addComponent(this.jLabel1, -2, 173, -2)).addGroup(layout.createSequentialGroup().addGap(23, 23, 23).addComponent(this.jTextField1, -2, 345, -2)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel4)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel2))).addGroup(layout.createSequentialGroup().addGap(21, 21, 21).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton1).addComponent(this.jPasswordField1, -2, 347, -2)))).addContainerGap(32, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(36, 36, 36).addComponent(this.jLabel1, -2, 36, -2).addGap(18, 18, 18).addComponent(this.jLabel4, -2, 22, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jTextField1, -2, 33, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel2, -2, 22, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jPasswordField1, -2, 35, -2).addGap(18, 18, 18).addComponent(this.jButton1).addContainerGap(33, 32767)));
        this.pack();
        this.setVisible(true);
    }
}

>>>>>>> 029475ddc8fd5077b1913e5898a80ba1c9bd76bc
