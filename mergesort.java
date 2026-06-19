import java.util.Arrays;

public class mergesort {
    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] first=mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] second=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(first,second);
    }
    public static int[] merge(int[] start,int[] end){
        int[] joined=new int[start.length+end.length];
        int i=0,j=0,k=0;
        while(i<start.length && j<end.length){
            if(start[i]<end[j]){
                joined[k++]=start[i++];
            }else{
                joined[k++]=end[j++];
            }
        }
        while(i<start.length){
            joined[k++]=start[i++];
        }
        while(j<end.length){
            joined[k++]=end[j++];
        }
        return joined;
    }
    public static void main(String[] args){
        int[] arr={5,9,6,4,1,3,8,2};
        int[] sorted=mergeSort(arr);
        System.out.println(Arrays.toString(sorted));

    }
}
