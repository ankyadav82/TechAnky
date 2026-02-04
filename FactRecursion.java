import java.util.*;
public class FactRecursion {
    public int factRec(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n*factRec(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter a Number: ");
        int n=sc.nextInt();
        FactRecursion fr=new FactRecursion();
        System.out.print("Factorial of "+n+ " is: "+fr.factRec(n));
        
    }
    
}
