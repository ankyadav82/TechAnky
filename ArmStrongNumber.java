import java.util.*;
public class ArmStrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=sc.nextInt();
        int temp=num;
        int arm=0;
        while(num>0){
            int rem=num%10;
            arm=arm+(rem*rem*rem);
            num=num/10;
        }
        System.out.println(arm);
        if(temp==arm){
            System.out.print("The Number is an Armstrong Number.");
        }
        else{
            System.out.print("The Number is not an Armstrong Number.");
        }
    }
    
}
