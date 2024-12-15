class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        Queue<ClassRoom> maxHeap = new PriorityQueue<ClassRoom>((a, b) -> {
            return Double.compare(b.extraStudentRatio, a.extraStudentRatio);
        });
        for (int[] aClass : classes) {
            int pass = aClass[0];
            int total = aClass[1];
            maxHeap.offer(new ClassRoom(getExtraPassRatio(pass, total), pass, total));
        }
        for (int i = 0; i < extraStudents; i++) {
            int pass = maxHeap.peek().currentPass;
            int total = maxHeap.poll().currentTotal;
            maxHeap.offer(new ClassRoom(getExtraPassRatio(pass+1, total+1), pass+1, total+1));
        }
        double ratio = 0;
        while (!maxHeap.isEmpty()) {
            ratio += maxHeap.peek().currentPass / (double) maxHeap.poll().currentTotal;
        }
        return ratio / classes.length;
    }

    private record ClassRoom(double extraStudentRatio, int currentPass, int currentTotal) {}

    private double getExtraPassRatio(int pass, int total) {
        return (pass + 1) / (double) (total + 1) - (pass) / (double) total;
    }
}
