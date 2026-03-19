import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class JDBCDemo extends JFrame implements ActionListener {
    JLabel uname, pass, cpass;
    JButton register, reset, exit;
    JTextField tname, tpass, tcpass;

    Connection con;
    Statement stmt;

    public JDBCDemo(String title) {
        super(title);

        uname = new JLabel("User name");
        pass = new JLabel("Password");
        cpass = new JLabel("Confirm Password");

        tname = new JTextField(40);
        tpass = new JTextField(40);
        tcpass = new JTextField(40);

        register = new JButton("Register");
        reset = new JButton("Reset");
        exit = new JButton("Exit");

        setLayout(new FlowLayout());

        add(uname);
        add(tname);
        add(pass);
        add(tpass);
        add(cpass);
        add(tcpass);
        add(register);
        add(reset);
        add(exit);

        register.addActionListener(this);
        reset.addActionListener(this);
        exit.addActionListener(this);

        setLocation(100, 100);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // FIX

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Nial",
                    "harman",
                    "Helsinki@6024"
            );

            stmt = con.createStatement();

            System.out.println("Connection Successful!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == register) {
            String str1 = tname.getText();
            String str2 = tpass.getText();
            String str3 = tcpass.getText();

            if(!str2.equals(str3)) {
                JOptionPane.showMessageDialog(this,"Passwords do not match");
                return;
            }

            String query = "insert into register values('"+str1+"','"+str2+"','"+str3+"')";
            System.out.println(query);

            try {
                int count = stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(this,"Insertion Successful");
            } catch(SQLException err) {
                System.out.println(err.getMessage());
            }
        }

        if(e.getSource() == reset) {
            tname.setText("");
            tpass.setText("");
            tcpass.setText("");
        }

        if(e.getSource() == exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {
        new JDBCDemo("Register Demo");
    }
}
