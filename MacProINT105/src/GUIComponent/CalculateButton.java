package GUIComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class CalculateButton implements ActionListener{
    private JTextField number1;
    private JTextField number2;
    private JTextField result;

    public CalculateButton(JTextField number1, JTextField number2, JTextField result) {
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonName = e.getActionCommand();
        int num1,num2,sum;
        if(buttonName.equals("+")){
            num1 = Integer.parseInt(number1.getText());
            num2 = Integer.parseInt(number2.getText());
            sum = num1+num2;
            result.setText(Integer.toString(sum));
        }else if(buttonName.equals("RESET")){
            number1.setText("");
            number2.setText("");
            result.setText("0");
        }
    }
    
}
