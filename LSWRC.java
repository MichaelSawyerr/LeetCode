class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();  //Create a HashSet
        int l = 0; //Sliding window so left and right
        int result = 0; //result

        for(int r = 0; r < s.length(); r++){ //right pointer constantly incrementing
            while(set.contains(s.charAt(r))){ //if the set contains the right pointer, remove it and increment the left
                set.remove(s.charAt(l)); //pointer
                l++;
            }
            set.add(s.charAt(r)); //add the right pointer into the set

            result = Math.max(result, r - l + 1); // get the max result


        }
        return result;
    }
}
