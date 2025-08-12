class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); 
        boolean[] used = new boolean[nums.length];
        backtrack(result, new ArrayList<>(), nums, used);
        return result;
    }
private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip used elements
            if (used[i]) continue;

            // Skip duplicates: if the current value is same as previous and previous wasn't used
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, used);
            tempList.remove(tempList.size() - 1);
            used[i] = false;
        }
}

}
