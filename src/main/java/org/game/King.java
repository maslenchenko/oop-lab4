package org.game;

import org.game.Character;

import java.util.concurrent.ThreadLocalRandom;

// nextInt is normally exclusive of the top value,
// so add 1 to make it inclusive
public class King extends Character {

    int power = ThreadLocalRandom.current().nextInt(5, 16);
    int hp = ThreadLocalRandom.current().nextInt(5, 16);

    public King() {
        super.setHp(hp);
        super.setPower(power);
    }

    public void kick(Character c) {
        int decreaseHp = ThreadLocalRandom.current().nextInt(1, this.power + 1);
        int cHp = c.getHp();
        c.setHp(cHp - decreaseHp);
    }
}
