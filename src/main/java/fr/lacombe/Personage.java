package fr.lacombe;

class Personage {
    private Health health;
    private Level level;

    Personage() {
        this.health = Health.initialize();
    }

    boolean isAlive() {
        return true;
    }

    boolean isFullHealth(){
        return health.isFull();
    }

    public int level() {
        return 1;
    }
    public boolean level2() {
        return level.isStart();
    }
}
