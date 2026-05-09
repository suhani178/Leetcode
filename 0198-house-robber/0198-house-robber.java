class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        int[] Tracker = new int[nums.length];
        Tracker[0] = nums[0];
        Tracker[1] = Math.max(nums[0], nums[1]);
        
        for (int i = 2; i < nums.length; ++i) {
            Tracker[i] = Math.max(nums[i] + Tracker[i - 2], Tracker[i - 1]);
        }
        
        return Tracker[nums.length - 1];
    }
}
