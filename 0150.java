class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        String oper = "+-*/";
        for (String tok : tokens) {
            if (oper.contains(tok)) {
                int f = Integer.parseInt(s.pop());
                int l = Integer.parseInt(s.pop());
                int result = 0;
                if (tok.equals("+")) {
                    result = l+f;
                } else if (tok.equals("-")) {
                    result = l-f;
                } else if (tok.equals("*")) {
                    result = l*f;
                } else {
                    result = l/f;
                }
                s.push(String.valueOf(result));
            } else {
                s.push(tok);
            }
        }
        return Integer.parseInt(s.pop());
    }
}
