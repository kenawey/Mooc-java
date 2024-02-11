
public class Statistics {

    private int count = 0;
    private int sum = 0;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;

    }

    public void addNumber(int number) {
        // write code here
        this.count++;
        this.sum += number;

    }

    public int getCount() {
        // write code here
        return this.count;
    }

    public int sum() {
        // write code here
        return this.sum;
    }

    public double average() {
        // write code here
        double average = 0.0;
        if (count == 0) {
            average = 0;
        } else {
            average = (double) sum / count;
        }
        return average;
    }

}
