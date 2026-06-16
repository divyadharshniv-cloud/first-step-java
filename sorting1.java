//bubble sort
// import java.util.Scanner;
// public class sorting1 {
//     public static void main(String[] args){
//         int arr[]={2,4,1,5,3};
//         //bubble sort 
//         int n=arr.length;
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         for(int i=0;i<=n-1;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

//selection sort
// public class sorting1{
//     public static void main(String[] args){
//         int arr[]={5,3,8,1,2};
//         int n=arr.length;
//         for(int i=0;i<n-1;i++){
//             int min=i;
//             for(int j=i+1;j<n;j++){
//                 if(arr[j]<arr[min]){
//                     min=j;
//                 }
//             }
//             //swap
//             int temp=arr[i];
//              arr[i]=arr[min];
//             arr[min]=temp;

//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

//insertion sort
// public class sorting1{
//     public static void main(String[] args){
//         int arr[]={5,3,8,1,2};
//         int n=arr.length;
//         for(int i=1;i<n;i++){
//             for(int j=i;j>0;j--){
//                 if(arr[j]<arr[j-1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j-1];
//                     arr[j-1]=temp;
//                 }else{
//                     break;
//                 }
//             }
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }