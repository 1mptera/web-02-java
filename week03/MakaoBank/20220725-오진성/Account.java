import java.util.ArrayList;
import java.util.List;

public class Account {
    private long amount = 1000;
    private String number = "123-456-78";
    private List<String> transactions = new ArrayList<>();

    public void tranfer(long tranferAmount) {
        amount -= tranferAmount;

        transactions = new ArrayList<>();
        transactions.add("송금 : " + tranferAmount + "원");
    }

    public long getAmount() {
        return amount;
    }

    public String getNumber() {
        return number;
    }

    public List<String> gettransactions() {
        return transactions;
    }

    public int transactionsSize() {
        return transactions.size();
    }
}
