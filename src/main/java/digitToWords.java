import java.util.Scanner;

public class digitToWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input the number: ");
        int num=scanner.nextInt();
        int k=methodDigitToWords(num);
        System.out.println(k);
    }

    public static int methodDigitToWords(int number){
        int i=0;
        if(number<10){
            switch (number) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
                case 10:
                    System.out.print("zero");
                    break;
            }

        } else {
            methodDigitToWords(number/10);
            i++;
        }
                return i;
    }
}
/*
7 Write a Java program to print digitsToWords(int number) for example digitToWords(321) should print three two ones
 */