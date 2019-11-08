package fr.lacombe;

import java.util.Objects;

class Health {
    private final int value;

    private Health(int value) {
        this.value = value;
    }

    static Health of(int value) {
        return new Health(value);
    }

    static Health initialize(){
        return new Health(1000);
    }

    boolean isFull(){
        return value == 1000;
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
