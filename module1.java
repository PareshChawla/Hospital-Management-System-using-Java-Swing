import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 class module1 extends JFrame  {
     JLabel patient_name, father_name, aadhar_number, choose_doctor_text, patient_illness_text;
     JTextField patient_text, father_text, aadhar_text;
     JButton submit,back;
     JComboBox choose_doctor, patient_illness;

     public module1() {
         patient_name = new JLabel("Patient Name");
         patient_text = new JTextField(15);
         father_name = new JLabel("Father Name");
         father_text = new JTextField(15);
         patient_illness_text = new JLabel("Patient Illness");
         patient_illness = new JComboBox<>();
         aadhar_number = new JLabel("Aadhar Number");
         aadhar_text = new JTextField(15);
         choose_doctor_text = new JLabel("Choose Doctor");
         choose_doctor = new JComboBox<>();
         submit = new JButton("SUBMIT");
         //To add listener to submit button
         submit.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
                 submitActionPerformed(evt);
             }
         });
         back = new JButton("Go Back");
         back.setText("GO BACK");
         //To add listener to back button
         back.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
                 backActionPerformed(evt);
             }
         });
         add(patient_name);
         add(patient_text);
         add(father_name);
         add(father_text);
         add(patient_illness_text);
         patient_illness.setModel(new DefaultComboBoxModel<>(new String[]{"Fever", "FLU", "BloodPressure", "Cancer"}));
         add(patient_illness);
         add(aadhar_number);
         add(aadhar_text);
         add(choose_doctor_text);
         choose_doctor.setModel(new DefaultComboBoxModel<>(new String[]{"Dr. David", "Dr. Paresh", "Dr. Vivek", "Dr. Hassan", "Dr. Tina"}));
         add(choose_doctor);
         add(submit);
         add(back);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new GridLayout(6, 1,20,20));
         setTitle("Patient Form!");
         setSize(500, 500);
         setVisible(true);
     }
//To create the instance and object of module1
     public static void main(String[] args) {
         module1 m1 = new module1();
     }

//To show message in the dialog box
     public void submitActionPerformed(ActionEvent evt) {
         String pname = patient_text.getText();
         String fname = father_text.getText();
         String Cnic = aadhar_text.getText();
         String pill = patient_illness.getSelectedItem().toString();
         String cdoc = choose_doctor.getSelectedItem().toString();
         JOptionPane.showMessageDialog(rootPane, "Patient Name: " + pname + "\nFather Name: " + fname + "\nCnic: " + Cnic + "\nIllness is: " +pill+ "\nChosen Doctor is: " +cdoc+ "\n\n Data has been Submitted");
     }

//go back button to go back from module 1 to menu page
     public void backActionPerformed(ActionEvent evt) {
         menupage mn = new menupage();
         mn.setVisible(true);
         dispose();
     }
 }