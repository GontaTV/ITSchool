public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public Range getIntersection(Range range1) {
        if (to <= range1.from || from >= range1.to) {
            return null;
        }

        if (from >= range1.from && to <= range1.to) {
            return new Range(from, to);
        }

        if (from < range1.from && to > range1.to) {
            return new Range(range1.from, range1.to);
        }

        if (from < range1.from && to < range1.to) {
            return new Range(range1.from, to);
        }

        return new Range(from, range1.to);
    }

    public double getLength() {
        return to - from;
    }

    public double getIntersectionLength(Range getIntersection) {
        if (getIntersection == null) {
            return 0;
        }
        return getIntersection.to - getIntersection.from;
    }

    public Range[] getUnion(Range range1) {
        if (to < range1.from || from > range1.to) {
            return new Range[]{new Range(from, to), new Range(range1.from, range1.to)};
        }

        if (from >= range1.from && to <= range1.to) {
            return new Range[]{new Range(range1.from, range1.to)};
        }

        if (from < range1.from && to > range1.to) {
            return new Range[]{new Range(from, to)};
        }

        if (from < range1.from && to < range1.to) {
            return new Range[]{new Range(from, range1.to)};
        }

        return new Range[]{new Range(range1.from, to)};
    }

    @Override
    public String toString() {
        return from + ", " + to;
    }

    public Range[] getDifference(Range range1) {
        if (to < range1.from) {
            return new Range[]{new Range(from, to)};
        }

        if (from > range1.to) {
            return new Range[]{new Range(range1.from, range1.to)};
        }

        if (from < range1.from && to > range1.to) {
            return new Range[]{new Range(from, range1.from), new Range(range1.to, to)};
        }

        if (from >= range1.from && to <= range1.to) {
            return new Range[]{};
        }

        if (from < range1.from && to < range1.to) {
            return new Range[]{new Range(from, range1.from)};
        }

        return new Range[]{new Range(range1.to, to)};
    }
}
