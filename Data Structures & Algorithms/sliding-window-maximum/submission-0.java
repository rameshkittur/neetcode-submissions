class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int l=0,r=0,n=nums.length;
        int [] ans = new int[n-k+1];

        // using queue so the addition and removal becoms easy from both end
        Deque<Integer> q = new LinkedList<>();

        while(r<n){
            // intution is to maintain order of q in decreasing order
            while(!q.isEmpty() && nums[q.getLast()]<nums[r]) q.removeLast();

            q.addLast(r);

            // if l is already crossed the remove left
            if(l>q.getFirst())q.removeFirst();
            
            // shift the window and store the answer
            if(r+1>=k){
                ans[l]=nums[q.getFirst()];
                l++;
            }
            r++;
        } 
        return ans;
        
    }
}
