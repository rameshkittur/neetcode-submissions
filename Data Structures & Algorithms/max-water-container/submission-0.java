class Solution {
    public int maxArea(int[] heights) {

        int  mostWater = 0;

        int l =0;
        int r= heights.length-1;

        while(l<r){
            mostWater = Math.max(mostWater,(Math.min(heights[l],heights[r])*(r-l)));
            if(heights[l]<heights[r]) l++;
            else r--;
        }

        return mostWater;
        
    }
}
