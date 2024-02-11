
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here

//        int[] array = {3, 1, 5, 99, 3, 12};
//
//        System.out.println("Smallest: " + MainProgram.smallest(array));
// indices:      0  1  2  3  4
//        int[] numbers = {6, 5, 8, 7, 11};
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
//        int[] numbers = {-1, 6, 9, 8, 12};
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
//int[] numbers = {3, 2, 5, 4, 8};
//
//System.out.println(Arrays.toString(numbers));
//
//MainProgram.swap(numbers, 1, 0);
//System.out.println(Arrays.toString(numbers));
//
//MainProgram.swap(numbers, 0, 3);
//System.out.println(Arrays.toString(numbers));
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static int smallest(int[] array) {

        int smallest = array[0];

        for (int i = 1; i < array.length; ++i) {
            smallest = array[i] < smallest ? array[i] : smallest;
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here
        int indexOfSmallest = 0;
        for (int i = 1; i < array.length; ++i) {
            indexOfSmallest = array[i] < array[indexOfSmallest] ? i : indexOfSmallest;
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallest = startIndex;
        for (int i = startIndex + 1; i < table.length; ++i) {
            indexOfSmallest = table[i] < table[indexOfSmallest] ? i : indexOfSmallest;
        }
        return indexOfSmallest;

        // write your code here
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
//        System.out.println("swaaap");
        // write your code here
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; ++i) {

            int smallest = indexOfSmallestFrom(array, i);
            if (array[smallest] < array[i]) {
                swap(array, i, smallest);
            }
//           System.out.println(Arrays.toString(array));
        }

    }

}
