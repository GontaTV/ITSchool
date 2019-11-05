package ru.academits.vector.gonta;
 
public class VectorStatic{
    public static Vector getAddition(double[] vector, double[] vector1) {
        double[] result = new double[Math.max(vector.length, vector1.length)];

        for (int i = 0; i < Math.max(vector.length, vector1.length); i++) {
            if (vector1.length <= i) {
                result[i] = vector[i];
            } else if (vector.length <= i) {
                result[i] = vector1[i];
            } else {
                result[i] = vector[i] + vector1[i];
            }
        }
        return new Vector(result);
    }

    public static Vector getSubtraction(double[] vector, double[] vector1) {
        double[] result = new double[Math.max(vector.length, vector1.length)];

        for (int i = 0; i < Math.max(vector.length, vector1.length); i++) {
            if (vector1.length <= i) {
                result[i] = vector[i];
            } else if (vector.length <= i) {
                result[i] = 0 - vector1[i];
            } else {
                result[i] = vector[i] - vector1[i];
            }
        }
        return new Vector(result);
    }

    public static double getScalarProduct(double[] vector, double[] vector1) {
        double result = 0;
        for (int i = 0; i < Math.min(vector.length, vector1.length); i++) {
            result += vector[i] * vector1[i];
        }
        return result;
    }

}
