package Basics_of_software_code.cycles;



public class Task8 {
    public static void main(String[] args) {
        sameNumbers(42889, 248809);
    }

    public static void sameNumbers(double x, double y){
        String number1 = String.valueOf(x).replace(".","");
        String number2 = String.valueOf(y).replace(".", "");

        char[] numbers1 = new char[number1.length()];
        char[] numbers2 = new char[number2.length()];

        int[] arr = new int[10];

        for (int i = 0; i < numbers1.length; i++){
            for (int j = 0; j < numbers2.length; j++){
                
            }
        }



      /*  int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);

        int[] arr = new int[10];
        System.out.print("Совподающие числа: ");

        while (a != 0 ) {
            arr[a % 10]++;

            a /= 10;
        }

        while (b != 0){
            if (arr[b % 10] != 0){
                System.out.print(b % 10);
            }
            b /= 10;
        }

       */
    }
}
