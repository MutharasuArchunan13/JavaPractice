/*
 * You got String is s and also k integer value. then you divide the s as substrings based on k value, then check each substring which one is smallest and largest 
 * based on lexigracphically.
 */

import java.util.Scanner;

public class SubString {

    public static void main(String arg[]) {
        Scanner inputs = new Scanner(System.in);
        String s = inputs.next();
        int k = inputs.nextInt();
        System.out.println(subStrings(s, k));
    }

    private static String subStrings(String s, int k) {
        // compareTo function used for string comparision
        // for checking to take first substring lowest and highest
        String lowest = s.substring(0, k);
        String highest = s.substring(0, k);
        // to compare each substring lowest and highest
        for (int i = 1; i < s.length() - k + 1; i++) // if length k= 3 we don't go to last two character because we want
                                                     // three charater substring
        {
            // if compareTo return lessthan 0 the argument graterthan substring so change
            // lowest value
            lowest = s.substring(i, k + i).compareTo(lowest) < 0 ? s.substring(i, k + i) : lowest;
            // if compareTo return greaterthan 0 the argument lessthan substring so change
            // highest value
            highest = s.substring(i, i + k).compareTo(highest) > 0 ? s.substring(i, k + i) : highest;
        }
        return lowest + "\n" + highest;
    }
}