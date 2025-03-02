import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import average.Average;
import operations.StandardDesviation;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> listNumbers = new ArrayList<>();

        while (true){
            System.out.print("Digite um número: ");
            double numbers = sc.nextDouble();
            listNumbers.add(numbers);

            System.out.print("Deseja continuar: (s/n) ");
            char writeCondition = sc.next().charAt(0);
            if (writeCondition == 's') {
                continue;
            }
            else {
                break;
            }

        }

        Average average = new Average();
        average.setAverage(listNumbers);
        StandardDesviation standardDesviation = new StandardDesviation();
        standardDesviation.setStandartDesviation(listNumbers, average);

        System.out.printf("A média é %.2f e o desvio padrão é %.2f para cima e %.2f para baixo.", average.getAverage(), standardDesviation.getStandartDesviation(), standardDesviation.getStandartDesviation());
        sc.close();
    }
}