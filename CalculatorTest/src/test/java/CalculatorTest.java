import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void returnMultiply() {
        assertEquals(4, Calculator.multiply(2, 2));
    }

    @Test
    void returnDivide() {
        assertEquals(2, Calculator.divide(4, 2));
        assertThrows(ArithmeticException.class, () -> Calculator.divide(2,0));
    }

    @Disabled
    @Test
    void returnSum() {
        assertEquals(6, Calculator.sum(4, 2));
    }

    @Test
    void returnSubtract() {
        assertEquals(4, Calculator.subtract(6, 2));
    }

}