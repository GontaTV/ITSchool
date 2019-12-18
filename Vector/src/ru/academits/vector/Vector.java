package ru.academits.vector;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class Vector {
    private double[] elements;

    public Vector(int n) {
        if (n <= 0) {
            throw new IndexOutOfBoundsException("Количество элементов не может равняться или быть меньшим 0");
        }

        this.elements = new double[n];
    }

    public Vector(Vector v) {
        this(v.elements);
    }

    public Vector(double[] vector) {
        if (vector.length <= 0) {
            throw new IndexOutOfBoundsException("Количество элементов не может равняться или быть меньшим 0");
        }

        this.elements = copyOf(vector, vector.length);
    }

    public Vector(int n, double[] vector) {
        if (n <= 0) {
            throw new IndexOutOfBoundsException("Количество элементов не может равняться или быть меньшим 0");
        }

        this.elements = copyOf(vector, n);
    }

    public void setElement(int index, double value) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException("index должен равнятся от 0 до " + (elements.length - 1));
        }

        elements[index] = value;
    }

    public double getElement(int index) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException("index должен равнятся от 0 до " + (elements.length - 1));
        }

        return elements[index];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < elements.length; i++) {
            s.append(getElement(i));

            if (i != elements.length - 1) {
                s.append(", ");
            }
        }

        s.insert(0, "{").append("}");
        return s.toString();
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

    public double getLength() {
        double result = 0;

        for (double element : elements) {
            result += Math.pow(element, 2);
        }

        return Math.sqrt(result);
    }

    public int getSize() {
        return elements.length;
    }

    public void setAddition(Vector vector) {
        if (elements.length < vector.elements.length) {
            elements = copyOf(elements, vector.elements.length);
        }

        for (int i = 0; i < elements.length && i < vector.elements.length; i++) {
            elements[i] += vector.elements[i];
        }
    }

    public void setSubtraction(Vector vector) {
        if (elements.length < vector.elements.length) {
            elements = copyOf(elements, vector.elements.length);
        }

        for (int i = 0; i < elements.length && i < vector.elements.length; ++i) {
            elements[i] -= vector.elements[i];
        }
    }

    public void reverse() {
        setMultiplicationByScalar(-1);
    }

    public void setMultiplicationByScalar(double scalar) {
        for (int i = 0; i < elements.length; i++) {
            elements[i] *= scalar;
        }
    }

    public static Vector getAddition(Vector vector1, Vector vector2) {
        Vector result = new Vector(vector1);
        result.setAddition(vector2);

        return result;
    }

    public static Vector getSubtraction(Vector vector1, Vector vector2) {
        Vector result = new Vector(vector1);
        result.setSubtraction(vector2);

        return result;
    }

    public static double getScalarProduct(Vector vector1, Vector vector2) {
        if (vector1.getSize() < vector2.getSize()) {
            vector1.elements = copyOf(vector1.elements, vector1.getSize());
        }

        double result = 0;

        for (int i = 0; i < vector1.getSize(); i++) {
            result += vector1.getElement(i) * vector2.getElement(i);
        }
        return result;
    }
}
