//intersection of two sorted arrays
//brute force approach
// import java.util.ArrayList;
// public class intersection_of_two_sorted_arrays {
//     public static void main(String[] args){
//         int[] a={1,2,3,4,4,5};
//         int[] b={2,3,4,5,5,6,7,8,9};
//         ArrayList<Integer> arr=new ArrayList<>();
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<b.length;j++){
//                 if(a[i]==b[j]){
//                     arr.add(a[i]);
//                 }
//             }
//         }
//     }
// }

//optimal approach

// import java.util.ArrayList;
// public class intersection_of_two_sorted_arrays {
//     public static void main(String[] args){
//         int[] a={1,2,3,4,4,5};
//         int[] b={2,3,4,5,5,6,7,8,9};
//         ArrayList<Integer> arr=new ArrayList<>();
//         int i=0;
//         int j=0;
//         while(i<a.length && j<b.length){
//             if(a[i]==b[j]){
//                 if(arr.isEmpty() || arr.get(arr.size()-1)!=a[i]){
//                 arr.add(a[i]);
//             }
//         i++;
//     j++;
// }
// else if(a[i]<b[j]){
//     i++;
// }
// else{
//     j++;
// }
//         }
// System.out.println(arr);
//     }
// }