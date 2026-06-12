package src.JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class removeDuplicateCharacter {
    public static void main(String[] args) {

        String x  = "Programming";

        String result = "";

        for (int i = 0; i<x.length(); i++){

            if (result.indexOf(x.charAt(i))==-1){
                result = result + x.charAt(i);

            }
        }
        System.out.println(result);


    }
}
