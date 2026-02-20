package Conditionals;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        int M1, M2, M3, M4, M5;
        double total;
        double percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks M1:");
        M1 = sc.nextInt();
        System.out.println("Enter the Marks M2: ");
        M2 = sc.nextInt();
        System.out.println("Enter the Marks M3: ");
        M3 = sc.nextInt();
        System.out.println("Enter the Marks M4: ");
        M4 = sc.nextInt();
        System.out.println("Enter the Marks M5: ");
        M5 = sc.nextInt();
        total = M1 + M2 + M3 + M4 + M5;
        System.out.println("Total Marks: " + total);
        percentage = (total / 500) * 100;
        System.out.println("Percentage: " + percentage);
        if (percentage >= 75) {
            System.out.println("Grade A");
        }
        else if(percentage >= 50) {
            System.out.println("Grade B");
        }
        else if(percentage >=30) {
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
