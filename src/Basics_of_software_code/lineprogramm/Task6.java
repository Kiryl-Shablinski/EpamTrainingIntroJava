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
        System.out.println(printTrueOrFalse(-3,7));
    }

    public static boolean printTrueOrFalse (int x, int y){
        boolean isXDownFigure, isXUpFigure, isYDownFigure, isYUpFigure, isDownFigure, isUpFigure;
        isXDownFigure = x >= minX1 && x <= maxX1;
        isYDownFigure = y >= minY1 && y <= maxY1;
        isXUpFigure = x >= minX2 && x <= maxX2;
        isYUpFigure = y >= minY2 && y <= maxY2;
        isDownFigure = isXDownFigure == isYDownFigure;
        isUpFigure = isXUpFigure == isYUpFigure;
        return isDownFigure || isUpFigure;
    }
}
