package Basics_of_software_code;



public class Task3 {
    public static void main(String[] args) {
        System.out.println(getFun(45,12));
    }

    public static double getFun(double x, double y){
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }
}
