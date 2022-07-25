import javax.swing.*;
import java.awt.*;

public class MakaoBank {
    private Account account;

    private JFrame frame;
    private JPanel contentPanel;

    public static void main(String[] args){
        MakaoBank application = new MakaoBank();
        application.run();
    }

    public void run() {
        account = new Account();

        frame = new JFrame("Makao Bank");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);

        initMenu();
        initContentPanel();

        frame.setVisible(true);

    }

    public void initMenu() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        frame.add(panel, BorderLayout.PAGE_START);

        panel.add(createAmountButton());
        panel.add(createTransferButton());
        panel.add(createTransactionsButton());
    }

    public JButton createTransactionsButton() {
        JButton button = new JButton("거래 내역");
        button.addActionListener(event -> {
            JPanel transactionspanel = new TransactionsPanel(account);
            showContentPanel(transactionspanel);
        });
        return button;
    }

    public JButton createTransferButton() {
        JButton button = new JButton("송금");
        button.addActionListener(event -> {
            JPanel transferpanel = new TransferPanel(account);
            showContentPanel(transferpanel);
        });
        return button;
    }

    public JButton createAmountButton() {
        JButton button = new JButton("잔액 조회");
        button.addActionListener(event -> {
            JPanel amountPanel = new AmountPanel(account);
            showContentPanel(amountPanel);
        });
        return button;
    }

    public void showContentPanel(JPanel Panel) {
        contentPanel.removeAll();
        contentPanel.add(Panel);
        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
        frame.setVisible(true);
    }

    public void initContentPanel() {
        contentPanel = new JPanel();
        frame.add(contentPanel);
    }
}
