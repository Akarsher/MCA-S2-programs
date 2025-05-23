import javax.swing.*;
import java.awt.*;

public class DrawPerson extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set color
        g.setColor(Color.BLACK);

        // Draw head (circle)
        g.fillOval(90, 20, 50, 50);
        
        // Draw facial features
        g.setColor(Color.WHITE); // Eyes
        g.fillOval(105, 35, 7, 7);
        g.fillOval(118, 35, 7, 7);
        
        g.setColor(Color.BLACK); // Pupils
        g.fillOval(108, 37, 3, 3);
        g.fillOval(121, 37, 3, 3);
        
        g.drawArc(105, 45, 20, 10, 0, -180); // Smile

        // Draw hair
        g.setColor(Color.BLACK);
        g.fillArc(90, 15, 50, 30, 0, 180);

        // Draw body (rectangle)
        g.fillRect(105, 70, 20, 60);
        
        // Draw arms (lines)
        g.drawLine(105, 80, 70, 120);
        g.drawLine(125, 80, 160, 120);
        
        // Draw legs (lines)
        g.drawLine(105, 130, 80, 180);
        g.drawLine(125, 130, 150, 180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Person Drawing");
        DrawPerson panel = new DrawPerson();
        frame.add(panel);
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

