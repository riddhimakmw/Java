package assign_17;

import javax.swing.*;
import java.awt.event.*;

public class EmployeeRegistrationForm extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1;

    EmployeeRegistrationForm() {

        l1 = new JLabel("Employee ID:");
        l1.setBounds(50, 50, 100, 30);

        t1 = new JTextField();
        t1.setBounds(180, 50, 150, 30);

        l2 = new JLabel("Name:");
        l2.setBounds(50, 100, 100, 30);

        t2 = new JTextField();
        t2.setBounds(180, 100, 150, 30);

        l3 = new JLabel("Department:");
        l3.setBounds(50, 150, 100, 30);

        t3 = new JTextField();
        t3.setBounds(180, 150, 150, 30);

        l4 = new JLabel("Salary:");
        l4.setBounds(50, 200, 100, 30);

        t4 = new JTextField();
        t4.setBounds(180, 200, 150, 30);

        b1 = new JButton("Submit");
        b1.setBounds(140, 260, 100, 30);

        b1.addActionListener(this);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);

        setTitle("Employee Registration Form");
        setSize(450, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String id = t1.getText();
        String name = t2.getText();
        String dept = t3.getText();
        String salary = t4.getText();
        JOptionPane.showMessageDialog(
                this,
                "Employee ID: " + id +
                "\nName: " + name +
                "\nDepartment: " + dept +
                "\nSalary: " + salary
        );
    }
    public static void main(String[] args) {
        new EmployeeRegistrationForm();
    }
}