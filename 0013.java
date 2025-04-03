class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanDict = new HashMap();
        romanDict.put('I', 1);
        romanDict.put('V', 5);
        romanDict.put('X', 10);
        romanDict.put('L', 50);
        romanDict.put('C', 100);
        romanDict.put('D', 500);
        romanDict.put('M', 1000);
        int sumRoman = 0, ptr = 0;
        while(ptr < s.length()) {
            if(ptr < s.length() - 1 && romanDict.get(s.charAt(ptr + 1)) > romanDict.get(s.charAt(ptr))) {
                sumRoman += romanDict.get(s.charAt(ptr + 1)) - romanDict.get(s.charAt(ptr));
                ptr += 2;
            } else {
                sumRoman += romanDict.get(s.charAt(ptr));
                ptr++;
            }
        }
        return sumRoman;
    }
}
