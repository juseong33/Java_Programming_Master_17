package CodingExercise;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(isTeen(9));
    }

    public static boolean hasTeen(int val1, int val2, int val3) {
        return (val1 >= 13 && val1 <= 19) || (val2 >= 13 && val2 <= 19) || (val3 >= 13 && val3 <= 19);
    }

    public static boolean isTeen(int val1) {
        return (val1 >= 13 && val1 <= 19);
    }
}
