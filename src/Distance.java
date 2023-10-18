import java.util.Comparator;

public class Distance {
    private final double distance;
    private final Position position1;
    private final Position position2;

    public Distance(double distance, Position position1, Position position2) {
        this.distance = distance;
        this.position1 = position1;
        this.position2 = position2;
    }

    public double getDistance() {
        return distance;
    }

    public String toString() {
        return String.format("Distance: %f Position1: " + position1.toString() + "Position2: " + position2.toString() + "\n", distance);
    }
}
