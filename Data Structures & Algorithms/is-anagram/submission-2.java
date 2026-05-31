class Solution {
    public boolean isAnagram(String s, String t) {

        // char[] chars1 = s.toCharArray();
        // char[] chars2 = t.toCharArray();
        // Arrays.sort(chars1);
        // Arrays.sort(chars2);
        // return Arrays.equals(chars1, chars2);

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++) {
           map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0 ; i < t.length() ; i++) {
           map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }


        for(Integer i : map.values()) { 
           if(i != 0) {
             return false;
           }
        }
        return true; 


    }
}
