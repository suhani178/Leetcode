class Solution {
    public int arrayNesting(int[] nums) {

        boolean[] visited = new boolean[nums.length];
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            int count = 0;
            int current = i;

            // follow the chain
            while (!visited[current]) {

                visited[current] = true;

                current = nums[current];

                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}