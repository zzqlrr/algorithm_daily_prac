package com.zhi.algorithm.leetcodeplugin.leetcode.editor.cn;
//一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。 
//
// 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。 
//
// 问总共有多少条不同的路径？ 
//
// 
//
// 示例 1： 
//
// 
//输入：m = 3, n = 7
//输出：28 
//
// 示例 2： 
//
// 
//输入：m = 3, n = 2
//输出：3
//解释：
//从左上角开始，总共有 3 条路径可以到达右下角。
//1. 向右 -> 向下 -> 向下
//2. 向下 -> 向下 -> 向右
//3. 向下 -> 向右 -> 向下
// 
//
// 示例 3： 
//
// 
//输入：m = 7, n = 3
//输出：28
// 
//
// 示例 4： 
//
// 
//输入：m = 3, n = 3
//输出：6 
//
// 
//
// 提示： 
//
// 
// 1 <= m, n <= 100 
// 题目数据保证答案小于等于 2 * 109 
// 
// Related Topics 数组 动态规划
// 👍 1006 👎 0

import java.util.Arrays;

public class UniquePaths{
  public static void main(String[] args) {
       Solution solution = new UniquePaths().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
      public int uniquePaths(int m, int n) {
          //dp[i][j]为到达(i,j)的方案数
//          int[][] f = new int[m][n];
//          for (int i = 0; i < m; ++i) {
//              f[i][0] = 1;
//          }
//          for (int j = 0; j < n; ++j) {
//              f[0][j] = 1;
//          }
//          for (int i = 1; i < m; ++i) {
//              for (int j = 1; j < n; ++j) {
          //从上边来的方案数+从左面来的方案数
//                  f[i][j] = f[i - 1][j] + f[i][j - 1];
//              }
//          }
//          return f[m - 1][n - 1];
          //一维空间，其大小为 n
          int[] dp = new int[n];
          Arrays.fill(dp, 1);
          for(int i = 1; i < m; ++i) {
              for(int j = 1; j < n; ++j) {
                  //等式右边的 dp[j]是上一次计算后的，即上边的值，加上左边的dp[j-1]即为当前结果
                  dp[j] = dp[j] + dp[j - 1];
              }
          }
          return dp[n - 1];
      }
  }
//leetcode submit region end(Prohibit modification and deletion)

}