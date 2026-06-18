import model.Numbers;
import parser.NumberParser;
import service.MathService;

import java.util.Scanner;

public class Application {
    private final MathService service = new MathService();
    private final NumberParser parser = new NumberParser();

    public void start() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число номер 1: ");
        String number1 = console.nextLine();
        System.out.print("Введите число номер 2: ");
        String number2 = console.nextLine();
        Numbers numbers = parser.parse(number1, number2);

        int gcd = service.getGcd(numbers);
        int lcm = service.getLcm(numbers);

        System.out.println();
        System.out.println("На вход поступили числа: " + number1 + " и " + number2);
        System.out.println("НОД: " + gcd);
        System.out.println("НОК: " + lcm);
    }
}