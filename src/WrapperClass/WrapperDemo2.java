package WrapperClass;

public class WrapperDemo2 {
    static void main(String[] args) {
        int x = 20;
        Integer obj = x ; //AutoBoxing(New way)
        System.out.println("Object Value : " +obj);
        System.out.println("Primitive Value : " +x);
       // x.methods (will not come) like x.valueof(); but for obj we have methods like shown below
        obj.byteValue();
        System.out.println(obj.byteValue());
    }
}
