package ru.academits;

import ru.academits.inteface.gonta.Shape;
import ru.academits.shapes.gonta.Circle;
import ru.academits.shapes.gonta.Rectangle;
import ru.academits.shapes.gonta.Square;
import ru.academits.shapes.gonta.Triangle;
import ru.academits.sort_shapes.gonta.SortShapesByAreaComparator;
import ru.academits.sort_shapes.gonta.SortShapesByPerimeterComparator;

import java.util.Arrays;

public class ShapesMain {
    public static void main(String[] args) {
        Shape square = new Square(1);

        System.out.println("----------КВАДРАТ----------");
        System.out.println("ширина квадрата = " + square.getWidth());
        System.out.println("высота квадрата = " + square.getHeight());
        System.out.println("площадь квадрата = " + square.getArea());
        System.out.println("периметр квадрата = " + square.getPerimeter());

        Shape circle = new Circle(5);

        System.out.println();
        System.out.println("----------ОКРУЖНОСТЬ----------");
        System.out.println("ширина окружности = " + circle.getWidth());
        System.out.println("высота окружности = " + circle.getHeight());
        System.out.println("площадь окружности = " + circle.getArea());
        System.out.println("длина окружности = " + circle.getPerimeter());

        Shape triangle = new Triangle(5, 3, 5, 1, 6, 9);

        System.out.println();
        System.out.println("----------ТРЕУГОЛЬНИК----------");
        System.out.println("ширина треугольника = " + triangle.getWidth());
        System.out.println("высота треугольника = " + triangle.getHeight());
        System.out.println("площадь треугольника = " + triangle.getArea());
        System.out.println("периметр треугольника = " + triangle.getPerimeter());

        Shape rectangle = new Rectangle(4, 8);

        System.out.println();
        System.out.println("----------ПРЯМОУГОЛЬНИК----------");
        System.out.println("ширина прямоугольника = " + rectangle.getWidth());
        System.out.println("высота прямоугольника = " + rectangle.getHeight());
        System.out.println("площадь прямоугольника = " + rectangle.getArea());
        System.out.println("периметр прямоугольника = " + rectangle.getPerimeter());

        Shape[] shapes = {
                new Rectangle(3, 5),
                new Triangle(2, 2, 5, 4, 5, 6),
                new Circle(3),
                new Square(5),
                new Triangle(2, 8, 7, 3, 1, 2),
                new Rectangle(2, 8),
                new Square(7),
                new Circle(5)};

        Arrays.sort(shapes, new SortShapesByAreaComparator());

        System.out.println();
        System.out.println("----------ПЛОЩАДЬ ФИГУР----------");

        for (Shape e : shapes) {
            System.out.println(e.getArea());
        }

        System.out.println();
        System.out.println("Фигура с максимальной площадью - " + shapes[0]);
        System.out.println();
        Arrays.sort(shapes, new SortShapesByPerimeterComparator());
        System.out.println("Фигура со вторым по величине периметром - " + shapes[1]);

        Shape rectangle1 = new Rectangle(5, 7);
        Shape rectangle2 = new Rectangle(5, 7);

        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(square);
    }
}