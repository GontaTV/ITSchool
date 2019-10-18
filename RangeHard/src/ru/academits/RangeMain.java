package ru.academits;

import ru.academits.rangehard.gonta.Range;

import java.util.Arrays;

public class RangeMain {
    public static void main(String[] args) {
        Range range0 = new Range(6, 7);
        Range range = new Range(8, 15);

        System.out.println("Длина первого интервала - " + range0.getLength() + " ед.");
        System.out.println("Длина второго интервала - " + range.getLength() + " ед.");

        range0.getIntersection(range);
        Range intersection = range0.getIntersection(range);
        System.out.println("Длина пересечения интелвалов - " + intersection.getLength() + " ед.");

        range0.getUnion(range);
        System.out.println("Объедененный интервал - " + Arrays.toString(range0.getUnion(range)));

        range0.getDifference(range);
        System.out.println("Разность интервалов - " + Arrays.toString(range0.getDifference(range)));
    }
}
