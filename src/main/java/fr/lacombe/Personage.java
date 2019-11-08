package fr.lacombe;

class Personage {
    private Health health;

    boolean isAlive() {
        return true;
    }

    int getHealth() {
        return 1000;
    }

    int getHealth2() {
        return Health.of(this);
    }

}
