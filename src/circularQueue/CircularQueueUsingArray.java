package circularQueue;
import java.util.Scanner;
public class CircularQueueUsingArray {
    Scanner scan=new Scanner(System.in);
    int queue[];
    int front=0,rear=0,size,in=0;
    public void size(){
        System.out.print("Enter the size of the queue: ");
        size=scan.nextInt();
        queue=new int[size];
    }
    public void enqueue(){
        if(check()==1){
            System.out.print("Enter any element: ");
            int element=scan.nextInt();
                queue[rear]=element;
                rear++;
                rear=rear%size;
                if(rear==front){
                    in=1;
                }
                System.out.println("Enqueue Successful!!!\n");
        }
    }
    public int check(){
        if(in==1){
            System.out.print("Queue full. Entering new element will reset queue\nEnter any key to return(c->continue): ");
            char op=scan.next().charAt(0);
            if(Character.compare(op,'c')==0){
                in=0;
                System.out.println("Queue cleared!!!\n");
                return 0;
            }else{
                System.out.println("Enqueue denied...\n");
                return 0;
            }
        }else{
            return 1;
        }
    }
    public void dequeue(){
        if(front==rear && in==0){
            System.out.println("Cannot dequeue. Queue is empty\n");
        }else{
            int temp=queue[front];
            queue[front]=0;
            front++;
            front=front%size;
            System.out.println(temp+ " element deleted\n");
            if(in==1){
                in=0;
            }
        }
    }
    public void traversal(){
        if(front==rear && in==0){
            System.out.println("Cannot display. Queue is empty\n");
        }else{
            System.out.println("Elements of Queue: ");
            int temp=front;
            do{
                System.out.println(queue[temp]);                
                temp++;
                temp=temp%size;
            }while(temp!=rear);
        }
    }
    public void menu(){
        System.out.println("::OPTIONS::\n1.ENQUEUE\n2.DEQUEUE\n3.TRAVERSAL\n4.EXIT");
        while(true){
            System.out.print("HINT:Enter 5 to display menu\nEnter any option: ");
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
                    System.exit(0);
                    break;
                case 5:
                    menu();
                    break;
                default:
                    System.out.println("Invalid Option\n");
            }
        }
    }
    public static void main(String[] args) {
        CircularQueueUsingArray obj=new CircularQueueUsingArray();
        obj.size();
        obj.menu();
    }
}
