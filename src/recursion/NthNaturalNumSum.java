/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class NthNaturalNumSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int max=scan.nextInt();
        System.out.println("Sum of "+max+"th natural number is: "+sum(max));
    }
    public static int sum(int count){
        if(count>0)
            return (count+sum(count-1));
        else
            return 0;
    }
}
