class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        HashMap<Character, Integer> check = new HashMap<>();

        int st = 0, max = 0;

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (check.containsKey(ch)) {
                st = Math.max(st, check.get(ch) + 1);
            }

            check.put(ch, i);

            max = Math.max(max, i - st + 1);
        }

        return max;
    }
}