import java.util.*;
public class SimpleInterest {
    public static int calSi(int p,int r,int t){
        int si=(p*r*t)/100;
        return si;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Principal Amount: ");
        int principal=sc.nextInt();
        System.out.print("Enter The Rate Of Interest: ");
        int rate=sc.nextInt();
        System.out.print("Enter The Time Period In Years: ");
        int time=sc.nextInt();
        int simpleInterest=calSi(principal,rate,time);
        System.out.println("The Simple Interest is: "+simpleInterest);
    }
    
}
