package assignments;

import java.util.Scanner;

public class Main {
 

           //function to checkPalindrome
       public void checkPalindrome()  {
    	   Scanner sc =new Scanner(System.in);
    	   System.out.println("Enter the Number to check for Palindrom");
    		int num=sc.nextInt();
    	 int reverse_num=0, remainder,temp;
    	 temp=num;
    	 while(temp !=0)
    	 {
    	    remainder=temp%10;
    	    reverse_num=reverse_num*10+remainder;
    	    temp/=10;
    	 } 
    	 if (reverse_num==num) {
    		 System.out.println("No is Palindrome");
    	 }
    	 else {
    		 System.out.println("No is not Palindrome");
    	 }

      }
 
            //function to printPattern
       public void printPattern() {
    	   System.out.println("Enter the Number of your choice");
   		Scanner sc = new Scanner(System.in);
   		int n = sc.nextInt();
   		
   		for (int i=n;i>=1;i--) 
   		{
   			for (int j=1;j<=i;j++) 
   			{
   				System.out.print("*");
   			}
   System.out.println();
   		}

      }

          //function to check no is prime or not
        public void checkPrimeNumber() {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the Number to check");
        	int num= sc.nextInt();
        	int count=0;
        	for(int i=2; i<num; i++) {
    			if(num % i == 0) {
    				count++;
    			}
    		}
    		
    		if(count > 0) {
    			System.out.println("Entered number is Not a Prime number");
    		}else {
    			System.out.println("Entered number is a Prime number");
    		}
        	
        	 

        }
      
          // function to print Fibonacci Series
          public void printFibonacciSeries() {
           Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of object you want to print");
           int num=sc.nextInt();
                //initialize the first and second value as 0,1 respectively.
           int first = 0, second = 1;
           System.out.print(first +","+second+",");
           for (int i=0;i<num-2;i++) {
        	   int sum=first+second;
        	   System.out.print(sum+",");
        	   first=second;
        	   second=sum;
           }
System.out.println();
          }

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;



case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}
