public class Account {
    private long amount = 1000;
    public void transfer(long transferAmount) {
        amount -= transferAmount;

    }

    public long getamount() {
        return amount;
    }
}
