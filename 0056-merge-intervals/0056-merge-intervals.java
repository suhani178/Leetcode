
class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        ArrayList<int[]> mergeInterval = new ArrayList<>();

        int CurrentStart = intervals[0][0];
        int CurrentEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; ++i) {
            int NextStart = intervals[i][0];
            int NextEnd = intervals[i][1];

            if (CurrentEnd >= NextStart) {
                CurrentEnd = Math.max(CurrentEnd, NextEnd);
            } else {
                mergeInterval.add(new int[]{CurrentStart, CurrentEnd});
                CurrentStart = NextStart;
                CurrentEnd = NextEnd;
            }
        }

        // Add last interval
        mergeInterval.add(new int[]{CurrentStart, CurrentEnd});

        return mergeInterval.toArray(new int[mergeInterval.size()][]);
    }
}