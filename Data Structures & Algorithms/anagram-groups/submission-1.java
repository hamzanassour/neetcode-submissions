class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> listOfLists = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for(int i = 0 ; i < strs.length; i++) {
            if (visited[i]) continue;
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            visited[i] = true;
            for(int j = i+1; j < strs.length; j++) {
                if(!visited[j] && isAnagrams(strs[i],strs[j])) {
                    list.add(strs[j]);
                    visited[j] = true;
                }
            }
            listOfLists.add(list);
        }

        return listOfLists;
    }

    public boolean isAnagrams(String s, String t)  {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}
