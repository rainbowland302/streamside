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

    public List<List<Integer>> run2(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // Arrays.sort(nums); // not necessary
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }
    /*
     * @list: List<List<Integer>> store the result
     * @tmpList: List<Integer> construct a single result
     */
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for (int num : nums) {
                if (tempList.contains(num)) continue; // element already exists, skip
                tempList.add(num);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}