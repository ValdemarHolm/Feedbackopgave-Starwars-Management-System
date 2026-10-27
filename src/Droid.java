public class Droid extends Character {
    public Droid(String name, int age){
        super(name, age);
    }

    @Override
    public void action(){
        System.out.println("Droid is doing something...");
    }
}
