class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int x = 1;  // f(1)
        int y = 2; // f(2)
        
        for (int i = 3; i <= n; i++) {
            int z = x + y;
            x = y;
            y = z;
        }
        
        return y;
    }
}
