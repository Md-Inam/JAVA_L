/*
 * This Program Shows the Factorial of the given input
 */
import java.util.*;

public class FactorialNonRec {
    public static void main(String[] args){
        int f =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find Factorial of:");
        int n = sc.nextInt();
        if (n==0){
            System.out.println("The Factorial of 0 is 1");
        }
        else{
            for(int i = 1; i<=n; i++){
                f=f*i;
            }
            System.out.printf("The Factorial of %d is %d",n,f);
        }
        sc.close();
    }
    
}
