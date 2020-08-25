public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++)
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    System.out.println(nums[i] + " + " + nums[j] + " = " + target);
                    return result;
                }
            }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15};
        int target = 9;
        int[] fag = twoSum(nums, target);
        if (fag != null) {
            for (int i = 0; i < fag.length; i++)
                System.out.print( fag[i] + " " );
            System.out.println();
        } else System.out.println("No solution");
    }
}
