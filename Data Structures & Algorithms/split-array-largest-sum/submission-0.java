class Solution {
    public int splitArray(int[] nums, int k) {
        return shipWithinDays(nums, k);
    }

        public int shipWithinDays(int[] weights, int days) {
        int minWeight = findMaxElement(weights);
        int maxCapacity = sumOfAllElement(weights);
        int minCapacity = 0;

        while(minWeight<=maxCapacity){
            int mid = (minWeight+maxCapacity)/2;
            int numberOfDays = findNumberOfdaysWithGivenCapacity(weights, mid);

            if(numberOfDays<=days){
                minCapacity = mid;
                maxCapacity = mid-1;
            } else minWeight = mid+1;
        }

        return minCapacity;
        
    }

    private int findMaxElement(int[] weights){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<weights.length;i++){
            if(weights[i]>max) max = weights[i];
        }

        return max;
    }

    private int sumOfAllElement(int[] weights){
        int sum = 0;

        for(int i=0;i<weights.length;i++) sum+=weights[i];

        return sum;
    }

    private int findNumberOfdaysWithGivenCapacity(int[] weights,int mid){
        int days = 1;
        int cap = 0;

        for(int i=0;i<weights.length;i++){
            if((cap+weights[i])>mid){
                days+=1;
                cap = weights[i];
            } else {
                cap+=weights[i];
            }
        }

        return days;
    }
}