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

    //FPS
    int FPS =60;

    KeyHandler keyH = new KeyHandler();

    Thread gameThread;
    //Set player s default position
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;

    public PanelJuego() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        while(gameThread !=null) {

            // 1 ACTUALIZAR INFORMACION DE LA POSICION DEL PERSONAJE
            update();

            //2 DIBUJAR EN LA PANTALLA LA ACTUALIZACION DEL PERSONAJE
            repaint();
        }

    }

    public void update() {
        if(keyH.upPressed == true) {
            playerY -= playerSpeed;
        }
        else if(keyH.downPressed == true) {
            playerY += playerSpeed;
        }
        else if(keyH.leftPressed == true) {
            playerX -= playerSpeed;
        }
        else if(keyH.rightPressed == true) {
            playerX += playerSpeed;
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.white);
        g2.fillRect(playerX, playerY,tileSize , tileSize);
        g2.dispose();

    }
}
