import javax.swing.*;
import java.awt.*;

public class MakaoBank {

    private JFrame frame;
    private JPanel contentPanel;

    public static void main(String[] args) {
        MakaoBank application = new MakaoBank();
        application.run();

    }

    private void run() {
        frame = new JFrame("Makao Bank");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setVisible(true);

        initmenu();
        initcontentPanel();

    }

    private void initcontentPanel() {
        contentPanel = new JPanel();
        frame.add(contentPanel);
    }

    private void initmenu() {
        JPanel panel = new JPanel();
        frame.add(panel, BorderLayout.PAGE_START);

        panel.add(createAmountPanel());
        panel.add(createTransferPanel());
        panel.add(createTransactionsPanel());

        frame.setVisible(true);
    }

    private JButton createAmountPanel() {
        JButton button = new JButton("잔액");
        button.addActionListener(event ->{
          AccountPanel accountPanel = new AccountPanel();
          contentPanel.add(accountPanel());
        });
        return button;

    }


    private JButton createTransferPanel() {
        JButton button = new JButton("송금하기");
        button.addActionListener(event ->{

        });
        return button;
    }

    private JButton createTransactionsPanel() {
        JButton button = new JButton("거래 내역");
        button.addActionListener(event ->{

        });
        return button;
    }
}