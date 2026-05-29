// Pattern 12 — Number crown
// 1            1
// 1 2        2 1
// 1 2 3    3 2 1
// 1 2 3 4 4 3 2 1
// import java.util.Scanner;
// public class patterns_12_22 {
//     public static void main(String[] args){
//         for(int i=1;i<=4;i++){
//             //pattern
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             //space
//             for(int j=1;j<=(2*(4-i));j++){
//                 System.out.print("  ");
//             }
//             //pattern
//             for(int j=i;j>=1;j--){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Pattern 13 — Continuous numbers
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// import java.util.Scanner;
// public class patterns_12_22 {
//     public static void main(String[] args){
//         int num=1;
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(num++ +" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Pattern 14 — Letter triangle
// A
// A B
// A B C
// A B C D
// A B C D E
// import java.util.Scanner;
// public class patterns_12_22 {
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print((char)('A'+j)+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// Pattern 15 — Inverted letter triangle
// A B C D E
// A B C D
// A B C
// A B
// A
// import java.util.Scanner;
// public class patterns_12_22 {
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=0;j<(5-i+1);j++){
//                 System.out.print((char)('A'+j)+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// Pattern 16 — Same letter each row
// A
// B B
// C C C
// D D D D
// E E E E E
// import java.util.Scanner;
// public class patterns_12_22 {
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print((char)('A'+i-1)+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// Pattern 17 — Letter pyramid
//     A
//    A B
//   A B C
//  A B C D
// A B C D E
// import java.util.Scanner;
// public class patterns_12_22 {
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             //space
//             for(int j=1;j<=5-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<i;j++){
//                 System.out.print((char)('A'+j)+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// Pattern 18 — Reverse letter triangle
// E
// E D
// E D C
// E D C B
// E D C B A
// import java.util.Scanner;
// public class patterns_12_22 {
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print((char)('E'-j)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Pattern 20 — Hollow rectangle
// * * * * *
// *       *
// *       *
// *       *
// * * * * *
// import java.util.Scanner;
// public class patterns_12_22 {
//     public static void main(String[] args){
//        for(int i=1;i<=5;i++){
//               for(int j=1;j<=5;j++){
//             if(i==1 || i==5 || j==1 || j==5){
//                 System.out.print("* ");
//             }else{
//                 System.out.print("  ");
//             }
//         }
//         System.out.println();
//     }}
// }

