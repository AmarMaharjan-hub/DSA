package sort;
public class BubbleSort2 {
    public static void main(String[] args) {
        int list[]={45,23,54,6,786,23,5,67};
        int size=list.length;
        System.out.println("Before sorting:");
        for(int i=0;i<size;i++){
            System.out.print(list[i]+" ");
        }
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(list[j]>list[j+1]){
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
        System.out.println("\nAfter sorting:");
        for(int i=0;i<size;i++){
            System.out.print(list[i]+" ");
        }
    }
}
