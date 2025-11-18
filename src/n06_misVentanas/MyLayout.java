package n06_misVentanas;

import javax.swing.*;
import java.awt.*;

public class MyLayout extends JFrame {

    public MyLayout() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("My Flow Layout");
        setBounds(300, 500, 400, 200);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.add(panelPrincipal);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        panelPrincipal.add(button1);
        panelPrincipal.add(button2);
        panelPrincipal.add(button3);
        panelPrincipal.add(button4);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyLayout();
    }
}



