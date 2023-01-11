package CodingExercise;

public class MinutesToYearAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long year = ((minutes / 60) / 24) / 365;
            long remainingDay = ((minutes / 60) / 24) - (365 * year);

            System.out.println(minutes + " min = " + year + " y and " + remainingDay + " d");
        }
    }
}
