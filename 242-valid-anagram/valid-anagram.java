class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        char[] newchar = s.toCharArray();
        char[] tchar = t.toCharArray();
        Arrays.sort(newchar);
        Arrays.sort(tchar);
        if(Arrays.equals(newchar,tchar)){ 
        return true;
        }
        return false;
        }
}