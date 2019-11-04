import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

class TrafficLights extends JPanel implements Runnable {

    private static final int RAY = 50;
    private static final int RED_POSITION_Y = 140;
    private static final int ORANGE_POSITION_Y = 195;
    private static final int GREEN_POSITION_Y = 255;
    private static final int X_POS = 370;
    boolean running = false;

    public TrafficLights() {
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawRoundRect(360, 130, 70, 190, 10, 10);
        drawLight(g, Color.BLACK, RED_POSITION_Y);
        drawLight(g, Color.BLACK, ORANGE_POSITION_Y);
        drawLight(g, Color.BLACK, GREEN_POSITION_Y);
      }

    public void drawLight(Graphics g, Color color, int yPos) {
        g.setColor(color); 
        g.fillOval(X_POS, yPos, RAY, RAY); 
    }

    public void init() {
        running = false;
        drawLight(getGraphics(), Color.BLACK, RED_POSITION_Y);
        drawLight(getGraphics(), Color.BLACK, ORANGE_POSITION_Y);
        drawLight(getGraphics(), Color.BLACK, GREEN_POSITION_Y);
    }

    @Override
    public void run() {
        running = true;   
        try {
            while (running) {
                drawLight(getGraphics(), Color.GREEN, RED_POSITION_Y);
                drawLight(getGraphics(), Color.BLACK, ORANGE_POSITION_Y);
                drawLight(getGraphics(), Color.BLACK, GREEN_POSITION_Y);
                Thread.sleep(2000);
                if(!running) break;

                drawLight(getGraphics(), Color.BLACK, RED_POSITION_Y);
                drawLight(getGraphics(), Color.ORANGE, ORANGE_POSITION_Y);
                drawLight(getGraphics(), Color.BLACK, GREEN_POSITION_Y);
                Thread.sleep(2000);
                if(!running) break;
                
                drawLight(getGraphics(), Color.BLACK, RED_POSITION_Y);
                drawLight(getGraphics(), Color.BLACK, ORANGE_POSITION_Y);
                drawLight(getGraphics(), Color.RED, GREEN_POSITION_Y);
                Thread.sleep(2000);
                if(!running) break;
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}