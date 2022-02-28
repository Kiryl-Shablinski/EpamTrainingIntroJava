package Basics_of_software_code.cycles;

public class Task6 {
    public static void main(String[] args) {
        printSymbol();
    }

    public static void printSymbol(){
        //существует тип  char, который служит для хранения символов
        for (int i = Character.MIN_VALUE; i < Character.MAX_VALUE; i++){

            System.out.printf("%s %d \n",  (char) i, i);
        }
    }
}
