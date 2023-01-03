package CodingExercise;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int val1, int val2, int val3) {
        return (val1 + val2) == val3;
    }
}
