package fr.lacombe;

class Personage {
    private Health health;
    private Level level;

    private Personage() {
        health = Health.initialize();
        level = Level.initialize();
    }

    static Personage initialize() {
        return new Personage();
    }

    boolean isAlive() {
        return !isDead();
    }

    boolean isDead() {
        return health.isDepleted();
    }

    boolean isFullHealth() {
        return health.isFull();
    }

    boolean isStartLevel() {
        return level.isStart();
    }

    void damagedBy(int points) {
        health = health.reduce(points);
    }

    Health getHealth() {
        return health;
    }
}
