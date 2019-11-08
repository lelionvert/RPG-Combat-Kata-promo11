package fr.lacombe;

class Health {
    private int value;

    private Health() {
        this.value = 1000;
    }

    static Health of(Personage personage) {
        return new Health();
    }
}
