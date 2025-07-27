class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        for (int i=1;i<=n;i++) {
            if(isValid(i)){
                count++;
            }
        }
        return count;
    }

    private boolean isValid(int i) {
        boolean valid = false;
        for(char c : String.valueOf(i).toCharArray()) {
            if (c == '0' || c == '1' || c == '8') {
                continue;
            } else if (c == '2' || c == '5' || c == '6' || c == '9') {
                valid = true;
            } else {
                return false;
            }
        }
        return valid;
    }
}
