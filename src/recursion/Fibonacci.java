package recursion;
import java.util.Scanner;
public class Fibonacci {
    int dis=0,sup=1,temp;
    public static void main(String[] args) {
        Fibonacci f=new Fibonacci();
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int max=scan.nextInt();
        System.out.println("Fibonacci series: ");
        f.fibonacci(max);
    }
    public void fibonacci(int max){
        if(max>0){
            System.out.print(dis+" ");
            temp=dis+sup;
            dis=sup;
            sup=temp;
            fibonacci(max-1);
        } 
    }
}
