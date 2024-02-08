import java.util.Scanner;

public class FunctionsPracticeQuest {
 
    public static void main(String[] args) {

        //q1. Enter 3 numbers from the user & make a function to print their average.

       
        /*Scanner avg = new Scanner(System.in);

        System.out.println("Enter Any Value");

        System.out.print("a : ");
        int a  = avg.nextInt();

        System.out.print("b : ");
        int b  = avg.nextInt();

        System.out.print("c : ");
        int c  = avg.nextInt();

        int sum = a+b+c;
        int average = sum/3;

        System.out.println("Total Average : " + average );*/





        //q2.Write a function to print the sum of all odd numbers from 1 to n.

        /*Scanner usernumber = new Scanner(System.in);

        System.out.print("Input a Number : ");
        int n = usernumber.nextInt();

        int oddsum = 0;
        int evensum = 0;

        for(int i = 1; i<=n;i++){
            if (i % 2 !=0) {
                oddsum= oddsum+i;
            }
            else{
                evensum=evensum+i;
            }
        }
         System.out.println("Sum of all Odd Number = " + oddsum);
  System.out.println("Sum of all Even Number = " + evensum);*/







         //q3.Write a function which takes  2 numbers and returns the greater No. of these two.

         /* Scanner Greater = new Scanner(System.in);

         System.out.println("Input a Value of A :");
         int a = Greater.nextInt();

            System.out.println("Input a Value of B :");
         int b = Greater.nextInt();

         if (a>b) {
            System.out.println("Here is your greater No. = "+a);
         }
         else{
            System.out.println("Here is your greater No. = "+b);
         } */








         //q4.Write a function that takes the radius as input and returns the circumference of a circle.

         /*Scanner numb = new Scanner(System.in);

         System.out.print("Input radius (r) : ");
         int radius = numb.nextInt();

         double r = 2*3.14159265359*radius;
         System.out.println(" Circumference of Circle : " + r );*/







         //q5. Write a function that takes age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

        /* Scanner vote = new Scanner(System.in);

         System.out.print("Enter your age : ");
         int age  = vote.nextInt();

         for(int i = age; i<=age;i++){

         if (i>=18) {
            System.out.println("You can Vote");
         }

         else{
            System.out.println("You cannot Vote");
         }
} */







        //q6.Write an infinite loop using do while condition.

        /*do{

        }while(true);*/








        //q7.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
        
        
        /*int positive = 0, negative = 0, zeros = 0;
        System.out.println("Press 1 to continue & 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
 
 
        while(input == 1) {
            System.out.println("Enter your number : ");
            int number = sc.nextInt();
            if(number > 0) {
                positive++;
            } else if(number < 0) {
                negative++;
            } else {
                zeros++;
            }
 
 
            System.out.println("Press 1 to continue & 0 to stop");
            input = sc.nextInt();
        }
 
 
        System.out.println("Positives : "+ positive);
        System.out.println("Negatives : "+ negative);
        System.out.println("Zeros : "+ zeros);*/


          



        //q8.Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x to the power n.

        /*Scanner user = new Scanner(System.in);

        System.out.print("Write X = ");
        int base = user.nextInt();

        
        System.out.print("Write N = ");
        int exponent = user.nextInt();

        double power = Math.pow(base, exponent);

        System.out.println("Here is your X to Power N : " + power);*/



 




    























      
        

        





















    }
}
