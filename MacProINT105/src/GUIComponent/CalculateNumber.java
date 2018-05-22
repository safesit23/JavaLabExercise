package GUIComponent;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculateNumber {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculater");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.setLayout(new GridLayout(3,2));
        
        JLabel label1 = new JLabel("Number 1: ");
        JLabel label2 = new JLabel("Number 2: ");
        JLabel labelResult = new JLabel("Result: ");
        JTextField number1 = new JTextField();
        JTextField number2 = new JTextField();
        JTextField result = new JTextField("0");
        JButton buttonAdd = new JButton("+");
        JButton buttonReset = new JButton("RESET");
        
        CalculateButton cButton = new CalculateButton(number1,number2,result);
        buttonAdd.addActionListener(cButton);
        buttonReset.addActionListener(cButton);
        
        panel1.add(label1);
        panel1.add(number1);
        panel1.add(label2);
        panel1.add(number2);
        panel1.add(labelResult);
        panel1.add(result);
        
        panel2.add(buttonAdd);
        panel2.add(buttonReset);
        
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        
        frame.setSize(400,150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
