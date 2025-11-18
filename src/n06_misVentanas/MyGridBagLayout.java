package n06_misVentanas;

import javax.swing.*;
import java.awt.*;

public class MyGridBagLayout extends JFrame {

    public MyGridBagLayout() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("My GridBag Layout");
        setBounds(300, 500, 800, 800);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;  // Para estirar botones horizontalmente

        this.add(panelPrincipal);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");

        gbc.fill = GridBagConstraints.BOTH; // Para que ocupe todo el espacio disponible



        // Fila 0
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelPrincipal.add(button1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panelPrincipal.add(button2, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        panelPrincipal.add(button3, gbc);

        // Fila 2
        gbc.gridx = 1;
        gbc.gridy = 2;
        panelPrincipal.add(button5, gbc);

    }

    public static void main(String[] args) {
        MyGridBagLayout ventana = new MyGridBagLayout();
        ventana.setVisible(true);
    }
}
