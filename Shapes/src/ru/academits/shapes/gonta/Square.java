package ru.academits.shapes.gonta;

import ru.academits.inteface.gonta.Shape;

public class Square implements Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Квадрат:" + System.lineSeparator() +
                "длина стороны (" + sideLength + ")" + System.lineSeparator() +
                "высота = " + getHeight() + System.lineSeparator() +
                "ширина = " + getWidth() + getHeight() + System.lineSeparator() +
                "площадь = " + getArea() + System.lineSeparator() +
                "периметр = " + getPerimeter();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Square square = (Square) o;
        return square.sideLength == sideLength;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(sideLength);
        return hash;
    }

    @Override
    public double getWidth() {
        return sideLength;
    }

    @Override
    public double getHeight() {
        return sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public double getPerimeter() {
        return sideLength * 4;
    }
}
