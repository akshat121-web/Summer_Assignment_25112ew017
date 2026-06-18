import java.util.*;

public class Multiplicationtable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input an integer: ");
        int targetNum = sc.nextInt();
        
        System.out.printf("%nTable of %d :-%n", targetNum);
        
        int b = 1;
        while (b <= 10) {
            int Result = targetNum * b;
            System.out.printf("%d * %d = %d%n", targetNum, b, Result);
            b++;
        }
        
        sc.close();
    }
}