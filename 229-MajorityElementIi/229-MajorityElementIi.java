// Last updated: 09/07/2026, 15:08:10
import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> np = new HashMap<>();

        for (int i = 0; i < n; i++) {
            np.put(nums[i], np.getOrDefault(nums[i], 0) + 1);
        }

        int m = n / 3;
        List<Integer> l = new ArrayList<>();

        for (Map.Entry<Integer, Integer> en : np.entrySet()) {
            if (en.getValue() > m) {
                l.add(en.getKey());
            }
        }

        return l;
    }
}