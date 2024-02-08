public class Sorting {
    public static void main(String[] args) {


        // Bubble Sort

        int arr[] = {7,8,3,1,2};
        //For round 1 to 5
        for(int i = 0; i<arr.length-1; i++){
            // For Comparision of Number and shifting them
            for(int j = 0; j<arr.length-i-1; j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }















    }
}