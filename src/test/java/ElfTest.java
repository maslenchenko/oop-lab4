import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.game.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElfTest {
    private org.game.Character character;

    @BeforeEach
    public void init() {
        character = new org.game.Elf();
    }

    @Test
    public void testToString(){ assertEquals("Elf{hp=10, power=10}", character.toString());
    }

    @Test
    public void testKick() {
        org.game.Hobbit hobbit = new org.game.Hobbit();
        character.kick(hobbit);
        assertEquals(0, hobbit.getHp());
    }
}



