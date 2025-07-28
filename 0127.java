class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        HashMap<String, List<String>> patternMap = new HashMap<>();
        wordList.add(beginWord);
        for (String curr : wordList) {
            for (int j = 0; j < curr.length(); j++) {
                String pattern = curr.substring(0, j) + "*" + curr.substring(j + 1);
                if (patternMap.containsKey(pattern)) {
                    patternMap.get(pattern).add(curr);
                } else {
                    patternMap.put(pattern, new ArrayList<>(List.of(curr)));
                }
            }
        }
        HashSet<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int count = 1;
        while (!q.isEmpty()) {
            count++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String curr = q.poll();
                for (int j = 0; j < Objects.requireNonNull(curr).length(); j++) {
                    String pattern = curr.substring(0, j) + "*" + curr.substring(j+1);
                    if (patternMap.containsKey(pattern)) {
                        for (String s : patternMap.get(pattern)) {
                            if (endWord.equals(s)) {
                                return count;
                            } else if (!visited.contains(s)) {
                                q.offer(s);
                                visited.add(s);
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
}
