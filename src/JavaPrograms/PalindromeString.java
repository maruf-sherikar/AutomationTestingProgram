package src.JavaPrograms;

public class PalindromeString {
    public static void main(String[] args) {

        String x = "INDIA";
        String y = "";

        for (int i = x.length()-1; i>=0; i--){
            y = y + x.charAt(i);

        }
        if (x.equals(y)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }




    }
}
