public class MultiplicityOfNumberM {

    /**
     * Given an integer M perform the following conditional actions:
     * If M is multiple of 3 and 5 then return "Good Number".
     * If M is only multiple of 3 and not of 5 then return "Bad Number"
     * If M is only multiple of 5 and not of 3 then return "Poor Number"
     * If M doesn't satisfy any of the above conditions then return "-1"
     */

    /**
     * Для заданного целого числа M выполните следующие условные действия:
     * Если M кратно 3 и 5, вернуть «Хорошее число».
     * Если M кратно только 3, а не 5, верните «Неверный номер».
     * Если M кратно только 5, а не 3, вернуть «Плохое число».
     * Если M не удовлетворяет ни одному из вышеперечисленных условий, верните «-1».
     */

    public String multiplicityOfNumberM(int m) {
        if(m % 3 == 0 && m % 5 == 0) {

            return "Хорошее число";
        } else if(m % 3 == 0) {

            return "Неверный номер";
        } else if (m % 5 == 0) {

            return "Плохое число";
        } else {

            return "-1";
        }
    }
}
