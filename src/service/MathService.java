package service;

import model.Numbers;

public class MathService {
    public int getGcd(Numbers numbers) {
        int max = numbers.max();
        int min = numbers.min();

        while (min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }

        return max;
    }

    public int getLcm(Numbers numbers) {
        return numbers.max() / getGcd(numbers) * numbers.min();
    }
}