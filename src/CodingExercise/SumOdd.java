package CodingExercise;

public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(sumOdd(1, 11));
    }

    public static boolean isOdd(int number) {

        if (!(number > 0)) {
            return false;
        }
        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {

        if (start > end || start <= 0) {
            return -1;
        }

        if(start == end && isOdd(start)) {
            return start;
        }

        int sum = 0;

        for(int i = start; i <= end; i++) {
            if(isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
