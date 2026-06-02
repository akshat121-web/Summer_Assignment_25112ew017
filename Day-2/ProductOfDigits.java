import java.util.*;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        int temp = (num < 0) ? -num : num;
        int product = 1;
        if (temp == 0) {
            product = 0;
        } else {
            while (temp > 0) {
                int digit = temp % 10;  
                product *= digit;       
                temp /= 10;            
            }
        }
        System.out.println("The product of the digits of " + num + " is: " + product);
        sc.close();
    }
}