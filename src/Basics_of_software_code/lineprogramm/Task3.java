package Basics_of_software_code.lineprogramm;



public class Task3 {
    public static void main(String[] args) {
        //(sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);

        System.out.println(getFun(Math.toRadians(45),Math.toRadians(15)));
    }

    public static double getFun(double x, double y){

        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }
}
