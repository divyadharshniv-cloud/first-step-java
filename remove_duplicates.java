//remove duplicates inplace from sorted array

//brute force method
// import java.util.HashSet;

// public class remove_duplicates{
//     public static void main(String[] args){
//         int[] arr={1,1,2,2,3,3,3,4,4};
//         HashSet<Integer> set=new HashSet<>();
//         for(int x:arr){
//             set.add(x);
//         }
//         System.out.print(set);
//     }
// }


//optimal method
// public class remove_duplicates {
//     public static void main(String[] args){
//         int[] arr={1,1,2,2,2,3,3};
//         int i=0;
//         for(int j=1;j<arr.length;j++){
//             if(arr[j]!=arr[i]){
//                 i++;
//                 arr[i]=arr[j];
//             }
//         }
//         for(int k=0;k<=i;k++){
//             System.out.print(arr[k]+" ");
//         }
//     }}
