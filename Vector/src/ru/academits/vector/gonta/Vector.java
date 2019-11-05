package ru.academits.vector.gonta;

import java.util.Arrays;

public class Vector {
    private double[] vector;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Количество элементов массива не может равняться или быть меньшим 0");
        }
        this.vector = new double[n];
    }

    public Vector(Vector v) {
        this.vector = v.vector;
    }

    public Vector(double[] vector) {
        this.vector = vector;
    }

    public Vector(int n, double[] vector) {
        if (n <= 0) {
            throw new IllegalArgumentException("Количество элементов массива не может равняться или быть меньшим 0");
        }
        double[] array = new double[n];
        int index = n;

        if (n > vector.length) {
            index = vector.length;
        }
        System.arraycopy(vector, 0, array, 0, index);
        this.vector = array;
    }

    public void setElement(int index, double value) {
        if (index < 0 || index > vector.length - 1) {
            throw new IllegalArgumentException("Введите число (index) от 0 до " + (vector.length - 1));
        }
        this.vector[index] = value;
    }

    public double[] getVector() {
        return vector;
    }

    public double getElement(int index) {
        if (index < 0 || index > vector.length - 1) {
            throw new IllegalArgumentException("Введите число (index) от 0 до " + (vector.length - 1));
        }
        return vector[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(vector);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector1 = (Vector) o;
        return Arrays.equals(vector, vector1.vector);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(vector);
    }

    public int getSize() {
        return vector.length;
    }

    public Vector getAddition(Vector vector1) {
        double[] result = new double[Math.max(vector.length, vector1.vector.length)];

        for (int i = 0; i < Math.max(vector.length, vector1.vector.length); i++) {
            if (vector1.vector.length <= i) {
                result[i] = vector[i];
            } else if (vector.length <= i) {
                result[i] = vector1.vector[i];
            } else {
                result[i] = vector[i] + vector1.vector[i];
            }
        }
        return new Vector(result);
    }

    public Vector getSubtraction(Vector vector1) {
        double[] result = new double[Math.max(vector.length, vector1.vector.length)];

        for (int i = 0; i < Math.max(vector.length, vector1.vector.length); i++) {
            if (vector1.vector.length <= i) {
                result[i] = vector[i];
            } else if (vector.length <= i) {
                result[i] = 0 - vector1.vector[i];
            } else {
                result[i] = vector[i] - vector1.vector[i];
            }
        }
        return new Vector(result);
    }

    public Vector getRevolt() {
        double[] result = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            result[i] = vector[i] * (-1);
        }
        return new Vector(result);
    }

    public Vector getScalar(double scalar) {
        double[] result = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            result[i] = vector[i] * scalar;
        }
        return new Vector(result);
    }

//    public static Vector getAdditionStatic(double[] vector, double[] vector1) {
//        double[] result = new double[Math.max(vector.length, vector1.length)];
//
//        for (int i = 0; i < Math.max(vector.length, vector1.length); i++) {
//            if (vector1.length <= i) {
//                result[i] = vector[i];
//            } else if (vector.length <= i) {
//                result[i] = vector1[i];
//            } else {
//                result[i] = vector[i] + vector1[i];
//            }
//        }
//        return new Vector(result);
//    }
//
//    public static Vector getSubtraction(double[] vector, double[] vector1) {
//        double[] result = new double[Math.max(vector.length, vector1.length)];
//
//        for (int i = 0; i < Math.max(vector.length, vector1.length); i++) {
//            if (vector1.length <= i) {
//                result[i] = vector[i];
//            } else if (vector.length <= i) {
//                result[i] = 0 - vector1[i];
//            } else {
//                result[i] = vector[i] - vector1[i];
//            }
//        }
//        return new Vector(result);
//    }
//
//    public static double getScalarProduct(double[] vector, double[] vector1) {
//        double result = 0;
//        for (int i = 0; i < Math.min(vector.length, vector1.length); i++) {
//            result += vector[i] * vector1[i];
//        }
//        return result;
//    }
}
