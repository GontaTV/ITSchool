package ru.academits.shapes.gonta;

import ru.academits.inteface.gonta.Shapes;

import java.util.Objects;

public class Triangle implements Shapes {
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX3() {
        return x3;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public double getY3() {
        return y3;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.x1, x1) == 0 &&
                Double.compare(triangle.x2, x2) == 0 &&
                Double.compare(triangle.x3, x3) == 0 &&
                Double.compare(triangle.y1, y1) == 0 &&
                Double.compare(triangle.y2, y2) == 0 &&
                Double.compare(triangle.y3, y3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, x2, x3, y1, y2, y3);
    }

    @Override
    public String toString() {
        return "Треугольник: \nвысота = " + getHeight() + "\nширина = " + getWidth() + "\nплощадь = " + getArea() + "\nпериметр = " + getPerimeter();
    }

    private static double lineABLength(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    @Override
    public double getWidth() {
        return ((x1 > x2) ? (Math.max(x1, x3)) : (Math.max(x2, x3))) - ((x1 < x2) ? (Math.min(x1, x3)) : (Math.min(x2, x3)));
    }

    @Override
    public double getHeight() {
        return ((x1 > x2) ? (Math.max(y1, y3)) : (Math.max(y2, y3))) - ((y1 < y2) ? (Math.min(y1, y3)) : (Math.min(y2, y3)));
    }

    @Override
    public double getPerimeter() {
        return lineABLength(x1, x2, y1, y2) + lineABLength(x2, x3, y2, y3) + lineABLength(x1, x3, y1, y3);
    }

    @Override
    public double getArea() {

        return Math.sqrt((getPerimeter() / 2) * ((getPerimeter() / 2) - lineABLength(x1, x2, y1, y2)) * ((getPerimeter() / 2) - lineABLength(x2, x3, y2, y3)) * ((getPerimeter() / 2) - lineABLength(x1, x3, y1, y3)));
    }
}
