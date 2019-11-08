package fr.lacombe;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonageTest {

    @Test
    void new_personage_is_alive(){
        // Given
        Personage paul = new Personage();

        // When
        boolean actual = paul.isAlive();

        // Then
        assertThat(actual).isTrue();
    }
}
