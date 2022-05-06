import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

    @Test
    public void testOddIndices() {
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] arrayER = {590, 985, 68};

        OddIndices oI = new OddIndices();
        int[] arrayAR = oI.oddIndices(array);

        Assertions.assertArrayEquals(arrayER, arrayAR);
    }

    @Test
    public void testOddIndicesnegativePath() {
        int[] array = {};
        int[] arrayER = {};

        OddIndices oI = new OddIndices();
        int[] arrayAR = oI.oddIndices(array);

        Assertions.assertArrayEquals(arrayER, arrayAR);
    }

    @Test
    public void testOddIndicesAllNumbersAreEven() {
        int[] array = {2, 4, 6, 8, 10};
        int[] arrayER = {4, 8};

        OddIndices oI = new OddIndices();
        int[] arrayAR = oI.oddIndices(array);

        Assertions.assertArrayEquals(arrayER, arrayAR);
    }

    @Test
    public void testOddIndicesOneNumber() {
        int[] array = {2};
        int[] arrayER = {};

        OddIndices oI = new OddIndices();
        int[] arrayAR = oI.oddIndices(array);

        Assertions.assertArrayEquals(arrayER, arrayAR);
    }

}


