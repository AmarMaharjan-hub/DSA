/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackAndQueue;
import java.util.*;
/**
 *
 * @author riku
 */
public class LinearQueueOperationUsingSwitch {
    static final int MAX=5;
    static int front=0,rear=-1;
    static int queue1[]=new int[MAX];
    public static void main(String args[]){
        LinearQueueOperationUsingSwitch obj1=new LinearQueueOperationUsingSwitch();
        Scanner scan=new Scanner(System.in);
        boolean loop=true;
        int input;
        System.out.println("**OPTION**\n1. ENQUEUE\n2. DEQUEUE\n3. TRAVERSAL\n4. EXIT");
        do{
            System.out.print("Enter an option: ");
            input=scan.nextInt();
            switch(input){
                case 1:
                    System.out.println("Enter the enqueue value: ");
                    int value=scan.nextInt();
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
                    System.out.println("INVALID INPUT!!!");
            }
        }while(loop);
    }
    public void enqueue(int value){
        if(rear==MAX-1){
            System.out.println("CANNOT ENQUEUE!!!\nQUEUE IS FULL...");
        }else{
            rear++;
            queue1[rear]=value;
            System.out.println("ENQUEUE SUCESSFUL...");
        }
    }
    public void dequeue(){
        if(rear<front){
            System.out.println("CANNOT DEQUEUE!!!\nQUEUE EMPTY...");
            if(rear==4&&front==5){
                System.out.println("RESETTING QUEUE...");
                rear=-1;
                front=0;
            }

        }else{
            System.out.println("ITEM DEQUEUED: "+queue1[front]);
            queue1[front]=0;
            front++;
        }
    }
    public void traversal(){
        if(rear<front){
            System.out.println("CANNOT DISPLAY!!!\nQUEUE EMPTY...");
        }else{
            System.out.println("Elements of queue:");
            for(int i=front;i<=rear;i++){
                System.out.println(queue1[i]);
            }
        }
    }
}
