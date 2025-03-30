class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> answer = new ArrayList();
        int[] rightMost = new int[26];
        for(int i = 0 ; i < s.length() ; i++) {
            rightMost[s.charAt(i) - 'a'] = i;
        }
        int l = 0, r = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            r = Math.max(r, rightMost[s.charAt(i) - 'a']);
            if (r == i) {
                answer.add(i - l + 1);
                l = i + 1;
            }
        }
        return answer;
        
    }
}
