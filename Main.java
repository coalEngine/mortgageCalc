
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Principal: ");
        String princ = input.next();
        System.out.print("\nPeriod: ");
        String years = input.next();
        System.out.print("\nAnnual Interest Rate: ");
        String annual = input.next();

        double prin = Double.parseDouble(princ);
        double year = Double.parseDouble(years);
        double an = Double.parseDouble(annual);

        an /= 100;
        an /= 12;
        year *= 12;

        double mortgage = prin * ((an * (Math.pow(1 + an, year))) / (Math.pow(1 + an, year) - 1));

        String mortageMoney = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortageMoney);



    }
}
