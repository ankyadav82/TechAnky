import java.util.*;
public class CondiState {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an number: ");
        int n=sc.nextInt();
        if(n>=18 && n<=60){
            System.out.print("You are eligible to vote");
        }
        else if(n>60){
            System.out.print("You are senior citizen");
        }
        else{
            System.out.print("You are not eligible to vote");
        }
    }
    
}
