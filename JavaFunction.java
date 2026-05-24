/* 
public class JavaFunction {   
    public static void printHelloWorld(){                   // Function making
        System.out.println("Hello World");
        System.out.println("Hello World");                  
        System.out.println("Hello World");
        return;
    }  
        public static void main(String args[]) {
        printHelloWorld();                                  // function call

    }   
}
*/

/* 
public class JavaFunction {   
    public static int printHelloWorld(){                   // Function making
        System.out.println("Hello World");
        System.out.println("Hello World");                  
        System.out.println("Hello World");
        return 3;
    }  
        public static void main(String args[]) {
        printHelloWorld();                                  // function call

    }   
}
*/

/* 
import java.util.*;
public class JavaFunction {
    public static void calculateSum(){                       // function making
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is :" + sum);
 }
    public static void main(String args[]) {
        calculateSum();                                      // function call    

    }
 }    
*/

/*
import java.util.*;
public class JavaFunction {
    public static void calculateSum(int num1, int num2) {     //parameters or formal parameters                // function as parameters               
        int sum = num1 + num2;
        System.out.println("sum is :" + sum);                                                                 // Passing sum in calculateSum() function
 }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a,b);  //arguments or actual parameters                                                  // function call by passing input a,b                  
    }
 }    
*/

/* 
import java.util.*;
public class JavaFunction {
    public static int calculateSum(int num1, int num2) {                // function as parameters               
        int sum = num1 + num2;
        return sum;
 }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b);                                     // function call by passing input a,b   
        System.out.println("sum is :" + sum);                            // Passing sum in main function
    }
 }    
*/

/* 
import java.util.*;
public class JavaFunction {
    public static void swap(int a, int b){
       int temp=a;
       a=b;
       b=temp;   
    //   System.out.println("a=" + a);         // swap of two numbers
    //   System.out.println("b=" + b);         // swap of two numbers
    }
    
    public static void main(String args[]){                                             // call by value in function in java
       int a=5;
       int b=10;
       swap(a,b);   
    //   System.out.println("a=" + a);         // call by value
    //   System.out.println("b=" + b);         // call by value
    }
}
*/

/* 
import java.util.*;
public class JavaFunction {
    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String args[]){                     // product of a and b
      int a = 3;
      int b = 5;  
      int product=multiply(a,b);  
      System.out.println(" a * b = " + product);  
      int prod=multiply(1,5);  
      System.out.println(" a * b = " + prod); 
    }
}
*/

/* 
import java.util.*;
public class JavaFunction {
    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }                                                           // find factorial of a number
    public static void main(String args[]){
      int a = 3;
      int f=factorial(a);  
      System.out.println(f);
            //or
      int fac=factorial(3);
      System.out.println(fac); 
            //or
      System.out.println(factorial(3));              
    }
}
*/































