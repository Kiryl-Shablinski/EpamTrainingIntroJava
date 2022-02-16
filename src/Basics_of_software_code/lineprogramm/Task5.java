package Basics_of_software_code.lineprogramm;


public class Task5 {
    public static void main(String[] args) {
        int time = 3987;

        System.out.println(getTime(time));
    }
    public static String getTime(int time){
        int seconds = time % 60;
        int  mints = (time / 60) % 60;
        int hours = (time / 3600);

        return String.format("%dч %dмин %dс.",hours, mints, seconds );
    }
}
