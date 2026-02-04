import java.util.*;
public class AddUsingRecursion {
    static int addRec(int a,int b){
        if (b==0){
            return a;
        }
        return addRec(a+1,b-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int x=sc.nextInt();
        System.out.print("Enter the second Number: ");
        int y=sc.nextInt();
        System.out.print("Sum Of "+x+" And " +y+" is "+addRec(x,y));
    }
    
}
