package CodingExercise;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-1));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number == 0) {
            return 0;
        }
        if (number < 1) {
            return -1;
        }
        String str = String.valueOf(number);

        char firstNum = str.charAt(0);
        char lastNum = str.charAt(str.length() -1);

        return Character.getNumericValue(firstNum) + Character.getNumericValue(lastNum);
    }
}
