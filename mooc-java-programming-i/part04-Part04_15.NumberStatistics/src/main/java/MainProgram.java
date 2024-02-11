
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
//     Statistics statistics = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
        /// part 2 
//     Statistics statistics = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
//    
        /// part 3 
        System.out.println("Enter numbers: ");
        int number = Integer.valueOf(scanner.nextLine());
        Statistics statistics = new Statistics(), evenStatistics = new Statistics(), oddStatistics = new Statistics();
        do {
            if (number == -1) {
                System.out.println("Sum: " + statistics.sum());
                System.out.println("Sum of even numbers: " + evenStatistics.sum());
                System.out.println("Sum of odd numberes: " + oddStatistics.sum());
                break;
            }
            // Statistics statistics= new Statistics(); // fetal error 
            statistics.addNumber(number);
            if (number % 2 == 0) {
                evenStatistics.addNumber(number);
            } else {
                oddStatistics.addNumber(number);
            }
            number = Integer.valueOf(scanner.nextLine());

        } while (true);

    }
}
