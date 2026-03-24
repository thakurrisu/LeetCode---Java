class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals , (a,b)->Integer.compare(a[1],b[1]));
        List<int[]> accepted = new ArrayList<>();
        accepted.add(intervals[0]);
        for(int i = 1; i<intervals.length; i++){
            if(accepted.get(accepted.size()-1)[1]<= intervals[i][0]){
                accepted.add(intervals[i]);
            }
        }
        return intervals.length - accepted.size();
    }
}