package operations;

import average.Average;

import java.util.ArrayList;

public class StandardDesviation {
    private double standartDesviation;


    public double getStandartDesviation(){
        return standartDesviation;
    }



    public void setStandartDesviation(ArrayList<Double> listNumbers, Average average){
        double sum = 0;
        for (double number : listNumbers) {
            double resolvingTheParentheses = Math.pow((number - average.getAverage()), 2);
            sum += resolvingTheParentheses;
        }
        double division_by_n = sum / listNumbers.size();
        standartDesviation = Math.sqrt(division_by_n);


        }

    }

