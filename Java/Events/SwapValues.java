import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SwapValues extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton swapButton;

    public SwapValues() {
        setTitle("Swap Values");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        swapButton = new JButton("Swap");

        add(new JLabel("First Value:"));
        add(textField1);
        add(new JLabel("Second Value:"));
        add(textField2);
        add(swapButton);

        swapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String temp = textField1.getText();
                textField1.setText(textField2.getText());
                textField2.setText(temp);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new SwapValues();
    }
}

