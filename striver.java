//input and output
// import java.util.Scanner;
// public class striver {
//     public static printNumber(Scanner sc){
//         int n=sc.nextInt();
//         System.out.println(n);
//     }
// }

//if elseif
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int mark=sc.nextInt();
//         if(mark>=90){
//             System.out.println("A");
//         }else if(mark>=70){
//             System.out.println("B");
//         }else if(mark>=50){
//             System.out.println("C");
//         }else if(mark>=35){
//             System.out.println("D");
//         }else{
//             System.out.println("FAil");
//         }
//     }
// }

//days of the week using switch
// import java.util.Scanner;
// public class switch_cases {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int no=sc.nextInt();
//         switch(no){
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.print("invalid");
//         }
//     }
// }

//Given two integers low and high, return the sum of all integers from low to high inclusive.
// import java.util.Scanner;
// public class Main {
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         int low=sc.nextInt();
//         int high=sc.nextInt();
//         int sum=0;
//         for(int i=low;i<=high;i++){
//             sum+=i;
//         }
//         System.out.print(sum);
//     }
    
// }

//Given a digit d (0 to 9), find the sum of the first 50 positive integers (integers > 0) that end with digit d.
// import java.util.Scanner;
// public class Main {
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum=0;
//         int i=1;
//         int count=0;
//         while(count<50){
//             if(i%10==n){
//                 sum+=i;
//                  count+=1;
//             }
//             i+=1;
           
//         }
//         System.out.print(sum);
//     }
// }

//Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.
// import java.util.Scanner;
// public class Main {
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for (int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int left=0;
//         int right=n-1;
//         while(left<right){
//             int temp=arr[left];
//             arr[left]=arr[right];
//             arr[right]=temp;
//             left++;
//             right--;
//         }
//         for (int i=0;i<n;i++){
//             System.out.println(arr[i]);
//         }
       
//     }
// }