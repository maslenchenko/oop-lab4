package org.game;

public class GameManager {

    public static void main(String[] args) throws Exception {
        CharacterFactory c = new CharacterFactory();
        Character c1 = c.createCharacter();
        Character c2 = c.createCharacter();
        System.out.println();
        System.out.println("welcome rivals!");
        System.out.println(c1.getName() + " vs " + c2.getName());
        System.out.println("current status:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("let the game begin");
        System.out.println();
        fight(c1, c2);
    }

    static void fight(org.game.Character c1, org.game.Character c2) {
        int counter = 1;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("round " + counter);
            System.out.println(c1.getName() + " is kicking " + c2.getName());
            c1.kick(c2);
            if (!c2.isAlive()) {
                System.out.println("oh no! " + c2.getName() + " is dead...\ngame is over!");
                break;
            }
            System.out.println("now " + c2.getName() + " has " + c2.getHp() + " health points and " + c2.getPower() + " power points");
            System.out.println(c2.getName() + " is kicking " + c1.getName());
            c2.kick(c1);
            if (!c1.isAlive()) {
                System.out.println("oh no! " + c1.getName() + " is dead...\ngame is over!");
                break;
            }
            System.out.println("now " + c1.getName() + " has " + c1.getHp() + " health points and " + c1.getPower() + " power points");
            counter += 1;
            System.out.println();
        }
    }
}
