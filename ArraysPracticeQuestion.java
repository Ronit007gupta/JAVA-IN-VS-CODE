import java.util.Scanner;

public class ArraysPracticeQuestion {
    public static void main(String[] args) {

        //q1. Take an array of names as input from the user and print them on the screen.

        Scanner sc = new Scanner(System.in);

        System.out.println("How many Names do you want to Enter");
        int sizes = sc.nextInt();

        String names [] = new String[sizes];

        for(int i= 0; i<sizes; i++){
            names [i]= sc.nextLine(); 
        }
         
       for(int i=0; i<names.length; i++) {
        System.out.println("name " + (i+1) +" is : " + names[i]);
    }



        
























    }
}
