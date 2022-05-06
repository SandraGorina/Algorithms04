import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BiggerValueTest {
    @Order(1)
    @Test
    public void testBiggerValueHappyPathPositiveNumbers() {
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.biggerValue(a, b);
    }

    @Order(2)
    @Test
    public void testBiggerValueHappyPathNegativeNumders() {
        int a = -3333;
        int b = -9999;
        int expectedResult = -3333;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testBiggerValueHappyPathPosNegNumder() {
        int a = 3333;
        int b = -9999;
        int expectedResult = 3333;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testBiggerValuePositiveNumderAndZero() {
        int a = 3333;
        int b = 0;
        int expectedResult = 3333;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testBiggerValueNegativeNumderAndZero() {
        int a = -3333;
        int b = 0;
        int expectedResult = 0;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testBiggerValueBothNumbersAreZero() {
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        BiggerValue bV = new BiggerValue();
        int actualResult = bV.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
