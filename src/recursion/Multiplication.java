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
public class Multiplication {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the multiplicand: ");
        int mul=scan.nextInt();
        System.out.print("Enter the multiplier: ");
        int multi=scan.nextInt();
        System.out.println(mul+" X "+multi+" = "+product(mul,multi));
    }
    static int product(int mul,int multi){
        if(multi>1){
            return (mul+product(mul,multi-1));
        }else if(multi==0){
            return 0;
        }else{
            return mul;
        }
    }
}
