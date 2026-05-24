import java.util.*;

public class JavaBasics {
   public static void main(String args[]) {
   /* 
    System.out.println("Hello");    
    System.out.println("Hello\n");              // output
    System.out.println("Hello");
   */

   /*  
    int a=5;
    int b=3;
    System.out.println(a);
    System.out.println(b);
    String name = "tonny";                      // variables
    System.out.println(name);
    a=6;
    System.out.println(a);
    a=b;
    System.out.println(a);
   */

   /* 
   byte b=8;
   System.out.println(b);
   char ch = 'a';
   System.out.println(ch);
   boolean var = true;       // boolean stores either true or false
   float price = 10.5;                                                              // data types
   int number = 25;
   // long                   // long stores long integer values
   // double                 // double stores long decimal values
   short n= 240;
   */

   /* 
   int a = 5;
   int b = 6;                // sum of a and b
   int sum = a+b;                    
   System.out.print(sum);
   */
   
                                                          // input from user
   /* 
   Scanner sc = new Scanner(System.in);
   String input = sc.next();                               // inputting single word
   System.out.println(input);
   */
   
   /*
   Scanner sc = new Scanner(System.in);
   String name = sc.nextLine();                          // inputting single line or paragraph 
   System.out.println(name);
   */   

   /*
   Scanner sc = new Scanner(System.in);
   String input = sc.nextInt();                          // inputting integer
   System.out.println(input);
   */

   /* 
   Scanner sc = new Scanner(System.in);
   String input = sc.nextFloat();                        // inputting decimal
   System.out.println(input);
   */
   
   /* 
   Scanner sc = new Scanner(System.in);
   int a= sc.nextInt();
   int b= sc.nextInt();                                
   int sum = a+b;                                        // sum of a and b
   int product = a*b;                                    // product of a and b
   System.out.println(sum);
   */

   /* 
   Scanner sc = new Scanner(System.in);
   float rad= sc.nextFloat();                            // area of a circle
   float area = 3.14f * rad * rad;                       // 3.14f denotes the conversion of 3.14 from double to float data type
   System.out.println(area);
   */

   /* 
   int a=25;
   long b= a;                                            // implicit conversion
   System.out.println(b);
   */

   /* 
   char ch='a';
   char ch2='b';
   int number= ch;                                       // implicit conversion
   int number2= ch2;                                    
   System.out.println(number);
   System.out.println(number2);
   */

   /*  
   char a='a';
   char b='b';       
   //char c= a-b;                 // error , since int cannot be converted to char                                                                                
   System.out.println(a);       // single letter will not be treated as an integer
   System.out.println(b-a+b);   // here expression will be treated as an integer
   */

   /* 
   int a=7;
   int b=3;                                         // binary operators
   System.out.println("add =" +(a+b));
   */

   /* 
   int a=10;                                         // pre increment
   int b= ++a;                                       // first value change then value use
   System.out.println(a);                            
   System.out.println(b);
   */

   /* 
   int a = 10;                                       // post increment
   int b = a++;                                      // first value use then value change
   System.out.println(a);
   System.out.println(b);
   */

   /* 
   int a=10;                                         // pre decrement
   int b= --a;                                       // first value change then value use
   System.out.println(a);                            
   System.out.println(b);
   */
   
   /* 
   int a = 10;                                       // post decrement
   int b = a--;                                      // first value use then value change
   System.out.println(a);
   System.out.println(b);
   */
   
   /* 
   System.out.println((3>2)&&(4>3));                  // logical and                 // Types of operators
   System.out.println(!(5>3));                        // logical not                  
   */

   /* 
   int age=16;
   if(age>=18){
      System.out.println("adult");
   }
   if(age>13 && age<18){                               // if else
      System.out.println("teenager");
   }
   else{
      System.out.println("not adult");
   }
   */

   /* 
   int a=2;
   int b=5;
   if(a>=b){                                            // print largest of two numbers
      System.out.println("a");
   }
   else{
      System.out.println("b");
   }
   */

   /* 
   Scanner sc=new Scanner(System.in);
   int number= sc.nextInt();
   if(number % 2== 0){                                  // print if number is even or odd
      System.out.println("even");
   }
   else{
      System.out.println("odd");
   }
   */

   /* 
   Scanner sc=new Scanner(System.in);
   int income= sc.nextInt();
   int tax;
   if (income<500000){
      tax=0;
   }                                                            // income tax calculator using else if statement
   else if(income>=500000 && income< 1000000){
      tax=(int) (income * 0.2);
   }
   else{
      tax=(int) (income*0.3);
   }
   System.out.println(" your income tax is: " + tax);
   */
   
   /* 
   int a=1 , b=3, c= 6;
   if((a>=b)&&(a>=c) ){
      System.out.println("largest is a");
   }                                                              // largest of 3 numbers
   else if (b>=c){
      System.out.println("largest is b ");
   }
   else{
      System.out.println("largest is c ");
   }
   */
   
   /* 
   int num=45;
   String number=((num%2)==0) ? "even" : "odd";                 // ternary operators
   System.out.println( number);
   */

   /* 
   int marks= 60;
   String reportCard = marks>=33 ? "pass" : "fail";               //ternary operators
   System.out.println(reportCard);
   */

   /* 
   char ch= 'a';
   switch(ch){
   case 'a': System.out.println("samosa");
            break;
   case 'b': System.out.println("burger");                        // switch staement
            break;
   case 'c': System.out.println("mango");
            break;
   default:System.out.println("invalid number");
   }
   */ 
   
   /* 
   Scanner sc = new Scanner(System.in);
   System.out.println("enter a:");
   int a = sc.nextInt();
   System.out.println("enter b:");
   int b= sc.nextInt();
   System.out.println("enter operator:"); 
   char operator = sc.next().charAt(0);
   switch(operator){
      case '+' : System.out.println(a+b);                         // calculator
                 break;
      case '-' : System.out.println(a-b);
                 break;
      case '*' : System.out.println(a*b);
                 break;
      case '/' : System.out.println(a/b);
                 break;
      case '%' : System.out.println(a%b);   
                 break;
      default  : System.out.println(" invalid operator");                                                
   }
   */

   /* 
   int i=0;
   System.out.println("print hello 10 times");
   while(i<10){                                                   // while loop
      System.out.println("hello");
      i++;
   }
   */

   /* 
   int i=1;
   while(i<=10){                                   // print numbers from 1 to 10                            
   System.out.println(i);
   i++; 
   }
   */

   /* 
   int i=1;
   while(i<=10){                                   // print numbers from 1 to 10 on same line                 
   System.out.print(i + " ");
   i++; 
   }
   */
   
   /* 
   Scanner sc=new Scanner(System.in);
   int n = sc.nextInt();
   int i=1;
   while(i<=n){                                   // print numbers from (1 to n) on same line                 
   System.out.print(i + " ");
   i++; 
   }
   */
   
   /* 
   Scanner sc=new Scanner(System.in);
   int n = sc.nextInt();
   int sum=0;
   int i=1;
   while(i<=n){                                   // print sum of first n natural numbers                  
   sum+=i;
   i++; 
   }
   System.out.print("sum is : " + sum);
   */

   /* 
   for(int i=1; i<=10 ; i++){
   System.out.println("Hello World");
   }  
   */
   
   /* 
   int n= 10899;
   while(n>0){
      int lastDigit = n % 10;                      // print reverse of a number
      System.out.print(lastDigit);
      n=n/10; // n/=10
   }
   System.out.println();
   */

   /* 
   int n=10899;
   int rev=0;
   while(n>0){                                     // reverse the given number
      int lastDigit = n % 10;
      rev = (rev*10)+ lastDigit;
      n = n/10;
   }
   System.out.println(rev);
   */

   /* 
   int i=1;
   do{
      System.out.println("hello");                 // do while loop
      i++;
   }while(i<=10);
   */

   /* 
   for(int i=1;i<=5;i++){
      if(i==3){
         break;                                   // Break statement
      }
      System.out.println(i);
   }
   System.out.println("i am out of loop");
   */
   
   /* 
   Scanner sc = new Scanner(System.in);

    do{
      System.out.print("enter your number: ");
      int n = sc.nextInt();                                // keep entering numbers till user enters a multiple of 10                   
      if(n % 10 == 0 ){
         break;
      }
      System.out.println(n);
    } while(true);
   */

    /* 
    for(int i=1; i<=5; i++){
      if (i==3){
         continue;                           // continue statement
      }
      System.out.println(i);
    }
    */

   /* 
    Scanner sc = new Scanner(System.in);

    do{
      System.out.print("enter your number : ");
      int n = sc.nextInt();                                 // Display all numbers entered by user except multiples of 10
      if(n % 10 ==0){
         continue;
      }
      System.out.println(" number was : " + n);
    } while(true);
   */
    
  /*  
    Scanner sc =new Scanner(System.in);
    System.out.print("enter the value of n : ");
    int n = sc.nextInt();
    if(n==2){
      System.out.println("n is prime");
  }else{

    boolean isPrime = true;
     for(int i=2; i<=n-1; i++){
       if(n % i == 0){                                       // check if a number is prime or not
         isPrime = false;                                    // 2 to (n-1)
      }
   }
   if (isPrime == true) {
      System.out.println("n is prime");
   } else {
      System.out.println("n is not prime");
   }
 }
  */ 

  /* 
   Scanner sc =new Scanner(System.in);
      System.out.print("enter the value of n : ");
      int n = sc.nextInt();
      if(n==2){
         System.out.println("n is prime");
   }else{

      boolean isPrime = true;
      for(int i=2; i<=Math.sqrt(n); i++){
         if(n % i == 0){                                       // check if a number is prime or not
            isPrime = false;                                   // n = sq root n * sq root n 
         }
      }
      if (isPrime == true) {
         System.out.println("n is prime");
      } else {
         System.out.println("n is not prime");
      }
   }
  */

   // PRINT THE PATTERNS :---

   /* 
   for(int line=1; line<=4; line++){                              // *
       for(int star=1; star<=line; star++){                       // **                    STAR PATTERN
         System.out.print("*");                                   // ***
       }                                                          // ****
       System.out.println();
   }
   */

   /*
   int n=4;
   for(int i=1; i<=n; i++){                                      // ****
       for(int j=1; j<=n-i+1; j++){                              // ***                   INVERTED STAR PATTERN
         System.out.print("*");                                  // **
       }                                                         // *
       System.out.println();
   }
   */
   
   /* 
   int n=4;
   for(int i=1; i<=n; i++){                                     // 1
      for(int j=1; j<=i; j++){                                  // 12                     HALF PYRAMID
         System.out.print(j);                                   // 123
      }                                                         // 1234
      System.out.println();
   }
   */

   /* 
   int n=4;
   char ch='A';
   // outer loop                                                // A
   for(int i=1 ; i<=n; i++){                                    // BC                    CHARACTER PATTERN
      // inner loop                                             // DEF
      for(int j=1; j<=i; j++){                                  // GHIJ
          System.out.print(ch);
          ch++;
      }
      System.out.println();
   }
   */

   



























   }
}
