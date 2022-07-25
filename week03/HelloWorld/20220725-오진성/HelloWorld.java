import javax.swing.*;
import java.awt.*;

public class HelloWorld {
    private String name = "world";

    public static void main(String[] args) {
        HelloWorld application = new HelloWorld();

        application.run();
    }

    private void run() {
        JFrame frame = new JFrame("Hello to you");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        frame.setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel("Hello," + name + "!");
        frame.add(label);

        JTextField textField = new JTextField(10);
        frame.add(textField);

        JButton button = new JButton("확인");
        button.addActionListener(event -> {
            name = textField.getText();
            label.setText("Hello," + name + "!");
        });
        frame.add(button);

        frame.setVisible(true);
    }
}
