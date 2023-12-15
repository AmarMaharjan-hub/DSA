package sort;
import java.util.Scanner;
public class BubbleSort {
    Scanner scan=new Scanner(System.in);
    public void sort(int list[],int size){
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(list[j]>list[j+1]){
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
    }
    public void getList(){
        int list[];
        System.out.print("Enter the size of list: ");
        int size=scan.nextInt();
        list=new int[size];
        System.out.println("Enter the elements of list:");
        for(int i=0;i<size;i++){
            list[i]=scan.nextInt();
        }
        sort(list,size);
        display(list,size);
    }
    public void display(int list[],int size){
        System.out.println("After sorting :");
        for(int i=0;i<size;i++){
            System.out.println(list[i]);
        }
    }
    public static void main(String[] args) {
        BubbleSort bs=new BubbleSort();
        bs.getList();
    }
            
}
