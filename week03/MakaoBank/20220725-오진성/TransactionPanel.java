import javax.swing.*;
import java.awt.*;

public class TransactionPanel extends JPanel {
    TransactionPanel(Account account) {
        this.setLayout(new GridLayout(1 + account.transactionsSize(), 1));

        this.add(new JLabel("거래 내역"));

        for (String transaction : account.gettransactions()) {
            this.add(new JLabel(transaction));
        }
    }
}
