/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> reads;

    public AverageSensor() {
        sensors = new ArrayList<>();
        reads = new ArrayList<>();
    }

    public List<Integer> readings() {
        return reads;
    }

    public void addSensor(Sensor toAdd) {

        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor s : sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        if (sensors.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public void setOn() {
        sensors.forEach(a -> a.setOn());
    }

    @Override
    public void setOff() {
        sensors.forEach(a -> a.setOff());
    }

    @Override
    public int read() {
        if (sensors.isEmpty() || !isOn()) {
            // sensors=new ArrayList<>(0);
            throw new IllegalStateException("sensors is empty or it is off");
        } else {
            int average = (int) sensors.stream().mapToInt(a -> a.read()).average().getAsDouble();
            reads.add(average);
            return average;
        }
    }

}
