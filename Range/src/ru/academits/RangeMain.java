package ru.academits;

import ru.academits.range.gonta.Range;

public class RangeMain {
    public static void main(String[] args) {
        Range range = new Range(3, 15);

        System.out.println("Длина интервала - " + range.getLength());
        System.out.println("Принадлежность числа (10) диапазону -  " + range.isInside(10));
        System.out.println("Принадлежность числа (19) диапазону -  " + range.isInside(19));
    }
}
