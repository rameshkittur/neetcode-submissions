class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
           while(!st.empty() && asteroids[i]<0 && st.peek() > 0){
            int diff = st.peek() + asteroids[i];
            if(diff<0){
                st.pop();
            } else if(diff > 0){
                asteroids[i] = 0;
            } else {
                asteroids[i] = 0;
                st.pop();
            }

           }
           if(asteroids[i]!=0) st.push(asteroids[i]);

        }

        return st.stream().mapToInt(Integer::intValue).toArray();
    }
}