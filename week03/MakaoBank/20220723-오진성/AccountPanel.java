import javax.swing.*;

public class AccountPanel extends JPanel {

    AccountPanel(Account account) {

        long amount = account.getamount();

        JLabel label = new JLabel("잔액: " + amount);
        this.add(label);

    }
}
