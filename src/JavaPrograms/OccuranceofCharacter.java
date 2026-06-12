package src.JavaPrograms;

import java.util.HashMap;
import java.util.Map;

//import static src.oops_concept_11_07.innerclass.OOC.o;

public class OccuranceofCharacter {
//    public static void main(String[] args) {
//
//
//        String str = "Automation";
//        // str = str.toLowerCase();
//
//        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
//
//        for (int i = 0; i<str.length(); i++){
//            if (!hm.containsKey(str.charAt(i))){
//                hm.put(str.charAt(i),1);
//            }else {
//                int count = hm.get(str.charAt(i));
//                hm.put(str.charAt(i), count + 1);
//            }
//        }
//
//        for (Map.Entry<Character, Integer> hm1 :hm.entrySet()){
//            System.out.println(hm1.getKey() + " " + hm1.getValue()) ;
//        }
//    }
//
//
//
//}

//public static void main(String[] args) {
//
//
//    String x = "MarufSherikar";
//
//    x = x.toUpperCase();
//
//    HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
//
//    for (int i = 0; i < x.length(); i++) {
//        if (!hm.containsKey(x.charAt(i))) {
//            hm.put(x.charAt(i), 1);
//        } else {
//
//            int count = hm.get(x.charAt(i));
//            hm.put(x.charAt(i), count + 1);
//        }
//    }
//
//    for (Map.Entry<Character, Integer> hm1 : hm.entrySet()) {
//        System.out.println(hm1.getKey() + " " + hm1.getValue());
//    }


    public static void main(String[] args) {

        String x = "India is my country".replace(" ", "");

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for (int i = 0; i<x.length(); i++){
            if (!hm.containsKey(x.charAt(i))){
                hm.put(x.charAt(i), 1);
            }else {
                int count = hm.get(x.charAt(i));
                hm.put(x.charAt(i), count + 1);
            }
        }

        for (Map.Entry<Character, Integer> hm1 : hm.entrySet()){
            System.out.println(hm1.getKey() + " " + hm1.getValue());
        }

}

}
