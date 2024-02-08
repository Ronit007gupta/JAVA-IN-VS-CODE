import java.util.Scanner;

public class DSApractice {
    public static void main(String[] args) {
        //Find the Sum of First N Natural Numbers
      /*   Scanner Natural = new Scanner(System.in);
        int sum = 0;

        System.out.print("Input an Natural Number : ");
        int n = Natural.nextInt();

        for( int i = 0; i<=n; i++ ){
            sum = sum+i;
        }

        System.out.println(sum);*/





        //Write The Table of Number Given By the User

        /*Scanner num = new Scanner(System.in);

        System.out.println("Input a Number");
        int k = num.nextInt();

        for(int i = 1; i<11;i++){
        System.out.println(k*i);
        }*/






        //Print All Even No. Till n Input The User

        /*Scanner even = new Scanner(System.in);

        System.out.print("Type A Number : ");
        int usernum = even.nextInt();
        System.out.println("Here is your Even Number:  ");

        for(int i = 0; i<=usernum; i++){
        if (i%2==0) {
            System.err.println(i); 
        }*/




        // Marks Given By the User

        Scanner choose = new Scanner(System.in);

        System.out.println("Hi User !");
        System.out.println("Choose 1 or 0");
        int initial = choose.nextInt();
        
        Scanner marks = new Scanner(System.in);
        int usernumber = 1;


        do{

            if (initial==0) {
            System.out.println("Stop There");
            break;
        }

            System.out.println("Input Marks Out of 100");
            usernumber = marks.nextInt();
            if (usernumber>=90 && usernumber<=100){
                System.out.println("This is Good");
            }

            else{
                if (usernumber<=89 && usernumber>=60){
                    System.out.println("This is also Good");
                }

                
        if (usernumber>100) {
                    System.out.println("Your Number is Too large");
                    break;
                }

                if (usernumber>=0 && usernumber<=59) {
                    System.out.println("This is Good As Well");
                }
            }

        }while(usernumber>0 && usernumber<=100);
        
    





































    }
}
