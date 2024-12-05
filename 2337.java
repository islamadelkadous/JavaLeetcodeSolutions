class Solution {
    public boolean canChange(String start, String target) {
        int startIndex = 0, targetIndex = 0, size = start.length();
        while (startIndex <= size && targetIndex <= size) {
            while (startIndex < size && start.charAt(startIndex) == '_')
                ++startIndex;
            while (targetIndex < size && target.charAt(targetIndex) == '_')
                ++targetIndex;
            if (startIndex == size || targetIndex == size)
                return startIndex == size && targetIndex == size;
            if (start.charAt(startIndex) != target.charAt(targetIndex))
                return false;
            if (start.charAt(startIndex) == 'R' && startIndex > targetIndex)
                return false;
            if (start.charAt(startIndex) == 'L' && startIndex < targetIndex)
                return false;
            ++startIndex;
            ++targetIndex;
        }
        return true;
    }
}
