package Conditionals;

public class nested_for {
    public static void main(String[] args) {
        for( int i=0 ; i<=5;i++){
            for(int j=0; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println( );
        }

        //upper triangle
        /*for( int i=0 ; i<5 ;i++ ){
            for( int j=0 ; j<5-i-1; j++) {
                System.out.print(" ");
            }
            for(int k=0 ; k< (i*2)+1; k++){
                System.out.print("*");
            }
            System.out.println( );
        }
        // lower triangle
        for( int i=3 ; i>=0 ;i-- ) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}
