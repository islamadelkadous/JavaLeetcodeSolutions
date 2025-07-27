class Solution {
    public String decodeString(String s) {
        Stack<String> stk = new Stack<>();
        for (int i = 0 ; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                stk.add(Character.toString(s.charAt(i)));
            } else {
                String sub = "";
                while(!stk.peek().equals("[")) {
                    sub = stk.pop() + sub;
                }
                stk.pop();
                String num = "";
                while(!stk.isEmpty() && stk.peek().matches("\\d+")) {
                    num = stk.pop() + num;
                }
                stk.push(sub.repeat(Integer.parseInt(num)));
            }
        }
        String result = "";
        while (!stk.isEmpty()) {
            result = stk.pop() + result;
        }
        return result;
    }
}
