package OOPs.Inheritance.Multiple;

public class mom {
    void cook() {
        System.out.println("Cooking....");
    }
}
class dad {
    void sleep() {
        System.out.println("Sleeping....");
    }

}
class child {
    void study() {
        System.out.println("Studying....");
    }
}
class Driver1{
    public static void main(String[] args) {
        mom m= new mom();
        m.cook();

        dad d=new dad();
        d.sleep();

        child c=new child();
        c.study();

    }
}
