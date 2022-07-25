import javax.swing.*;

public class MakaoBank {
    public static void main(String[] args){
        MakaoBank application = new MakaoBank();
        application.run();
    }

    private void run() {
        JFrame frame = new JFrame("MakaoBank");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);

        frame.setVisible(true);
    }
}
