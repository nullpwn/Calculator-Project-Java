import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new  JButton[10];
    JButton[] functioButtons = new JButton[8];
    JButton addButton,subButton,mulButton,divButton;
    JButton decimalButton,equalButton,clearButton,deleteButton;
    JPanel panel;

    Font myFont = new Font("Ink Free",Font.BOLD,30);

    double num1,num2,result = 0;
    char operator;


    
    Calculator(){

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);

        frame.setVisible(true);

    }
    public static void main(String[] args) {

        Calculator Calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
    }
}