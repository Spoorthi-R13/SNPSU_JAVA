package CollectionFrameworks;

import java.util.HashMap;

public class HashMapDemo {
    static void main(String[] args) {
        HashMap<Integer , String > map =new HashMap<>();
        //put() -> inserts key-value pair
        map.put(1 ,"Spoorthi");
        map.put(2 ,"Ambika");
        map.put(3 ,"Surabhi");
        System.out.println(map);

        //get() --> retrieve value
        System.out.println(map.get(4)); //bcz 0 is not there it prints null
        System.out.println(map.get(1));

        //contains Key()
        System.out.println(map.containsKey(1));

        //remove()
        map.remove(1);
        System.out.println(map);

    }
}

/**
 * Stores the element as kk=ey-value pair
 * key must be unique
 * values can be duplicated
 * It does not maintain the insertion Order
 * uses hashing internally
 * here we use - put() ,get(), remove(), containsKey() ->Important ones
 */