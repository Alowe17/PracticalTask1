package parser;

import model.NumberPair;

public class NumberParser {
    public NumberPair parse (String string1, String string2) {
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

        return new NumberPair(number1, number2);
    }
}