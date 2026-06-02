import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please input an integer to check:");
        int inputVal = sc.nextInt();
        sc.close();

        int temporaryVal = inputVal;
        int invertedResult = 0;      
        for (; temporaryVal > 0; temporaryVal /= 10) {
            int currentDigit = temporaryVal % 10;
            invertedResult = (invertedResult * 10) + currentDigit;
        }
        String Message = (inputVal == invertedResult) ? " is a palindrome." : " is not a palindrome.";
        System.out.println(inputVal + Message);
    }
}