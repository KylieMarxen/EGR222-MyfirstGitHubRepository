import java.awt.*;

public class TrainCar {
    public static void main(String[] args){
         DrawingPanel panel = new DrawingPanel(200,100);
         Graphics g = panel.getGraphics();
         //Train body
         g.fillRect(40,10,100,50);
         //windshield
         g.setColor(Color.CYAN);
         g.fillRect(110,20,30,20);
         //wheels
        g.setColor(Color.RED);
        for (int i = 0; i < 5; i++) {
            //             x  y     w       h
            g.fillOval(20 * i + 40,50,20,20);
        }

        }
}
