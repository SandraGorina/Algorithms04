import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {
    @Test
    public void testIsPositiveNumberHappyPathPositiveNumber() {
        int a = 555;
        boolean expectedResult = true;

        IsPositiveNumber iPn = new IsPositiveNumber();
        boolean actualResult = iPn.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberHappyPathZero() {
        int a = 0;
        boolean expectedResult = true;

        IsPositiveNumber iPn = new IsPositiveNumber();
        boolean actualResult = iPn.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberNegativeNumber() {
        int a = -555;
        boolean expectedResult = false;

        IsPositiveNumber iPn = new IsPositiveNumber();
        boolean actualResult = iPn.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
