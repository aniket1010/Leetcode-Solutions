class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(r1,r2)->r1[0]-r2[0]);

        List <int[]> ans = new ArrayList<>();

        int low = intervals[0][0];
        int high = intervals[0][1];
        int n = intervals.length;

        for(int i=1;i<n;i++){
            if(intervals[i][0]<=high){
                high=Math.max(intervals[i][1],high);
            }else{
                ans.add(new int[]{low,high});
                low=intervals[i][0];
               high=Math.max(intervals[i][1],high);
            }
        }
        ans.add(new int[]{low,high});
        return ans.toArray(new int[ans.size()][]);
        
    }
}