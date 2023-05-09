package leetcode;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] array = new int[]{1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(array));
    }

    public static int pivotIndex(int[] nums) {
        var total = 0;
        var leftSum = 0;
        for (int num : nums) {
            total = total - num;
            if (leftSum == total) return num;
            leftSum += num;

        }
        return -1;
    }
}
