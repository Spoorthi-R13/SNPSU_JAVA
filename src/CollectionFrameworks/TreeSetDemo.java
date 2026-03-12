package CollectionFrameworks;

import java.util.TreeSet;

public class TreeSetDemo {
    static void main(String[] args) {
        TreeSet<Integer> set= new TreeSet<>();

        set.add(20);
        set.add(30);
        set.add(10);
        set.add(10);

        System.out.println(set);
    }
}

/**
 * Features
 * NO Duplicates
 * Automatically sort the data
 * uses Red and Black tree internally
 * slower than hashset
 * used when we want the data to be sorted!
 */
