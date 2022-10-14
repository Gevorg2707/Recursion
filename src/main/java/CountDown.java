import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input the number: ");
        int num=scanner.nextInt();
        methodCountDown(num);
    }
    public static void methodCountDown(int num){
        if(num==1) {
            System.out.print(num);
        } else if(num<=0) {
            return;
        } else {
            System.out.print(num + " ");
            methodCountDown(num - 1);
        }

    }
}
/*
4. Write a countDown(int number) method
in Java using Recursion which prints
countdown till zero to console,
 like count(3) should print 3 2 1 0
 */