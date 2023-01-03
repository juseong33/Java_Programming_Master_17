package CodingExercise;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 22));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return ((barking) && ((hourOfDay <= 24 && hourOfDay > 22) || ((hourOfDay < 8) && hourOfDay >= 0)));
    }
}
