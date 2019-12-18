package ru.academits;

import ru.academits.vector.Vector;

public class VectorMain {
    public static void main(String[] args) {
        Vector vector = new Vector(new double[]{2, 4});
        Vector vector1 = new Vector(new double[]{2, 4, 6});
        Vector vector2 = new Vector(new double[]{2, 4});
        Vector vector3 = new Vector(new double[]{2, 4, 6});


        System.out.println("получение элемента по индексу" + vector.getElement(1));
        System.out.println("Вектор: " + vector1);
        vector.setAddition(vector1);
        System.out.println("Результат сложения векторов = " + vector);
        vector.setSubtraction(vector1);
        System.out.println("Результат вычитания векторов = " + vector);
        vector.reverse();
        System.out.println("Разворот вектора = " + vector);
        vector.setMultiplicationByScalar(5);
        System.out.println("Умножение вектора на скаляр = " + vector);
        vector.setElement(0, 15);
        System.out.println("Элементы вектора " + vector);
        System.out.println("Размерность вектора " + vector.getSize());
        System.out.println("Длина вектора " + vector.getLength());

        System.out.println("Сложение векторов (static) = " + Vector.getSubtraction(vector2, vector3));
        System.out.println("Вычитание векторов (static) = " + Vector.getSubtraction(vector2, vector3));
        System.out.println("Скалярное произведение векторов (static) = " + Vector.getScalarProduct(vector, vector1));
    }
}

