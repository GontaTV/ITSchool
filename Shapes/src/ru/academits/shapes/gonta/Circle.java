package ru.academits.shapes.gonta;

import ru.academits.inteface.gonta.Shape;

import java.util.Objects;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Circle circle = (Circle) o;
        return circle.radius == radius;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(radius);
        return hash;
    }

    @Override
    public String toString() {
        return "Окружность:" + System.lineSeparator() +
                "радиус (" + radius + ")" + System.lineSeparator() +
                "высота = " + getHeight() + System.lineSeparator() +
                "ширина = " + getWidth() + System.lineSeparator() +
                "площадь = " + getArea() + System.lineSeparator() +
                "длина окружности = " + getPerimeter();
    }

    @Override
    public double getWidth() {
        return radius * 2;
    }

    @Override
    public double getHeight() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
