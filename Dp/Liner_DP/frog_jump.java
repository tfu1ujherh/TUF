package Dp.Liner_DP;

import java.util.*;

public class frog_jump {
    public static void main(String[] args) {
        int nums[] = {0, 1, 3, 5, 6, 8, 12, 17};
        // Call the solve method and print the result
        System.out.println(solve(nums));  // Expected Output: true
    }

    public static boolean solve(int nums[]) {
        int n = nums.length;

        // If the second stone is not at position 1, frog can't even start
        if (nums[1] != 1) {
            return false;
        }

        // Map to store each stone and the set of jump lengths that can land on that stone
        Map<Integer, Set<Integer>> map = new HashMap<>();

        // Initialize the map with all stones
        for (int i = 0; i < n; i++) {
            map.put(nums[i], new HashSet<>());
        }

        // Start at stone 0 with a jump of 0 (we are already on it)
        map.get(0).add(0);

        // Try all possible jumps from each stone
        for (int i = 0; i < n; i++) {
            int currStone = nums[i];

            // Get all jumps that land on the current stone
            List<Integer> jumps = new ArrayList<>(map.get(currStone));

            // Try jumping with steps (jump - 1), jump, (jump + 1)
            for (int j = 0; j < jumps.size(); j++) {
                int jump = jumps.get(j);

                // Loop through all valid steps (step > 0)
                for (int step = jump - 1; step <= jump + 1; step++) {
                    if (step > 0) {  // Avoid jumping backward or staying at the same place
                        int nextStone = currStone + step;

                        // If the next stone exists, add the step to that stone's jump possibilities
                        if (map.containsKey(nextStone)) {
                            map.get(nextStone).add(step);
                        }
                    }
                }
            }
        }

        // If the last stone has any valid jumps, return true, meaning frog can reach the last stone
        return !map.get(nums[n - 1]).isEmpty();
    }
}
