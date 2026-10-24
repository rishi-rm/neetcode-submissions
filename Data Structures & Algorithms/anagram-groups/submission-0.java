class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();

     for(String x: strs){
        int[] count = new int[26];
        for(char c: x.toCharArray()){
            count[c-'a']++;
        }
        StringBuilder s = new StringBuilder();
        for(int i: count){
            s.append('#');
            s.append(i);
        }
        String key = s.toString();
        if(!map.containsKey(key)) map.put(key, new ArrayList<String>());
        map.get(key).add(x);
     }

     return new ArrayList<>(map.values());
    }
}
