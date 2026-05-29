package Day_4;
import java.util.Scanner;

// Problem 1 — Count digits in a number
// public class basic_maths {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int count=0;
//         while(num>0){
//             count=count+1;
//             num/=10;
//         }
// System.out.print(count);
//     }
// }


// Problem 2 — Reverse a number
// public class basic_maths {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int rev=0;
//         while(num>0){
//             rev=rev*10+(num%10);
//             num/=10;
//         }
// System.out.print(rev);
//     }
// }


// Problem 3 — Check palindrome number
// public class basic_maths {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int original=num;
//         int rev=0;
//         while(num>0){
//             rev=rev*10+(num%10);
//             num/=10;
//         }
// if(original==rev){
//     System.out.println("palindrome");
// }else{
//     System.out.println("not a palindrome");
// }
//     }
// }


// Problem 4 — Armstrong number->for 3 digit number
// public class basic_maths {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int original=num;
//         int sum=0;
//         while(num>0){
//             int d=num%10;
//             int newd=d*d*d;
//             sum=sum+newd;
//             num/=10;

//         }
// if(original==sum){
//     System.out.println("armstrong");
// }else{
//     System.out.println("not a armstrong");
// }
//     }
// }

//Problem 5 — Print all divisors
// public class basic_maths {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         for(int i=1;i<=num;i++){
//             if(num%i==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }


// Problem 6 — Check prime
// public class basic_maths {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();int count=0;
//         for(int i=1;i<=num;i++){
//             if(num%i==0){
//                 count+=1;
//             }
//         }
//         if(count==2){
// System.out.println("prime");
//         }
//         else{
//             System.out.println("not prime");
//         }
//     }
// }


//Problem 7 — GCD of two numbers
// public class basic_maths {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int m=sc.nextInt();
//         int n=sc.nextInt();
//         while(n!=0){
//             int r=m%n;
//             m=n;
//             n=r;
//         }
//         System.out.println(m);
//     }
// }
