package com.ss.up.test;

import com.ss.up.enums.ServiceTypeE;
import com.ss.up.enums.SystemServiceTypeE;
import com.ss.up.model.ResExt;
import org.junit.Test;
import org.springframework.util.StopWatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test0915 {


    @Test
    public void test001() {

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list1.add(i);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = 10000; i > 0; i--) {
            list2.add(i);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("1111");
        int count = 0;
        for (Integer i : list1) {
            for (Integer j : list2) {
                if (i.intValue() == j) {
                    count++;
                }
            }
        }
        System.out.println("count:" + count);
        stopWatch.stop();

        stopWatch.start("2222");
        int count1 = 0;
        for (Integer i : list1) {
            for (Integer j : list2) {
                if (i.equals(j)) {
                    count1++;
                }
            }
        }
        System.out.println("count:" + count1);
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    /**
     * 给定一个字符串 s 和一个字符串 t ，计算在 s 的子序列中 t 出现的个数。
     * <p>
     * 字符串的一个 子序列 是指，通过删除一些（也可以不删除）字符且不干扰剩余字符相对位置所组成的新字符串。（例如，"ACE" 是 "ABCDE" 的一个子序列，而 "AEC" 不是）
     * <p>
     * 题目数据保证答案符合 32 位带符号整数范围。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：s = "rabbbit", t = "rabbit"
     * 输出：3
     * 解释：
     * 如下图所示, 有 3 种可以从 s 中得到 "rabbit" 的方案。
     * rabbbit
     * rabbbit
     * rabbbit
     * 示例 2：
     * <p>
     * 输入：s = "babgbag", t = "bag"
     * 输出：5
     * 解释：
     * 如下图所示, 有 5 种可以从 s 中得到 "bag" 的方案。
     * babgbag
     * babgbag
     * babgbag
     * babgbag
     * babgbag
     *  
     * <p>
     * 提示：
     * <p>
     * 0 <= s.length, t.length <= 1000
     * s 和 t 由英文字母组成
     */
    @Test
    public void test002() {

        String s = "rabbbit";
        String t = "rabbit";
        System.out.println(numDistinct(s, t));
    }

    public int numDistinct(String s, String t) {

        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n];
    }

    /**
     * 求出最长递增子序列长度
     */
    @Test
    public void test004() {

        int[] arr = {9, 8, 1, 5, 2, 6, 2, 3, 10, 8, 5, 2, 5, 5, 3, 10, 10, 11};

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (list.contains(arr[i])) {
                list.add(arr[i]);
                continue;
            }
            if (arr[i] < list.get(list.size() - 1)) {
                list.set(list.size() - 1, arr[i]);
            } else {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }

    @Test
    public void test005() {

        ServiceTypeE ss = ServiceTypeE.getById(2030);
        SystemServiceTypeE ss1 = SystemServiceTypeE.getById(2032);
        aa(ss, 1);
        aa(ss1, 0);
    }

    public int aa(Object obj, int source) {
        ServiceTypeE serviceTypeE;
        SystemServiceTypeE systemServiceTypeE;
        if (source == 1) {
            serviceTypeE = (ServiceTypeE)obj;
            System.out.println(serviceTypeE.getName());
        } else {
            systemServiceTypeE = (SystemServiceTypeE)obj;
            System.out.println(systemServiceTypeE.getName());
        }

        return 1;
    }

    @Test
    public void test012() {

        System.out.println(getBinary(23442));

        System.out.println(hammingWeight(23442));

        System.out.println(Integer.toBinaryString(23442));

    }

    /**
     * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
     *
     *  
     *
     * 提示：
     *
     * 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
     * 在 Java 中，编译器使用二进制补码记法来表示有符号整数。因此，在上面的 示例 3 中，输入表示有符号整数 -3。
     *  
     *
     * 示例 1：
     *
     * 输入：00000000000000000000000000001011
     * 输出：3
     * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
     * 示例 2：
     *
     * 输入：00000000000000000000000010000000
     * 输出：1
     * 解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
     * 示例 3：
     *
     * 输入：11111111111111111111111111111101
     * 输出：31
     * 解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/number-of-1-bits
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param num
     * @return
     */
    public String getBinary(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            sb.append((num & (1 << i)) == 0 ? 0 : 1);
        }
        return sb.toString();
    }

    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 31; i >= 0; i--) {
            if ((n & (1 << i)) != 0) {
                count++;
            }
        }
        return count;
    }

    public int hammingWeight1(int n) {
        int count = 0;
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        for (char a : chars) {
            if (a == 1) {
                count++;
            }
        }
        return count;
    }

    /**
     * 输入：nums = [2,1,3,3], k = 2
     * 输出：[3,3]
     * 解释：
     * 子序列有最大和：3 + 3 = 6 。
     */
    @Test
    public void test013() {

        int num = 23;
        StringBuilder sb = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            sb.append((num & (1 << i)) == 0 ? 0 : 1);
        }
        System.out.println(sb);
    }

    @Test
    public void test014() {
        int[] nums = {87 , -78};
        maxSubsequence(nums, 2);
        System.out.println();
    }

    @Test
    public void test0922() {

        int m = 8;
        StringBuilder sb = new StringBuilder();
        System.out.println(Integer.toBinaryString(m));
        for (int i = 31; i >= 0; i--) {
            sb.append((m & (1 << i)) == 0 ? 0 : 1);
        }
        System.out.println(sb);
    }

    @Test
    public void test092201() {

        System.out.println(8 << 2);
        System.out.println(25 << 2);
        System.out.println(18 << 2);
    }

    public int[] maxSubsequence(int[] nums, int k) {
        int[] arr = new int[k];
        int[] tmp = new int[k];

        List<Integer> list = new ArrayList<>();
        for (int b : nums) {
            list.add(b);
        }
        Arrays.sort(nums);

        for (int i = 0; i< k; i++) {
            tmp[i] = nums[nums.length - i - 1];
        }



        return arr;
    }

    @Test
    public void test0919() {


    }

}
