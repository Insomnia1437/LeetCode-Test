public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (nums.length == 0) return result;
    
    backtrack(result, nums, new ArrayList<Integer>(), 0);
    
    return result;
}

private void backtrack(List<List<Integer>> result, int[] nums, List<Integer> currentList, int index) {
    if (currentList.size() == nums.length) {
        result.add(currentList);
        return;
    }
    
    int n = nums[index];
    for (int i = 0; i <= currentList.size(); i++) {
        List<Integer> copy = new ArrayList<Integer>(currentList);
        copy.add(i, n);
        backtrack(result, nums, copy, index + 1);
    }
    
    
}