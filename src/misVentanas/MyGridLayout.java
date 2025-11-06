package misVentanas;

import javax.swing.*;
import java.awt.*;

public class MyGridLayout extends JFrame {

    public MyGridLayout() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("My Grid Layout");
        setBounds(300, 500, 800, 800);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(3,3,5,4)); // 3 filas, 2 columnas
        this.add(panelPrincipal);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");

        panelPrincipal.add(button1);
        panelPrincipal.add(button2);
        panelPrincipal.add(button3);
        panelPrincipal.add(button4);
        panelPrincipal.add(button5);
        panelPrincipal.add(button6);


    }

    public static void main(String[] args) {
        MyGridLayout ventana = new MyGridLayout();
        ventana.setVisible(true);
    }
}
