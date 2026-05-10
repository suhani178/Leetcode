class Solution {

    public int[] beautifulArray(int n) {
        List<Integer> result = helper(n);

        int[] ans = new int[n];

        for(int i = 0; i < n; i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }

    private List<Integer> helper(int n) {

        List<Integer> res = new ArrayList<>();

        if(n == 1) {
            res.add(1);
            return res;
        }

        // Odd part
        List<Integer> odd = helper((n + 1) / 2);
        for(int x : odd) {
            res.add(2 * x - 1);
        }

        // Even part
        List<Integer> even = helper(n / 2);
        for(int x : even) {
            res.add(2 * x);
        }

        return res;
    }
}