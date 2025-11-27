import javax.swing.*;
import java.awt.*;

public class ventana extends JFrame {

    public ventana() {
        setTitle("Cursor personalizado");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Fondo negro
        getContentPane().setBackground(Color.BLACK);

        // Cargar imagen del cursor
        ImageIcon icono = new ImageIcon("pruebaCursor/pico_32.png");
        Image imagenCursor = icono.getImage();

        System.out.println("Ancho: " + imagenCursor.getWidth(null));
        System.out.println("Alto: " + imagenCursor.getHeight(null));

        Point hotspot = new Point(0, 0);

        Cursor cursor = Toolkit.getDefaultToolkit()
                .createCustomCursor(imagenCursor, hotspot, "cursor");

        setCursor(cursor);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ventana();
    }
}
