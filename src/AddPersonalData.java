import java.text.DecimalFormat;
import java.util.Scanner;

public class AddPersonalData {
    static void addData(Data data) {
        Scanner userData = new Scanner(System.in);
        System.out.println("Podaj swój wzrost: ");
        double height = userData.nextDouble();
        System.out.println("Podaj swoją wagę: ");
        int weight = userData.nextInt();
        System.out.println("Jeśli Twój wzrost to: " + height + "\nA Twoja waga to: " + weight);
        int sum = (int)(weight / (height * height));
        DecimalFormat dFormat = new DecimalFormat("0");
        String round = dFormat.format(sum);
        System.out.println("Twój Body Mass Index wynosi:" + round);
    }
}
