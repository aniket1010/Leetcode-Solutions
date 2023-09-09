class Solution {
    public int mySqrt(int x) {

        long low = 1;
        long high = x;
        long ans = 0;
        while(low<=high){

            long mid = low + (high-low)/2;
            System.out.println(mid);
            if((mid*mid)<=(long)x){
            low = mid+1;
            ans = mid;
            }
            else high = mid -1;
            
        }
        return (int)ans;
        
    }
}