import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login extends JFrame implements ActionListener
{
    JButton Login;
    JLabel label1,label2;
    JTextField  text1,text2;
    Login()
    {
        label1 = new JLabel();
        label1.setText("Username:");
        text1 = new JTextField(15);
        label2 = new JLabel();
        label2.setText("Password:");
        text2 = new JPasswordField(15);
        Login=new JButton("LOGIN");
        add(label1);
        add(text1);
        add(label2);
        add(text2);
        add(Login);
        Login.addActionListener(this);
        setTitle("HOSPITAL MANAGEMENT SYSTEM-LOGIN FORM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(new GridLayout(3, 1));
        setVisible(true);
    }
//To create event of the Login button
    public void actionPerformed(ActionEvent ae)
    {
        String value1=text1.getText();
        String value2=text2.getText();
        if (value1.equals("admin") && value2.equals("admin")) {
            //to login into menu page
            menupage page=new menupage();
            page.setVisible(true);
            dispose();
        }
        else {
            System.out.println("enter the valid username and password");
            JOptionPane.showMessageDialog(this,"Incorrect login or password", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
class loginpage {
    public static void main(String[] args) {
            Login lg = new Login();
    }
}