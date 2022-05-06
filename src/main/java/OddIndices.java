public class OddIndices {
    /**
     * Написать алгоритм OddIndices, который принимает массив чисел,
     * и возвращает массив значений нечетных индексов
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    public int[] oddIndices(int[] array) {
        if(array.length != 0) {
//            int count = 0;
//            for (int i = 0; i < array.length; i++) {
//                if (i % 2 != 0) {
//                    count++;
//                }
//            }
//            if (count != 0) {

                int[] arrayOddIndices = new int[array.length / 2]; //создаем новый массив с длиной count
                int count2 = 0; // первая ячейка нового массива
                for (int i = 0; i < array.length; i++) {
                    if (i % 2 != 0) {
                        arrayOddIndices[count2] = array[i];
                        count2++;
                    }
                }

                return arrayOddIndices;
            }
//
//            return new int[]{};
//        }
        return new int[]{};
    }


}
