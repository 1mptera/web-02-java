import java.util.ArrayList;
import java.util.List;

public class Account {
    private  String number = "123-4567-8910-23";
    private  long amount = 1000;
    private List<String> transaction = new ArrayList<>();;

    public String getNumber() {
        return number;
    }

    public long getAmount() {
        return amount;
    }

    public List<String> getTransactions() {
        return transaction;
    }

    public int TransactionsSize() {
        return transaction.size();
    }

    public void transfer(long transferAmount) {
        amount -= transferAmount;

        transaction.add("송금: " + transferAmount + "원");
    }
}
