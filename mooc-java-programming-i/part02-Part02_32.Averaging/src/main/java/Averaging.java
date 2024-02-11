
public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        // write some code here
        int result = number1 + number2 + number3 + number4;
        return result;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        //write some code here
        int s = sum(number1, number2, number3, number4);
        double avg = s * 1.0 / 4;
        return avg;
    }

    public static void main(String[] args) {
        double result = average(-12, 2, 8, 0);
        //System.out.println(sum(-12, 2, 8, 0));
        System.out.println("Average: " + result);
    }
}
