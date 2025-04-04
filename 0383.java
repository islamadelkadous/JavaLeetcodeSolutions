class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magMap = new HashMap();
        for (char c : magazine.toCharArray()) {
            magMap.merge(c, 1, Integer::sum);
        }
        for (char l : ransomNote.toCharArray()) {
            if (!magMap.containsKey(l)) {
                return false;
            } else {
                int occ = magMap.get(l);
                if (occ == 1) {
                    magMap.remove(l);
                } else {
                    magMap.put(l, occ-1);
                }
            }
        }
        return true;
    }
}
