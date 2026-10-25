class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        while(l<=r){
            int mid = (l+r)/2;

            if(nums[mid]==target) return true;

            // discard the elements if all the 3(left,right,mid) are equal
            if(nums[mid]==nums[r] && nums[mid]==nums[l]){
                l=l+1;
                r=r-1;
                continue; 
            }
            // at a given point for the mid in the sorted rotated array
            // either left part is sorted 
            // or right part is sorted

            // left part is sorted
            if(nums[l]<=nums[mid]){
                if(nums[l]<=target && nums[mid]>=target)
                    r=mid-1;
                else l=mid+1;    
            }
            // right part is sorted
            else {
                if(nums[mid]<=target && nums[r]>=target) 
                    l=mid+1;
                else 
                    r=mid-1;    
            }
        }
        return false;
    }
    
}