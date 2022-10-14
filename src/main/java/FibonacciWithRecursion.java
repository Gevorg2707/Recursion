import java.util.Scanner;

public class FibonacciWithRecursion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input number: ");
        long number=scanner.nextLong();
        for (long i = 0; i < number; i++) {
            System.out.print(methodFibonachi(i)+" ");
        }
    }
    public static long methodFibonachi(long num){
        if(num==0) {
            return num;
        }
        if (num==1||num==2){
            return 1;
        }
        return methodFibonachi(num-1)+methodFibonachi(num-2);
    }
}
/*
2. Write a program to Print Fibonacci Series in Java using Recursion
 */