import java.awt.Color;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator {
    public Calculator() {
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);

        JLabel displayLabel = new JLabel("OK");
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.BLUE);
        displayLabel.setOpaque(true);
        
        jf.add(displayLabel);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close on program exit
    }

    public static void main(String[] args) {
        new Calculator();
    }

}