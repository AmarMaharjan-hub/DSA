package stack;
import java.util.Scanner;
public class StackWithArray {
    int[] stack;
    int top=-1,max;
    public void size(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of stack: ");
        max=scan.nextInt();
        stack=new int[max];
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        StackWithArray obj1=new StackWithArray();
        obj1.size();
        System.out.println("::OPERATIONS::\n1.PUSH\n2.POP\n3.TRAVERSAL\n4.EXIT\n");
        while(true){
            System.out.print("Enter your choice of operation: ");
            int operation=scan.nextInt();
            switch(operation){
                case 1:
                    obj1.push();
                    break;
                case 2:
                    obj1.pop();
                    break;
                case 3:
                    obj1.traversal();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option!!!\n");
            }
        }
    }
    public void push(){
        Scanner scan=new Scanner(System.in);
        if(top==max-1){
            System.out.println("Push operation failed. Stack is full!!!\n");
        }else{
            System.out.print("Enter the element:");
            int element=scan.nextInt();
            top++;
            stack[top]=element;
            System.out.println("Push Operation Sucessfull.\n");
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("Pop operation failed. Stack is empty!!!\n");
        }else{
            int temp=stack[top];
            stack[top]=0;
            top--;
            System.out.println("Element "+temp+" Sucessfully deleted.\n");
        }
    }
    public void traversal(){
        if(top==-1){
            System.out.println("Cannot display. Stack is empty!!!\n");
        }else{
            System.out.println("Elements of stack are:");
            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
            System.out.println();
        }
    }
}
