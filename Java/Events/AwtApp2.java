import java.awt.*;
import java.awt.event.*;

public class AwtApp2 extends Frame {
    
    TextField firstNameTF, lastNameTF, dobTF;
    TextArea displayTextArea;

    AwtApp2() {
        setTitle("First Frame");
        setSize(350, 350);
        setLayout(null); 
        Label firstName = new Label("First Name:");
        firstName.setBounds(20, 50, 80, 20);
        Label lastName = new Label("Last Name:");
        lastName.setBounds(20, 80, 80, 20);
        Label dob = new Label("Date of Birth:");
        dob.setBounds(20, 110, 80, 20);

        firstNameTF = new TextField();
        firstNameTF.setBounds(120, 50, 150, 20);
        lastNameTF = new TextField();
        lastNameTF.setBounds(120, 80, 150, 20);
        dobTF = new TextField();
        dobTF.setBounds(120, 110, 150, 20);

        Button sbmt = new Button("Submit");
        sbmt.setBounds(20, 160, 100, 30);
        Button reset = new Button("Reset");
        reset.setBounds(130, 160, 100, 30);

        displayTextArea = new TextArea("", 4, 30, TextArea.SCROLLBARS_NONE);
        displayTextArea.setBounds(20, 200, 300, 80);
        displayTextArea.setEditable(false);
        

        add(firstName);
        add(lastName);
        add(dob);
        add(firstNameTF);
        add(lastNameTF);
        add(dobTF);
        add(sbmt);
        add(reset);
        add(displayTextArea);


        sbmt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameTF.getText();
                String lastName = lastNameTF.getText();
                String dob = dobTF.getText();
		displayTextArea.setText("Details:\nFirst Name: " + firstName + 
                                        "\nLast Name: " + lastName + 
                                        "\nDOB: " + dob);
            }
        });


        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNameTF.setText("");
                lastNameTF.setText("");
                dobTF.setText("");
                displayTextArea.setText("");
            }
        });


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose(); 
            }
        });

        setVisible(true); 
    }

    public static void main(String[] args) {
        new AwtApp2();
    }
}

