package Generics;

import java.util.ArrayList;

public class GenericsDemo1 {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //if we use <> we say that this arraylist is generic
        //ArrayList list = new ArrayList();
       // list.add("Hello"); //String
        list.add(10); //int
       // list.add(1.5); //float (we can add any data type these are all objects)
        System.out.println(list);
        //int x = (int)list.get(2); //we have to type cast it if we have not used <> ths diamond operator
    }
}
