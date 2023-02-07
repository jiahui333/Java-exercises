import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MockitoTest {
    @Mock
    Calculator calculatorMock;
    @Test
    void testMultiply() {
        when(calculatorMock.multiply(3.0, 4.0)).thenReturn(12.0);
        assertEquals(12.0, calculatorMock.multiply(3.0, 4.0));
    }

}
