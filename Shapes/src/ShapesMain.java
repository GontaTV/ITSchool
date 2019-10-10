public class ShapesMain {
    public static void main(String[] args) {
        Shapes square = new Square(1);

        System.out.println("----------КВАДРАТ----------");
        System.out.println("ширина квадрата = " + square.getWidth());
        System.out.println("высота квадрата = " + square.getHeight());
        System.out.println("площадь квадрата = " + square.getArea());
        System.out.println("периметр квадрата = " + square.getPerimeter());

        Shapes circle = new Circle(5);

        System.out.println();
        System.out.println("----------ОКРУЖНОСТЬ----------");
        System.out.println("ширина окружности = " + circle.getWidth());
        System.out.println("высота окружности = " + circle.getHeight());
        System.out.println("площадь окружности = " + circle.getArea());
        System.out.println("периметр окружности = " + circle.getPerimeter());

        Shapes triangle = new Triangle(5,3,5,1,6,9);

        System.out.println();
        System.out.println("----------ТРЕУГОЛЬНИК----------");
        System.out.println("ширина треугольника = " + triangle.getWidth());
        System.out.println("высота треугольника = " + triangle.getHeight());
        System.out.println("площадь треугольника = " + triangle.getArea());
        System.out.println("периметр треугольника = " + triangle.getPerimeter());
    }
}
