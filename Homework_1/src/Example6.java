public class Example6 {

    public static void main(String args[]){

        double pointX1 = -45, pointY1 = 48;
        double pointX2 = 98, pointY2 = -32;
        double aX, aY;

        aX = pointX2 - pointX1;
        aY = pointY2 - pointY1;

        System.out.println("Уравнение прямой, проходящей через точки M1("
            + pointX1 + "; " + pointY1 + ") и " + "M2(" + pointX2 + "; " + pointY2 + "): ");

        System.out.println(aY + "(x "
                + (pointX1 < 0 ? "+ " : "- ") + Math.abs(pointX1)
                + ") = " + aX + "(y "
                + (pointY1 < 0 ? "+ " : "- ") + Math.abs(pointY1) + ")");

    }

}
