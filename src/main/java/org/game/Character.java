package org.game;

public class Character {
    int power;
    int hp;

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public void kick(Character c){
    }

    boolean isAlive() {
        if ((this.hp <= 0) || (this.power < 0)) {
            return false;
        }
        return true;
    }

    public String toString() {
        String name  = getClass().getName();
        return name.substring(9, name.length()) + "{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
    }

    String getName() {
        String name  = getClass().getName();
        return name.substring(9, name.length());
    }
}
