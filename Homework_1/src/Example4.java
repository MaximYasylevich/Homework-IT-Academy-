import javax.swing.*;

public class Example4 {

    public static void main(String args[]){

        double pointX1 = -5, pointY1 = 3;
        double pointX2 = 1, pointY2 = -7;
        double segmentLength;

        segmentLength = Math.sqrt(Math.pow(pointX1 - pointX2, 2) + Math.pow(pointY1 - pointY2, 2));

        System.out.println("Точка 1: (" + pointX1 + "; " + pointY1 + ")");
        System.out.println("Точка 2: (" + pointX2 + "; " + pointY2 + ")");
        System.out.println("Длина отрезка: " + segmentLength);

    }



}
