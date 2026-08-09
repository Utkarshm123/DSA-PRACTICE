class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        for(String words : strs){
            char[] chars = words.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k-> new ArrayList<>()).add(words);
        }
        return new ArrayList<>(map.values());
    }
}