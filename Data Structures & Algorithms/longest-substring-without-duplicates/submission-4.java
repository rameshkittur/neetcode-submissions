class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1)return s.length();

        Set<Character> set = new HashSet<>();
        int ans = 0;
        int n = s.length();

        for(int i=0;i<n-1;i++){
            set.add(s.charAt(i));
            for(int j=i+1;j<n;j++){
            if(set.contains(s.charAt(j))){
                ans = Math.max(ans,set.size());
                set.clear();
                break;
            }
            set.add(s.charAt(j));
         }
        }
        ans = Math.max(ans,set.size());
        return ans;

    }

    // dvdvf
    // i=0; j=1
    // while j<n
    // arr[i]== arr[j] length, i++

    // abcabcbb
    // 3
}
