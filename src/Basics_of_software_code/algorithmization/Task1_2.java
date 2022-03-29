package Basics_of_software_code.algorithmization;

import java.util.Arrays;

public class Task1_2 {
    public static void main(String[] args) {
    int [] arr = new int[]{1,5,7,3,4,5,7,8};
    int z = 6;
    replaceElement(arr, z);
        System.out.println(Arrays.toString(arr));
    }
    public static void replaceElement(int[] arr, int z){
       int countReplace = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > z){
                arr[i] = z;
                countReplace++;
            }
        }
        System.out.println("Колличество замен: " + countReplace);
    }

}
