package CodingExercise;

public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(4, 18, 19));
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(0, 5, 6));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        for (int i = 0; i < bigCount; i++) {
            goal -= 5;
            if (goal == 0) {
                return true;
            }
            if (goal < 0) {
                return false;
            }
            if (goal < 5) {
                break;
            }
        }

        for (int i = 0; i < smallCount; i++) {
            goal -= 1;
            if (goal <= 0) {
                return true;
            }
        }
        return false;
    }
}
