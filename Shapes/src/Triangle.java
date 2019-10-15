public class Triangle implements Shapes {
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    @Override
    public String toString() {
        return "Треугольник: \nвысота = " + getHeight() + "\nширина = " + getWidth() + "\nплощадь = " + getArea() + "\nпериметр = " + getPerimeter();
    }

    private double lineABLength() {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    private double lineBCLength() {
        return Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
    }

    private double lineACLength() {
        return Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
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
        return lineABLength() + lineBCLength() + lineACLength();
    }

    @Override
    public double getArea() {
        return Math.sqrt((getPerimeter() / 2) * ((getPerimeter() / 2) - lineABLength()) * ((getPerimeter() / 2) - lineBCLength()) * ((getPerimeter() / 2) - lineACLength()));
    }
}
