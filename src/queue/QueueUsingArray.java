package queue;
import java.util.Scanner;
public class QueueUsingArray {
    Scanner scan=new Scanner(System.in);
    int max,rear=-1,front=0;
    int[] queue;
    public void size(){
        System.out.print("Enter size of queue: ");
        max=scan.nextInt();
        queue=new int[max];
    }
    public void enqueue(){
        if(rear==max-1){
            System.out.println("Queue is full. Clear queue to use again!!!\n");
        }else{
            System.out.print("Enter the element: ");
            int element=scan.nextInt();
            rear++;
            queue[rear]=element;
            System.out.println("Enqueue sucessfull!!!\n");
        }
    }
    public void dequeue(){
        if(rear<front){
            System.out.println("Cannot dequeue. Queue is empty!!!\n");
        }else{
            int temp=queue[front];
            queue[front]=0;
            front++;
            System.out.println("Element "+temp+" deleted.\n");
        }
    }
    public void traversal(){
        if(rear<front){
            System.out.println("Cannot display. Queue is empty!!!\n");
        }else{
            System.out.println("Element of queue are: ");
            for(int i=front;i<=rear;i++){
                System.out.println(queue[i]);
            }
        }
        System.out.println();
    }
    public void clear(){
        for(int i=0;i<max;i++){
            queue[i]=0;
        }
        rear=-1;
        front=0;
        System.out.println("Queue sucessfully cleared!!!\n");
    }
    public void menu(){
        System.out.println("::OPERATIONS::\n1.ENQUEUE\n2.DEQUEUE\n3.TRAVERSAL\n4.CLEAR\n5.EXIT");
        while(true){
            System.out.print("HINT:Enter 6 to display menu\nEnter an option: ");
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
                case 4:
                    clear();
                    break;
                case 5:
                    System.exit(0);
                    break;
                case 6:
                    menu();
                    break;
                default:
                    System.out.println("Invalid Option!!!\n");
            }
        }
    }
    public static void main(String[] args) {
        QueueUsingArray obj1=new QueueUsingArray(); 
        obj1.size();
        obj1.menu();
    }
}
