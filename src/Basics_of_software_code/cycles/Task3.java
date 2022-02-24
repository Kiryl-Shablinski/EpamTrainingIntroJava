package Basics_of_software_code.cycles;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(sumSquares());
    }

    public static long sumSquares(){
        long sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += Math.pow(i, 2);
        }
        return sum;
    }
}
