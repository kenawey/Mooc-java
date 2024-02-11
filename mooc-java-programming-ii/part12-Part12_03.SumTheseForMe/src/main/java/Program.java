
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = {3, -1, 8, 4};
        // test your method here
        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int sum = 0;
        fromWhere = fromWhere < 0 ? 0 : fromWhere;

        toWhere = toWhere > array.length ? array.length : toWhere;

        for (int i = fromWhere; i < toWhere; i++) {
            if (array[i] >= smallest && array[i] <= largest) {
                sum += array[i];
            }

        }
        return sum;
    }

}
