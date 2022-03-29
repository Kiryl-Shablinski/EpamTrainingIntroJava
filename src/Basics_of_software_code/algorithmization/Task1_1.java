package Basics_of_software_code.algorithmization;

public class Task1_1 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,6,4,8,2,9};
        int k = 6;
        System.out.println(sumElements(arr,k));

    }

    public static  int sumElements( int[] arr, int k){
        int sumElements = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % k == 0){
                sumElements += arr[i];
            }
        }
        return sumElements;
    }
}
