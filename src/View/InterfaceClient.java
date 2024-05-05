package View;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;

public class InterfaceClient extends JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;

    public InterfaceClient() {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.setDefaultCloseOperation(3);
        this.jLabel1.setFont(new Font("Segoe UI", 1, 24));
        this.jLabel1.setForeground(new Color(0, 51, 153));
        this.jLabel1.setText("Bienvenue ");
        this.jButton1.setBackground(new Color(0, 51, 153));
        this.jButton1.setFont(new Font("Segoe UI", 1, 16));
        this.jButton1.setForeground(new Color(255, 255, 255));
        this.jButton1.setText("demande réservation");
        this.jButton1.setFocusable(false);
        this.jButton2.setBackground(new Color(0, 51, 153));
        this.jButton2.setFont(new Font("Segoe UI", 1, 16));
        this.jButton2.setForeground(new Color(255, 255, 255));
        this.jButton2.setText("modifier réservation");
        this.jButton2.setFocusable(false);
        this.jButton3.setBackground(new Color(0, 51, 153));
        this.jButton3.setFont(new Font("Segoe UI", 1, 16));
        this.jButton3.setForeground(new Color(255, 255, 255));
        this.jButton3.setText("annuler réservation");
        this.jButton3.setFocusable(false);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jButton2, Alignment.TRAILING, -1, -1, 32767).addComponent(this.jButton1, -1, -1, 32767).addComponent(this.jButton3, Alignment.TRAILING, -1, -1, 32767)).addContainerGap()).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(132, 32767).addComponent(this.jLabel1, -2, 211, -2).addGap(57, 57, 57)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(27, 27, 27).addComponent(this.jLabel1).addGap(18, 18, 18).addComponent(this.jButton1, -2, 44, -2).addGap(18, 18, 18).addComponent(this.jButton2, -2, 44, -2).addGap(18, 18, 18).addComponent(this.jButton3, -2, 44, -2).addContainerGap(55, 32767)));
        this.pack();
        this.setVisible(true);
    }
}
