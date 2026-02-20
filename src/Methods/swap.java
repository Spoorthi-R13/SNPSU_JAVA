package Methods;
public class swap {
    static int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);


        int[] result = swap(a, b);


        a = result[0];
        b = result[1];

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}