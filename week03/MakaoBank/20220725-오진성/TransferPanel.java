import javax.swing.*;
import java.awt.*;

public class TransferPanel extends JPanel {
    private Account account;

    TransferPanel(Account account) {
        this.account = account;

        setLayout(new GridLayout(3, 1));

        this.add(new JLabel("송금하기"));

        this.add(new JTextField(10));

        JButton button = new JButton("송금");
        button.addActionListener(event -> {
            account.tranfer(Long.parseLong(new JTextField(10).getText()));
        });
        this.add(button);
    }
}
