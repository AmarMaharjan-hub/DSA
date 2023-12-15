package sort;
public class SelectionSort {
    public static void main(String[] args) {
        int list[]={23,51,72,43,10,15,91,88,1,67};
        System.out.print("before sorting: ");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        for(int i=0;i<list.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<list.length;j++){
                if(list[minIndex]>list[j]){
                    minIndex=j;
                }
            }
            int temp=list[minIndex];
            list[minIndex]=list[i];
            list[i]=temp;
        }
        System.out.print("\nafter sorting: ");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
    }
}

/*
//Pratice
public class SelectionSort{
    public static void main(String[] args){
        int[] arr={12,34,13,53,72,43,10,15};
        for(int i=0; i<arr.length-1; i++){
            int min=i;
            for(int j=i; j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println("sorted: ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
*/