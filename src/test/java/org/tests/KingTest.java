package org.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.game.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KingTest {
    private org.game.Character character;

    @BeforeEach
    public void init() { character = new org.game.King(); }

    @Test
    public void testIsClass() {
        assertTrue(character instanceof org.game.Character);
    }

    @Test
    public void testHp() {
        assertTrue(character.getHp() >= 5 && character.getHp() <= 15);
    }

    @Test
    public void testPower() {
        assertTrue(character.getPower() >= 5 && character.getPower() <= 15);
    }
}