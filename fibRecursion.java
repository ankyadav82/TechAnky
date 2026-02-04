import java.util.*;
public class fibRecursion{
    public static int fiboRec(int n){
        if (n==0 || n==1){
            return n;
        }else{
            return fiboRec(n-1) +fiboRec(n-2);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print("Fibonacci Number using Recursion: "+fiboRec(n));
    }
}
