//brute force method
// import java.util.Arrays;
// public class largest_element{
//     public static void main(String[] args){
//         int arr[]={4,6,1,5,3,2};
//         //sorting
//         Arrays.sort(arr);
//         System.out.println("Sorted array "+Arrays.toString(arr));
//         //fetch largest element
//         int n=arr.length;
//         System.out.print("Largest element "+arr[n-1]);
//     }
// }

//optimal soln/method
// public class largest_element{
//     public static void main(String[] args){
//         int[] arr={4,6,1,5,3,2};
//         int largest=arr[0];
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]>largest){
//                 largest=arr[i];
//             }
//         }
//         System.out.print("Largest element "+largest);
//     }
// }