import javax.swing.*;
import java.awt.*;

public class AmountPanel extends JPanel {
    AmountPanel(Account account) {
        long amount = account.getAmount();
        String number = account.getNumber();

        this.setLayout(new GridLayout(2, 1));

        this.add(new JLabel(number));

        this.add(new JLabel("잔액 " + amount + "원"));
    }
}
