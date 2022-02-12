package Basics_of_software_code;



public class Task3 {
    public static void main(String[] args) {
        //(sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);

        System.out.printf("%.12f",getFun(Math.toRadians(45),Math.toRadians(15)));
    }

    public static double getFun(double x, double y){
     /*  System.out.printf("%.12f\n",(Math.sin(x) + Math.cos(y)));
        System.out.printf("%.12f\n",Math.cos(x) - Math.sin(y));
        System.out.printf("%.12f\n",(Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)));
        System.out.printf("%.12f\n",Math.sin(x * y));
        System.out.printf("%.12f\n",Math.cos(x * y));

      */
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }
}
