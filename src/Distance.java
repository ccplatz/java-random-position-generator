import java.util.Comparator;

public class Distance {
    private final double distance;
    private final Position position1;
    private final Position position2;

    static Comparator<Distance> distanceComparator = Comparator.comparingDouble(Distance::getDistance);

    public Distance(double distance, Position position1, Position position2) {
        this.distance = distance;
        this.position1 = position1;
        this.position2 = position2;
    }

    public double getDistance() {
        return distance;
    }

    public Position getPosition1() {
        return position1;
    }

    public Position getPosition2() {
        return position2;
    }

    public String toString() {
        return String.format("Distance: %f Position1: " + position1.toString() + "Position2: " + position2.toString() + "\n", distance);
    }
}
