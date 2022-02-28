package Basics_of_software_code.cycles;

public class Task5 {
    public static void main(String[] args) {
        //siries of the number
        // an = 1 / 2 ^ n + 1 / 3 ^ n;
        System.out.println(sumOfNumberSiries(5,0.002));

    }

    public static  double sumOfNumberSiries(int n, double e){
        double sum = 0.0;
        for (int i = 0; i <= n; i++){
            double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(a)  >= e) {
                sum += a;
            }
        }

        return sum;
    }
}
