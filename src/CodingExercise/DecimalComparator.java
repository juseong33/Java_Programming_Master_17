package CodingExercise;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        if (first < 0 && second > 0 || first > 0 && second < 0) {
            return false;
        }

        double firstThousand = first * 1000;
        double secondThousand = second * 1000;

        int firstInt = (int) firstThousand;
        int secondInt = (int) secondThousand;

        return firstInt == secondInt;
    }
}
