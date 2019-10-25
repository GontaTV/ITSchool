package ru.academits.shapes.gonta;

import ru.academits.inteface.gonta.Shape;

import java.util.Objects;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void width(double width) {
        this.width = width;
    }

    public void height(double height) {
        this.height = height;
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
        return rectangle.width == width && rectangle.height == height;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(width);
        hash = prime * hash + Double.hashCode(height);
        return hash;
    }

    @Override
    public String toString() {
        return "Прямоугольник:" + System.lineSeparator() +
                "длина (" + width + "); " + "высота (" + height + ")" + System.lineSeparator() +
                "высота = " + getHeight() + System.lineSeparator() +
                "ширина = " + getWidth() + System.lineSeparator() +
                "площадь = " + getArea() + System.lineSeparator() +
                "периметр = " + getPerimeter();
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width * 2) + (height * 2);
    }
}
