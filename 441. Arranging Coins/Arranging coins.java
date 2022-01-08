class Solution {
    public int arrangeCoins(int n) {
        long start = 0;
        long end = n;
        
        while(start <= end) {
            long mid = start + (end-start) /2;
            long coinsSum = mid * (mid+1) /2;
            
            if (coinsSum == n) return (int)mid;
            
            if (n < coinsSum) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return (int)end;
    }
}
