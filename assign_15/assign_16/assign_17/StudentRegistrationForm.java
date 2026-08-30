package assign_17;

import javax.swing.*;
import java.awt.event.*;

public class StudentRegistrationForm extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1;

    StudentRegistrationForm() {

        l1 = new JLabel("Student ID:");
        l1.setBounds(50, 50, 100, 30);

        t1 = new JTextField();
        t1.setBounds(150, 50, 150, 30);

        l2 = new JLabel("Student Name:");
        l2.setBounds(50, 100, 100, 30);

        t2 = new JTextField();
        t2.setBounds(150, 100, 150, 30);

        b1 = new JButton("Submit");
        b1.setBounds(120, 160, 100, 30);

        b1.addActionListener(this);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);

        setTitle("Student Registration Form");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(
                this,
                "Student ID: " + t1.getText() +
                "\nStudent Name: " + t2.getText()
        );
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}