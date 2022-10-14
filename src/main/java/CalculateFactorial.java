import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input number: ");
        int number=scanner.nextInt();
        int result=methodFactr(number);
        System.out.println("result = " + result);
    }

    public static int methodFactr(int num){
        if(num==1){
            return 1;
        }
        int res=num*methodFactr(num-1);
        return res;
    }
}
/*
1. Write a program to calculate factorial using recursion in Java

 */