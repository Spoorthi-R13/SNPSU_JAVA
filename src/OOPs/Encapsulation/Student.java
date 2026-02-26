package OOPs.Encapsulation;

public class Student {
    private String name;
    private int usn;

    Student(String name, int usn ){
        this.name=name;
        this.usn=usn;
    }
    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name=name;
    }
    int getusn(){
        return this.usn;
    }
    void setusn(int usn){
        this.usn=usn;
    }


    void printDetails(){
        System.out.println("Student name is :" + name);
        System.out.println("Student usn is :" + usn);
    }
}
class Drive{
    public static void main(String[] args) {
       Student s1=new Student("Ashank", 100);
       s1.printDetails();
       s1.getName();
       System.out.println("Name is : "+ s1.getName());
       s1.setName("Spoo");
       s1.printDetails();
       System.out.println("Name is : "+ s1.getName());
       s1.getusn();
       System.out.println("USN is : "+ s1.getusn());

    }
}