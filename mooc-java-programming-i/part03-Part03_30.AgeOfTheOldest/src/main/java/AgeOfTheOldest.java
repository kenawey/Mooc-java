
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        List<Integer> ages = new ArrayList<>();
        while (!answer.isEmpty()) {
            String[] myStrings = answer.split(",");
            int age = Integer.valueOf(myStrings[1]);
            ages.add(age);

            answer = scanner.nextLine();
        }
        if (ages.size() > 0) {
            System.out.println("Age of the oldest: " + olderAge(ages));
        }

    }

    public static int olderAge(List<Integer> l) {
        int max = 0;
        for (int i : l) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
