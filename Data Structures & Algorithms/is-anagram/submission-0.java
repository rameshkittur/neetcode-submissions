class Solution {
    public boolean isAnagram(String s, String t) {
        int[]count1 = new int[26];
        int[]count2 = new int[26];

        for(char c: s.toCharArray()){
            count1[c-'a']++;
        }

        for(char c: t.toCharArray()){
            count2[c-'a']++;
        }

        return Arrays.toString(count2).equals(Arrays.toString(count1));
    }
}
