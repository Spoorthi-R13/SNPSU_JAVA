package OOPs.Basics;

public class Tree {
    String TreeName;
    int NumTree;
    String Fruit;

    public Tree(String TName , int noTree , String Fru){
        TreeName = TName;
        NumTree = noTree;
        Fruit = Fru;
    }
    void treeDetails(){
        System.out.printf("\n\nTree Name is : %s  " , TreeName);
        System.out.printf("\nNumber of trees is : %d " , NumTree);
        System.out.printf("\nName of the Fruit is : %s" , Fruit);
    }
}
class subtree{
    public static void main(String[] args) {
       Tree t1 = new Tree( " Mango Tree" , 20 , "Mango Fruit");//constructor call
        Tree t2 = new Tree( "Apple Tree" , 15, "Apple Fruit");
        t1.treeDetails();
        t2.treeDetails();
    }
}