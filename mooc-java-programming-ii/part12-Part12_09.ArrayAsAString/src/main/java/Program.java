
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder result = new StringBuilder();
        int rowLength = array.length;
        for (int ir = 0; ir < rowLength; ir++) {
            for (int ic = 0; ic < array[ir].length; ic++) {
                result.append(array[ir][ic]);
            }
            result.append('\n');
        }

        return result.toString();
    }

}
