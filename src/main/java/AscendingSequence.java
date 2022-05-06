public class AscendingSequence {

    //0, 1, 2, 3, 4, 5

    public int[] ascendingSequenceAlgorithm(int start, int end, int step) {
        if(step > 0 && start < end) {
            int[] result = new int[(end - start + 1) / step]; //+1 так как 0 и 5 включительно
            for(int i = 0; i < result.length; i ++) {      // идем по индексам массива
                if (start <= end) {
                    result[i] = start;
                    start += step;                          // start = start + step
                }
            }

            return result;
        }

        return new int[]{};
    }

//            int j = 0;
//
//            for(int i = start; i <= end; i += step) {     // идем по числам
//                if(j < result.length) {
//                    result[j] = i;
//                    j++;
//                }
//            }

//            return result;
}
