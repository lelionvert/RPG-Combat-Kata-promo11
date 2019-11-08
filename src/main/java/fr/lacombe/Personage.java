package fr.lacombe;

class Personage {
    private Health health;

    Personage() {
        this.health = Health.initialize();
    }

    boolean isAlive() {
        return true;
    }

    // TODO: remove later #calisthenic
    Health getHealth() {
        return health;
    }
}
