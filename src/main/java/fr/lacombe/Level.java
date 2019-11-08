package fr.lacombe;

class Level {
    private final int value;

    public Level(int value) {
        this.value = value;
    }

    public static Level initialize() {
        return new Level(1);
    }

    boolean isStart() {
        return true;
    }
}
