import Exceptions.DivideByZeroException;
import java.util.logging.Logger;
import javax.annotation.concurrent.GuardedBy;


public class Main{
    public static void main(String[] args) throws DivideByZeroException{


        try {
            System.out.println(Calculator.divide(2, 0));
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
