class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;        
        for (int num1 : nums) {
            int count = 0;
            for (int num2 : nums) {
                if (num1 == num2) {
                    count++;
                }
            }
            if (count > n / 2) {
                return num1;
            }
        }
        return -1;
    }
}
