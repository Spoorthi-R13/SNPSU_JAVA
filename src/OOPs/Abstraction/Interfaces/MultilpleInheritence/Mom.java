package OOPs.Abstraction.Interfaces.MultilpleInheritence;

interface Mom {
    default void cook(){
        System.out.println("Indian");
    }
}

interface Dad {
    default void cook(){
        System.out.println("Chineese");
    }
}

class Child implements Mom,Dad{
    //@Override
    public void cook() {
        System.out.println("Italian");
        Dad.super.cook();
        Mom.super.cook();
    }
}
class Driver{
    public static void main(String[] args) {
        Child c = new Child();
        c.cook();
    }
}
