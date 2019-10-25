package ru.academits.sort_shapes.gonta;

import ru.academits.inteface.gonta.Shape;

import java.util.Comparator;

public class SortShapesPerimeter {
    public static Comparator<Shape> PerimeterComparator = new Comparator<Shape>() {
        @Override
        public int compare(Shape s1, Shape s2) {
            return Double.compare(s2.getArea(), s1.getArea());
        }
    };
}
