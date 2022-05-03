import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AscendingSequenceTest {
    AscendingSequence as;

    @BeforeEach
    void setUp() {
        as = new AscendingSequence();
    }

    @Order(1)
    @RepeatedTest(50)
    @Test
    public void testAscendingSequenceHappyPathPositiveNumbers() {
        //0, 1, 2, 3, 4, 5
        // Arrange
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};
        //Act
        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        //Assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAscendingSequenceHappyPathNegativeNumbers() {
        //-10, -9, -8, -7
        // Arrange
        int start = -10;
        int end = -7;
        int step = 1;
        int[] expectedResult = {-10, -9, -8, -7};
        //Act
        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        //Assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAscendingSequenceHappyPathNegativePositiveNumbers() {
        // Arrange
        int start = -5;
        int end = 5;
        int step = 1;
        int[] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        //Act
        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        //Assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAscendingSequenceHappyPathStepTwo() {
        // Arrange
        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0, 2, 4};
        //Act
        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        //Assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStartLargerThenEnd() {                        //негативный сценарий
        // Arrange
        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};
        //Act
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        //Assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceNegativeStep() {                        //негативный сценарий
        // Arrange
        int start = 0;
        int end = 5;
        int step = -1;
        int[] expectedResult = {};
        //Act
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        //Assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStepIsZero() {                        //негативный сценарий
        // Arrange
        int start = 5;
        int end = 0;
        int step = 0;
        int[] expectedResult = {};
        //Act
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        //Assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }




}
