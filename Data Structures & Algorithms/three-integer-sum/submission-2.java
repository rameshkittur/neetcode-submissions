class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // -4,-1,-1,0,1,2
        Set<List<Integer>> solutionSet = new HashSet<>();
        Arrays.sort(nums);

        for(int i =0; i< nums.length-2 ; i++){
            int target = nums[i];
            int l = i+1;
            int r = nums.length-1;

            while(l<r){
                if(nums[r]+nums[l] + target ==0){
                    List<Integer> resArray = Arrays.asList(nums[i],nums[l],nums[r]);
                    solutionSet.add(resArray);
                    l++;
                    r--;
                } else if(nums[l]+nums[r]> -target){
                r--;
            } else l++;
            }
        }

        return new ArrayList<>(solutionSet);
        
    }
}
