class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int e = nums.length-1;
        int mid=0;

        if(target < nums[l]) return 0;

        else if (target > nums[e]) return e+1;
        else {
            while(l<=e){
                mid = (l+e)/2;
                if(nums[mid]==target) return mid;

                else if(target<nums[mid]){
                    e = e-1;
                }

                else{
                    l = l+1;
                }
            }
        }
        return mid;
    }
}