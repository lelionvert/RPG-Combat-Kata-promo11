package fr.lacombe;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TestClass {

    @Test
    void new_personage_is_alive(){
        Personage paul = new Personage();
        Assertions.assertThat(paul.isAlive()).isTrue();
    }


}
