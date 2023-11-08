import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int fact=1;
        int total=0;
        System.out.println("Enter any positive integer:");
        num= input.nextInt();
        for(int i=1 ;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial: "+fact);
    }


}