/**
**Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

**You may assume that each input would have exactly one solution, and you may not use the same element twice.

**You can return the answer in any order.

 

**Example 1:

**Input: nums = [2,7,11,15], target = 9
**Output: [0,1]
**Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
**Example 2:

**Input: nums = [3,2,4], target = 6
**Output: [1,2]
**Example 3:

**Input: nums = [3,3], target = 6
**Output: [0,1]
**/

public class StreamsApplication {

    public static void main(String[] args) {

        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] op = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i< nums.length;i++){
            int difference = target - nums[i];
            //map.put(nums[i], map.getOrDefault(nums[i], 0) + difference);
            if(map.containsKey(difference)){
               op =  new int[]{
                        map.get(difference), i
                };
            }
            map.put(nums[i], i);
        }
        //return new int[]{};
        System.out.println(op[0]+"----"+op[1]);
    }

}