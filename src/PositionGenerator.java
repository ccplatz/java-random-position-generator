import java.util.ArrayList;

public class PositionGenerator {
    public static ArrayList<Position> getPositions(int number) {
        ArrayList<Position> positions = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            long coordinate1;
            long coordinate2;
            if (i == 0) {
                coordinate1 = CustomRandomGenerator.getNextRandom();
                coordinate2 = CustomRandomGenerator.getNextRandom(coordinate1);
            } else {
                Position previousPosition = positions.get(i - 1);
                coordinate1 = CustomRandomGenerator.getNextRandom(previousPosition.getCoordinate2());
                coordinate2 = CustomRandomGenerator.getNextRandom(coordinate1);
            }
            Position position = new Position(coordinate1, coordinate2);
            positions.add(position);
        }

        return positions;
    }

    public static Position getNextPosition(Position previousPosition) {
        if (previousPosition == null) {
            return getNextPosition();
        }

        long coordinate1;
        long coordinate2;

        coordinate1 = CustomRandomGenerator.getNextRandom(previousPosition.getCoordinate2());
        coordinate2 = CustomRandomGenerator.getNextRandom(coordinate1);

        return new Position(coordinate1, coordinate2);
    }

    private static Position getNextPosition() {
        long coordinate1;
        long coordinate2;

        coordinate1 = CustomRandomGenerator.getNextRandom();
        coordinate2 = CustomRandomGenerator.getNextRandom(coordinate1);

        return new Position(coordinate1, coordinate2);
    }
}
