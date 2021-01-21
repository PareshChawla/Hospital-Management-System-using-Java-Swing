import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class module2 extends JFrame  {
    JLabel dat, af, po;
    JComboBox doc, ap, pay;
    JButton ok,back;

    public module2() {
        dat = new JLabel("Doctor Appointment Time");
        doc = new JComboBox();
        af = new JLabel("Appointment Fee");
        ap = new JComboBox();
        po = new JLabel("Payment Option");
        pay = new JComboBox();
        ok = new JButton("OK");
        //to add listener to Ok button
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        back = new JButton("Go Back");
       //To add listener to Go Back label
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        add(dat);
        doc.setModel(new DefaultComboBoxModel<>(new String[]{"Dr.David (10:00am)", "Dr.Vivek (11:00am)", "Dr.Paresh(12:00pm)", "Dr.Tina(1:00pm)", "Dr.Hassan(2:00pm)"}));
        add(doc);
        add(af);
        ap.setModel(new DefaultComboBoxModel<>(new String[]{"Dr.David (100USD$)", "Dr.Vivek(200USD$)", "Dr.Paresh(3000USD$)", "Dr.Tina(400USD$)", "Dr.Hassan(500USD$)"}));
        add(ap);
        add(po);
        pay.setModel(new DefaultComboBoxModel<>(new String[]{"cash", "credit card", "Already paid"}));
        add(pay);
        add(ok);
        add(back);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1,50,50));
        setTitle("Doctor Availabilty- Choose Your Doctor");
        setSize(500, 500);
        setVisible(true);
    }

//To create the instance and object of module 2
    public static void main(String[] args) {
        module2 m = new module2();
    }

//To show message in the dialog box
    public void okActionPerformed(ActionEvent evt) {
        String d = doc.getSelectedItem().toString();
        String c = ap.getSelectedItem().toString();
        String cd = pay.getSelectedItem().toString();
        JOptionPane.showMessageDialog(rootPane, "Time: " + d + "\nFee: " + c + "\nPayement Option: " + cd);
    }
//go back button to go back from module 2 to menu page
public void backActionPerformed(ActionEvent evt) {
    menupage mn = new menupage();
    mn.setVisible(true);
    dispose();
    }
}