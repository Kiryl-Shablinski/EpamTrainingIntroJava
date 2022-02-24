package Basics_of_software_code.cycles;

import java.math.BigInteger;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(productSquares());
    }

    public static BigInteger productSquares(){
        BigInteger prod = BigInteger.ONE;
        for (int i = 1; i <= 200; i++){
            prod = prod.multiply(BigInteger.valueOf((long) Math.pow(i, 2)));
        }
        return prod;
    }
}
