import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HouseDrawing extends JPanel {
    private Color doorColor = Color.BLUE;

    public HouseDrawing() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (new Rectangle(130, 170, 40, 80).contains(e.getPoint())) {
                    doorColor = Color.RED;
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw house body
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(50, 100, 200, 150);

        // Draw roof
        g.setColor(Color.DARK_GRAY);
        int[] xPoints = {50, 150, 250};
        int[] yPoints = {100, 30, 100};
        g.fillPolygon(xPoints, yPoints, 3);

        // Draw door
        g.setColor(doorColor);
        g.fillRect(130, 170, 40, 80);

        // Draw windows
        g.setColor(Color.WHITE);
        g.fillRect(65, 120, 40, 40);
        g.fillRect(195, 120, 40, 40);

        // Draw house name
        g.setColor(Color.BLACK);
        g.drawString("Thankan's Home", 110, 140);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("House Drawing");
        HouseDrawing panel = new HouseDrawing();
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

