class Solution {
    public int partitionString(String s) {
        HashSet<Character> charSet = new HashSet<Character>();
        int noPartitions = 1;
        for(char c : s.toCharArray()) {
            if (charSet.contains(c)) {
                noPartitions++;
                charSet.clear();
            }
            charSet.add(c);
        }
        return noPartitions;
    }
}
