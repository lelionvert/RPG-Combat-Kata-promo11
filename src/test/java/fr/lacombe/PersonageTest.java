package fr.lacombe;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonageTest {

    @Test
    void new_personage_is_alive(){
        Personage paul = new Personage();
        assertThat(paul.isAlive()).isTrue();
    }


}
