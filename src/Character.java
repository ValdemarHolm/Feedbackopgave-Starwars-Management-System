//Superclass
public class Character {
    protected String name;
    protected int age;

    public Character(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void action(){
        System.out.println("Character is doing something...");
    }

    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
