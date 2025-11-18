package n06_misVentanas;

import javax.swing.*;
import java.awt.*;

public class MyBorderLayout extends JFrame {

    public MyBorderLayout() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("My Border Layout");
        setBounds(300, 500, 400, 200);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        this.add(panelPrincipal);

        JButton button1 = new JButton("NORTH");
        JButton button2 = new JButton("SOUTH");
        JButton button3 = new JButton("EAST");
        JButton button4 = new JButton("WEST");
        JButton button5 = new JButton("CENTER");

        panelPrincipal.add(button1, BorderLayout.NORTH);
        panelPrincipal.add(button2, BorderLayout.SOUTH);
        panelPrincipal.add(button3, BorderLayout.EAST);
        panelPrincipal.add(button4, BorderLayout.WEST);
        panelPrincipal.add(button5, BorderLayout.CENTER);

        setVisible(true);
    }
    public static void main(String[] args) {
        new MyBorderLayout();
    }

}


