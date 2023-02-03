package CodingExercise;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            x *= -1;
        }
        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str);

        return sb.reverse().toString().equals(str);
    }
}
