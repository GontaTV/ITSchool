public class Rectangle implements Shapes {
    private double sideLength1;
    private double sideLength2;

    public Rectangle(double sideLength1, double sideLength2) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
    }

    public double getWidth() {
        return sideLength1;
    }

    public double getHeight(){
        return sideLength2;
    }

    public double getArea(){
        return sideLength1 * sideLength2;
    }

    public double getPerimeter(){
        return (sideLength1 * 2) + (sideLength2 * 2);
    }
}
