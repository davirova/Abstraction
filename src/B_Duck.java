public class B_Duck extends B_Anima{
    B_Duck(){}
    B_Duck(String name)
    {
        this.name = name;
    }
    void sound()
    {
        System.out.println("Animal sound: "+"quack quack");
    }

    @Override
    void getName(String name) {
        System.out.println( "Animal name: "+ name);
    }

    public static void main(String[] args) {
        B_Anima bDuck = new B_Duck();
        bDuck.getName("Duck");
        bDuck.sound();
    }
}
