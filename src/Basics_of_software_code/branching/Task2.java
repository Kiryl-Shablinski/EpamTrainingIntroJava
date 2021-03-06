package Basics_of_software_code.branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) {
       Task2 solution = new Task2();
        double[] numbers = solution.createNumbers();
        double max = 0;
        double min1 = 0;
        double min2 = 0;
        if(numbers[0] < numbers[1]){
            min1 = numbers[0];
        }else{
            min1 = numbers[1];
        }
        if (numbers[2] < numbers[3]){
            min2 = numbers[2];
        }else{
            min2 = numbers[3];
        }
            if (min1 > min2){
                max = min1;

            }else{
                max = min2;

            }
        System.out.println(max);
//----------------------------------------
// or
// ---------------------------------------
        System.out.println(Math.max(Math.min(numbers[0], numbers[1]),
                Math.min(numbers[2], numbers[3])));
    }

    public double[] createNumbers(){
        //счетчик вводимых чисел
        int count = 0;
        // массив для хранения введенных чисел
        double[] numbers = new double[4];
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
        while( count < 4 ) {
            String text = bufferedReader.readLine();
            double number = Double.parseDouble(text);
            numbers[count] = number;
            count++;
        }
            } catch (IOException e) {
                e.printStackTrace();
            }catch (NumberFormatException o){
                System.out.println("Please insert number");
            }

        return numbers;
    }
}
