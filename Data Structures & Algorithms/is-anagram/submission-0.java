class Solution {
    public boolean isAnagram(String s, String t) {

        // anagrams : 2 strings are considered anagrams if the have the same characters but different orders 

        if(s == null || t == null){
            return false;
        }

        if(s.equals(t)) {
            return true ;
        }


        Map<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i), 0) + 1 );
        }


        for(int i = 0 ; i < t.length() ; i++){
            map.put(t.charAt(i) , map.getOrDefault(t.charAt(i) , 0) - 1 );
        }



        for(int i : map.values()) {
           if(i != 0) {
            return false;
           }
        }


        return true;


    


    }
}
