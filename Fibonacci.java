public class Fibonacci {
    public static void main(String[] args){
        int a=0;
        int b=1;
        int c=a+b;
        for(int i=1;i<=10;i++){
            System.out.println(a+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
    
}
