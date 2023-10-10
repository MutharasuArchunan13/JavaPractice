/*
   we are providing two two Strings A and B.
   (1) -> To find the total length of two stings
   (2) -> To compare the first character of each string (lexicographically), if A String character is 'A' and B string character is 'B' in alphabetical order 'A' came first then 'B' come. this structured follow two string first two letters to print "No" else print "Yes".
   (3) -> make both String first letter as captical then print same line inbetween single space
 */

import java.util.Scanner;

public class StringProblem {
  public static void main(String arg[]) {
    // receive the Two Strings
    Scanner inputs = new Scanner(System.in);
    String A = inputs.next();
    String B = inputs.next();

    // print the total length
    int totalLenth = A.length() + B.length();
    System.out.println(totalLenth);

    // seperate the first character on each strings use charAt()
    char a = A.charAt(0);
    char b = B.charAt(0);
    // compare the two characters
    if (a <= b)
      System.out.println("No");
    else
      System.out.println("Yes");

    // change the first character as capital use to uppercase method
    /*
     * int aa = (int) a - 32; // because the difference is capital to small 32
     * int bb = (int) b - 32;
     * a = (char) aa;
     * b = (char) bb;
     * String newA = String.valueOf(a);
     * String newB = String.valueOf(b);
     * int i = 1;
     * while (i < A.length() || i < B.length()) {
     * if (i < A.length())
     * newA += A.charAt(i);
     * if (i < B.length())
     * newB += B.charAt(i);
     * i++;
     * }
     * System.out.println(newA + " " + newB);
     */

    String newA = "" + Character.toUpperCase(a) + A.substring(1);
    String newB = "" + Character.toUpperCase(b) + B.substring(1);
    System.out.println(newA + " " + newB);

  }
}