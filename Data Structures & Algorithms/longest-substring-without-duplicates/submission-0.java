class Solution {
    public int lengthOfLongestSubstring(String s) {
        // substring is a set of contiguous characters
        // bruteforce : generate every possible substring .....
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            Set<Character> chars = new HashSet<>();
            for(int j = i ; j < s.length(); j++) {
                // "zxyzxyz"
                if(!chars.add(s.charAt(j))) {
                    break;
                }
            }
            max = Math.max(max,chars.size());
        }

        return max; 
    }
}
