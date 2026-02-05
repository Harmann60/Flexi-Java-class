// Non working Calc
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    JButton button[] = new JButton[10];
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton mul = new JButton("*");
    JButton div = new JButton("/");
    JButton equal = new JButton("=");
    Integer n1 = 0;
    login(String title) {
        super(title);
        for (JButton i : button) {
            i = new JButton(n1.toString());
            add(i);
            n1++;
        }
        add(plus);
        add(minus);
        add(mul);
        add(div);
        add(equal);
        setLayout(new GridLayout(3, 4));
        setLocation(100, 100);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new login("Calculator");
    }
}

