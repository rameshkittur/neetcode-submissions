class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int overall = 1;
        for(int num:nums){
            if(num!=0) overall*=num ;
            else zeroCount++; 
        }
        int[] sol = new int[nums.length]; 
        if(zeroCount>1)
            return new int[nums.length];
        else {
            for(int i=0;i<nums.length;i++){
                if(zeroCount==1 && nums[i]==0)
                sol[i] = overall;

                else if(zeroCount==1 && nums[i]!=0)
                sol[i]=0;

                else 
                sol[i]=overall/nums[i];
            }
        }

        return sol;

    }
}  
