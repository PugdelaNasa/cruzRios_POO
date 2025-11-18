package MiJuego2D;

import javax.swing.*;
import java.awt.*;

public class PanelJuego extends JPanel implements Runnable {
    //CONFIGURACION PANTALLA
    final int originalTileSize = 16; //16x16
    final int scale = 3;

    final int tileSize = originalTileSize * scale; //48x48
    final int maxScreenCol =16; //horzional
    final int maxScreenRow=12; // vertical

    final int screenWidth = maxScreenCol*tileSize; //768 px
    final int screenHeight = maxScreenRow*tileSize;//576 px

    Thread gameThread;

    public PanelJuego() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        while(gameThread !=null) {

            // 1 ACTUALIZAR INFORMACION DE LA POSICION DEL PERSONAJE

            //2 DIBUJAR EN LA PANTALLA LA ACTUALIZACION DEL PERSONAJE
        }

    }
}
