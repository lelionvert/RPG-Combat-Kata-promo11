package fr.lacombe;

class Personage {
    private Health health;
    private Level level;

    Personage() {
        health = Health.initialize();
        level = Level.initialize();
    }

    boolean isAlive() {
        return true;
    }

    boolean isFullHealth(){
        return health.isFull();
    }

    boolean isStartLevel() {
        return level.isStart();
    }
}
