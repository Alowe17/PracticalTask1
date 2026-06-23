import model.NumberPair;
import parser.NumberParser;
import service.MathService;

import java.util.Scanner;

public class Application {
    private final MathService service = new MathService();
    private final NumberParser parser = new NumberParser();

    public void start() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число номер 1: ");
        String first = console.nextLine();
        System.out.print("Введите число номер 2: ");
        String second = console.nextLine();
        NumberPair numberPair = parser.parse(first, second);

        int gcd = service.getGcd(numberPair);
        int lcm = service.getLcm(numberPair);

        System.out.println();
        System.out.println("На вход поступили числа: " + first + " и " + second);
        System.out.println("НОД: " + gcd);
        System.out.println("НОК: " + lcm);
    }
}