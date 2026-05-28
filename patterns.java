package Day_2;
//Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// *****
// *****
// *****
// *****
// *****
// public class patterns {
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// Pattern 2 — Right triangle stars
// *
// * *
// * * *
// * * * *
// * * * * *
// public class patterns {
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// Pattern 3 — Right triangle numbers
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// public class patterns{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Pattern 4 — Same number triangle
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
// public class patterns{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Pattern 5 — Inverted right triangle stars
// * * * * *
// * * * *
// * * *
// * *
// *
// public class patterns{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=(5-i+1);j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// Pattern 6 — Inverted number triangle
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
// public class patterns{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=(5-i+1);j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Pattern 7 — Star pyramid
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
// public class patterns{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             //space
//             for(int j=1;j<=(5-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//         }
//     }

// Pattern 8 — Inverted star pyramid
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
// public class patterns{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             //space
//             for(int j=1;j<=(i-1);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=(5-i+1);j++){
//                 System.out.print(" * ");
//             }
//         System.out.println();
//         }
//      }
//  }

// Pattern 9 — Diamond
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
// public class patterns{
//     public static void main(String[] args){
//         //upper 
//         for(int i=1;i<=5;i++){
//             //space
//             for(int j=1;j<=(5-i);j++){
//                 System.out.print(" ");
//             }
//             //star
//             for(int j=1;j<=i;j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//         //lower
//         for(int i=1;i<=4;i++){
//             //space
//             for(int j=1;j<=(i-1);j++){
//                 System.out.print(" ");
//             }
//             //star
//             for(int j=1;j<=(5-i);j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//         }
//      }

// Pattern 10 — Half diamond
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *
// public class patterns{
//     public static void main(String[] args){
//         //upper 
//         for(int i=1;i<=5;i++){
//             //space
            
//             //star
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             for(int j=1;j<=(5-i);j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//         //lower
//         for(int i=1;i<=4;i++){
//             //space
            
//             //star
//             for(int j=1;j<=(5-i);j++){
//                 System.out.print("* ");
//             }
//             for(int j=1;j<=(i-1);j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//         }
     
//  }

// Pattern 11 — Binary triangle
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
// public class patterns{
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.println("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }