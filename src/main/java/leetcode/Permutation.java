package leetcode;
/*
Medium
Recursion
Given a collection of distinct numbers, return all possible permutations.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> run(int[] nums) {
        return permute(nums, nums.length);
    }

    private static List<List<Integer>> permute(int[] nums, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k == 1) {
            for (int num : nums) {
                res.add(Collections.singletonList(num));
            }
            return res;
        }
        for (List<Integer> list : permute(nums, k - 1)) {
            // Get the num to be concat
            List<Integer> restNums = new ArrayList<>();
            for (int num : nums) {
                if (!list.contains(num)) {
                    restNums.add(num);
                }
            }
            for (Integer num : restNums) {
                ArrayList<Integer> newList = new ArrayList<>(list);
                newList.add(num);
                res.add(newList);
            }
        }
        return res;
    }
}