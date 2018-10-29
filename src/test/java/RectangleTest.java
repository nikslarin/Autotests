import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {

    @DisplayName("Should calculate the correct area and perimeter")
    @ParameterizedTest
    @ValueSource(doubles = {3.0, 2.0})
    public void testRectangle(Double argument)
    {
        Rectangle rectangle = new Rectangle();
        double result = rectangle.getArea(argument,argument);
        assertEquals(6.0, result);
        double result3 = rectangle.getPerimeter(argument,argument);
        assertEquals(10.0, result3);
    }

    @Test
    public void testRectangleException()        {
        Throwable exception = Assertions.assertThrows(ArithmeticException.class,
                () -> {new Rectangle().getPerimeter(1.0, 2.3);});
            final String expected = "Только положительные цифры";
            assertEquals( expected, exception.getMessage());
        }
    }


