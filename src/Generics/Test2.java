package Generics;

class Test2<K,V> {
    K key;
    V val;
    Test2(K key, V val){
        this.key= key;
        this.val=val;
    }
    void display(){
        System.out.println(" Key : " + key +" , Value : "+ val);
    }
}
class Driver1{
    static void main(String[] args) {
        Test2<Integer,String> obj1 = new Test2<>(40,"Hello");
        obj1.display();

    }

}
