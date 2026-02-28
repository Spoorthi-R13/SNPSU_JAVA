package ExceptionHandling.CheckedException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E4 {
    public static void main(String[] args) throws Exception {
        String str;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
            //in this we can skip catch and directly use finally bcz we use throws where exception is handeled by jvm
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            br.close();
        }

    }
}
