import java.awt.*;
import java.awt.event.*;
class House extends Frame implements MouseListener {
Color doorColor = Color.BLUE;
boolean msg = true;
House() {
setTitle("Change Door Color");
setSize(500, 400);
setVisible(true);
addMouseListener(this);
addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
        dispose(); 
    }
});
}
public void paint(Graphics g) {
Graphics2D g2 = (Graphics2D) g;
g2.setColor(new Color(200, 255, 200));
g2.fillRect(0, 0, getWidth(), getHeight());
g2.setColor(Color.LIGHT_GRAY);
g2.fillRect(175, 150, 150, 150);
g2.setColor(Color.BLACK);
g2.drawRect(175, 150, 150, 150); 
if(msg){
g2.setColor(Color.BLACK);
g2.drawString("Click anywhere to change color of door from blue to red ",150,370);}
g2.setColor(Color.BLACK);
int[] xPoints = {150, 250, 350};
int[] yPoints = {150, 80, 150};
g2.fillPolygon(xPoints, yPoints, 3);
g2.setColor(doorColor);
g2.fillRect(230, 220, 40, 80); 
g2.setColor(Color.BLACK);
g2.drawRect(230, 220, 40, 80);
g2.setColor(Color.WHITE);
g2.fillRect(190, 180, 40, 40);
g2.setColor(Color.BLACK);
g2.drawRect(190, 180, 40, 40);
g2.drawLine(190, 200, 230, 200); 
g2.drawLine(210, 180, 210, 220); 
}
public void mouseClicked(MouseEvent e) {
doorColor = Color.RED;
msg = false;
repaint();
}
public void mousePressed(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
public static void main(String[] args) {
        new House();
    }}
