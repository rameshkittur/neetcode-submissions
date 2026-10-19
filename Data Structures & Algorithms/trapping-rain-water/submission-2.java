class Solution {
    public int trap(int[] height) {
        int n = height.length;
        //1. approach using prefix array
        // int[] leftMax = new int[n];
        // int[] rightMax = new int[n];

        // leftMax[0] = height[0];
        // rightMax[n-1] = height[n-1];
        // for(int i=1;i<n;i++){
        //     leftMax[i]=Math.max(leftMax[i-1],height[i]);
        //     rightMax[n-i-1]=Math.max(rightMax[n-i],height[n-i-1]);
        // }
        // // rightMax[0]= Math.max(rightMax[1],height[0]);

        // int soln =0 ;
        // for(int i=0;i<n;i++){
        //     soln+=Math.min(leftMax[i],rightMax[i])-height[i];
        // } 

        // return soln;
        //height     = 0,2,0,3,1,0,1,3,2,1
        // left max  = 0,2,2,3,3,3,3,3,3,3
        // right max = 3,3,3,3,3,3,3,3,2,1
        //capacity   = 0,0,2,0,2,3,2,0,0,0
        // total = 9

        //2. approach using 2 pointers
        int l = 0;
        int r = n-1;
        int res =0;
        int leftMax = height[l],rightMax = height[r];
        while(l<r){
            if(leftMax<rightMax){
                l++;
                leftMax = Math.max(leftMax,height[l]);
                res+=leftMax-height[l];
            } else{
                r--;
                rightMax = Math.max(rightMax,height[r]);
                res+=rightMax-height[r];
            }
        }
        return res;

    }
}
