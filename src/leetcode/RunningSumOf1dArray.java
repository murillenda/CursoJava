package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1

//Constraints:

//1 <= nums.length <= 1000
//-10^6 <= nums[i] <= 10^6

//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.

//Example:
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(array)));
    }

    // Modo simplificado e com mais performance sem programação funcionmal
    private static int[] runningSum(int[] nums) {
        if ((nums.length >= 1 && nums.length <= 1000)
            && Arrays.stream(nums)
            .allMatch(num -> {
                double valorMaximo = Math.pow(num, 6);
                return num <= valorMaximo && num >= -valorMaximo;
            })) {
            var sum = 0;
            var result = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                result[i] = sum;
            }
            return result;
        }
        return new int[]{0};
    }


    // Modo que fiz com programação funcional desnecessária
    public static int[] runningSum2(int[] nums) {
        if ((nums.length >= 1 && nums.length <= 1000)
            && Arrays.stream(nums)
            .allMatch(num -> {
                double valorMaximo = Math.pow(num, 6);
                return num <= valorMaximo && num >= -valorMaximo;
            })) {
            List<Integer> resultList = new ArrayList<>();

            Arrays.stream(nums)
                .reduce(0, (subTotal, valor) -> {
                    resultList.add(subTotal + valor);
                    return subTotal + valor;
                });

            return resultList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        } else {
            return new int[]{0};
        }
    }
}
