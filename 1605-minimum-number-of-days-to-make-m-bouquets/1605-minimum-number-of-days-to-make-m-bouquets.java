class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>(long)bloomDay.length)return -1;
        int low = 0;
        int high = -1;
        for(int i:bloomDay)high=Math.max(high,i);
        int totalFlowers = m*k;

        while(low<=high){
            int mid = low +(high - low)/2;
            if(isTrue(mid,bloomDay,m,k)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }
    private boolean isTrue(int mid , int[]arr , int bouqets , int flowers){
        int f = 0;
        int b = 0;
        for(int num : arr){
            if(num<=mid)f++;
            else f=0;
            if(f==flowers){
                b++;
                f=0;
            }
        }
        return b>=bouqets;
    }
}