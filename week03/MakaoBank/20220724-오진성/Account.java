public class Account{
    private long amount = 1000;

    public void tranfer(long tranferAmount) {
        amount-= tranferAmount;

    }


    public long getAmount() {
        return amount;
    }
}