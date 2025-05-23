import java.awt.*;
import java.awt.event.*;
class CBD implements ActionListener
{
Button b1,b2,b3;
public CBD()
{
Frame f=new Frame("Button Demo....");
f.setSize(300,300);
f.setVisible(true);
b1 = new Button("Ok");
b2 = new Button("Cancel");
b3 = new Button("Exit");
b1.setBounds(50,100,50,30);
b2.setBounds(150,100,80,30);
b3.setBounds(60,150,80,30);
f.add(b1);
f.add(b2);
f.add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource() == b1)
{
System.out.println("Button is pressed....OK");
}
else if(ae.getSource() == b2)
{
System.out.println("Button is pressed....CANCEL");
}
else
{
System.exit(0);
}
}
}
class mouseListener
{
public static void main(String args[])
{
CBD obj = new CBD();
}
} 
