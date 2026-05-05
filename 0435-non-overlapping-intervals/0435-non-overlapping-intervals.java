
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        // Step 1: Sort by end time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int count = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (start < prevEnd) {
                // Overlap → remove this interval
                count++;
            } else {
                // No overlap → update end
                prevEnd = end;
            }
        }

        return count;
    }
}