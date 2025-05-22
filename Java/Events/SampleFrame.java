import java.awt.*;
import java.awt.event.*;

class First{
	Frame f;
	public void create(){
		f = new Frame("New Frame");
		f.setSize(300,300);
		f.setLayout(new FlowLayout());
		
		Label lb = new Label("Enter text");
		f.add(lb);
		
		TextField text =new TextField(20);
		f.add(text);
		
		Button bt = new Button("Click here");
		f.add(bt);
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
			f.dispose();
			}
		});
		
		f.setVisible(true);
	
	}
}

class SampleFrame{
	public static void main(String arg[]){
		First obj = new First();
		obj.create();
	}
}
