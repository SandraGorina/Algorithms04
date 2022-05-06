import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

    @Test
    public void testSumArrayHappyPathEvenNumbers(){
        int[] array = {0, 1, 2, 3, 4, 5};
        int sumEr = 15;

        SumArray sa = new SumArray();
        int sumAR = sa.sumArray(array);

        Assertions.assertEquals(sumEr, sumAR);
    }

    @Test
    public void testSumArrayHappyPathOddNumbers(){
        int[] array = {-7, -3};
        int sumEr = -10;

        SumArray sa = new SumArray();
        int sumAR = sa.sumArray(array);

        Assertions.assertEquals(sumEr, sumAR);
    }

    @Test
    public void testSumArrayHappyPathOddEvenNumbers(){
        int[] array = {-7, -3, 0, 1, 2, 3, 4, 5};
        int sumEr = 5;

        SumArray sa = new SumArray();
        int sumAR = sa.sumArray(array);

        Assertions.assertEquals(sumEr, sumAR);
    }
}


