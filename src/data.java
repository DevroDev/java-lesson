//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class data extends JFrame implements ActionListener {
    JLabel lblName;
    JLabel lblAddress;
    JLabel lblPhone;
    JLabel lblEmail;
    JTextField txtName;
    JTextField txtAddress;
    JTextField txtPhone;
    JTextField txtEmail;
    JTextArea jta = new JTextArea();
    JScrollPane jsp;
    JButton btnSave;
    JButton btnShow;
    JButton btnClose;
    JPanel P1;
    JPanel P2;

    public data() {
        super("Student Entry");
        this.setDefaultCloseOperation(3);
        this.setLayout((LayoutManager)null);
        this.P1 = new JPanel();
        this.P1.setBorder(BorderFactory.createTitledBorder("Enter Student Information"));
        this.P1.setBounds(0, 0, 250, 170);
        this.P1.setLayout((LayoutManager)null);
        this.lblName = new JLabel("Name");
        this.lblName.setBounds(10, 20, 100, 25);
        this.P1.add(this.lblName);
        this.lblAddress = new JLabel("Address");
        this.lblAddress.setBounds(10, 50, 100, 25);
        this.P1.add(this.lblAddress);
        this.lblPhone = new JLabel("Phone Number");
        this.lblPhone.setBounds(10, 80, 100, 25);
        this.P1.add(this.lblPhone);
        this.lblEmail = new JLabel("Email");
        this.lblEmail.setBounds(10, 110, 100, 25);
        this.P1.add(this.lblEmail);
        this.txtName = new JTextField();
        this.txtName.setBounds(120, 20, 120, 25);
        this.P1.add(this.txtName);
        this.txtAddress = new JTextField();
        this.txtAddress.setBounds(120, 50, 120, 25);
        this.P1.add(this.txtAddress);
        this.txtPhone = new JTextField();
        this.txtPhone.setBounds(120, 80, 120, 25);
        this.P1.add(this.txtPhone);
        this.txtEmail = new JTextField();
        this.txtEmail.setBounds(120, 110, 120, 25);
        this.P1.add(this.txtEmail);
        this.btnSave = new JButton("Save");
        this.btnSave.setBounds(5, 140, 70, 25);
        this.btnSave.setMnemonic('S');
        this.btnSave.addActionListener(this);
        this.P1.add(this.btnSave);
        this.btnShow = new JButton("Show List");
        this.btnShow.setBounds(80, 140, 90, 25);
        this.btnShow.setMnemonic('L');
        this.btnShow.addActionListener(this);
        this.P1.add(this.btnShow);
        this.btnClose = new JButton("Close");
        this.btnClose.setBounds(175, 140, 70, 25);
        this.btnClose.setMnemonic('C');
        this.btnClose.addActionListener(this);
        this.P1.add(this.btnClose);
        this.P2 = new JPanel();
        this.P2.setBorder(BorderFactory.createTitledBorder("All Students Information"));
        this.P2.setBounds(0, 140, 250, 170);
        this.P2.setLayout((LayoutManager)null);
        this.jsp = new JScrollPane(this.jta);
        this.jsp.setBounds(5, 20, 240, 140);
        this.P2.add(this.jsp);
        this.add(this.P1);
        this.add(this.P2);
        this.setBounds(100, 100, 255, 340);
        this.setVisible(true);
        this.setResizable(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(this.btnSave)) {
            if (this.txtName.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Name");
                this.txtName.requestFocus(true);
            } else if (this.txtAddress.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Address");
                this.txtAddress.requestFocus(true);
            } else if (this.txtPhone.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Phone");
                this.txtPhone.requestFocus(true);
            } else if (this.txtEmail.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Email");
                this.txtEmail.requestFocus(true);
            } else {
                this.saveRecord();
            }

        } else if (ae.getSource().equals(this.btnShow)) {
            this.showAllRecord();
        } else {
            if (ae.getSource().equals(this.btnClose) && JOptionPane.showConfirmDialog(this, "Are you sure want to close?", "Confirm Message", 0, 3) == 0) {
                System.exit(0);
            }

        }
    }

    public void saveRecord() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Record.txt", true));
            bw.write(this.txtName.getText() + "|" + this.txtAddress.getText() + "|" + this.txtPhone.getText() + "|" + this.txtEmail.getText() + System.getProperty("line.separation"));
            bw.flush();
            bw.close();
            this.txtName.setText("");
            this.txtAddress.setText("");
            this.txtPhone.setText("");
            this.txtEmail.setText("");
            this.txtName.requestFocus(true);
            JOptionPane.showMessageDialog(this, "This Record is successfully save");
        } catch (IOException var2) {
            JOptionPane.showMessageDialog(this, "Save denied");
        }

    }

    public void showAllRecord() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Record.txt"));
            this.jta.setText("");

            String line;
            while((line = br.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(line, "|");

                while(stk.hasMoreElements()) {
                    this.jta.append("\n");
                }
            }

            br.close();
        } catch (FileNotFoundException var4) {
            JOptionPane.showMessageDialog(this, "File is not found to read");
        } catch (IOException var5) {
            JOptionPane.showMessageDialog(this, "Can't read data from file");
        }

    }

    public static void main(String[] args) {
        new data();
    }
}
