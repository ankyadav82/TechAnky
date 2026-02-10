import java.util.*;
public class RPS {
    public static void main(String[] args){
        System.out.println("0 for Rock, 1 for Paper, 2 for Scissors.");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int userChoice=sc.nextInt();
        
        Random rn=new Random();
        int computerChoice=rn.nextInt(3);

        if(userChoice==computerChoice){
            System.out.println("Match Draw.");

        }
        else if(userChoice==0 && computerChoice==2 || userChoice==1 && computerChoice==0 || userChoice==2 && computerChoice==1){
            System.out.println("You win.");
        }
        else{
            System.out.println("Computer wins.");
        }

        System.out.println("Your choice: "+userChoice);
        System.out.println("Computer choice: "+computerChoice);


    }
    
}
