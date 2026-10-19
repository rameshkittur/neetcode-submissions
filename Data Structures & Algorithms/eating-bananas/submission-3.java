class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxElement = findMaxElement(piles);
        int l = 1;
        int r = maxElement;
        int ans = 0;

        while(l<=r){
            int mid = (l+r)/2;
            int timeTakeToComplete = timeTakenToComplete(piles, mid);

            if(timeTakeToComplete <= h){
                ans = mid;
                r = mid-1;
            } else l = mid+1;
        }

        return ans;
    }

    private int findMaxElement(int[] piles){
        int maxValue = Integer.MIN_VALUE;

        for(int i = 0; i < piles.length ; i++ ){
            if( piles[i]> maxValue ) maxValue = piles[i];
        }

        return maxValue;
    }

    private int timeTakenToComplete(int[] piles, int number){
        int timeTaken = 0;
        System.out.println("Element "+number);
        for(int i=0;i<piles.length;i++){
            timeTaken += (int)Math.ceil((double)piles[i]/number);
        }
        return timeTaken;
    }
}
