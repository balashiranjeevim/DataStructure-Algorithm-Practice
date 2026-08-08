/*
 
Isomorphic String

Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while 
preserving the order of characters. No two characters may map to the same character, 
but a character may map to itself.


Example 1
Input : s = "egg" , t = "add"
Output : true

Explanation :
The 'e' in string s can be replaced with 'a' of string t.
The 'g' in string s can be replaced with 'd' of t.
Hence all characters in s can be replaced to get t.

Example 2

Input : s = "apple" , t = "bbnbm"
Output : false

Explanation :

Strings are matched index by index.
At index 0, 'a' maps to 'b'.
At index 1, 'p' also maps to 'b'.
This is invalid because two different characters (a and p) cannot map to the same character (b) in a one-to-one mapping.
Therefore, no valid mapping exists and the output is false.

 */


import java.util.*;

public class isIsomorphicString {

    public static void main(String[] args) {

        String s = "aabcc";
        String t = "xxzyy";

        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {

            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);

            if (map1.containsKey(c1)) {

                if (map1.get(c1) != c2) {
                    return false;
                }

            } else {
                map1.put(c1, c2);
            }

            if (map2.containsKey(c2)) {

                if (map2.get(c2) != c1) {
                    return false;
                }

            } else {
                map2.put(c2, c1);
            }
        }

        return true;
    }
}