package Basics_of_software_code;

public class Task1 {
    public static void main(String[] args) {
        //find function z=((a-3)*b/2)+c;
        System.out.println(getFun(75.67,45,30));
    }

    public static double getFun(double a, double b, double c){

        return ((a - 3) * b / 2) + c;
    }
}
