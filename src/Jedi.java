public class Jedi extends Character{
    public Jedi(String name, int age){
        super(name, age);
    }

    @Override
    public void action(){
        System.out.println("Jedi is doing something...");
    }

    public void meditate(){
        System.out.println("Meditating...");
    }
}
