public class BiggerValue {

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
