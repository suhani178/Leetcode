class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        // Important
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            // Convert 0 to -1
            if (nums[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }

            // Sum already seen
            if (map.containsKey(sum)) {

                int length = i - map.get(sum);

                maxLength = Math.max(maxLength, length);
            }

            // Store first occurrence only
            else {
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}