package ru.academits;

import ru.academits.inteface.gonta.Shapes;
import ru.academits.shapes.gonta.Circle;
import ru.academits.shapes.gonta.Rectangle;
import ru.academits.shapes.gonta.Square;
import ru.academits.shapes.gonta.Triangle;

import java.util.Arrays;
import java.util.Comparator;

public class ShapesMain {
    static class SortShapesArea {
        static Comparator<Shapes> AreaComparator = new Comparator<Shapes>() {
            @Override
            public int compare(Shapes s1, Shapes s2) {
                return (int) (s2.getArea() - s1.getArea());
            }
        };
    }

    public static void main(String[] args) {
        Shapes square = new Square(1);

        System.out.println("----------КВАДРАТ----------");
        System.out.println("ширина квадрата = " + square.getWidth());
        System.out.println("высота квадрата = " + square.getHeight());
        System.out.println("площадь квадрата = " + square.getArea());
        System.out.println("периметр квадрата = " + square.getPerimeter());

        Shapes circle = new Circle(5);

        System.out.println();
        System.out.println("----------ОКРУЖНОСТЬ----------");
        System.out.println("ширина окружности = " + circle.getWidth());
        System.out.println("высота окружности = " + circle.getHeight());
        System.out.println("площадь окружности = " + circle.getArea());
        System.out.println("длина окружности = " + circle.getPerimeter());

        Shapes triangle = new Triangle(5, 3, 5, 1, 6, 9);
        Shapes triangle1 = new Triangle(3, 3, 1, 8, 2, 9);

        System.out.println();
        System.out.println("----------ТРЕУГОЛЬНИК----------");
        System.out.println("ширина треугольника = " + triangle.getWidth());
        System.out.println("высота треугольника = " + triangle.getHeight());
        System.out.println("площадь треугольника = " + triangle.getArea());
        System.out.println("площадь треугольника = " + triangle1.getArea());
        System.out.println("периметр треугольника = " + triangle.getPerimeter());

        Shapes rectangle = new Rectangle(4, 8);

        System.out.println();
        System.out.println("----------ПРЯМОУГОЛЬНИК----------");
        System.out.println("ширина прямоугольника = " + rectangle.getWidth());
        System.out.println("высота прямоугольника = " + rectangle.getHeight());
        System.out.println("площадь прямоугольника = " + rectangle.getArea());
        System.out.println("периметр прямоугольника = " + rectangle.getPerimeter());

        Shapes[] shapes = {
                new Rectangle(3, 5),
                new Triangle(2, 2, 5, 4, 5, 6),
                new Circle(3),
                new Square(5),
                new Triangle(2, 8, 7, 3, 1, 2),
                new Rectangle(2, 8),
                new Square(7),
                new Circle(5)};

        Arrays.sort(shapes, SortShapesArea.AreaComparator);

        System.out.println();
        System.out.println("----------ПЛОЩАДЬ ФИГУР----------");

        for (Shapes e : shapes) {
            System.out.println(e.getArea());
        }

        System.out.println();
        System.out.println("Фигура с максимальной площадью - " + shapes[0]);
        System.out.println();
        System.out.println("Фигура со второй по величине площадью - " + shapes[1]);

        Shapes rectangle1 = new Rectangle(5, 7);
        Shapes rectangle2 = new Rectangle(5, 7);

        System.out.println(rectangle1.equals(rectangle2));
    }
}