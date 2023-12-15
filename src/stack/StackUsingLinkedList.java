package stack;
import java.util.Scanner;
public class StackUsingLinkedList {
    Scanner scan=new Scanner(System.in);
    private class Node{
        int data;
        Node address;
    }
    Node top;
    StackUsingLinkedList(){
        this.top=null;
    }
    public void push(){
        System.out.print("Enter an element: ");
        int element=scan.nextInt();
        Node newNode=new Node();
        newNode.data=element;
        newNode.address=top;
        top=newNode;
        System.out.println("Push Sucessfull!!!\n");
    }
    public void pop(){
        
        if(top==null){
            System.out.println("Stack is empty!!!\n");
        }else{
            int tempData=top.data;
            top=top.address;
            System.out.println(tempData+" data erased!!!\n");
        }
    }
    public void traversal(){
        if(top==null){
            System.out.println("Cannot display. Stack is empty!!!\n");
        }else{
            Node temp=top;
            System.out.println("Elements of the stack are: ");
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.address;
            }
            System.out.println();
        }
    }
    public void menu(){
        System.out.println("::OPERATION::\n1.PUSH\n2.POP\n3.TRAVERSAL\n4.EXIT\n");
        while(true){
            System.out.print("HINT:Enter 5 to display menu\nEnter any option: ");
            int option=scan.nextInt();
            switch(option){
                case 1:
                    push();
                    break;
                case 2:
                    pop();
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
                    System.out.println("Invalid Option!!!\n");
            }
        }
        
    }
    public static void main(String[] args){
        StackUsingLinkedList obj1=new StackUsingLinkedList();
        obj1.menu();
    }
}
