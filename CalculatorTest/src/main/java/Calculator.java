import java.util.NoSuchElementException;

public class Calculator {

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) throws ArithmeticException{
        if (num2 == 0) {
            throw new ArithmeticException("Cannot be divided by 0");
        }
        return num1/num2;
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

}
