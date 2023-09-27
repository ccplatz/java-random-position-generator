public class Position {
    private final long coordinate1;
    private final long coordinate2;

    public Position(long coordinate1, long coordinate2) {
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
    }

    public long getCoordinate1() {
        return coordinate1;
    }

    public long getCoordinate2() {
        return coordinate2;
    }

    public double getDistance(Position p2) {
        return Math.sqrt(Math.pow(this.coordinate1 - p2.getCoordinate1(), 2) + Math.pow(this.coordinate2 -p2.getCoordinate2(), 2));
    }

    public String toString() {
        return "Position: (" + coordinate1 + "|" + coordinate2 + ")\n";
    }
}
