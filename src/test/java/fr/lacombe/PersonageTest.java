package fr.lacombe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonageTest {

    private Personage paul;

    @BeforeEach
    void setUp() {
        paul = Personage.initialize();
    }

    @Test
    void new_personage_is_alive() {
        // When
        boolean actual = paul.isAlive();

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void new_personage_has_1000_health() {
        // When
        boolean actual = paul.isFullHealth();

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void new_personage_has_level_1() {
        // When
        boolean actual = paul.isStartLevel();

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void personage_damages_another_personage() {
        // When
        Personage thanos = Personage.initialize();
        thanos.damage(paul, 100);

        // Then
        assertThat(paul.getHealth()).isEqualTo(900);
    }
}
