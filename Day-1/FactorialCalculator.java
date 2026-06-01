import java.util.*;

public class FactorialCalculator {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive whole number: ");
        int Value = sc.nextInt();
            
        if (Value < 0) {
            System.out.println("Invalid input");
        } else {
            long productTotal = 1;
            int counter = Value;
            
            while (counter > 1) {
                productTotal *= counter;
                counter--;
            }
            
            System.out.printf("The factorial of %d is: %d%n", Value, productTotal);
        }
        
        sc.close(); 
    }
}