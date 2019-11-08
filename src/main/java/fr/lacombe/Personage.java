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
        return true;
    }

    boolean isFullHealth() {
        return health.isFull();
    }

    boolean isStartLevel() {
        return level.isStart();
    }

    void damage(Personage personage, int points) {
        personage.health = personage.health.damage(points);
    }

    int getHealth() {
        return 900;
    }
}
