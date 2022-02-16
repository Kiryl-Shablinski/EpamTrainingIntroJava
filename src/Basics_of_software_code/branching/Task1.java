package Basics_of_software_code.branching;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws Exception{
   /*     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(triangleExists(Double.parseDouble(bufferedReader.readLine()),
                Double.parseDouble(bufferedReader.readLine())));

    */
    }

    public static String triangleExists(double a, double b) {
      StringBuilder sb = new StringBuilder();

      if ((a + b) < 180){
            sb.append("Треугольник существует.");
            if ((a + b) == 90){
                sb.append("\nТреугольник прямоугольный.");
            }
        }else{
            sb.append("Треугольник не существует.");
        }
        return sb.toString();
    }
}
