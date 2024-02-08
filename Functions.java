import java.util.Scanner;

public class Functions {
    public static void printFactorial(int n) {
/// Find The "FACTORIAL" of a Number :


        int Factorial = 1;
        for(int i=n; i>=1; i--){
         Factorial = Factorial*i;
        }
        System.out.println(Factorial);
        
    }
    public static void main(String[] args) {
        Scanner Number = new Scanner(System.in);
        int n = Number.nextInt();

        printFactorial(n);
    

    }
}
