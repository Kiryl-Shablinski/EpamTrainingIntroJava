package Basics_of_software_code.cycles;

public class Task2 {
    double y;
    double  x = 46;
    public static void main(String[] args) {
        Task2 solution = new Task2();
      solution.fun(-3,5, 2);



    }

    public void fun( int a, int b, int h){

        for (int i = a; i <= b; i = i + h){
            if (i <= 2){
               y = -x;
                System.out.println(y);
            }else{
                y = x;
                System.out.println(y);
            }

        }


    }
}
