import javax.swing.*;
import java.awt.*;

public class Calculator {
    public static void main(String[] args){
        Calculator application = new Calculator();

        application.run();
    }

    private void run() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JTextField textField = new JTextField(10);
        textField.setText("0");
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField, BorderLayout.PAGE_START);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(new GridLayout(4,3));

               int[] numbers = new int[9];
        for(int i = 0 ; i <10 ; i+=1){
           numbers[i] = i+1;
        }
        JButton button = new JButton("i")

        frame.setVisible(true);
    }
}
