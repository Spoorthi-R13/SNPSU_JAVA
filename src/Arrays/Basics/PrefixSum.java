package Arrays.Basics;

public class PrefixSum {
    static void main(String[] args) {

        int[] arr = {2, 8, 4, 3, 5};
        int[] prefix = new int[arr.length];

        //first element remains the same
        prefix[0] = arr[0];

        //build prefix array
        for (int i = 1; i < arr.length; i++) {  //O (n)
            prefix[i] = prefix[i - 1] + arr[i];
        }

        //print the result
        for (int i = 0; i < arr.length; i++) {
            System.out.print(prefix[i] + " ");
        }
        System.out.println();
        // --------------------Prefix sum over -----------------------------------------------------//

        int L=1;
        int R=3;
        int sum;
        sum= prefix[R]-prefix[L-1]; //O(1)
        System.out.println("Sum of range between index 1 to 3: "+ sum);
    }

}
