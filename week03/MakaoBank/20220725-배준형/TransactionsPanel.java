import javax.swing.*;
import java.awt.*;

public class TransactionsPanel extends JPanel {
    TransactionsPanel(Account account) {
        this.setLayout(new GridLayout(1 + account.TransactionsSize(), 1));

        JLabel label = new JLabel("거래 내역");
        this.add(label);

        for (String transaction : account.getTransactions()) {
            JLabel transactionLabel = new JLabel(transaction);
            this.add(transactionLabel);

        }
    }
}
