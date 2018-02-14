package model;

import java.util.Arrays;

public class CountText {
    public static void main(String[] args) {
        String sentence2 = "Hello WorLd";
        char[] char4count2 = {'H', 'e', 'l', 'o', 'W'};
        System.out.println(Arrays.toString(countCharInText(sentence2, char4count2)));   //Example
    }
    
    
    public static int[] countCharInText(String text, char[] givenChars) {
        int[] result = new int[givenChars.length];      //Create variables that will return at ends
        int countText = text.length();                  //Count length of String Text
        for(int i=0;i<result.length;i++){               //Loop for char Array Ex. [o] is h
            for(int j=0;j<countText;j++){               //Loop text for check each letter in text
                if((""+text.charAt(j)).equalsIgnoreCase(""+givenChars[i])){ //If letter in text equal char in Array
                    result[i]++;                        // Count index of Result++
                }
            }
        }
        return result;
    }
}
