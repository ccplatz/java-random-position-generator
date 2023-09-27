public class CustomRandomGenerator {
    private static final int s0 = 290797;
    private static final int divisor = 50515093;

    public static long getNextRandom(long base) {
        long divider = (base * base);
        return divider % divisor;
    }

    public static long getNextRandom() {
        return s0;
    }
}
