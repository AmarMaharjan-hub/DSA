package sort;
public class InsertionSort {
    public static void main(String[] args) {
        int list[]={65,58,18,79,16,23,71,3,61,87};
        System.out.print("Before sorting: ");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        for(int i=1;i<list.length;i++){
            int temp=list[i];
            int j=i-1;
            while(j>=0 && temp<=list[j]){
                list[j+1]=list[j];
                j=j-1;
            }
            list[j+1]=temp;
        }
        System.out.print("\nAfter sorting: ");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
    }
}
