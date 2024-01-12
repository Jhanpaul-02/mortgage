import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Calculate Mortgage
        final byte MONTHS_IN_A_YEAR = 12;
        final byte PERCENT = 100;

//        The value that you input
        int principal = 0;
        float annualInterest = 0;
        byte years = 0;

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("Principal (1k-1M): ");
            principal = sc.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
                System.out.println("Enter a number between 1,000 and 1,000,000");
        }

        while (true){
            System.out.print("Annual Interest Rate: ");
            annualInterest = sc.nextFloat();
            if (annualInterest > 0 && annualInterest <= 30)
                break;
                System.out.println("Enter a value greater than 0 and less than 30");
        }
        float monthlyInterestRate = annualInterest / PERCENT / MONTHS_IN_A_YEAR;

        while (true) {
            System.out.print("Period (Years): ");
            years = sc.nextByte();
            if (years > 0 && years <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }
        int period = years * MONTHS_IN_A_YEAR;

        double mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, period))
                / (Math.pow( 1 + monthlyInterestRate, period) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);

//        FizzBuzz
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int inputNumber = sc.nextInt();
//
//        if (inputNumber % 5 == 0 && inputNumber % 3 == 0)
//            System.out.println("FizzBuzz");
//        else if (inputNumber % 3 == 0)
//            System.out.println("Buzz");
//        else if (inputNumber % 5 == 0)
//            System.out.println("Fizz");
//        else
//            System.out.println(inputNumber);
    }
}