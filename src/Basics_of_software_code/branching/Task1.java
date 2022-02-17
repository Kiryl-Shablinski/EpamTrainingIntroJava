package Basics_of_software_code.branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String angle1 = bufferedReader.readLine();
            String angle2 = bufferedReader.readLine();

            double a = Double.parseDouble(angle1);
            double b = Double.parseDouble(angle2);
            System.out.println(triangleExists(a, b));
        } catch (NumberFormatException | IOException e) {
            System.out.println("Неверный формат данных");
            e.printStackTrace();
        }
    }

    public static String triangleExists(double a, double b) {
      StringBuilder sb = new StringBuilder();

      if (a > 0 && b > 0 && a + b < 180){
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
