package TheForLoop;

public class Main {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }
//      System.out.println("10,000 at 2% insert = " + calculateInsert(10000.0, 2.0));
        for(double rate = 2.0; rate <= 5.0; rate++) {
            double insertAmount = calculateInsert(10000.0, rate);
            System.out.println("10,000 at " + rate + "% insert = " + insertAmount);
        }
        for(double i = 7.5; i <= 10; i += 0.25) {
            double insertAmount = calculateInsert(100.0, i);
            if (insertAmount > 8.5) {
                break;
            }
            System.out.println("$100.00 at " + i + "% insert = $" + insertAmount);
        }
    }

    public static double calculateInsert(double amount, double insertRate) {
        return (amount * (insertRate / 100));
    }
}
