package org.game;

import org.game.Character;

public class Elf extends Character{

    int hp = 10;
    int power = 10;

    public Elf() {
        super.setHp(hp);
        super.setPower(power);
    }

    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            c.setHp(0);
            c.setPower(0);
        } else {
            int cPower = c.getPower();
            c.setPower(cPower - 1);
        }
    }
}
