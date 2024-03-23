import java.util.Scanner;

public class call {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int roll = sc.nextInt();
        new Display(roll);
        sc.close();
    }
}
