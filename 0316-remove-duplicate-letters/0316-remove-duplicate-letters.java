import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        // Step 1: Count frequency
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Step 2: Stack + visited set
        Stack<Character> stack = new Stack<>();
        Set<Character> visited = new HashSet<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.get(c) - 1); // decrease remaining count

            if (visited.contains(c)) continue;

            while (!stack.isEmpty() && c < stack.peek() && freq.get(stack.peek()) > 0) {
                visited.remove(stack.pop());
            }

            stack.push(c);
            visited.add(c);
        }

        // Step 3: Build result
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}
