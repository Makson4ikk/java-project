package l16;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AverageCalculatorTest {
    @Test
    public void testRun() {
        // Arrange
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        AverageCalculator calculator = new AverageCalculator(numbers);

        // Act
        calculator.run();

        // Assert
        assertEquals(5, calculator.getCount());
        assertEquals(15, calculator.getSum(), 0);
    }

    @Test
    public void testInterrupted() {
        // Arrange
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        AverageCalculator calculator = new AverageCalculator(numbers);
        Thread thread = new Thread(calculator);

        // Act
        thread.start();
        thread.interrupt();

        // Assert
        assertEquals(0, calculator.getCount());
        assertEquals(0, calculator.getSum(), 0);
    }

    @Test
    public void testEmptyList() {
        // Arrange
        List<Integer> numbers = Arrays.asList();
        AverageCalculator calculator = new AverageCalculator(numbers);

        // Act
        calculator.run();

        // Assert
        assertEquals(0, calculator.getCount());
        assertEquals(0, calculator.getSum(), 0);
    }
}
