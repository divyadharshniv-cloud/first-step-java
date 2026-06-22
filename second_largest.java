//brute force method
// import java.util.Arrays;
// public class second_largest {
//     public static void main(String[] args){
//         int[] arr={4,5,3,1,5,5,2};
//         Arrays.sort(arr);
//         int largest=arr[arr.length-1];
//         int slargest=0;
//         System.out.println("largest "+ largest);
//         for(int i=arr.length-2;i>=0;i--){
//             if(arr[i]!=largest){
//              slargest=arr[i];
//                 break;
//             }
//         }
// System.out.print("Second largest element: "+slargest);
//     }
// }

//better approach
// public class second_largest{
//     public static void main(String[] args){
//     int [] arr={1,7,8,7,5,4,4,7};
//     int largest=arr[0];
//     for(int i=1;i<arr.length;i++){
//         if(arr[i]>largest){
//             largest=arr[i];
//         }
//     }
//     int slargest=-1;
//     for(int i=0;i<arr.length;i++){
//         if(arr[i]>slargest && arr[i]!=largest){
//             slargest=arr[i];
//         }
//     }
//     System.out.println("largest: "+largest);
//     System.out.println("second largest: "+slargest);
//     }
// }

//optimal approach
// public class second_largest{
//     public static void main(String[] args){
//         int []arr={1,5,3,6,3,5,66,77,6};
//         int largest=arr[0];
//         int slargest=-1;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>largest){
//                 slargest=largest;
//                 largest=arr[i];
//             }else if(arr[i]<largest && arr[i]>slargest){
//                 slargest=arr[i];
//             }
//         }
//         System.out.println("largest: "+largest);
//         System.out.println("second largest: "+slargest);
//     }
// }