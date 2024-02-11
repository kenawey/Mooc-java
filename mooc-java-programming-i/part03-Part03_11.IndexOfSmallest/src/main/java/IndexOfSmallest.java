
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        int x = getMinInList(list);
        System.out.println("Smallest number: " + x);
        find(x, list);

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
    }

    public static int getMinInList(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i : list) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }

    public static void find(int number, ArrayList<Integer> list) {
        int index = list.indexOf(number);
        if (index == -1) {
            return;
        } else {
            for (; index < list.size(); index++) {
                if (list.get(index) == number) {
                    System.out.println("Found at index: " + index);
                }
            }
        }

    }
}
