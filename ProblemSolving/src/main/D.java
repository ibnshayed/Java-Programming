package main;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        //Two Plus Tow Is Four...
        Scanner in = new Scanner(System.in);
        String anotherEquation = in.next();
        int another = computeAnother(anotherEquation);
        System.out.println(another);
    }

    static int computeAnother(String equation) {
        int result = 0;
        String noMinus = equation.replace("-", "+-");
        String[] byPluses = noMinus.split("\\+");

        for (String multipl : byPluses) {
            String[] byMultipl = multipl.split("\\*");
            double multiplResult = 1.0;
            for (String operand : byMultipl) {
                if (operand.contains("/")) {
                    String[] division = operand.split("\\/");
                    double divident = Double.parseDouble(division[0]);
                    for (int i = 1; i < division.length; i++) {
                        divident /= Double.parseDouble(division[i]);
                    }
                    multiplResult *= divident;
                } else {
                    multiplResult *= Double.parseDouble(operand);
                }
            }
            result += multiplResult;
        }

        return result;
    }
}

