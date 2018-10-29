import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {

    @DisplayName("Should calculate the correct area and perimeter")
    @ParameterizedTest
    @ValueSource(doubles = {6.3, 7.4, 6.4})

     void testTriangle(Double argument)
    {
        final Triangle triangle = new Triangle();
        double result = triangle.getArea(argument, argument, argument);
        assertEquals(17.186274138102178, result);
        double result4 = triangle.getPerimeter(argument, argument, argument);;
        assertEquals(20.1, result4);
    }

    @Test
    public void testTriangleException() {
        {
            try {
                Triangle triangle = new Triangle();
                double result = triangle.getArea(-4.0, -1.0, -3.5);
            }
            catch (Exception e) {
                final String expected = "Только положительные цифры";
                assertEquals( expected, e.getMessage());
            }
        }
    }
}
