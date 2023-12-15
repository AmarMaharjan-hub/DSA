/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackAndQueue;
import java.util.Scanner;
/**
 *
 * @author riku
 */
public class StackOperationUsingSwitch {
    static final int MAX=100;
    static int stack1[]=new int[MAX];
    static int top=-1;
    public static void main(String args[]){
        StackOperationUsingSwitch obj1=new StackOperationUsingSwitch();
        Scanner scan=new Scanner(System.in);
        int input;
        boolean loop=true;
        int value;
            System.out.println("***OPTIONS***\n");
            System.out.println("1. PUSH\n2. POP\n3. TRAVERSAL\n4. EXIT\n");
        do{
            System.out.print("Enter an option: ");
            input=scan.nextInt();
            switch(input){
                case 1:
                    System.out.println("Enter the push value: ");
                    value=scan.nextInt();
                    obj1.stackPush(value);
                    break;
                case 2:obj1.stackPop();
                    break;
                case 3:obj1.stackTraversal();
                    break;
                case 4:loop=false;
                    break;
                default:
                    System.out.println("Illegal input!!!");
            }
        }while(loop);
    }
    
    public void stackPush(int value){
        String result="";
        if(top==MAX-1){
            System.out.println("OPERATION FAILED!!!\nSTACK FULL...");
        }else{
            top++;
            stack1[top]=value;
            System.out.println("STACK PUSH SUCESSFUL...");
        }
    }
    
    public void stackPop(){
        if(top==-1){
            System.out.println("OPERATION FAILED!!!\nSTACK EMPTY...");
        }else{
            int temp=stack1[top];
            stack1[top]=0;
            top--;
            System.out.println("DELETION COMPLETE!!!\nVALUE: "+temp);
        }
    }
    
    public void stackTraversal(){
        if(top==-1){
            System.out.println("COULDN'T DISPLAY!!!\nSTACK EMPTY...");
        }else{
            System.out.println("ELEMENTS OF STACK:");
            for(int i=0;i<=top;i++){
                System.out.println(stack1[i]);
            }
        }
    }
}
