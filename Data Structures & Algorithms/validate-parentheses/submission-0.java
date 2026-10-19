class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character,Character> mp = Map.of(')','(','}','{',']','[');

        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                if(!st.isEmpty() && st.peek()==mp.get(s.charAt(i))){
                    st.pop();
                }
                else return false;
            } else {
                st.push(s.charAt(i));
            }
        }

        return st.isEmpty();
        
    }
        
}
