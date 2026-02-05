import java.util.*;
public class AllInOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=sc.nextInt();
        /*int count=0;
        int sum=0;
        for(int i=0;i<=num;i++){
            System.out.print(i+" ");
            sum=sum+i;
            count++;
        }
        System.out.println("\n"+sum);
        System.out.println(count);*/
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=num;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    
}
