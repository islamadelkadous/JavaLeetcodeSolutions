class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, maxArea = 0;
        while (l < r) {
            int base = r - l;
            int xheight = 0;
            if (height[l] >= height[r]) {
                xheight = height[r];
                r--;
            } else {
                xheight = height[l];
                l++;
            }
            maxArea = Math.max(maxArea, base * xheight);
        }
        return maxArea;
    }

}
