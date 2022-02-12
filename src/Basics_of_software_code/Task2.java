package Basics_of_software_code;

public class Task2 {
    public static void main(String[] args) {
        // ((b + (b ^ 2 + 4 * a * c) ^ 1/2) / 2 * a) - a ^ 3 *c + b ^ -2;

        System.out.println(getFun(1, 2, 3));
    }

    public static double getFun(double a, double b, double c){


        return ((b + Math.pow((Math.pow(b, 2) + 4 * a * c ), 0.5 )) / (2 * a)) -
                Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
