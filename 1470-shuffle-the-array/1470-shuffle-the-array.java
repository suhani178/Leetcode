class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] ans = new int[2 * n];

        int index = 0;

        for (int i = 0; i < n; i++) {

            ans[index++] = nums[i];      // x values
            ans[index++] = nums[i + n];  // y values
        }

        return ans;
    }
}