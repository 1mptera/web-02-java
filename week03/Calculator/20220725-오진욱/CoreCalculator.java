import javax.swing.*;

public class CoreCalculator {

    public static final String[] OPERATORS = new String[]{"+", "*", "-", "/", "="};

    private long currentNumber = 0;
    private long accumulator = 0;
    private String currentOperator = "";

    public void updateOperator(String operator) {
        currentOperator = operator;
    }

    public void calculate() {
        switch(currentOperator) {
            case "" -> accumulator = currentNumber;
            case "+" -> accumulator += currentNumber;
            case "-" -> accumulator -= currentNumber;
            case "*" -> accumulator *= currentNumber;
            case "/" -> accumulator /= currentNumber;
            case "=" -> accumulator = accumulator;
        }
        currentNumber = 0;
    }

    public void addNumber(int number) {
        currentNumber *= 10;
        currentNumber += number;
    }

    public long getCurrentNumber() {
        return currentNumber;
    }

    public long getAccumulator() {
        return accumulator;
    }
}
