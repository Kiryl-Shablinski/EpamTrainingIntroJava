package Basics_of_software_code.cycles;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Введите натуральные числа");
        while (true) {
          try {
              m = Integer.parseInt(sc.next());
              n = Integer.parseInt(sc.next());
              if (m < n && m > 0) {
                  break;
              }
              System.out.println("Введите натуральные числа");
          } catch (NumberFormatException o) {
              System.out.println("Вы ввели неверные данные. Введите натуральнвые числа");
          }
      }
      devidedNumber(m, n);
    }

    public static void devidedNumber(int begin, int end){
      // флаг вывода числа с делителями
       boolean flag = false;
      // флаг перехода на новую строку
       boolean nextLine = false;
        for (int i = begin; i <= end; i++){
            for (int j = 2; j <= i-1; j++){
             //определяем, является число делителем
               if (i % j == 0){
                   if (!flag) {
                       System.out.print(i + " : ");
                   }
                   flag = true;
                   System.out.print(j + "  ");
                   nextLine = true;
               }
           }
           if (nextLine){
               System.out.println();
           }
            flag = false;
           nextLine = false;
       }
    }
}
