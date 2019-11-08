package fr.lacombe;

final class Level {
    private final int value;

    private Level(int value) {
        this.value = value;
    }

    static Level initialize() {
        return new Level(1);
    }

    boolean isStart() {
        return true;
    }
}
