package calculator;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Калькулятор умеет работать как с арабскими (1,2,3…), так и с римскими (I,II,III…) числами,");
        System.out.println("но только с одним типом чисел одновременно.");
        System.out.println("Нельзя использовать более двух операндов и одного оператора.");
        System.out.println("Введите выражение в виде: 1 + 1, либо I + I (пробелы обязательны).");

        List<String> list = new ArrayList<>(Arrays.asList(args));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        try {
            Collections.addAll(list, input.split(" ", 50));
            Calculator.inputValues(list.get(0), list.get(1), list.get(2));
        } catch (Exception e) {
            System.out.println("Вы ввели некорректные значения.");
        }

        System.exit(0);
    }
}
