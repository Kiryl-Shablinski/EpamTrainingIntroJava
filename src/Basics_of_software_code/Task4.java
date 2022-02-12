package Basics_of_software_code;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(getNumber(567.345));
    }
    public static String getNumber( double r){
        StringBuilder number = new StringBuilder();

        String [] numbers = String.valueOf(r).split("\\.");
        return number.append(numbers[1]).append(".").append(numbers[0]).toString();
    }
}
