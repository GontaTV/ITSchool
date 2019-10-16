package ru.academits.shapes.gonta;

import ru.academits.inteface.gonta.Shapes;

import java.util.Objects;

public class Rectangle implements Shapes {
    private double rectangleWidth;
    private double rectangleHeight;

    public Rectangle(double rectangleWidth, double rectangleHeight) {
        this.rectangleWidth = rectangleWidth;
        this.rectangleHeight = rectangleHeight;
    }

    public double getRectangleWidth() {
        return rectangleWidth;
    }

    public double getRectangleHeight() {
        return rectangleHeight;
    }

    public void setRectangleWidth(double rectangleWidth) {
        this.rectangleWidth = rectangleWidth;
    }

    public void setRectangleHeight(double rectangleHeight) {
        this.rectangleHeight = rectangleHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.rectangleWidth, rectangleWidth) == 0 && Double.compare(rectangle.rectangleHeight, rectangleHeight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rectangleWidth, rectangleHeight);
    }

    @Override
    public String toString() {
        return "Прямоугольник: \nвысота = " + getHeight() + "\nширина = " + getWidth() + "\nплощадь = " + getArea() + "\nпериметр = " + getPerimeter();
    }

    @Override
    public double getWidth() {
        return rectangleWidth;
    }

    @Override
    public double getHeight() {
        return rectangleHeight;
    }

    @Override
    public double getArea() {
        return rectangleWidth * rectangleHeight;
    }

    @Override
    public double getPerimeter() {
        return (rectangleWidth * 2) + (rectangleHeight * 2);
    }
}
