package Interfaces;

/**
 * Created by Carolina on 27/09/2015.
 */
public class AppInheritance {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(2.5);
        shapes[1] = new Rectangle(3,5);

        for (Shape shape : shapes)
            System.out.println(shape + " with area = " + shape.area());
    }
}
