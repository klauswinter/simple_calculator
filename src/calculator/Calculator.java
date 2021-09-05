package calculator;

import operators.*;

public class Calculator {

    public static void inputValues(String firstString, String operators, String secondString) {
        int firstValue = 0;
        int secondValue = 0;
        int result = 0;
        boolean flag = false;

        try {
            firstValue = Integer.parseInt(firstString);
            secondValue = Integer.parseInt(secondString);
        } catch (Exception e) {
            try {
                firstValue = Converter.toArabic(firstString);
                secondValue = Converter.toArabic(secondString);
                flag = true;
            } catch (Exception e1) {
                System.out.println("Вы ввели некорректные значения.");
            }
        }

        if(firstValue < 1 || firstValue > 10 || secondValue < 1 || secondValue > 10) {
            System.out.println("Один из операндов меньше 1, либо больше 10.");
            System.exit(0);
        }

        Operation operation;

        if(operators.equals("+")) {
            operation = new Add();
            result = operation.call(firstValue, secondValue);
        }

        if(operators.equals("-")) {
            operation = new Subtract();
            result = operation.call(firstValue, secondValue);
        }

        if(operators.equals("*")) {
            operation = new Multiplicate();
            result = operation.call(firstValue, secondValue);
        }

        if(operators.equals("/")) {
            operation = new Divide();
            result = operation.call(firstValue, secondValue);
        }

        if(flag) {
            String roman = Converter.toRoman(result);
            System.out.println(roman);
        }

        else {
            System.out.println(result);
        }

    }
}
