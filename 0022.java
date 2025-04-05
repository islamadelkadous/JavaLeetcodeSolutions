class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        recursiveParenthesis(0, 0, n, "", result);
        return result;
    }

    private void recursiveParenthesis(int countOpen, int countClose, int n, String curr, List<String> result) {
        if (countOpen == countClose && countOpen + countClose == 2*n) {
            result.add(curr);
            return;
        }
        
        if (countOpen < n) {
            recursiveParenthesis(countOpen + 1, countClose, n, curr + "(", result);
        }
        
        if (countClose < countOpen) {
            recursiveParenthesis(countOpen, countClose + 1, n, curr + ")", result); 
        }
    }
}
