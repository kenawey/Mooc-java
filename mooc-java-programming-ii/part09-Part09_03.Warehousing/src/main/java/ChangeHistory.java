
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohamed
 */
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {

        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        double myMax = history.get(0);
        for (int i = 1; i < history.size(); i++) {
            if (myMax < history.get(i)) {
                myMax = history.get(i);
            }
        }

        double result = history.isEmpty() ? 0.0 : myMax;
        return result;
    }

    public double minValue() {
        double myMin = history.get(0);
        for (int i = 1; i < history.size(); i++) {
            if (myMin > history.get(i)) {
                myMin = history.get(i);
            }
        }

        double result = history.isEmpty() ? 0.0 : myMin;
        return result;
    }

    public double average() {
        double avg = 0.0;
        for (Double d : history) {
            avg += d;
        }
        return avg / history.size();
    }
}
