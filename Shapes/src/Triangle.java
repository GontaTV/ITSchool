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

    public double lineABLength() {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    public double lineBCLength() {
        return Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
    }

    public double lineACLength() {
        return Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
    }

    public double getWidth() {
        return ((x1 > x2) ? ((x1 > x3) ? x1 : x3) : ((x2 > x3) ? x2 : x3)) - ((x1 < x2) ? ((x1 < x3) ? x1 : x3) : ((x2 < x3) ? x2 : x3));
    }

    public double getHeight() {
        return ((x1 > x2) ? ((y1 > y3) ? y1 : y3) : ((y2 > y3) ? y2 : y3)) - ((y1 < y2) ? ((y1 < y3) ? y1 : y3) : ((y2 < y3) ? y2 : y3));
    }

    public double getPerimeter() {
        return lineABLength() + lineBCLength() + lineACLength();
    }

    public double getArea() {
        return Math.sqrt((getPerimeter() / 2) * ((getPerimeter() / 2) - lineABLength()) * ((getPerimeter() / 2) - lineBCLength()) * ((getPerimeter() / 2) - lineACLength()));
    }
}
