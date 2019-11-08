package fr.lacombe;

class Personage {
    private Health health;

    Personage() {
        this.health = Health.initialize();
    }

    boolean isAlive() {
        return true;
    }

    int getHealth() {
        return 1000;
    }

    int  getHealth2() {
        return health.of();
    }
}
