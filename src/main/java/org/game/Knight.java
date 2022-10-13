package org.game;

import org.game.Character;

import java.util.concurrent.ThreadLocalRandom;

public class Knight extends King{

    int power = ThreadLocalRandom.current().nextInt(2, 13);
    int hp = ThreadLocalRandom.current().nextInt(2, 13);

    public Knight() {
        super.setHp(hp);
        super.setPower(power);
    }
}
