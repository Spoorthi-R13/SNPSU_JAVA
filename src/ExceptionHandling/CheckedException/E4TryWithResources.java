package ExceptionHandling.CheckedException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E4TryWithResources {
    public static void main(String[] args) throws Exception{
        String str;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter Text: ");
            str = br.readLine();
            System.out.println("You Entered: "+ str);
        }//here also we can skip catch and directly use finally bcz we used throws where exception is handled by jvm
    }
}
