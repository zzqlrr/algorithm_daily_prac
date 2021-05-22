package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, 
//ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。 
//
// 说明：你不能倾斜容器。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：[1,8,6,2,5,4,8,3,7]
//输出：49 
//解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。 
//
// 示例 2： 
//
// 
//输入：height = [1,1]
//输出：1
// 
//
// 示例 3： 
//
// 
//输入：height = [4,3,2,1,4]
//输出：16
// 
//
// 示例 4： 
//
// 
//输入：height = [1,2,1]
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// n = height.length 
// 2 <= n <= 3 * 104 
// 0 <= height[i] <= 3 * 104 
// 
// Related Topics 数组 双指针 
// 👍 2291 👎 0

public class ContainerWithMostWater {
    public static void main(String[] args) {
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxArea(int[] height) {
            if (height.length <= 1) {
                return 0;
            }
            //双指针,i、j从两头向中间移动，计算每次移动后的面积，保存最大值，左边高度低，左边移动，右边高度低，右边移动
            int i = 0, j = height.length - 1;
            int max = 0;
            while (i < j) {
                max = Math.max(Math.min(height[i], height[j]) * (j - i), max);
                if (height[i] > height[j]) {
                    j--;
                } else {
                    i++;
                }
            }
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}