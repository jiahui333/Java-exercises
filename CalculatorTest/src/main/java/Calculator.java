import Exceptions.DivideByZeroException;

public class Calculator {

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) throws ArithmeticException{
        if (num2 == 0) {
            throw new DivideByZeroException("Cannot be divided by 0 haha");
        }
        return num1/num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

}
