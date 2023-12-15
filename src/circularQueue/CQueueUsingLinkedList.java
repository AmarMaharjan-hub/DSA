package circularQueue;
import java.util.*;
class CQueueUsingLinkedList {
    Scanner scan=new Scanner(System.in);
    static class Node{
        int value;
        Node address;
    }
    static class Queue{
        Node front,rear;
    }
    public void enqueue(Queue q){
        System.out.print("Enter element: ");
        int data=scan.nextInt();
        Node temp=new Node();
        temp.value=data;
        if(q.front==null){
            q.front=temp;
        }else{
            q.rear.address=temp;
        }
        q.rear=temp;
        q.rear.address=q.front;
        System.out.println("Enqueue Successful\n");
    }
    public void dequeue(Queue q){
        if(q.front==null){
            System.out.println("Queue empty\n");
        }else{
            int value;
            value=q.front.value;
            if(q.rear==q.front){
                q.front=null;
                q.rear=null;
            }else{
                q.front=q.front.address;
            }
            System.out.println(value+" element deleted\n");
        }
    }
    public void traversal(Queue q){
        if(q.front==null){
            System.out.println("Queue empty\n");
        }else{
            Node temp=q.front;
            System.out.println("Elements of queue:");
            while(temp.address!=q.front){
                System.out.println(temp.value);
                temp=temp.address;
            }
            System.out.println(temp.value);
        }
    }
    public void menu(Queue q){
        System.out.println("::OPTION::\n1.ENQUEUE\n2.DEQUEUE\n3.TRAVERSAL\n4.EXIT");
        while(true){
            System.out.print("HINT:Enter 5 to show menu\nEnter any option:");
            int op=scan.nextInt();
            switch(op){
                case 1:
                    enqueue(q);
                    break;
                case 2:
                    dequeue(q);
                    break;
                case 3:
                    traversal(q);
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    menu(q);
                    break;
                default:
                    System.out.println("Invalid option\n");
            }
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.front=null;
        q.rear=null;
        CQueueUsingLinkedList obj=new CQueueUsingLinkedList();
        obj.menu(q);
    }
}
