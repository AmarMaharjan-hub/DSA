/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackandqueue;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class CircularQueueOperationUsingSwitch {
    Scanner scan=new Scanner(System.in);
    public final int MAX=5;
    int circQueue[]=new int[MAX];
    int head=0,tail=0;
    public static void main(String args[]){
        CircularQueueOperationUsingSwitch obj1=new CircularQueueOperationUsingSwitch();

        int input,value;
        boolean loop=true;
        System.out.println("***OPTION***\n1. ENQUEUE\n2. DEQUEUE\n3. TRAVERSAL\n4. EXIT\n");
        do{
            System.out.print("Enter an option: ");
            input=obj1.scan.nextInt();
            switch(input){
                case 1:
                    System.out.print("Enter the enqueue value: ");
                    value=obj1.scan.nextInt();
                    obj1.enqueue(value);
                    break;
                case 2:
                    obj1.dequeue();
                    break;
                case 3:
                    obj1.traversal();
                    break;
                case 4:
                    loop=false;
                    break;
                default:
                    System.out.println("INVALID INPUT!!!\n");
            }
        }while(loop);
    }
    public void enqueue(int value){
        int val,temp;
        temp=circAlgo(tail+1);
        if(head==temp){
            System.out.print("Inserting another data will reset the queue!!!\nPress 1 to continue: ");
            val=scan.nextInt();
            if(val==1){
                System.out.println("RESETTIG QUEUE!!!\n");
                circQueue[tail]=value;
                tail++;
                tail=circAlgo(tail);
            }else{
                System.out.println("OPERATION CANCELLED!!!\n");
            }
        }else{
            circQueue[tail]=value;
            tail++;
            tail=circAlgo(tail);
            System.out.println("ITEM ENQUEUED!!!\n");
        }
    }
    public void dequeue(){
        if(head==tail){
            System.out.println("CANNOT DEQUEUE!!!\nSTACK IS EMPTY...\n");
        }else{
            circQueue[head]=0;
            head++;
            head=circAlgo(head);
            System.out.println("DEQUEUE SUCESSFUL!!!\n");
        }
    }
    public void traversal(){
        if(head==tail){
            System.out.println("CANNOT DISPLAY\nQUEUE EMPTY...\n");
        }else{
            System.out.println("Elements of queue:");
            int temp=head;
            do{
                System.out.println(circQueue[temp]);
                temp++;
                temp=circAlgo(temp);
            }while(temp!=tail);
        }
    }
    
    public int circAlgo(int value){
        if(value>=MAX){
            value=value-MAX;
        }
        return value;
    }
}
