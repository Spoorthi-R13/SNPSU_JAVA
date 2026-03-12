package Arrays.Basics;

public class ArrayEx1 {
    static void main(String[] args) {
        int[] arr = {1 ,2,3,4,5,6,7,8,9,10};//one variable of int has 4 bytes here we have 10 variables so 10*4 = 40 bytes
     //   int[] arr = new int[10]; Another way of initializing array

        for(int i=0; i<arr.length ; i++){
            System.out.println("Array : " + arr[i]);
        }
    }
}
