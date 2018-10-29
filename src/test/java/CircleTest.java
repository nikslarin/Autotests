import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;

public class CircleTest {

    @DisplayName("Should calculate the correct area and perimeter")
    @ParameterizedTest
    @ValueSource(doubles = {4.0})
     void testCircle(Double argument) {
        Circle circle = new Circle();
        double result = circle.getArea(argument);
        assertEquals(50.26548245743669, result);
        double result4 = circle.getPerimeter(argument);
        assertEquals(25.132741228718345, result4);
    }

    @Test
    public void testCircleException() {
        try {
            Circle circle = new Circle();
            double result = circle.getArea(-4.0);
        }
        catch (Exception e) {
            final String expected = "Только положительные цифры";
            assertEquals( expected, e.getMessage());
        }
    }
}

