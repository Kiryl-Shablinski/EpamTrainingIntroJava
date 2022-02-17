package Basics_of_software_code.lineprogramm;

public class Task6 {
  static  int  minX1 = -4;
  static int maxX1 = 4;
  static int minX2 = -2;
  static int maxX2 = 2;
    static  int  minY1 = -3;
    static int maxY1 = 0;
    static int minY2 = 0;
    static int maxY2 = 4;

    public static void main(String[] args) {
        System.out.println(printTrueOrFalse(-2, 2));
    }

    public static boolean printTrueOrFalse (int x, int y){
        boolean  isDownFigure, isUpFigure;
       // принадлежность точки нижней фигуре
        isDownFigure = x >= minX1 && x <= maxX1 && y >= minY1 && y <= maxY1;
        // принадлежность точки верхней фигуре
        isUpFigure = x >= minX2 && x <= maxX2 && y >= minY2 && y <= maxY2;

        return isDownFigure || isUpFigure;
    }
}
