package recursion;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the nth item: ");
        int max=scan.nextInt();
        System.out.println("Factorial of "+max+" is :"+factorial(max));
    }
    public static int factorial(int count){
        if(count>0){
            return (count*factorial(count-1));
        }else{
            return 1;
        }
    }
}
