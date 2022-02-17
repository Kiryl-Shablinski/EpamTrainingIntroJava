package Basics_of_software_code.branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        Task5 task = new Task5();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(bufferedReader.readLine());

        System.out.println(task.getFun(x));
    }

    public double getFun(double x){
        if (x <= 3) {
            return fun1(x);
        }
        else {
            return fun2(x);
        }
    }

    public static double fun1(double x){

        return x * x - 3 * x + 9;
    }

    public static double fun2 (double x){
        return 1 / (Math.pow(x, 3) + 6);
    }
}
