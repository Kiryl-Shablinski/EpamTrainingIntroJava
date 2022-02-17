package Basics_of_software_code.branching;

public class Task3 {
    public static void main(String[] args) {
        Task3 solution = new Task3();
        Point pointA = solution.new Point(4,6);
        Point pointB = solution.new Point(6,9);
        Point pointC = solution. new Point(3,10);

        if (pointToLine(pointA.x, pointA.y, pointB.x, pointB.y, pointC.x, pointC.y)) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки не лежат на одной прямой");
        }

    }

    public static boolean pointToLine(int xA, int yA, int xB, int yB, int xC, int yC) {
        return (xC - xA) / (xB - xA) == (yC - yA) / (yB - yA);
    }


    class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}


