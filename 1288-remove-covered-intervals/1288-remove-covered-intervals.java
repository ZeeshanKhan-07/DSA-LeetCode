class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals, (a,b) -> {
            if(a[0] == b[0]) { //if the first element is equal
                return b[1] - a[1]; //sort based on second element
            }
            return a[0] - b[0]; //sort based on first element
        });

        int removed = 0;
        int prev = 0;

        for(int i = 1; i < n; i++) {
            int cstart = intervals[i][0], cend = intervals[i][1];
            int pstart = intervals[prev][0], pend = intervals[prev][1];

            if(cstart >= pstart && cend <= pend) {
                removed++;
            } else {
                prev = i;
            }
        }

        return n - removed;
        
    }
}