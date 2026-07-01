//union of two sorted arrays
//brute force approach

// import java.util.ArrayList;
// import java.util.TreeSet;

// public class union_of_two_sorted_arrays {
//     public static void main(String[] args){
//         int a[]={1,2,3,4,5};
//         int b[]={4,5,6,7,8};
//         TreeSet<Integer> set =new TreeSet<>();
//         for(int i=0;i<a.length;i++){
//             set.add(a[i]);
//         }
//         for(int i=0;i<b.length;i++){
//             set.add(b[i]);
//         }
//         ArrayList<Integer> array=new ArrayList<>(set);
//         System.out.println(array);
//     }
// }

//optimal approach

// import java.util.ArrayList;

// public class union_of_two_sorted_arrays {
//     public static void main(String[] args){
//         int a[]={1,2,3,4,5,5,5,5,5,9,10,13};
//         int b[]={4,5,6,7,11};
//         ArrayList<Integer> arr=new ArrayList<>();
//         int i=0;
//         int j=0;
//         while(i<a.length && j<b.length){
//             //same elements
//             if(a[i]==b[j]){
//                 if(arr.isEmpty() || arr.get(arr.size()-1)!=a[i]){
//                     arr.add(a[i]);
                   
//                 }
//                  i++;
//                     j++;
//             }
//             else if(a[i]<b[j]){
//                 if(arr.isEmpty() || arr.get(arr.size()-1)!=a[i]){
//                     arr.add(a[i]);
                    
//                 }
//                 i++;
//             }
//             else{
//                 if(arr.isEmpty() || arr.get(arr.size()-1)!=b[j]){
//                     arr.add(b[j]);
                    
//             }
//             j++;
//         }

        
//     }
//     while(i<a.length){
//         if(arr.isEmpty() || arr.get(arr.size()-1)!=a[i])
//                     arr.add(a[i]);
//                     i++;
                
//     }
//     while(j<b.length){
//         if(arr.isEmpty() || arr.get(arr.size()-1)!=b[j])
//                     arr.add(b[j]);
//                     j++;
            
//         }

//     System.out.println(arr);
// }
// }