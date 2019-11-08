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

    @Test
    void new_personage_has_1000_health(){
        // Given
        Personage paul = new Personage();

        // When
        Health actual = paul.getHealth();

        // Then
        assertThat(actual).isEqualTo(Health.of(1000));
    }

    @Test
    void new_personage_has_level_1(){
        // Given
        Personage paul = new Personage();

        // When
        int actual = paul.level();

        // Then
        assertThat(actual).isEqualTo(1);
    }
}
