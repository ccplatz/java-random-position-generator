import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int numberOfDistances = 2000000;
        Distance shortestDistance = null;
        ArrayList<Position> positions = getPositons(numberOfDistances);
        positions.sort(Position.coordinate1Comparator);

        for (int i = 0; i < positions.size() - 1; i++) {
            Position position1 = positions.get(i);
            Position position2 = positions.get(i + 1);

            double distanceBetweenPositions = position1.getDistance(position2);
            Distance distance = new Distance(distanceBetweenPositions, position1, position2);
            if (shortestDistance == null) {
                shortestDistance = distance;
            } else if (position1.getDifferenceBetweenCoordinate1(position2) < shortestDistance.getDistance()) {
                if (position1.getDistance(position2) < shortestDistance.getDistance()) {
                    shortestDistance = distance;
                }
            }
        }
        System.out.println(shortestDistance.toString());
    }

    private static ArrayList<Position> getPositons(int counter) {
        ArrayList<Position> positions = new ArrayList<>();
        Position position1;
        Position position2 = null;

        while (positions.size() < counter) {
            position1 = PositionGenerator.getNextPosition(position2);
            positions.add(position1);
            position2 = PositionGenerator.getNextPosition(position1);
            positions.add(position2);
        }

        return positions;
    }
}