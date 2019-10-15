package Mai;

import Range.Range;

public class RangeMain {
    public static void main(String[] args) {
        Range range1 = new Range(2, 8);

        System.out.println(range1.isInside(5));

        Range range2 = new Range(3, 15);

        range1.setTo(10);
        System.out.println(range2.isInside(12));
        System.out.println(range2.getLength());
    }
}
