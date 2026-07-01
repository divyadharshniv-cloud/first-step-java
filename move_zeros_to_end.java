//move zeros to end 
//brute force method
// import java.util.Arrays;
// public class move_zeros_to_end {
//     public static void main(String[] args){
//         int[] arr={1,0,0,3,4,5,0,9,6};
//         int n=arr.length;
//         int[] temp=new int[n];
//         int j=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]!=0){
//                 temp[j]=arr[i];
//                 j++; 
//             }
//         }
//         System.out.println(Arrays.toString(temp));
//     }
// }

//optimal approach
// import java.util.Arrays;
// public class move_zeros_to_end{
//     public static void main(String[] args){
//         int[] arr={1,0,2,8,0,6,4,4};
//         int j=-1;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==0){
//                 j=i;
//                 break;
//             }
//         }
//         for(int i=j+1;i<arr.length;i++){
//             if(arr[i]!=0){
//                 int temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//                 j++;
//             }
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }