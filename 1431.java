class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int currentMax = Arrays.stream(candies).max().getAsInt();
        for (int candy : candies) {
            result.add(candy + extraCandies >= currentMax);
        }
        return result;
    }
}
