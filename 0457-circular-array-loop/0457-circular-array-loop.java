class Solution {

    private int nextIndex(int[] nums, int i) {
        int n = nums.length;
        return ((i + nums[i]) % n + n) % n;
    }

    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0)
                continue;

            boolean forward = nums[i] > 0;

            int slow = i;
            int fast = i;

            while (true) {

                // move slow one step
                int nextSlow = nextIndex(nums, slow);

                if (nums[nextSlow] == 0 ||
                    (nums[nextSlow] > 0) != forward)
                    break;

                // move fast first step
                int nextFast = nextIndex(nums, fast);

                if (nums[nextFast] == 0 ||
                    (nums[nextFast] > 0) != forward)
                    break;

                // move fast second step
                nextFast = nextIndex(nums, nextFast);

                if (nums[nextFast] == 0 ||
                    (nums[nextFast] > 0) != forward)
                    break;

                slow = nextSlow;
                fast = nextFast;

                // cycle found
                if (slow == fast) {

                    // self-loop not allowed
                    if (slow == nextIndex(nums, slow))
                        break;

                    return true;
                }
            }

            // mark visited nodes as 0
            int curr = i;

            while (nums[curr] != 0 &&
                   (nums[curr] > 0) == forward) {

                int next = nextIndex(nums, curr);
                nums[curr] = 0;
                curr = next;
            }
        }

        return false;
    }
}