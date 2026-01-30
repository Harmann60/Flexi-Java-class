package extra;
import javax.swing.*;
public class GUI extends JFrame
{
  GUI(String title)
  {
    super(title);
        JLabel uname = new JLabel("User  Name");
        JLabel password = new JLabel("Passowrd");
        JTextField tname = new JTextField(20);
        JTextField tpass = new JTextField(20);
        JButton submit = new JButton("Submit");
        JButton reset = new JButton("Reset");
        setLayout(new FlowLayout());
        add(uname);
        add(tname);
        add(password);
        add(tpass);
        add(submit);
        add(reset);
        setLocation(400,200);
        setSize(400, 200);
        setVisible(true);
  }
  public static void main(String args[])
  {
    new GUI("First GUI Program");
  }

//basic Ui implementation 