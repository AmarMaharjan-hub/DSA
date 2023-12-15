package linkedlist;
import java.util.Scanner;
public class LinkedListOperation {
    Scanner scan=new Scanner(System.in);
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void insertAtFirst(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }else{
            n.next=head;
            head=n;
        }
        System.out.println(data+" inserted\n");
    }
    public void insertAtLast(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
        System.out.println(data+" inserted\n");
    }
    public void insertAtSpecificPosition(int data){
        Node n=new Node(data);
        Node temp1=head,temp2=null;
        System.out.print("Enter the position for insertion: ");
        int pos=scan.nextInt();
        int count=0;
        if(head==null){
            head=n;
        }else if(pos<=1){
            insertAtFirst(data);
        }else{
            while(count<pos-1 && temp1!=null){
                temp2=temp1;
                temp1=temp1.next;
                count++;
            }
            temp2.next=n;
            n.next=temp1;
            System.out.println(data+" inserted\n");
        }
    }
    public void deleteAtFirst(){
        if(head==null){
            System.out.println("List is empty.\n");
        }else{
            Node temp=head;
            head=head.next;
            System.out.println(temp.data+" has been deleted.\n");
            temp=null;
        }
    }
    public void deleteAtLast(){
        if(head==null){
            System.out.println("List is empty.\n");
        }else{
            Node temp1=head,temp2=null;
            while(temp1.next!=null){
                temp2=temp1;
                temp1=temp1.next;
            }
            if(temp2==null){
                deleteAtFirst();
            }else{
                temp2.next=null;
                System.out.println(temp1.data+" has been deleted.\n");
            }
            temp1=null;
        }
    }
    public void deleteAtSpecificPosition(){        
        if(head==null){
            System.out.println("List is empty.\n");
        }else{
            System.out.print("Enter the position: ");
            int pos=scan.nextInt();
            if(pos<=1){
                deleteAtFirst();
            }else{
                Node temp1=head,temp2=null;
                int count=0;
                while(count<pos-1 && temp1.next!=null){
                    temp2=temp1;
                    temp1=temp1.next;
                    count++;
                }
                if(temp2==null){
                    deleteAtFirst();
                }else{
                    temp2.next=temp1.next;
                    System.out.println(temp1.data+" has been deleted.\n");
                    temp1=null;
                }
            }
        }
    }
    public void traversal(){
        if(head==null){
            System.out.println("List is empty.\n");
        }else{
            System.out.println("Elements of list are: ");
            Node temp1=head;
            while(temp1!=null){
                System.out.println(temp1.data);
                temp1=temp1.next;
            }
            System.out.print("\n");
        }
    }
    public void menu(){
        int data;
        System.out.println("Operations:\n1. insert at first\n2. insert at last\n3. insert at specific position\n4. delete at first"
                + "\n5. delete at last\n6. delete at specific position\n7. traversal\n8. exit");
        while(true){
            System.out.print("HINT:Enter 9 to show menu\nEnter an operation: ");
            int ope=scan.nextInt();
            switch(ope){
                case 1:
                    data=data();
                    insertAtFirst(data);
                    break;
                case 2:
                    data=data();
                    insertAtLast(data);
                    break;
                case 3:
                    data=data();
                    insertAtSpecificPosition(data);
                    break;
                case 4:
                    deleteAtFirst();
                    break;
                case 5:
                    deleteAtLast();
                    break;
                case 6:
                    deleteAtSpecificPosition();
                    break;
                case 7:
                    traversal();
                    break;
                default:
                    System.out.println("Invalid input.\n");
                    break;
                case 8:
                    System.exit(0);
                case 9:
                    menu();
            }
        }
    }
    public int data(){
        System.out.print("Enter an element: ");
        int data=scan.nextInt();
        return data;
    }
    public static void main(String[] args) {
        LinkedListOperation obj1=new LinkedListOperation();
        obj1.head=null;
        obj1.menu();
    }
}