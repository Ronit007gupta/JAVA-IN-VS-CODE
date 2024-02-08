import java.util.Scanner;

public class TOH {
// Lets Play The Game Of The Tower Of Hanoi: - 

    public static void towerOfHanoi(int n , String origin , String tower , String destination){
        if (n == 1) {
                    System.out.println("transfer disk"+n+"+from"+origin+ "to"+destination);

            return;
        }

        towerOfHanoi(n-1, origin, destination, tower);
        System.out.println("transfer disk "+ n+"+from"+origin+ "to"+destination);
        towerOfHanoi(n-1, tower, origin, destination);
    }
    public static void main(String[] args) {
        Scanner toh = new Scanner(System.in);
        System.out.print("Set your Number of Disk to play Tower Of Hanoi : ");
        int n = toh.nextInt();
        towerOfHanoi(n, "O", "T", "D");
    }
}
