package fr.lacombe;

import java.util.Objects;

final class Health {
    private static final int MAX = 1000;

    private final int value;

    private Health(int value) {
        this.value = value;
    }

    static Health initialize() {
        return new Health(MAX);
    }

    static Health of(int value) {
        return new Health(value);
    }

    boolean isFull() {
        return value == MAX;
    }

    Health reduce(int points) {
        return new Health(value - points);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Health health = (Health) o;
        return value == health.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
