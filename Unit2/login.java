import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener
{
    JLabel uname, upass;
    JTextField tname,tpass;
    JButton submit , reset;
    login(String title)
    {
        super(title);
        uname = new JLabel("Username");
        upass = new JLabel("Password");
        tname = new JTextField(30);
        tpass = new JTextField(30);
        reset = new JButton("Rest");
        submit = new JButton("Submit");
        setLayout(new FlowLayout());
        add(uname);
        add(tname);
        add(upass);
        add(tpass);
        add(submit);
        add(reset);
        submit.addActionListener(this) ;
        reset.addActionListener(this);
        setLocation(100,100);
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new login("Login Verification");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        tname.setText("");
        tpass.setText("");

    }
}
