import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Character droid = new Droid("R2-D2", 30);
        Character sith = new Sith("Darth Vader", 100);
        Character jedi = new Jedi("Luke Skywalker", 50);
        Character cloneTrooper = new CloneTrooper("Clone Trooper", 20);

        List<Character> characters = new ArrayList<>();
        characters.add(droid);
        characters.add(sith);
        characters.add(jedi);
        characters.add(cloneTrooper);

        for (Character character : characters) {
            System.out.println("----------NEW CHARACTER----------");
            character.showInfo();
            character.action();
            if (character instanceof Jedi) {
                ((Jedi) character).meditate();
            }
        }


    }
}