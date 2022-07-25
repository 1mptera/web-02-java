import javax.swing.*;

public class AmountPanel extends JPanel {
    AmountPanel(Account account){


       long amount = account.getAmount();

        JLabel label = new JLabel(String.valueOf(amount));
        this.add(label);

    }


}