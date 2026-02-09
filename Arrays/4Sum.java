class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length<4)
        {
            return new ArrayList<>();
        }    

        Arrays.sort(nums);
        Set<List<Integer>> arr=new HashSet<>();

        for(int i=0;i<nums.length-3;i++)
        {
            for(int j = i + 1; j < nums.length - 2; j++)
            {
                int start = j + 1;
                int end = nums.length - 1;

                while(start < end)
                {
                    long sum = (long)nums[i] + nums[j] + nums[start] + nums[end];

                    if(sum == target)
                    {
                        arr.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        start++;
                        end--;
                    }
                    else if(sum > target)
                    {
                        end--;
                    }
                    else
                    {
                        start++;
                    }
                }
            }
        }
        return new ArrayList<>(arr);
    }
}
