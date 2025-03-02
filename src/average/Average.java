package average;

import java.util.ArrayList;

public class Average {
    private double average;


    public double getAverage(){
        return average;
    }

    public void setAverage(ArrayList<Double> list) {
        double sum = 0;
        for (double number : list) {
            sum += number;
        }

        average = sum / list.size();
    }
}
