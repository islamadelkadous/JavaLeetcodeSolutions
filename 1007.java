class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        if(tops.length != bottoms.length) {
            return -1;
        }
        int size = tops.length;
        int[] topOcc = new int[7];
        int[] botOcc = new int[7];
        int[] bothOcc = new int[7];
        for(int i = 0; i<size; i++) {
            topOcc[tops[i]]++;
            botOcc[bottoms[i]]++;
            if (bottoms[i] == tops[i]) {
                bothOcc[bottoms[i]]++;
            }
        }

        for(int i = 1; i < 7;i++) {
            if (topOcc[i] + botOcc[i] - bothOcc[i] == size) {
                return size - Math.max(botOcc[i], topOcc[i]);
            }
        }
        return -1;
    }
}
