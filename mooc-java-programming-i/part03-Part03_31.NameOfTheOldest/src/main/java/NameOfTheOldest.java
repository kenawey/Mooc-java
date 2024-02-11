
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        List<Integer> ages = new ArrayList<>();
        List<String> names = new ArrayList<>();

        while (!answer.isEmpty()) {
            String[] myStrings = answer.split(",");
            int age = Integer.valueOf(myStrings[1]);
            ages.add(age);
            names.add(myStrings[0]);
            answer = scanner.nextLine();
        }
        if (ages.size() > 0) {
            int index = olderAgeIndex(ages);
            System.out.println("Name of the oldest: " + names.get(index));
        }

    }

    public static int olderAgeIndex(List<Integer> l) {
        int max = 0;
        for (int i = 1; i < l.size(); i++) {
            if (l.get(i) > l.get(max)) {
                max = i;
            }
        }
        return max;
    }

}
