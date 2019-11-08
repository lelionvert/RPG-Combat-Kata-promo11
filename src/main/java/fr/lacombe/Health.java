package fr.lacombe;

final class Health {
    private static final int MAX = 1000;

    private final int value;

    private Health(int value) {
        this.value = value;
    }

    static Health initialize() {
        return new Health(MAX);
    }

    boolean isFull() {
        return value == MAX;
    }

    public Health damage(int points) {
        return new Health(value - points);
    }
}
