class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();

        if(n<1) return n;

        int l = 0;
        // int r =0;
        int[] lastSeen = new int[256];
        Arrays.fill(lastSeen, -1);
        int ans = 0;

    for (int r = 0; r < n; r++) {
        char c = s.charAt(r);
        
        // If the character was seen inside the current window
        if (lastSeen[c] >= l) {
            l = lastSeen[c] + 1;
        }
        
        lastSeen[c] = r;
        // Update ans at every step
        ans = Math.max(ans, r - l + 1);
    }

    return ans;
    }

    // dvdvf
    // i=0; j=1
    // while j<n
    // arr[i]== arr[j] length, i++

    // abcabcbb
    // 3

    // 2 for loop with set works

    // sliding window 
    // start with l =0 , r=1, save the last seen index for each char
    // if index already exis update the last seen index and lenght
}
