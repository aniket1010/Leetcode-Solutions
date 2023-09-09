class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1000000000;
    
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(blackbox(mid, piles, h)) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }
       private boolean blackbox(int maxpiles, int[] piles, int h) {
        long hours = 0;
        for (int i : piles) hours += (int) Math.ceil((double) i / (double)maxpiles);
        return hours <= (long)h;
    }
}