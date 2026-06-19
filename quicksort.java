import java.util.Arrays;

public class quicksort {
    public static void quickSort(int[] arr,int low,int high){
        if(low>high){
            return;
        }
        int start=low;
        int end=high;
        int mid=(start+end)/2;
        int pivot=arr[mid];
        //check
        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        quickSort(arr,low,end);
        quickSort(arr,start,high);

    }
    public static void main(String[] args){
        int[] arr={3,6,7,6,8,2,1,4};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
    }
        }
        
}
