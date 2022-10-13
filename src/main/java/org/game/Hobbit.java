package org.game;

import org.game.Character;

public class Hobbit extends Character {

    int hp = 3;
    int power = 0;

    public Hobbit() {
        super.setHp(hp);
        super.setPower(power);
    }

    void toCry() {
        String line = "Hobbit: Aaaaa!";
        System.out.println(line);
    }

    public void kick(Character c) {
        toCry();
    }
}
