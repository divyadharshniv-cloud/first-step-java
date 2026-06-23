import java.util.Arrays;
public class move_zeros_to_end {
    public static void main(String[] args){
        int[] arr={1,0,0,3,4,5,0,9,6};
        int n=arr.length;
        int[] temp=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++; 
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
