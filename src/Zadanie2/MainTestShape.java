package Zadanie2;

public class MainTestShape {
    public static void main(String[] args) {
        Shape shape = new Shape(12, "shape");
        int count = shape.getSidesCount();
        System.out.println(count);
        shape.setSidesCount(24);
        System.out.println(shape.getSidesCount());
        System.out.println(shape);
    }
}
