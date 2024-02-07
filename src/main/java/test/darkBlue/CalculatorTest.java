package test.darkBlue;

import java.util.Calendar;
import java.util.Scanner;

public class CalculatorTest {

   /* public static void main(String[] args) {
        CalculatorPage calculatorPage = new CalculatorPage();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator");

        System.out.println("Enter A value: ");
        if (scanner.hasNextInt()) {
            int a =scanner.nextInt();
            System.out.println("Enter B value: ");
            int b =scanner.nextInt();
            int c=a+b;
            System.out.println(c);
        } else if (scanner.hasNextDouble()) {
            double a =scanner.nextInt();
            System.out.println("Enter B value: ");
            double b =scanner.nextInt();
            double c=a+b;
            System.out.println(c);
        }
    }*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorPage calculatorPage = new CalculatorPage();
        System.out.println("Enter A Value: ");
        String aInput = scanner.nextLine();
        System.out.println("Enter B Value: ");
        String bInput = scanner.nextLine();

        boolean isDouble = aInput.contains(".") | bInput.contains(".");
        double aDouble = 0;
        double bDouble = 0;
        int aIntValue = 0;
        int bIntValue = 0;
        if (isDouble) {
            aDouble = Double.parseDouble(aInput);
            bDouble = Double.parseDouble(bInput);
        } else {
            aIntValue = Integer.parseInt(aInput);
            bIntValue = Integer.parseInt(bInput);
        }

        System.out.println("Select one option");
        System.out.println("1. Add \n" +
                "2. Sub");
        String option = scanner.nextLine();


        switch (option) {
            case "1":
                if (isDouble) {
                    System.out.println(calculatorPage.addition(aDouble, bDouble));
                } else {
                    System.out.println(calculatorPage.addition(aIntValue, bIntValue));
                }
                break;
            case "2":
                if (isDouble) {
                    System.out.println(calculatorPage.subtraction(aDouble, bDouble));
                } else {
                    System.out.println(calculatorPage.subtraction(aIntValue, bIntValue));
                }
                break;
        }


    }

}
