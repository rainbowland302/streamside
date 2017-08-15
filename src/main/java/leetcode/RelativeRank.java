package leetcode;

/*
Easy
Given scores of N athletes, find their relative ranks.
Who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
For the left two athletes, you just need to output their relative ranks according to their scores.
Note:
N is a positive integer and won't exceed 10,000.
All the scores of athletes are guaranteed to be unique.
*/

import java.util.*;

public class RelativeRank {
    public static String[] run(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        List<Integer> sortList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        for(int num: nums)
        {
            numList.add(num);
            sortList.add(num);
        }
        String[] medalGroup = new String[] {"Gold Medal", "Silver Medal", "Bronze Medal"};
        sortList.sort(Collections.reverseOrder());
        for(Integer num: numList)
        {
            int index = sortList.indexOf(num);
            if( index < 3 )
                stringList.add(medalGroup[index]);
            else
                stringList.add(index + 1 + "");
        }
        return stringList.toArray(new String[0]);
    }

    public static String[] exec(int[] nums) {
        String[] medalGroup = new String[] {"Gold Medal", "Silver Medal", "Bronze Medal"};
        Integer[] indexBox = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++)
            indexBox[i] = i;
        Arrays.sort(indexBox, (a, b) -> (nums[b] - nums[a]));
        String[] res = new String[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            int index = indexBox[i];
            if(i < 3)
                res[index] = medalGroup[i];
            else
                res[index] = i + 1 + "";
        }
        return res;
    }
}

