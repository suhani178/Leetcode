class Solution {

    public int clumsy(int n) {

        Stack<Integer> stack = new Stack<>();
        stack.push(n);

        int op = 0;
        n--;

        while (n > 0) {

            if (op == 0) {
                // multiplication
                stack.push(stack.pop() * n);
            }
            else if (op == 1) {
                // division
                stack.push(stack.pop() / n);
            }
            else if (op == 2) {
                // addition
                stack.push(n);
            }
            else {
                // subtraction
                stack.push(-n);
            }

            op = (op + 1) % 4;
            n--;
        }

        int ans = 0;

        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }
}