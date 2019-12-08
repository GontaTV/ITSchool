package ru.academits.vector;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class Vector {
    private double[] elements;

    public Vector(int n) {
        if (n <= 0) {
            throw new IndexOutOfBoundsException("Количество элементов массива не может равняться или быть меньшим 0");
        }

        this.elements = new double[n];
    }

    public Vector(Vector v) {
        this(v.elements);
    }

    public Vector(double[] vector) {
        if (vector.length <= 0) {
            throw new IndexOutOfBoundsException("Количество элементов массива не может равняться или быть меньшим 0");
        }

        this.elements = copyOf(vector, vector.length);
    }

    public Vector(int n, double[] vector) {
        if (n <= 0) {
            throw new IndexOutOfBoundsException("Количество элементов массива не может равняться или быть меньшим 0");
        }

        this.elements = copyOf(vector, n);
    }

    public void setElement(int index, double value) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException("Введите число (index) от 0 до " + (elements.length - 1));
        }

        this.elements[index] = value;
    }

    public double getElement(int index) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Введите число (index) от 0 до " + (elements.length - 1));
        }

        return elements[index];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(String.valueOf(getElement(0)));

        for (int i = 1; i < elements.length; i++) {
            s.append(", ").append(getElement(i));
        }
        s.insert(0, "{").append("}");
        return String.valueOf(s);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Vector vector = (Vector) o;
        return Arrays.equals(elements, vector.elements);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(elements);
    }

    public double getVectorLength() {
        double result = 0;

        for (int i = 0; i < elements.length; i++) {
            result += Math.pow(elements[i], 2);
        }

        return Math.sqrt(result);
    }

    public int getSize() {
        return elements.length;
    }

    public void addition(Vector vector) {
        if (elements.length < vector.elements.length) {
            elements = copyOf(elements, vector.elements.length);
        }

        for (int i = 0; i < elements.length; i++) {
            if (vector.elements.length == i) {
                break;
            }
            elements[i] += vector.elements[i];
        }
    }

    public void subtraction(Vector vector) {
        if (elements.length < vector.elements.length) {
            elements = copyOf(elements, vector.elements.length);
        }

        for (int i = 0; i < elements.length; i++) {
            if (vector.elements.length == i) {
                break;
            }
            elements[i] -= vector.elements[i];
        }
    }

    public void reverse() {
        multiplicationByScalar(-1);
    }

    public void multiplicationByScalar(double scalar) {
        for (int i = 0; i < elements.length; i++) {
            elements[i] *= scalar;
        }
    }

    public static Vector getAddition(Vector vector, Vector vector1) {
        vector.addition(vector1);
        return vector;
    }

    public static Vector getSubtraction(Vector vector, Vector vector1) {
        vector.addition(vector1);
        return vector;
    }

    public static void getScalarProduct(Vector vector, Vector vector1) {
        if (vector.getSize() < vector1.getSize()) {
            vector.elements = copyOf(vector.elements, vector1.getSize());
        }

        for (int i = 0; i < vector.getSize(); i++) {
            if (vector1.getSize() == i) {
                break;
            }
            vector.setElement(i, vector.getElement(i) * vector1.getElement(i));
        }
    }
}
