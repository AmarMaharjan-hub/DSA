/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;
import java.util.Scanner;
public class HighestCommonFactor {
    static int count;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first num: ");
        int num1=scan.nextInt();
        System.out.print("Enter the second num: ");
        int num2=scan.nextInt();
        count=num1<num2?num1:num2;
        System.out.println("ans: "+high(num1,num2));
    }
    static int high(int num1,int num2){
        if(count==1){
            return count;
        }else if(num1%count==0 && num2%count==0){
            return count;
        }else{
            count--;
            return high(num1,num2);
        }
    }
}
