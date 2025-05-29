import java.awt.*;
import java.awt.event.*;

public class ButtonMouseEvents extends Frame implements MouseListener {

    Button btn;
    String msg = "";
    int mouseX = 0, mouseY = 0;

    public ButtonMouseEvents() {
        setTitle("Mouse Events on Button");
        setSize(400, 300);
        setLayout(null);  
        setVisible(true);

        btn = new Button("Hover / Click Me");
        btn.setBounds(130, 100, 120, 40);
        add(btn);

        btn.addMouseListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public void mouseClicked(MouseEvent e) {
        msg = "Mouse Clicked on Button";
        mouseX = e.getXOnScreen() - getLocationOnScreen().x;
        mouseY = e.getYOnScreen() - getLocationOnScreen().y;
        repaint();
    }
    public void mousePressed(MouseEvent e) {
        msg = "Mouse Pressed on Button";
        mouseX = e.getXOnScreen() - getLocationOnScreen().x;
        mouseY = e.getYOnScreen() - getLocationOnScreen().y;
        repaint();
    }
    public void mouseReleased(MouseEvent e) {
        msg = "Mouse Released on Button";
        mouseX = e.getXOnScreen() - getLocationOnScreen().x;
        mouseY = e.getYOnScreen() - getLocationOnScreen().y;
        repaint();
    }
    public void mouseEntered(MouseEvent e) {
        msg = "Mouse Entered Button";
        mouseX = 30;
        mouseY = 250;
        repaint();
    }
    public void mouseExited(MouseEvent e) {
        msg = "Mouse Exited Button";
        mouseX = 30;
        mouseY = 250;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }

    public static void main(String[] args) {
        new ButtonMouseEvents();
    }
}
