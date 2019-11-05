import java.util.Arrays;

public class RangeMain {
    public static void main(String[] args) {
        Range range = new Range(6, 10);
        Range range1 = new Range(9, 15);

        System.out.println("Длина первого интервала - " + range.getLength() + " ед.");
        System.out.println("Длина первого интервала - " + range1.getLength() + " ед.");

        range.getIntersection(range1);
        Range intersection = range.getIntersection(range1);
        System.out.println("Длина пересечения интелвалов - " + range.getIntersectionLength(intersection) + " ед.");

        range.getUnion(range1);
        System.out.println("Объедененный интервал - " + Arrays.deepToString(range.getUnion(range1)));

//        range.getDifference(range1);
//        System.out.println("Разность интервалов - " + Arrays.deepToString(range.getDifference(range1)));
    }
}
