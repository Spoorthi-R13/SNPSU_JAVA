package Strings;

public class StringInternFunction {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = "Hello";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        String s3 = s1.intern();//check the string pool
        System.out.println(s2==s3);
        String s4 = new String(s1.intern());
        System.out.println(s1==s3);
        System.out.println(s1==s4); //these two are seperate objects
    }
}
