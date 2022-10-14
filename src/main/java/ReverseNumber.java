import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Inout the number: ");
        int num=scanner.nextInt();
        methodReverseNumber(num);

    }
    public static void methodReverseNumber(int num){
        int i=0;
        if (num%10==num){
            System.out.println(num);;
            return;
        } else {
            System.out.print(num%10);
            methodReverseNumber(num/10);

        }

    }
}
/*
6. Program to reverse a number using Recursion in Java
 */