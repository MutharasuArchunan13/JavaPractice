/*
 * Anagram means -> we match the two string if it's match perfectly that's angram. It's don't care about case-sencitive(i.e-> "hello" and "HeLLo")
 */
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// public class AnagramStrings {

// static boolean isAnagram(String a, String b) {
// if (a.length() != b.length())
// return false;
// a = a.toLowerCase();
// b = b.toLowerCase();
// Map<Character, Integer> val = new HashMap<>();
// for (int i = 0; i < a.length(); i++) {
// char letter = a.charAt(i);
// if (!val.containsKey(letter))
// val.put(letter, 1);

// int count = val.get(letter);

// if (val.containsKey(letter))
// val.put(letter, ++count);
// }

// for (int i = 0; i < b.length(); i++) {
// char letter = b.charAt(i);
// if (!val.containsKey(letter))
// return false;
// int count = val.get(letter);
// if (count == 0)
// return false;
// else
// val.put(letter, --count);
// }
// return true;
// }

// public static void main(String[] args) {

// Scanner scan = new Scanner(System.in);
// String a = scan.next();
// String b = scan.next();
// scan.close();
// boolean ret = isAnagram(a, b);
// System.out.println((ret) ? "Anagrams" : "Not Anagrams");
// }
// }
import java.io.*;
import java.util.*;

public class AnagramStrings {

    static boolean isAnagram(String firstWord, String secondWord) {
        char[] word1 = firstWord.toLowerCase().toCharArray();
        char[] word2 = secondWord.toLowerCase().toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        for (int index = 0; index < word1.length; index++) {
            if (word1[index] != word2[index])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        boolean ret = isAnagram(A, B);
        if (ret)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

    }
}