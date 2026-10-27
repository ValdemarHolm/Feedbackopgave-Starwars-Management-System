public class CloneTrooper extends Character {
    public CloneTrooper(String name, int age){
        super(name, age);
    }

    @Override
    public void action(){
        System.out.println("Clone Trooper is doing something...");
    }
}
