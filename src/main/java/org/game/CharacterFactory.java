package org.game;
import java.lang.reflect.Constructor;
import java.util.concurrent.ThreadLocalRandom;
import org.reflections.Reflections;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.log4j.BasicConfigurator;

public class CharacterFactory {
     public Character createCharacter() throws Exception {
        BasicConfigurator.configure();
        Reflections reflections = new Reflections("org.game");
        Set<Class<? extends Character>> subClasses = reflections.getSubTypesOf(Character.class);
        List<Class> subs = new ArrayList<>(subClasses);
        int idx = ThreadLocalRandom.current().nextInt(0, subs.size());
        Class character = subs.get(idx);
        Constructor constructor = character.getConstructor();
        Character c = (Character) constructor.newInstance();
        return c;
    }

//    public static void main(String[] args) throws Exception {
//        Character c = CharacterFactory.createCharacter();
//        Character c1 = CharacterFactory.createCharacter();
//        System.out.println(c);
//        System.out.println(c1);
//
//    }

}
