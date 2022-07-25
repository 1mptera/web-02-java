public class Calculation {

    private String[] operators = new String[]{"+", "-", "*", "/", "="};
    private String currentOperator = "";
    private long accumulator = 0;
    private long currentnumber = 0;


    public void addnumber(int numbers) {
        currentnumber *= 10;
        currentnumber += numbers;
    }

    public void updateOperator(String operator) {
        currentOperator = operator;
    }

    public void caculate() {
        switch (currentOperator) {
            case "" -> accumulator = currentnumber;
            case "+" -> accumulator += currentnumber;
            case "-" -> accumulator -= currentnumber;
            case "*" -> accumulator *= currentnumber;
            case "/" -> accumulator /= currentnumber;
        }
        currentnumber = 0;
    }


    public Long getcurrentnumber() {
        return currentnumber;
    }

    public Long getaccumulator() {
        return accumulator;
    }

    public String[] getOperators() {
        return operators;
    }
}