class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0;
        int res = 0;
        
        int maxFreq = 0 ;
        int[] freq = new int[26];
        
        while(r<s.length()){
            freq[s.charAt(r)-'A']++;
            
            maxFreq = Math.max(freq[s.charAt(r)-'A'],maxFreq);
            
            if(((r-l+1)-maxFreq)>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            
            res=Math.max((r-l+1),res);
            r++;
        }
        return res;
        
    }
}
