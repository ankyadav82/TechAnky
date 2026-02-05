import java.util.*;
public class Palindrome {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num=sc.nextInt();
    int rev=0;
    int temp=num;
    while(num>0){
        int digit=num%10;
        rev=rev*10+digit;
        num=num/10;
    }
    if(temp==rev){
        System.out.print("The number is a palindrome.");
    }
    else{
        System.out.print("The Number is not a palindrome.");
    }

    }
    
}
