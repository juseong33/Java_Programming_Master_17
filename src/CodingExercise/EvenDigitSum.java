package CodingExercise;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }
        String str = String.valueOf(number);

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.getNumericValue(str.charAt(i)) % 2 != 0) {
                continue;
            }
            sum += Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }
}
