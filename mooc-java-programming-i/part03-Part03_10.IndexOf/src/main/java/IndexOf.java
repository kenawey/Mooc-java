
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

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

        // implement here finding the indices of a number
        System.out.println("Search for? ");
        int number = Integer.valueOf(scanner.nextLine());
        int index = list.indexOf(number);
        find(number, list);
    }

    public static void find(int number, ArrayList<Integer> list) {
        int index = list.indexOf(number);
        if (index == -1) {
            return;
        } else {
            for(;index<list.size();index++)
            if(list.get(index)==number){
            System.out.println(number + " is at index " + index);
        }
        }

    }

}
