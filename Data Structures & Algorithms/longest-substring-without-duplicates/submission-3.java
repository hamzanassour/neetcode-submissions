class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<Character>();
        int max  = 0; 
        for(int i = 0; i < s.length(); i++) {
            set.clear();
            set.add(s.charAt(i));
            for(int j = i + 1; j < s.length() ; j++) {
                if(!set.add(s.charAt(j))){
                   break;
                }
            }
            max = Math.max(max, set.size());
        }

        return max;
    }
}
