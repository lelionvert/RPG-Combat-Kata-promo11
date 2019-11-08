package fr.lacombe;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TestClass {

    @Test
    void setUpEnvironment(){
        Personnage paul = new Personnage();
        Assertions.assertThat(paul.isAlive()).isTrue();
    }


}
