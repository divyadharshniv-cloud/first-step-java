//left rotate array by one place

// import java.util.Arrays;
// public class left_rotate {
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5};
//         int temp=arr[0];
//         for(int i=1;i<arr.length;i++){
//             arr[i-1]=arr[i];
//         }
//         arr[arr.length-1]=temp;
//         System.out.print(Arrays.toString(arr));
//     }
// }

//left rotate array by d places
//brute force approach

// import java.util.Scanner;
// import java.util.Arrays;
// public class left_rotate{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int[] arr={1,2,3,4,5,6,7};
//         int n=arr.length;
//         int d=3;
//         d=d%n;
//         int [] temp=new int[d];
//         //add elements to temp variable
//         for(int i=0;i<d;i++){
//             temp[i]=arr[i];
//         }
//         //shifting of element
//         for(int i=d;i<n;i++){
//             arr[i-d]=arr[i];
//         }
//         //add temp elements to array
//         for(int i=0;i<d;i++){
//             arr[n-d+i]=temp[i];
//         }
// System.out.println(Arrays.toString(arr));

//     }
// }

//optimal soln
// import java.util.Arrays;
// public class left_rotate{
//     public static void reverse(int[]arr,int left,int right){
//         while(left<right){
//             int temp=arr[left];
//             arr[left]=arr[right];
//             arr[right]=temp;
//             left++;
//             right--;
//         }
//     }
//     public static void main(String[] args){
//         int []arr={1,2,3,4,5,6,7};
//         int n=arr.length;
//         int d=3;
//         d=d%n;
//         reverse(arr,0,d-1);
//         reverse(arr,d,n-1);
//         reverse(arr,0,n-1);
// System.out.print(Arrays.toString(arr));
//     }
// }