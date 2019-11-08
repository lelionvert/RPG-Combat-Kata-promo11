package fr.lacombe;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TestClass {

    @Test
    void new_character_is_alive(){
        Personnage paul = new Personnage();
        Assertions.assertThat(paul.isAlive()).isTrue();
    }


}
