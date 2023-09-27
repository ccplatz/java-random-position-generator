import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Position> positions = new ArrayList<>();
        positions = PositionGenerator.getPositions(300);

        ArrayList<Distance> distances = new ArrayList<>();
        for (int i = 0; i < positions.size() - 1; i++) {
            for (int j = 0; j < positions.size() - 1; j++) {
                if (i == j || j < i) {
                    continue;
                }
                Position position1 = positions.get(i);
                Position position2 = positions.get(j);
                double distanceBetweenPositions = position1.getDistance(position2);
                Distance distance = new Distance(distanceBetweenPositions, position1, position2);
                distances.add(distance);
            }
        }
        distances.sort(Distance.distanceComparator);
        //System.out.println(distances.toString());
        System.out.println(distances.get(0).toString());
    }
}