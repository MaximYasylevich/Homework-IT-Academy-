public class Example5 {

    public static void main(String args[]){

        double width = 7;
        double length = 8;
        double radius = 6;

        System.out.println("Ширина: " + width);
        System.out.println("Длина: " + length);
        System.out.println("Радиус: " + radius);

        if (radius >= Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2)) / 2){

            System.out.println("Картонка с радиусом " + radius
                    + " закрывает полностью отверстие размера "
                    + width + " * " + length);

        }
        else {

            System.out.println("Картонка с радиусом " + radius
                    + " НЕ закрывает полностью отверстие размера "
                    + width + " * " + length);

        }

    }

}
