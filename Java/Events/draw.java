import java.awt.*;
import java.awt.event.*;
public class draw extends Frame implements ItemListener {
Choice sc;
String ss = "";
draw() {
setTitle("Shape Drawer");
sc = new Choice();
sc.add("Rectangle");
sc.add("Triangle");
sc.add("Square");
sc.add("Circle");
sc.addItemListener(this);
setLayout(null);
sc.setBounds(50, 50, 120, 30);
add(sc);
setSize(400, 400);
setVisible(true);
}
public void itemStateChanged(ItemEvent e) {
ss = sc.getSelectedItem();
repaint(); 
}
public void paint(Graphics g) {
g.clearRect(0, 100, getWidth(), getHeight()); 
g.setColor(Color.BLACK);
switch (ss) {
case "Rectangle":
g.drawRect(100, 150, 150, 80); break;
case "Square":
g.drawRect(100, 150, 100, 100); break;
case "Circle":
g.drawOval(100, 150, 100, 100); break;
case "Triangle":
int x[] = {100, 175, 250};
int y[] = {230, 130, 230};
g.drawPolygon(x, y, 3); break;}}
public static void main(String[] args) {
new draw(); 
}}
