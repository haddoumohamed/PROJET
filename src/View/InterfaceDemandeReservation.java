package View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class InterfaceDemandeReservation extends JFrame {
	 private ButtonGroup buttonGroup1;
	    private JButton jButton1;
	    private JCheckBox jCheckBox1;
	    private JLabel jLabel1;
	    private JLabel jLabel2;
	    private JLabel jLabel3;
	    private JLabel jLabel4;
	    private JLabel jLabel5;
	    private JLabel jLabel6;
	    private JLabel jLabel7;
	    private JLabel jLabel8;
	    private JLabel jLabel9;
	    private JTextField jTextField1;
	    private JTextField jTextField10;
	    private JTextField jTextField2;
	    private JTextField jTextField3;
	    private JTextField jTextField5;
	    private JTextField jTextField6;
	    private JTextField jTextField7;
	    private JTextField jTextField8;
	    private JTextField jTextField9;

	    public InterfaceDemandeReservation() {
	        this.initComponents();
	    }

	    private void initComponents() {
	        this.buttonGroup1 = new ButtonGroup();
	        this.jLabel1 = new JLabel();
	        this.jCheckBox1 = new JCheckBox();
	        this.jLabel2 = new JLabel();
	        this.jLabel3 = new JLabel();
	        this.jLabel4 = new JLabel();
	        this.jLabel5 = new JLabel();
	        this.jLabel6 = new JLabel();
	        this.jTextField2 = new JTextField();
	        this.jTextField3 = new JTextField();
	        this.jLabel7 = new JLabel();
	        this.jTextField5 = new JTextField();
	        this.jTextField1 = new JTextField();
	        this.jTextField6 = new JTextField();
	        this.jTextField7 = new JTextField();
	        this.jTextField8 = new JTextField();
	        this.jLabel8 = new JLabel();
	        this.jTextField9 = new JTextField();
	        this.jTextField10 = new JTextField();
	        this.jLabel9 = new JLabel();
	        this.jButton1 = new JButton();
	        this.setDefaultCloseOperation(3);
	        this.jLabel1.setFont(new Font("Segoe UI", 1, 24));
	        this.jLabel1.setForeground(new Color(0, 51, 153));
	        this.jLabel1.setText("demande réservation");
	        this.jCheckBox1.setBackground(new Color(0, 51, 153));
	        this.jCheckBox1.setFont(new Font("Segoe UI", 1, 16));
	        this.jCheckBox1.setForeground(new Color(255, 255, 255));
	        this.jCheckBox1.setText("vip");
	        this.jCheckBox1.setFocusable(false);
	        this.jLabel2.setFont(new Font("Segoe UI", 1, 16));
	        this.jLabel2.setForeground(new Color(0, 51, 153));
	        this.jLabel2.setText("nombre de lit ");
	        this.jLabel3.setFont(new Font("Segoe UI", 1, 16));
	        this.jLabel3.setForeground(new Color(0, 51, 153));
	        this.jLabel3.setText("date début :");
	        this.jLabel4.setFont(new Font("Segoe UI", 1, 16));
	        this.jLabel4.setForeground(new Color(0, 51, 153));
	        this.jLabel4.setText("jour :");
	        this.jLabel5.setFont(new Font("Segoe UI", 1, 16));
	        this.jLabel5.setForeground(new Color(0, 51, 153));
	        this.jLabel5.setText("mois :");
	        this.jLabel6.setFont(new Font("Segoe UI", 1, 16));
	        this.jLabel6.setForeground(new Color(0, 51, 153));
	        this.jLabel6.setText("année  :");
	        this.jTextField2.setFont(new Font("Segoe UI", 1, 16));
	        this.jTextField2.setForeground(new Color(0, 51, 153));
	        this.jTextField2.setText(" ");
	        this.jTextField3.setFont(new Font("Segoe UI", 1, 16));
	        this.jTextField3.setForeground(new Color(0, 51, 153));
	        this.jTextField3.setText(" ");
	        this.jLabel7.setFont(new Font("Segoe UI", 1, 16));
	        this.jLabel7.setForeground(new Color(0, 51, 153));
	        this.jLabel7.setText("date fin :");
	        this.jTextField5.setFont(new Font("Segoe UI", 1, 15));
	        this.jTextField5.setForeground(new Color(0, 51, 153));
	        this.jTextField5.setText(" ");
	        this.jTextField1.setFont(new Font("Segoe UI", 1, 16));
	        this.jTextField1.setForeground(new Color(0, 51, 153));
	        this.jTextField1.setText("jour :");

	        this.jTextField6.setFont(new Font("Segoe UI", 1, 16));
	        this.jTextField6.setForeground(new Color(0, 51, 153));
	        this.jTextField6.setText(" ");
	        this.jTextField7.setFont(new Font("Segoe UI", 1, 16));
	        this.jTextField7.setForeground(new Color(0, 51, 153));
	        this.jTextField7.setText("jour :");
	        this.jTextField8.setFont(new Font("Segoe UI", 1, 16));
	        this.jTextField8.setForeground(new Color(0, 51, 153));
	        this.jTextField8.setText(" ");
	        this.jLabel8.setFont(new Font("Segoe UI", 1, 16));
	        this.jLabel8.setForeground(new Color(0, 51, 153));
	        this.jLabel8.setText("mois :");
	        this.jTextField9.setFont(new Font("Segoe UI", 1, 16));
	        this.jTextField9.setForeground(new Color(0, 51, 153));
	        this.jTextField9.setText(" ");
	        this.jTextField10.setFont(new Font("Segoe UI", 1, 16));
	        this.jTextField10.setForeground(new Color(0, 51, 153));
	        this.jTextField10.setText(" ");
	        this.jLabel9.setFont(new Font("Segoe UI", 1, 16));
	        this.jLabel9.setForeground(new Color(0, 51, 153));
	        this.jLabel9.setText("année  :");
	        this.jButton1.setBackground(new Color(0, 51, 153));
	        this.jButton1.setFont(new Font("Segoe UI", 1, 16));
	        this.jButton1.setForeground(new Color(255, 255, 255));
	        this.jButton1.setText("envoyer");
	        this.jButton1.setFocusable(false);
	        GroupLayout layout = new GroupLayout(this.getContentPane());
	        this.getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jLabel8, -2, 67, -2)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel4, -2, 61, -2).addComponent(this.jLabel3, -2, 140, -2).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jTextField7, -2, 71, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jTextField2, -2, 71, -2))).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel5, -2, 61, -2)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jTextField1, -2, 71, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jTextField8, -2, 71, -2).addGap(85, 85, 85))).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jTextField3, -2, 71, -2).addComponent(this.jTextField10, -2, 71, -2)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel6, -2, 61, -2).addGap(18, 18, 18).addComponent(this.jTextField6, -2, 71, -2).addContainerGap(-1, 32767)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jLabel9, -2, 61, -2).addPreferredGap(ComponentPlacement.RELATED, 20, 32767).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jButton1).addComponent(this.jTextField9, -2, 71, -2)).addGap(24, 24, 24)))).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel2, -2, 140, -2)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jTextField5, -2, 71, -2)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel7, -2, 140, -2)).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jCheckBox1, -2, 85, -2))).addContainerGap(-1, 32767)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jLabel1, -2, 245, -2).addGap(135, 135, 135)));
	        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(31, 31, 31).addComponent(this.jLabel1).addGap(40, 40, 40).addComponent(this.jLabel4, -2, 0, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jTextField5, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel3).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextField2, -2, -1, -2).addComponent(this.jLabel5).addComponent(this.jTextField3, -2, -1, -2).addComponent(this.jLabel6).addComponent(this.jTextField6, -2, -1, -2).addComponent(this.jTextField7, -2, -1, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jLabel7).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextField1, -2, -1, -2).addComponent(this.jTextField8, -2, -1, -2).addComponent(this.jLabel8, -2, 28, -2).addComponent(this.jTextField9, -2, -1, -2).addComponent(this.jTextField10, -2, -1, -2).addComponent(this.jLabel9)).addPreferredGap(ComponentPlacement.RELATED, 33, 32767).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jCheckBox1).addComponent(this.jButton1)).addContainerGap()));
	        this.pack();
	        this.setVisible(true);
	    }
}
