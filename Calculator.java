import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton zeroButton;



    public Calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.DARK_GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        sevenButton = new JButton("7"); // ROW 1
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(sevenButton);
        sevenButton.addActionListener(this);

        eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(eightButton);
        eightButton.addActionListener(this);

        nineButton = new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        nineButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(nineButton);
        nineButton.addActionListener(this);

        fourButton = new JButton("4"); //ROW 2
        fourButton.setBounds(30, 230, 80, 80);
        fourButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(fourButton);
        fourButton.addActionListener(this);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(fiveButton);
        fiveButton.addActionListener(this);

        sixButton = new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        sixButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(sixButton);
        sixButton.addActionListener(this);

        oneButton = new JButton("1"); //ROW 3
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(oneButton);
        oneButton.addActionListener(this);

        twoButton = new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        twoButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(twoButton);
        twoButton.addActionListener(this);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        threeButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(threeButton);
        threeButton.addActionListener(this);


        JButton dotButton = new JButton("."); //ROW 4
        dotButton.setBounds(30, 430, 80, 80);
        dotButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(dotButton);

        zeroButton = new JButton("0"); 
        zeroButton.setBounds(130, 430, 80, 80);
        zeroButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(zeroButton);
        zeroButton.addActionListener(this);

        JButton equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        equalButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(equalButton);
        
        // Operators

        JButton divButton = new JButton("/"); // Div
        divButton.setBounds(330, 130, 80, 80);
        divButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(divButton);

        JButton mulButton = new JButton("x"); //Mul
        mulButton.setBounds(330, 230, 80, 80);
        mulButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(mulButton);

        JButton minButton = new JButton("-"); //Sub
        minButton.setBounds(330, 330, 80, 80);
        minButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(minButton);

        JButton addButton = new JButton("+"); //Add
        addButton.setBounds(330, 430, 80, 80);
        addButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(addButton);



        


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close on program exit
    }

    public static void main(String[] args) {
        new Calculator();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == sevenButton){
       displayLabel.setText("7");
        } else if(e.getSource() == eightButton){
            displayLabel.setText("8");
        }else if(e.getSource() == nineButton){
            displayLabel.setText("9");
        }else if(e.getSource() == fourButton){
            displayLabel.setText("4");
        }else if(e.getSource() == fiveButton){
            displayLabel.setText("5");
        }else if(e.getSource() == sixButton){
            displayLabel.setText("6");
        }else if(e.getSource() == oneButton){
            displayLabel.setText("1");
        }else if(e.getSource() == twoButton){
            displayLabel.setText("2");
        }else if(e.getSource() == threeButton){
            displayLabel.setText("3");
        }else if(e.getSource() == zeroButton){
            displayLabel.setText("0");
        }
        
    }

}