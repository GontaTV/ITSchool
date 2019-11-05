package ru.academits;

import ru.academits.vector.gonta.Vector;
import ru.academits.vector.gonta.VectorStatic;

public class VectorMain {
    public static void main(String[] args) {
        Vector vector = new Vector(new double[]{2, 4, 6, 3});
        Vector vector1 = new Vector(5);
        Vector vector2 = new Vector(10, new double[]{3, 4, 2});
        Vector vector3 = new Vector(vector2);
        Vector vector4 = new Vector(2, new double[]{3, 4, 2, 7});
        double[] vector5 = new double[]{3, 4, 2, 7};
        double[] vector6 = new double[]{8, 2, 5};
        double[] vector7 = vector6;

        System.out.println("Элементы вектора " + vector4);
        System.out.println("Результат сложения векторов = " + vector1.getAddition(vector2));
        System.out.println("Результат сложения векторов = " + vector3.getAddition(vector2));
        System.out.println("Результат вычитания векторов = " + vector.getSubtraction(vector1));
        System.out.println("Разворот вектора = " + vector.getRevolt());
        System.out.println("Размерность вектора = " + vector1.getSize());
        System.out.println("Умножение вектора на скаляр = " + vector1.getScalar(5));
        System.out.println("Получение элемента по индексу = " + vector.getElement(1));
        vector.setElement(0, 15);
        System.out.print("Элементы вектора " + vector);

        System.out.println("Сложение векторов (static) = " + VectorStatic.getAddition(vector5, new double[]{7, 4}));
        System.out.println("Вычитание векторов (static) = " + VectorStatic.getSubtraction(vector6, vector7));
        System.out.println("Скалярное произведение векторов (static) = " + VectorStatic.getScalarProduct(new double[]{6, 2}, vector6));
    }
}
