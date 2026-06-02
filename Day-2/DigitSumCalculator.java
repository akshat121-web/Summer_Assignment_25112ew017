import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Please input a whole number: ");
        int Input = sc.nextInt();
        int Value = (Input < 0) ? (-1 * Input) : Input;
        int Sum = 0;
        for (; Value > 0; Value /= 10) {
            int currentDigit = Value % 10;
            Sum += currentDigit;
        }
        System.out.println("Sum of the individual digits of " + Input + " equals: " + Sum);        
        sc.close();
    }
}