package src.JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class removeDuplicateCharacter {
    public static void main(String[] args) {

        String x  = "Programming";

        String re = "";

        for (int i = 0; i<x.length(); i++){

            if (re.indexOf(x.charAt(i))==-1){
                re = re + x.charAt(i);

            }
        }
        System.out.println(re);


    }
}
