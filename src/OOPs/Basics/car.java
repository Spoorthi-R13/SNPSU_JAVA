//class with attribute
package OOPs.Basics;

public class car {
    String BrandName; // these are attributes
    int ManuDate;
    String Color;

    public car(String BrandName , int ManuDate , String Color  ){  //constructor(within parameters)
        this.BrandName = BrandName;
        this.ManuDate = ManuDate;
        this.Color = Color;
    }
    void printDetails(){
        System.out.printf(" car BrandName is %s\n",this.BrandName);
        System.out.printf(" Car ManuDate is %d\n ", this.ManuDate);
        System.out.printf("Car color is %s\n " , this.Color);
    }
}
class driver{
    public static void main(String[] args) {
        car c1 = new car( " Audi" , 2000 , "Red");//constructor call
        car c2 = new car( "BMW" , 20005, "Blue");
        c1.printDetails();
        c2.printDetails();
    }
}