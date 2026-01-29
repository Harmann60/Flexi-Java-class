package extra;
import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame
  {
    Menu(String title)
    {
      super(title);
      JMenu menu = new JMenu("File");
      JMenu edit = new JMenu("Edit");
      JMenu help = new JMenu("Help");
      JMenuBar menubar = new JMenu();
      menubar.add(file);
      menubar.add(edit);
      menubar.add(help);
      setLayout(new FlowLayout());
      add(menubar);
      setLocation(200,200);
      setSize(300,400);
      setVisible(true);
    }
    public static void main(String[] args)
    {
      new Menu("HERE ITS GOES");
    }
