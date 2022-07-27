package Day7.Practice.Model.ComparableForShape;

public class ComperableCricle extends  Circle implements Comparable<ComperableCricle>{
    public ComperableCricle() {
    }

    public ComperableCricle(double radius) {
        super(radius);
    }

    public ComperableCricle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComperableCricle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;

    }
}
