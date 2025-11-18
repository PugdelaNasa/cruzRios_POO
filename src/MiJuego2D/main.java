package MiJuego2D;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("MiJuego2D");

        PanelJuego panelJuego = new PanelJuego();
        window.add(panelJuego);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
