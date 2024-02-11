
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
         ArrayList<Integer>result=new ArrayList<>();
         int rowLength = square.length;
        for (int ir = 0; ir < rowLength; ir++) {
            int sum=0;
            for (int ic = 0; ic < square[ir].length; ic++) {
                sum+=square[ir][ic];
            }
            result.add(sum);
        }
        
        
        return result;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer>result=new ArrayList<>();
         int rowLength = square.length;
        for (int ir = 0; ir <square[0].length; ir++) {
            int sum=0;
            for (int ic = 0;  ic<rowLength; ic++) {
                sum+=square[ic][ir];
            }
            result.add(sum);
        }
        
        
        return result;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
         ArrayList<Integer>result=new ArrayList<>();
          int sumD1=0,sumD2=0;
         int rowLength = square.length;
        for (int ir = 0; ir < rowLength; ir++) {
            //int sumD1=0,sumD2=0;
            for (int ic = 0; ic < square[ir].length; ic++) {
                if(ir==ic){
                sumD1+=square[ir][ic];
            }
                if((ir + ic) == (rowLength - 1)){
                sumD2+=square[ir][ic];
                }
            }
            
        }
        result.add(sumD1);
        result.add(sumD2);
        return result;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
