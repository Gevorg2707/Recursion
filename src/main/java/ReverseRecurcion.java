import java.util.Random;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class ReverseRecurcion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input text: ");
        String text=scanner.nextLine();
        String reverseText=methodReverseString(text);
        System.out.println("reverseText = " + reverseText);
        

    }
    public static String methodReverseString(String txt){
        if (txt.length()==1) return txt;

        return methodReverseString(txt.substring(1))+txt.charAt(0);
    }
}
/*
3. Write a program to reverse String in Java using Recursion

 */