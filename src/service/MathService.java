package service;

import model.Numbers;

public class MathService {
    public Numbers validate(String string1, String string2) {
        int number1;
        int number2;

        try {
            if (string1.isBlank())
                throw new IllegalArgumentException("Необходимо ввести 1 число!");


            number1 = Integer.parseInt(string1);
        } catch (NumberFormatException exception) {
            throw new NumberFormatException("Не удалось преобразовать 1 число!");
        }

        try {
            if (string2.isBlank())
                throw new IllegalArgumentException("Необходимо ввести 2 число!");

            number2 = Integer.parseInt(string2);
        } catch (NumberFormatException exception) {
            throw new NumberFormatException("Не удалось преобразовать 2 число!");
        }

        if (number1 <= 0 || number2 <= 0)
            throw new IllegalArgumentException("Числа должны быть строго положительными (больше 0)!");

        return new Numbers(Math.max(number1, number2), Math.min(number1, number2));
    }

    public int getGcd(int max, int min) {
        for (int i = min; i >= 1; i--) {
            if (max % i == 0 && min % i == 0)
                return i;
        }

        throw new IllegalArgumentException("Не удалось определить НОД для чисел: " + max + " и " + min);
    }

    public int getLcm(int max, int min) {
        for (int i = max; ; i += max) {
            if (i % min == 0)
                return i;
        }
    }
}