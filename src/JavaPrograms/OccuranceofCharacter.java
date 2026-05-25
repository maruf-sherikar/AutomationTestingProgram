package src.JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class OccuranceofCharacter {
    public static void main(String[] args) {


        String str = "Automation";
        // str = str.toLowerCase();

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for (int i = 0; i<str.length(); i++){
            if (!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),1);
            }else {
                int count = hm.get(str.charAt(i));
                hm.put(str.charAt(i), count + 1);
            }
        }

        for (Map.Entry<Character, Integer> hm1 :hm.entrySet()){
            System.out.println(hm1.getKey() + " " + hm1.getValue()) ;
        }
    }
}
