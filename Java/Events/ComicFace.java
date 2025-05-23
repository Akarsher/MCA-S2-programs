import java.awt.*;
public class ComicFace extends Frame {
Color c1;
public ComicFace ()
{
setVisible(true);
setSize(600, 600);
c1=new Color(190,120,140);
setBackground(c1);
}
public void paint(Graphics g)
{
//Draw the face
g.drawOval(100,100,250,250);
//Draw the left eye
g.fillArc(170,185,25,25,20,180);
//Draw the right eye
g.fillArc(255,185,25,25,40,180);
//Draw the smile
g.drawArc(150,215,150,100,0,-180);
}
public static void main(String[] args)
{
new ComicFace();
}
}
