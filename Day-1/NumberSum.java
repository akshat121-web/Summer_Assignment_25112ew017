import java.util.*;

public class NumberSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input value: ");
        int p = sc.nextInt();
        
      
        if (p>= 1) {
            long total = ((long) p * (p + 1)) / 2;
            System.out.printf(" total from 1 to %d equals: %d%n", p, total);
        } else {
            System.out.println("Value must be greater than zero.");
        }
        
        sc.close();
    }
}