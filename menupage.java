import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class menupage extends JFrame {
    JButton df, pa;
    JLabel log;

    menupage() {
        df = new JButton("Patient Form");
        pa = new JButton("Doctor Availability");
        log = new JLabel("Log Out");
        add(df);
        add(pa);
        add(log);
 //To add listener to df(doctor form) button
        df.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dfActionPerformed(evt);
            }
        });

//To add listener to pa(patient availability) button
        pa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                paActionPerformed(evt);
            }
        });
//To add listener to logout label
        log.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                logMouseClicked(evt);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Menu Page");
        setSize(500, 500);
        setVisible(true);
        setLayout(new GridLayout(2, 2,30,30));

    }
//To create the instance and object of menu page
    public static void main(String[] args) {
        menupage n = new menupage();
    }
//To open the doctor form
    public void dfActionPerformed(ActionEvent evt) {
        module1 obj = new module1();
        obj.setVisible(true);
        dispose();
    }
// To open the patient availability form
    public void paActionPerformed(ActionEvent evt) {
        module2 obj=new module2();
        obj.setVisible(true);
        dispose();
    }
// To logout from the menu page
    public void logMouseClicked(MouseEvent evt) {
        Login obj=new Login();
        obj.setVisible(true);
        dispose();
    }
}




