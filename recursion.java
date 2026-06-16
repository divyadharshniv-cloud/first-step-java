// Problem — Print 1 to N using recursion
// import java.util.Scanner;
// public class recursion{
//     static void print(int i,int n){
//         if(i>n){
//             return;
//         }
//         System.out.print(i);
//         print(i+1,n);
//     }

//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         print(1,n);
//     }
// }

// Problem — Print N to 1 using recursion
// import java.util.Scanner;
// public class recursion{
//     static void print(int n){
//         if(n<1){
//             return;
//         }
//         System.out.print(n+" ");
//         print(n-1);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         print(n);
//     }
// }

//Problem  — Sum of first N numbers
// import java.util.Scanner;
// public class recursion{
//     static int sum(int n){
//         if(n==0)return 0 ;
//         return n+sum(n-1);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.print(sum(n));
//     }
// }

// Problem  — Factorial of N
// import java.util.Scanner;
// public class Main{
//     static int fact(int n){
//         if(n==0)return 1 ;
//         return n*fact(n-1);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.print(fact(n));
//     }
// }

// Problem 5 — Fibonacci series
// import java.util.Scanner;
// public class Main{
//     static int fib(int n){
//         if(n<=1)return n ;
//         return fib(n-2)+fib(n-1);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.print(fib(n));
//     }
// }