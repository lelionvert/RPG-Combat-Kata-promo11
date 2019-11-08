package fr.lacombe;

class Health {
    private int value;

    private Health() {
        this.value = 1000;
    }

    private Health(int value) {
        this.value = value;
    }

    static Health of(int value) {
        return new Health(value);
    }

    static Health initialize(){
        return new Health();
    }
}
