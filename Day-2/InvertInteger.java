import java.util.*;

public class InvertInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer to reverse: ");
        int originalValue = sc.nextInt();
        int invertedResult = 0;
        for (; originalValue != 0; originalValue /= 10) {
            int remainder = originalValue % 10;
            invertedResult = (invertedResult * 10) + remainder;
        }        
        System.out.println("Reversed Number: " + invertedResult);
        sc.close();
    }
}