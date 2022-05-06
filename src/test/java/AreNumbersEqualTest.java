import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {
    @Test
    public void testAreNumbersEqualHappyPath() {
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual nE = new AreNumbersEqual();
        int actualResult = nE.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualHappyPathPositiveNegative() {
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual nE = new AreNumbersEqual();
        int actualResult = nE.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualHappyPathPositiveNegative1() {
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual nE = new AreNumbersEqual();
        int actualResult = nE.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
