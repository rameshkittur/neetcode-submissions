class Solution {
    private int findPivot(int[] nums){
        int l=0;
        int r=nums.length-1;

        while(l<r){
            int mid = (l+r)/2;
            System.out.println("mid= "+nums[mid]+" right= "+nums[r]);
            if(nums[mid]<nums[r]) r=mid;
            else l=mid+1;
        }

        return l;
    }

    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        System.out.println("Pivot= "+pivot);
        int leftIndex = applayBinarySearch(nums,0,pivot-1,target);
        if(leftIndex!=-1) return leftIndex;
        return applayBinarySearch(nums,pivot,nums.length-1,target);
    }

    private int applayBinarySearch(int[] nums,int l,int r, int target){
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target) return mid;

            else if(nums[mid]>target) r=mid-1;

            else l=mid+1;
        }
        return -1;
    }

}
