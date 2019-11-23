package ru.academits.gonta.vector;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class Vector {
    private double[] vectorElements;

    public Vector(int n) {
        if (n <= 0) {
            throw new ArrayIndexOutOfBoundsException("Количество элементов массива не может равняться или быть меньшим 0");
        }

        this.vectorElements = new double[n];
    }

    public Vector(Vector v) {
        this(v.vectorElements);
        if (vectorElements.length <= 0) {
            throw new ArrayIndexOutOfBoundsException("Количество элементов массива не может равняться или быть меньшим 0");
        }
    }

    public Vector(double[] vector) {
        int n = vector.length;
        if (n <= 0) {
            throw new ArrayIndexOutOfBoundsException("Количество элементов массива не может равняться или быть меньшим 0");
        }

        this.vectorElements = copyOf(vector, n);
    }

    public Vector(int n, double[] vector) {
        if (n <= 0) {
            throw new ArrayIndexOutOfBoundsException("Количество элементов массива не может равняться или быть меньшим 0");
        }

        this.vectorElements = copyOf(vector, n);
    }

    public void setElement(int index, double value) {
        if (index < 0 || index >= vectorElements.length) {
            throw new ArrayIndexOutOfBoundsException("Введите число (index) от 0 до " + (vectorElements.length - 1));
        }

        this.vectorElements[index] = value;
    }

    public double getElement(int index) {
        if (index < 0 || index > +vectorElements.length) {
            throw new ArrayIndexOutOfBoundsException("Введите число (index) от 0 до " + (vectorElements.length - 1));
        }

        return vectorElements[index];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(String.valueOf(getElement(0)));

        for (int i = 1; i < vectorElements.length; i++) {
            s.append(", ").append(getElement(i));
        }
        return "{" + s + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vector vector1 = (Vector) o;
        return Arrays.equals(vectorElements, vector1.vectorElements);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(vectorElements);
    }

    public int getSize() {
        return vectorElements.length;
    }

    public void getAddition(Vector vector) {
        for (int i = 0; i < vectorElements.length; i++) {
            if (vector.vectorElements.length == i) {
                break;
            }
            vectorElements[i] += vector.vectorElements[i];
        }
    }

    public void getSubtraction(Vector vector) {
        for (int i = 0; i < vectorElements.length; i++) {
            if (vector.vectorElements.length == i) {
                break;
            }
            vectorElements[i] -= vector.vectorElements[i];
        }
    }

    public void getRevers() {
        getMultiplicationByScalar(-1);
    }

    public void getMultiplicationByScalar(double scalar) {
        for (int i = 0; i < vectorElements.length; i++) {
            vectorElements[i] *= scalar;
        }
    }

    public static Vector getAddition(double[] vector1, double[] vector2) {
        Vector vector_1 = new Vector(vector1);
        Vector vector_2 = new Vector(vector2);
        vector_1.getAddition(vector_2);
        return vector_1;
    }

    public static Vector getSubtraction(double[] vector1, double[] vector2) {
        Vector vector_1 = new Vector(vector1);
        Vector vector_2 = new Vector(vector2);
        vector_1.getAddition(vector_2);
        return vector_1;
    }

    public static void getScalarProduct(double[] vector, double[] vector1) {
        for (int i = 0; i < vector.length; i++) {
            if (vector1.length == i) {
                break;
            }
            vector[i] *= vector1[i];
        }
    }
}
