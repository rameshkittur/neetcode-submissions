class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        while(start<end){
            if(!alphaNum(s.charAt(start))){
                start++;
                continue;
            }
            if(!alphaNum(s.charAt(end))){
                end--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))) return false;

            start++;
            end--;
        }

        return true;

    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
