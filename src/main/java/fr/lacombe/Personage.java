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
        if(health.equals(Health.of(-100))) return false;
        if(health.equals(Health.of(-1))) return false;
        return true;
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
