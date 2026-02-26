package OOPs.ConstructorDemo;

class Student {
    String name;
    int usn;

    Student(String name ,int usn){
        this.name=name;
        this.usn=usn;
    }
    //copy constructor
    Student(Student obj){
        this.name = obj.name;
        this.usn = obj.usn;
    }
    void display(){
        System.out.println(name + " " + usn );
    }
}
class Common{
    public static void main(String[] args) {
        Student s1 = new Student("Spoorthi " , 108);
        Student s2 = new Student(s1);  //here s1 and s2 have diiferent memory location
       // Student s2 = s1; //here s1 and s2 are stored in same memrory location
        s1.display();
        s2.display();//clone or copied
    }
}
