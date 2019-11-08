package fr.lacombe;

class Personage {
    private Health health;

    Personage() {
        this.health = Health.of(this);
    }

    boolean isAlive() {
        return true;
    }

    int getHealth() {
        return 1000;
    }

    Health getHealth2() {
        return Health.of(this);
    }
}
