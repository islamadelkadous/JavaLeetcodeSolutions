class Solution {
    public int maximumLength(String s) {
        HashMap<String, Integer> subStringCounter = new HashMap<>();
        int i = 0, size = s.length();
        while (i < size) {
            subStringCounter.merge(String.valueOf(s.charAt(i)), 1, Integer::sum);
            if (i < size - 1) {
                int j = i+1;
                while (j < size && s.charAt(j) == s.charAt(i)) {
                    subStringCounter.merge(s.substring(i, j+1), 1, Integer::sum);
                    j++;
                }
            }
            i++;
        }
        int ans = -1;
        for(String key:subStringCounter.keySet()){
            if (subStringCounter.get(key) >= 3) {
                ans = Math.max(ans, key.length());
            }
        }
        return ans;
    }
}
