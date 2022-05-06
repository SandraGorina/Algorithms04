public class BiggerValue {
    /**
     * Напишите алгоритм BiggerValue,
     * который из двух параметров типа int возвращает бОльшее значение.
     * Test Data:
     * 3333, 9999
     * Expected Result = 9999
     */

    public int biggerValue(int a, int b) {
        if(a == 0 && b == 0) {

          return 0;
        }
        if(a > b) {

            return a;
        }

        return b;
    }
}
