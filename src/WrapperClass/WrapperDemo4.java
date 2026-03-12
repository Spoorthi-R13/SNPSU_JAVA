package WrapperClass;

public class WrapperDemo4 {
    static void main(String[] args) {
        String str = "123";
        System.out.println(str+10);

       int num = Integer.parseInt(str); //str---->int
        System.out.println(num+10);

        int num1=100;
        String str1 = Integer.toString(num1); //int-->string
        System.out.println(str1+10);
    }
}
