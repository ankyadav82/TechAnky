import java.util.*;
public class CalculatePercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks in sub1: ");
        int sub1=sc.nextInt();
        System.out.print("Enter marks in sub2: ");
        int sub2=sc.nextInt();
        System.out.print("Enter marks in sub3: ");
        int sub3=sc.nextInt();
        System.out.print("Enter marks in sub4: ");
        int sub4=sc.nextInt();
        System.out.print("Enter marks in sub5: ");
        int sub5=sc.nextInt();
        int totalMarks=(sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println("Total Marks in Percentage: "+ totalMarks + "%");
    }
    
}
