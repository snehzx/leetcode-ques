//here dynamic sliding is used where hashset is created keeping the track of substring and while loop to remove the duplicate to shrink 
//the size of window till there is no duplicate left
//r-l+1 keeps the track of window size and compares to max size 





class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hash = new HashSet<>();
        int max=0;
        int l=0;
        for(int r=0;r<s.length();r++){
            while(hash.contains(s.charAt(r))){
                hash.remove(s.charAt(l));
                l++;
            }
            hash.add(s.charAt(r));
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}
