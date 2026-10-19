class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] s1Freq = new int[26];
        int [] s2Freq = new int[26];
        if(s1.length()>s2.length())return false;

        for(int i=0;i<s1.length();i++){
            s1Freq[s1.charAt(i)-'a']++;
            s2Freq[s2.charAt(i)-'a']++;
        }

        int matches=0;
        for(int i=0;i<26;i++){
            if(s1Freq[i]==s2Freq[i]) matches++;
        }

        int l = 0;
        for(int r = s1.length();r<s2.length();r++){
            // System.out.println(matches);
            if(matches==26) return true;

            s2Freq[s2.charAt(r)-'a']++;
            if(s2Freq[s2.charAt(r)-'a']==s1Freq[s2.charAt(r)-'a']) matches++;
            else if(s1Freq[s2.charAt(r)-'a']+1 == s2Freq[s2.charAt(r)-'a']) matches--;

            s2Freq[s2.charAt(l)-'a']--;
            if(s2Freq[s2.charAt(l)-'a']==s1Freq[s2.charAt(l)-'a']) matches++;
            else if(s1Freq[s2.charAt(l)-'a']-1 == s2Freq[s2.charAt(l)-'a']) matches--;

            l++;   
        }

        return matches==26;
        
    }
}
