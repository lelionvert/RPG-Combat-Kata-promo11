package fr.lacombe;

class Personage {
    private Health health;

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
}
