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
        frame.setSize(420,550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("x");
        divButton = new JButton("/");
        decimalButton = new JButton(".");
        equalButton = new JButton("=");
        clearButton = new JButton("Clear");
        deleteButton = new JButton("Delete");

        functioButtons[0] = addButton;
        functioButtons[1] = subButton;
        functioButtons[2] = mulButton;
        functioButtons[3] = divButton;
        functioButtons[4] = decimalButton;
        functioButtons[5] = equalButton;
        functioButtons[6] = clearButton;
        functioButtons[7] = deleteButton;

        for(int i=0;i<8;i++){
            functioButtons[i].addActionListener(this);
            functioButtons[i].setFont(myFont);
            functioButtons[i].setFocusable(false);
        }

        for(int i=0;i<10;i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        deleteButton.setBounds(50, 430, 145, 50);
        clearButton.setBounds(205, 430, 145, 50);

        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        //panel.setBackground(Color.LIGHT_GRAY);

        panel.add(numberButtons[7]); // ROW 1
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(addButton);

        panel.add(numberButtons[4]); // ROW 2
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);

        panel.add(numberButtons[1]); // ROW 3
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(mulButton);

        panel.add(decimalButton); // ROW 4
        panel.add(numberButtons[0]);
        panel.add(equalButton);
        panel.add(divButton);
       

        frame.add(panel);
        frame.add(deleteButton);
        frame.add(clearButton);
        frame.add(textField);
        frame.setVisible(true);

    }
    public static void main(String[] args) {

        Calculator Calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
    }
}