class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int index = 0;
        
        // Add all intervals before the new interval
        while (index < intervals.length && intervals[index][1] < newInterval[0]) {
            result.add(intervals[index]);
            index++;
        }
        
        // Merge overlapping intervals with the new interval
        while (index < intervals.length && intervals[index][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[index][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[index][1]);
            index++;
        }
        result.add(newInterval);
        
        // Add all remaining intervals
        while (index < intervals.length) {
            result.add(intervals[index]);
            index++;
        }
        
        return result.toArray(new int[result.size()][]);
    } 
    }
