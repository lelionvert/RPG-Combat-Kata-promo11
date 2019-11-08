package fr.lacombe;

class Health {
    private int value;

    private Health() {
        this.value = 1000;
    }

    int of() {
        return value;
    }

    static Health initialize(){
        return new Health();
    }
}
