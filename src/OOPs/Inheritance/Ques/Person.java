package OOPs.Inheritance.Ques;

public class Person {
    String fName;
    String lName;

    Person(String fName , String lName ){
        this.fName=fName;
        this.lName=lName;
    }
}
class Student extends Person{
    int usn;
    Student(String fName,String lName ,int usn){
        super(fName,lName); //calling parent constructor here
        this.usn=usn;
    }
}
class Driver{
    public static void main(String[] args) {
        Student s1= new Student("Ashank" , "David" , 108);

    }
}