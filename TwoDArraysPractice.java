import java.util.Scanner;

public class TwoDArraysPractice {
    public static void main(String[] args) {
        


        // Print a Spiral Matrix of a Number

        Scanner matrix = new Scanner(System.in);
        System.out.print("Define rows : ");
        int n = matrix.nextInt();
        System.out.print("Define cols : ");
        int m = matrix.nextInt();

        System.out.println("Make a Matrix ");

        int number [] [] = new int[n][m];

        for(int i = 0; i<n;i++){
            for(int j = 0 ; j<m; j++){
            number[i][j] = matrix.nextInt();
            }

        }

         System.out.println("Here is your Matrix Table ");

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                    System.out.print(number[i][j]+" ");
                }
                System.out.println();
            }




            // q2. For a given matrix of N x M, print its transpose.

            Scanner transpose = new Scanner(System.in);
        int rows = transpose.nextInt();
        int cols = transpose.nextInt();


        int numbers [] [] = new int[rows][cols];

        for(int i = 0; i<rows;i++){
            for(int j = 0 ; j<cols; j++){
            numbers[i][j] = transpose.nextInt();
            }

        }

        System.out.println("Here is your Transpose of Matrix");

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                    System.out.print(+number[j][i]+" ");
                }

                System.out.println();
            }

            

 

















    }
}
