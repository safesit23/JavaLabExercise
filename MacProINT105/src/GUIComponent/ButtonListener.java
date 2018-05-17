package GUIComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class ButtonListener implements ActionListener{
    private JTextField text1;
    private JTextField text2;

    public ButtonListener(JTextField text1, JTextField text2) {
        this.text1 = text1;
        this.text2 = text2;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String message = text1.getText();
        text2.setText(message);
    }
    
}




