package CodingExercise;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1855));
    }

    public static boolean isLeapYear(int year) {
        if (year > 9999 || year <= 0) {
            return false;
        } else {
            return (year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0));
        }
    }
}
