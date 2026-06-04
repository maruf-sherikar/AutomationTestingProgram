package src.JavaPrograms;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

//        String x = "Maruf";
//        String y = "";
//
//
//        for (int i = x.length()-1;i>=0; i--){
//            y = y + x.charAt(i);
//
//        }
//
//        System.out.println(y);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");

        String x = sc.nextLine();
        String y = "";


        for (int i = x.length()-1;i>=0; i--){
            y = y + x.charAt(i);
        }

        if (x.equals(y)){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is not Palindrome");
        }

        System.out.println(y);

    }
}
