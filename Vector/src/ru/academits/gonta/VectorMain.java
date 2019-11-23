package ru.academits.gonta;

import ru.academits.gonta.vector.Vector;

public class VectorMain {
    public static void main(String[] args) {
        Vector vector = new Vector(new double[]{2, 4, 6, 3});
        Vector vector1 = new Vector(5);
        Vector vector2 = new Vector(10, new double[]{3, 4, 2});
        Vector vector3 = new Vector(vector2);
        Vector vector4 = new Vector(2, new double[]{3, 4, 2, 7});
        double[] vector6 = new double[]{8, 2, 5};

        System.out.println("Элементы вектора " + vector4);
        vector4.getAddition(vector);
        System.out.println(vector4);
        vector3.getAddition(vector2);
        System.out.println("Результат сложения векторов = " + vector3);
        vector.getSubtraction(vector1);
        System.out.println("Результат вычитания векторов = " + vector);
        vector.getRevers();
        System.out.println("Разворот вектора = " + vector1);
        vector.getMultiplicationByScalar(5);
        System.out.println("Умножение вектора на скаляр = " + vector);
        System.out.println("Получение элемента по индексу = " + vector.getElement(1));
        vector.setElement(0, 15);
        System.out.println("Элементы вектора " + vector);
        System.out.println("Размерность вектора " + vector.getSize());

        System.out.println("Сложение векторов (static) = " + Vector.getAddition(new double[]{3, 4}, new double[]{2, 4, 6, 3}));
        System.out.println("Вычитание векторов (static) = " + Vector.getSubtraction(new double[]{3, 5, 8, 7, 4}, new double[]{7, 1, 7, 4}));
        Vector.getScalarProduct(new double[]{6, 2}, vector6);
        System.out.println("Скалярное произведение векторов (static) = " + vector);
    }
}

