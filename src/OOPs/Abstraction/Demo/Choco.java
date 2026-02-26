package OOPs.Abstraction.Demo;

abstract class Choco {
    abstract void kitkat();

    void dairymilk(){
        System.out.println("Popular Chololate");
    }
}
class Biscuit extends Choco{
    void kitkat(){
        System.out.println(" MY Fav Chocho");
    }
}
class Driver1{
    public static void main(String[] args) {
        Biscuit b =new Biscuit();
        b.kitkat();
        b.dairymilk();
    }
}