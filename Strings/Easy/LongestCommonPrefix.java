/*

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".


Example 1

Input : str = ["flowers" , "flow" , "fly", "flight" ]
Output : "fl"

Explanation :
All strings given in array contains common prefix "fl".

Example 2

Input : str = ["dog" , "cat" , "animal", "monkey" ]
Output : ""

Explanation :
There is no common prefix among the given strings in array.

*/



public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] arr = {"flowers", "flow", "fly", "flight"};

        String word = arr[0];
        StringBuilder answer = new StringBuilder();

        // Find the shortest string
        for (String element : arr) {
            if (word.length() > element.length()) {
                word = element;
            }
        }

        for (int i = 0; i < word.length(); i++) {

            int ref = 0;

            for (String element : arr) {
                if (word.charAt(i) != element.charAt(i)) {
                    ref--;
                } else {
                    ref++;
                }
            }

            if (ref == arr.length) {
                answer.append(word.charAt(i));
            } else {
                break;
            }
        }

        System.out.println(answer);
    }
}