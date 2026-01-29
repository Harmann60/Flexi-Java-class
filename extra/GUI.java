package extra;
import javax.swing.*;
public class GUI extends JFrame
{
  GUI(String title)
  {
    super(title);
    setSize(400,200);
    setVisible(true);
  }
  public static void main(String args[])
  {
    new GUI("First GUI Program");
  }
