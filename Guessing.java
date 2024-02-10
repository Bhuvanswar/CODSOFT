import java.util.*;

public class Guessing{
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        int t=3,x,n,i;
        x=1+(int)(100*Math.random());
        System.out.println("let the game begin");
        System.out.println("Guess the number");
        for(i=0;i<t;i++){
            n=sc.nextInt();
            if(n==x){
                System.out.println("you win");
                break;
            }
            else if (x<n){
                System.out.println("Guess is high try again");
            }
            else if(x>n){
                System.out.println("Guess is low try again");
            }
           
        }
        System.out.println("You are out");
        System.out.println("The number is"+x);
    }
}
