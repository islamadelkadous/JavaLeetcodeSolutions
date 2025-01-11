class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) {
            return false;
        }
        HashMap<Character, Integer> counterMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            counterMap.merge(c, 1, Integer::sum);
        }
        int counter = 0;
        for (Map.Entry<Character, Integer> characterIntegerEntry : counterMap.entrySet()) {
            if (characterIntegerEntry.getValue() % 2 != 0) {
                counter++;
            }
        }
        return counter <= k;
    }
}
