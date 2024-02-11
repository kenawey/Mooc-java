
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        System.out.println("The greatest number: " + getMaxInList(list));

        // implement finding the greatest number in the list here
    }

    public static int getMaxInList(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }
}
