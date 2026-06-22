package service;

import model.NumberPair;

public class MathService {
    public int getGcd(NumberPair numberPair) {
        int first = numberPair.first();
        int second = numberPair.second();

        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }

        return first;
    }

    public int getLcm(NumberPair numberPair) {
        return numberPair.first() / getGcd(numberPair) * numberPair.second();
    }
}