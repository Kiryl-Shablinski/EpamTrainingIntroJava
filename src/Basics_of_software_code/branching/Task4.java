package Basics_of_software_code.branching;

public class Task4 {
    static int hight = 9;
    static int width = 7;
    private  static final int SQUARE = hight * width;

    public static void main(String[] args) {
       if (passes(4, 6, 78)){
           System.out.println("Кирпич проходит в отверстие");
       }
        else{
            System.out.println("Кирпич не проходит в отверстие");
       }
    }

    public static boolean passes(int x, int y, int z){
        //найдем площади граней кирпича
        int squareA = x * y;
        int squareB = x * z;
        int squareC = y * z;

        return squareA <= SQUARE || squareB <= SQUARE || squareC <=SQUARE;
    }
}
