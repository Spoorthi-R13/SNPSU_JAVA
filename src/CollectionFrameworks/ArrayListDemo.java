package CollectionFrameworks;

import java.util.ArrayList;

public class ArrayListDemo {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);


        System.out.println("Array list: "+list);
        System.out.println("Getting element at index 1 :" +list.get(1));
        System.out.println("List Size: "+list.size());
        System.out.println("List contains 100 : "+ list.contains(100));
        System.out.println("List Remove 30 : "+ list.remove(2));
        System.out.println("Updated Array : "+ list);
        for(int i: list){
            System.out.print(i+" ");
        }
    }
}


/*
* Features
*Maintains order of insertion
* allows duplicates
* Dynamic size
* index based access
* Fast
*/
