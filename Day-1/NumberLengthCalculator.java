import java.util.*;

public class NumberLengthCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int Input = sc.nextInt();
        
        int Value = Input;
        int totalDigits = 0;
        
        
        if (Value < 0) {
            Value = -Value;
        }
        
        
        do {
            Value /= 10; 
            totalDigits++;      
        } while (Value > 0);
        
        System.out.println("The number of digits in " + Input + " is: " + totalDigits);
        
        sc.close();
    }
}