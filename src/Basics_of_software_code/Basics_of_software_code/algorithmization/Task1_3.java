package Basics_of_software_code.algorithmization;

import java.util.Random;

public class Task1_3 {
    public static void main(String[] args) {
        int n = new Random().nextInt(10000);
        System.out.println(n);
        int [] array = creatArray(n);
        elementCount(array);

    }
// создаем и заполняем массив случайными числами
    public static int[] creatArray(int n){
    int[] array = new int[n];
    for (int i = 0; i < n; i++){
        array[i] = new Random().nextInt();
    }

    return array;
    }

    public static void elementCount (int[] arr){
        int countNegativ = 0;
        int countZero = 0;
        int countPositive = 0;

        for (int num : arr){
            if (num < 0) countNegativ++;
            if (num == 0) countZero++;
            if (num > 0) countPositive++;
        }
        System.out.println("Колличество отрицательных элементов: " + countNegativ);
        System.out.println("Колличество нулевых элементов: " + countZero);
        System.out.println("Колличество положительных элементов: " + countPositive);
    }
}
