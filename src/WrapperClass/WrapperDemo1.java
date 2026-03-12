package WrapperClass;

public class WrapperDemo1 {
    static void main(String[] args) {
        int x = 10;
        Integer obj = new Integer(x); //Manual Boxing(Old Way)
        System.out.println("Primitive Value : "+x);
        System.out.println("Object Value: "+obj);
    }
}
