package Generics;

class Test<T> {
    T obj;
    Test(T obj){ //constructor
        this.obj = obj;
    }
}

class Driver{
    static void main(String[] args) {
        Test<Integer> obj1 = new Test<>(15);
        Test<String> obj2 = new Test<>("Hello");  //generics(can handle any data type)
    }
}