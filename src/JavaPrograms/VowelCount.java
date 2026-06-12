package src.JavaPrograms;

import java.util.Scanner;

public class VowelCount {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string or value");
//        String x = sc.nextLine();
//
//        x = x.toLowerCase();
//        int count = 0;
//
//        for (int i = 0; i<x.length(); i++){
//            Character c = x.charAt(i);
//
//            c =  Character.toLowerCase(c);
//
//            if (c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u'){
//                count = count + 1;
//
//            }
//        }
//
//        System.out.println("Number of Vowels present in String is " + count);


        String x = "maruf";

        int count = 0;

        for (int i = 0; i<x.length(); i++){
            char c = x.charAt(i);

            if (c=='a' || c=='e' || c=='u'){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
