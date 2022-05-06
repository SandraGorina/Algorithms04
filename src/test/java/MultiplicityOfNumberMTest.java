import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicityOfNumberMTest {

    @Test
    public void testMultiplicityOfNumberM() {
        int m = 15;
        String expectedResult = "Хорошее число";

        MultiplicityOfNumberM number = new MultiplicityOfNumberM();
        String actualResult = number.multiplicityOfNumberM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplicityOfNumberM1() {
        int m = 12;
        String expectedResult = "Неверный номер";

        MultiplicityOfNumberM number = new MultiplicityOfNumberM();
        String actualResult = number.multiplicityOfNumberM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplicityOfNumberM2() {
        int m = 10;
        String expectedResult = "Плохое число";

        MultiplicityOfNumberM number = new MultiplicityOfNumberM();
        String actualResult = number.multiplicityOfNumberM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplicityOfNumberM3() {
        int m = 9;
        String expectedResult = "Неверный номер";

        MultiplicityOfNumberM number = new MultiplicityOfNumberM();
        String actualResult = number.multiplicityOfNumberM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplicityOfNumberMZero() {
        int m = 0;
        String expectedResult = "Хорошее число";

        MultiplicityOfNumberM number = new MultiplicityOfNumberM();
        String actualResult = number.multiplicityOfNumberM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplicityOfNumberM5() {
        int m = 7;
        String expectedResult = "-1";

        MultiplicityOfNumberM number = new MultiplicityOfNumberM();
        String actualResult = number.multiplicityOfNumberM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
