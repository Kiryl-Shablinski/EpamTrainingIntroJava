package Basics_of_software_code.cycles;


import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
       int number =  createNumber();
        System.out.println(sum(number));
        //----------------------------------
        // или рекурсией
        //---------------------------------
        System.out.println(recursionSum(number));
    }

    public static int  createNumber(){
        System.out.println("Введите целое положительное число");
        int number;
        while(true) {
            try (Scanner sc = new Scanner(System.in)) {


                number = Integer.parseInt(sc.next());
                if (number > 0) {

                    return number;
                } else {
                    System.out.println("Введите положительное число");
                }

            } catch (NumberFormatException o) {
                System.out.println("Вы не ввели число");

            }
        }

    }

    public static  int sum(int number){
        int sum = 0;
       for (int i = 1; i <= number; i++){
            sum +=i;
       }
        return sum;
    }

    public static int recursionSum(int number){

        return number == 1 ? number : number + recursionSum(number - 1);
    }
}
