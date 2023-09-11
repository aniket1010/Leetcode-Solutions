class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int num : weights){
            high +=num;
            low=Math.max(low,num);
        }
     
        while(low<=high){

            int mid = low + (high - low)/2;
            if(blackBox(weights,days,mid)==true)high=mid-1;
            else low = mid+1;

        }
        return low;
        
    }

    public boolean blackBox(int[]weights,int days,int capacity ){

        int load = 0;
        int d=1;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>capacity)return false;
           if(load+weights[i]>capacity){
               d++;
               load=weights[i];
           }else{
               load+=weights[i];
           }
        }
        return d<=days;
    }
}