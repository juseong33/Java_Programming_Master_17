package CodingExercise;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(11);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        StringBuilder result = new StringBuilder();
        int numDigit = 0;
        int count = getDigitCount(number);
        number = reverse(number);
        for (int i = 0; i < count; i++) {
            numDigit = number % 10;
            number /= 10;
            switch (numDigit) {
                case 1 : System.out.println("One"); break;
                case 2 : System.out.println("Two"); break;
                case 3 : System.out.println("Three"); break;
                case 4 : System.out.println("Four"); break;
                case 5 : System.out.println("Five"); break;
                case 6 : System.out.println("Six"); break;
                case 7 : System.out.println("Seven"); break;
                case 8 : System.out.println("Eight"); break;
                case 9 : System.out.println("Nine"); break;
                case 0 :
                default : System.out.println("Zero"); break;
            }
        }
    }

    public static int reverse(int number) {
        if (number < 0) {
            number *= -1;

            String str = String.valueOf(number);
            StringBuffer sb = new StringBuffer(str);
            str = sb.reverse().toString();

            return Integer.parseInt(str) * -1;
        } else {
            String str = String.valueOf(number);
            StringBuilder sb = new StringBuilder(str);
            str = sb.reverse().toString();

            return Integer.parseInt(str);
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number < 10) {
            return 1;
        }

        int numDigit = 0;
        for (; number > 0; number /= 10) {
            numDigit++;
        }
        return numDigit;
    }
}
