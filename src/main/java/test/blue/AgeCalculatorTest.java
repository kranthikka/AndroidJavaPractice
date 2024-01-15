package test.blue;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;

public class AgeCalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.now();

        System.out.println("**Age Calculator**");
        System.out.println("1. Full age\n" +
                "2. Only years \n" +
                "Select any one option: ");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter Month: ");
                int month = scanner.nextInt();

                System.out.println("Enter Day: ");
                int day = scanner.nextInt();

                System.out.println("Enter Year: ");
                int year = scanner.nextInt();

                LocalDate birthDate = LocalDate.of(year, month, day);
                Period period = Period.between(birthDate, localDate);

                int days = period.getDays();
                int months = period.getMonths();
                int years = period.getYears();

                System.out.println("Current age: " + months + " months " + days + " days " + years + " years old.");
                break;

            case 2:
                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                System.out.println("Enter year of birth: ");
                int birthYear = scanner.nextInt();

                int age = currentYear - birthYear;
                System.out.println("Current age: " + age + " years old.");
                break;

            default:
                System.out.println("Invalid selection.");
                break;
        }
    }

}

/* Classes:
1. LocalDate
2. Period
3. Calendar
* */


