import javax.swing.*;
import java.awt.*;

public class MakaoBank {

    private JFrame frame;
    private JPanel contentPanel;
private  Account account;

    public static void main(String[] args) {
        MakaoBank application = new MakaoBank();
        application.run();
    }

    private void run() {
        account = new Account();
        frame = new JFrame(" Makao Bank ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setVisible(true);

        initmenu();
        initcotentPanel();

    }

    private void initcotentPanel() {
        contentPanel = new JPanel();
        frame.add(contentPanel);
    }

    private void initmenu() {
        JPanel panel = new JPanel();
        frame.add(panel, BorderLayout.PAGE_START);

        panel.add(createAmountPanel());
        panel.add(createTranferPanel());
        panel.add(createTransactionsPanel());

        frame.setVisible(true);
    }

    private JButton createTransactionsPanel() {
        JButton button = new JButton("거래 내역");
        button.addActionListener(event -> {
            showContentPanel(new TransactionPanel());
        });
        return button;
    }

    private JButton createTranferPanel() {
        JButton button = new JButton("송금");
        button.addActionListener(event -> {
            showContentPanel(new TransferPanel(account));
        });
        return button;
    }

    private JButton createAmountPanel() {
        JButton button = new JButton("보유 금액");
        button.addActionListener(event -> {
            showContentPanel(new AmountPanel(account));
        });
        return button;
    }

    private void showContentPanel(JPanel Panel) {
        contentPanel.removeAll();
        contentPanel.add(Panel);
        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
        frame.setVisible(true);
    }
}