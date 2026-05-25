package src.JavaPrograms;

import java.util.Arrays;

public class largetnumberinArray {

    public static void main(String[] args) {



        int arr[] = {10,202,14,15,85};

        int max = arr[0];

        for (int i = 1; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println(max);

        // Second Largest
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
