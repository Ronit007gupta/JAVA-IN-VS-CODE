import java.util.Scanner;

public class Recursion {

    /*public static void reverseCounting(int n){
        if (n==0) {
            return;
        }

        System.out.println(n);
        reverseCounting(n-1);
    }*/

/*public static void printSum(int i,int n,int sum){

    if (i == n) {
        sum = sum + i;
        System.out.println(sum);
        return;
    }

    sum = sum + i;
    printSum(i+1, n, sum);
}*/

    /*public static void Factorial(int n, int i , int facto){
        if (i == n) {
            facto = facto*i;
            System.out.print(facto);
            return;
        }

        //Niche maine element ki value updation ke liye likha h...

        facto = facto * i;
        Factorial(n, i+1, facto);
    }*/

    /*public static int numPower(int x,int n){
        if (x ==0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        int xPownm1 = numPower(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
    }*/


    /*public static void printRev(String sentence , int index){
        if (index==0) {
            System.out.println(sentence.charAt(index));
            return;
        }

        System.out.print(sentence.charAt(index));
        printRev(sentence, index-1);
    }*/


    public static void printSorted(int arr[] , int idx){
if (idx == arr.length-1) {
}

        if (arr[idx] < arr[idx+1]) {
            System.out.println(arr[idx]);
        
        }

        else{
            return;
        }
         printSorted(arr, idx+1);     
    }



    public static void main(String[] args) {
       //Print Number From 5 to 1

       //If you use loop function

       /*for(int i = 5; i>0; i--){
        System.out.println(i);
       }*/
        

       // If you use Recursion
       /*Scanner sc = new Scanner(System.in);
       System.out.print("Enter a Number : ");
       int n = sc.nextInt();
       reverseCounting(n);*/


       //Print Sum of first n natural Numbers using Recursion : -

      //printSum(1, 100, 0);



      /*Print Factorial of n Using Recurrsion */

      /*System.out.println("Enter Your Factorial Number : " );
      Scanner num = new Scanner(System.in);
      int x  = num.nextInt();






      Factorial(x, 1, 1);*/

      /// Print X^n using recursion : - 

      /*Scanner power = new Scanner(System.in);
      System.out.println("Type Base of number");
      int base = power.nextInt();
      System.out.println("Type poweer of a number");
      int exponent = power.nextInt();

      System.out.println(numPower(base, exponent));*/



      // Print Your name using Recursion :- 

      /*Scanner reverse = new Scanner(System.in);
      String sent = reverse.nextLine();

      printRev(sent, sent.length()-1);*/




      //Check If an Array is Sorted (Strictly Increasing) : - 

      int arr [] = {1,2,3,4,2};
      int idx = 0;
      
      
      





     


      



       










    }
}