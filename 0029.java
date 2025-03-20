class Solution {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for (char bracet : s.toCharArray()) {
            if (bracet == '(' || bracet == '{' || bracet == '[') {
                charStack.add(bracet);
            } else if (bracet == ')') {
                if (!charStack.isEmpty() && charStack.peek() == '(') {
                    charStack.pop();
                } else {
                    return false;
                }
            } else if (bracet == '}') {
                if (!charStack.isEmpty() && charStack.peek() == '{') {
                    charStack.pop();
                } else {
                    return false;
                }
            } else {
                if (!charStack.isEmpty() && charStack.peek() == '[' ) {
                    charStack.pop();
                } else {
                    return false;
                }
            }
        }
        return charStack.size() == 0;
    }
}
