package queue;
import java.util.Scanner;
public class QueueUsingLinkedList {
    Scanner scan=new Scanner(System.in);
    class Node{
        int data;
        Node address;
    }
    Node rear,front,next;
    int count=0;
    QueueUsingLinkedList(){
        Node newNode=new Node();
        rear=null;
        front=newNode;
        next=newNode;
    }
    public void enqueue(){
        Node newNode=new Node();
        System.out.print("Enter a data: ");
        int value=scan.nextInt();
        next.data=value;
        next.address=newNode;
        rear=next;
        next=newNode;
        System.out.println("Enqueue Sucessfull.\n");
    }
    public void dequeue(){
        if(rear==null||rear.address==front){
            System.out.println("Cannot dequeue.Queue is empty.\n");
        }else{
            int temp=front.data;
            front=front.address;
            System.out.println(temp+" element deleted.\n");
        }
    }
    public void traversal(){
        if(rear==null||rear.address==front){
            System.out.println("Cannot display.Queue is empty\n");
        }else{
            Node temp=front;
            while(temp.address!=null){
                System.out.println(temp.data);
                temp=temp.address;
            }
        }
    }
    public void menu(){
        System.out.println("\n::OPTIONS::\n1.ENQUEUE\n2.DEQUEUE\n3.TRAVERSAL\n4.EXIT");
        while(true){
            System.out.print("HINT:Enter 5 to display menu.\nEnter any option: ");
            int option=scan.nextInt();
            switch(option){
                case 1:
                    enqueue();
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    traversal();
                    break;
                case 5:
                    menu();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option!!!\n");
            }
        }
    }
    public static void main(String[] args) {
        QueueUsingLinkedList obj1=new QueueUsingLinkedList();
        obj1.menu();
    }
}
