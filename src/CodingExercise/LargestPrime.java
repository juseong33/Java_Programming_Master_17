package CodingExercise;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        }

        int result = -1;
        int count = 0;
        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return number;
        }

        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                result = i;
                break;
            }
        }

        for (int i = result - 1; i > 1; i--) {
            if (result % i == 0) {
                result = i;
            }
        }

        return result;
    }
}
