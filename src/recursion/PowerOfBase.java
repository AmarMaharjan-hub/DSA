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
public class PowerOfBase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base=scan.nextInt();
        System.out.print("Enter the power: ");
        int pow=scan.nextInt();
        System.out.println(base+"^"+pow+" = "+power(base,pow));
    }
    static int power(int base,int pow){
        if(pow>1){
            return (base*power(base,pow-1));
        }else if(pow==0){
            return 1;
        }else{
            return base;
        }
    }
}
