/*

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

Example 5:
Input: s = "([)]"
Output: false

 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.

*/

import java.util.ArrayDeque;
import java.util.Deque;

class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        String s = "([])";
        System.out.println(solution.isValid(s)); // Output: true
    }
	public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

		Deque<Character> stack = new ArrayDeque<>();

		for (char c : s.toCharArray()) {

            if (c == '(') {
                stack.push(')');
            } 
            else if (c == '{') {
                stack.push('}');
            } 
            else if (c == '[') {
                stack.push(']');
            } 
            else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
	}
}

