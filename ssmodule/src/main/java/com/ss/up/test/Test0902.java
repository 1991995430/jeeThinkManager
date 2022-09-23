package com.ss.up.test;

import javafx.beans.binding.StringBinding;
import org.junit.Test;
import org.springframework.util.StopWatch;

import java.util.*;
import java.util.stream.Collectors;

public class Test0902 {

    /**
     * 给你一个字符串 s ，其中包含字母顺序打乱的用英文单词表示的若干数字（0-9）。按 升序 返回原始的数字。
     * <p>
     * 输入：s = "owoztneoer"
     * 输出："012"
     * <p>
     * 输入：s = "fviefuro"
     * 输出："45"
     */

    @Test
    public void findNum() {
        System.out.println(originalDigits("szerioonnniszerioonnniezereoxsixsxiezereoxsixsxi"));
    }

    public String originalDigits(String s) {

        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        Set<String> letterSet = map.keySet();

        // eenooortwz
        char[] chars = s.toCharArray();
        List<String> cs = new ArrayList<>();
        for (char aa : chars) {
            cs.add(String.valueOf(aa));
        }
        List<String> chooseLetterList = new ArrayList<>();
        while (cs.size() > 0) {
            for (String letter : letterSet) {
                List<String> removeChar = new ArrayList<>();
                char[] chars1 = letter.toCharArray();
                int count = 0;
                for (char cc : chars1) {
                    if (cs.contains(String.valueOf(cc))) {
                        removeChar.add(String.valueOf(cc));
                        count++;
                    }
                }
                if (count == chars1.length) {
                    chooseLetterList.add(letter);
                    // 删除字母
                    for (String c : removeChar) {
                        cs.remove(c);
                    }
                }
            }
        }


        List<Integer> numList = new ArrayList<>();
        if (chooseLetterList.size() > 0) {
            for (String letter : chooseLetterList) {
                numList.add(map.get(letter));
            }
        }

        if (numList.size() > 0) {
            List<Integer> collect = numList.stream().sorted().collect(Collectors.toList());
            StringBuilder stringBuilder = new StringBuilder();
            for (Integer num : collect) {
                stringBuilder.append(num);
            }
            return stringBuilder.toString();
        }
        return "";

    }

    /**
     * 我们知道输入中各个字母的个数，其中很特殊的就可以知道一些数字的个数了，比如只有零用了z，只有六用了x等等，
     * 在将一些可以求得的个数求了后，将它们占用的其他字母的个数排除掉，经过排除后，剩下的有用到别人用过的字母的数字的个数也可以得到了。
     * 比如在四的个数通过u得到后，五的个数就可以通过剩下的f的个数得到了。
     *
     * <p>
     * one two three four five six seven eight nine
     */
    @Test
    public void test01() {
        String s = "fviefuro";
        int[] cnts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            cnts[s.charAt(i) - 'a']++;
        }


        int zeros = cnts['z' - 'a'], twos = cnts['w' - 'a'], fours = cnts['u' - 'a'], sixs = cnts['x' - 'a'], eights = cnts['g' - 'a'];
        int fives = cnts['f' - 'a'] - fours, ones = cnts['o' - 'a'] - twos - zeros - fours, sevens = cnts['s' - 'a'] - sixs, threes = cnts['h' - 'a'] - eights;
        int nines = cnts['i' - 'a'] - sixs - fives - eights;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zeros; i++) {
            sb.append(0);
        }
        for (int i = 0; i < ones; i++) {
            sb.append(1);
        }
        for (int i = 0; i < twos; i++) {
            sb.append(2);
        }
        for (int i = 0; i < threes; i++) {
            sb.append(3);
        }
        for (int i = 0; i < fours; i++) {
            sb.append(4);
        }
        for (int i = 0; i < fives; i++) {
            sb.append(5);
        }
        for (int i = 0; i < sixs; i++) {
            sb.append(6);
        }
        for (int i = 0; i < sevens; i++) {
            sb.append(7);
        }
        for (int i = 0; i < eights; i++) {
            sb.append(8);
        }
        for (int i = 0; i < nines; i++) {
            sb.append(9);
        }

        System.out.println(sb);

    }

    @Test
    public void test004() {
        System.out.println(countLetter("oneaeaeeacc"));
    }

    public Map<String, Integer> countLetter(String letter) {
        Map<String, Integer> countMap = new HashMap<>();

        int[] cnts = new int[26];
        for (int i = 0; i < letter.length(); i++) {
            if (countMap.get(String.valueOf(letter.charAt(i))) != null) {
                countMap.put(String.valueOf(letter.charAt(i)), countMap.get(String.valueOf(letter.charAt(i))) + 1);
            } else {
                countMap.put(String.valueOf(letter.charAt(i)), 1);
            }
        }
        return countMap;
    }

    @Test
    public void test003() {

        // 000001111
        // 000001000
        int num = Integer.MAX_VALUE;
        int num1 = Integer.MIN_VALUE;

//        System.out.println("MAX:" + num + " MIN:" + num1);
//        System.out.println(Math.pow(2, 32));
//
//        print(num);

        print(0);
        System.out.println();
        print(~0 + 1);
        System.out.println();
        System.out.println(~5 + 1);

    }

    //
    public void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? 0 : 1);
        }
    }


    public String originalDigits1(String s) {
        int[] cnts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnts[s.charAt(i) - 'a']++;
        }
        int zeros = cnts['z' - 'a'], twos = cnts['w' - 'a'], fours = cnts['u' - 'a'], sixs = cnts['x' - 'a'], eights = cnts['g' - 'a'];
        int fives = cnts['f' - 'a'] - fours, sevens = cnts['s' - 'a'] - sixs, ones = cnts['o' - 'a'] - zeros - twos - fours, threes = cnts['h' - 'a'] - eights;
        int nines = cnts['i' - 'a'] - fives - sixs - eights;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zeros; i++)
            sb.append("0");
        for (int i = 0; i < ones; i++)
            sb.append("1");
        for (int i = 0; i < twos; i++)
            sb.append("2");
        for (int i = 0; i < threes; i++)
            sb.append("3");
        for (int i = 0; i < fours; i++)
            sb.append("4");
        for (int i = 0; i < fives; i++)
            sb.append("5");
        for (int i = 0; i < sixs; i++)
            sb.append("6");
        for (int i = 0; i < sevens; i++)
            sb.append("7");
        for (int i = 0; i < eights; i++)
            sb.append("8");
        for (int i = 0; i < nines; i++)
            sb.append("9");
        return sb.toString();
    }

    @Test
    public void test005() {

        int[] arr = {3, 2, 5, 7, 4, 1, 4};

        System.out.println(getSum1(arr, 0, 3));

    }

    public int getSum(int[] arr, int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int getSum1(int[] arr, int l, int r) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i + 1] = arr[i] + arr[i + 1];
        }
        if (l == 0) {
            return arr[r];
        } else {
            return arr[r] - arr[l - 1];
        }
    }

    @Test
    public void test0001() {

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(nums);
        int i = removeElement1(nums, 2);
        System.out.println(i);
        System.out.println(nums);

    }

    public int removeElement1(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    @Test
    public void test0002() {
//        print(1548);
//        System.out.println();
//        print(8451);
//        System.out.println(new StringBuilder("15486").reverse());
//        System.out.println(reverse1(0));
//        System.out.println(reverse2(-1315));
        System.out.println("48585".split(""));
    }

    // 1548 - 8451
    public int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }
        return (int) n == n ? (int) n : 0;
    }

    public int reverse1(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        try {
            if (x >= 0) {
                if (sb.toString().endsWith("0")) {
                    sb.replace(sb.length() - 1, sb.lastIndexOf("0"), "");
                }
                return Integer.parseInt(sb.reverse().toString());
            } else {
                sb.replace(0, 1, "");
                if (sb.toString().endsWith("0")) {
                    sb.replace(sb.length() - 1, sb.lastIndexOf("0"), "");
                }
                return Integer.parseInt("-" + sb.reverse());
            }
        } catch (Exception e) {
            return 0;
        }

    }

    @Test
    public void test0003() {
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode listNode = new ListNode();
        listNode.val = 2;
        listNode.next = listNode1;
        listNode1.val = 4;
        listNode1.next = listNode2;
        listNode2.val = 3;
        listNode2.next = null;

        ListNode listNode4 = new ListNode();
        ListNode listNode5 = new ListNode();
        ListNode listNode3 = new ListNode();

        listNode3.val = 5;
        listNode3.next = listNode4;
        listNode4.val = 6;
        listNode4.next = listNode5;
        listNode5.val = 4;
        listNode5.next = null;

        addTwoNumbers(listNode, listNode3);


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        sb1.append(l1.val);
        while (l1.next != null) {
            l1 = l1.next;
            sb1.append(l1.val);
        }

        sb2.append(l2.val);
        while (l2.next != null) {
            l2 = l2.next;
            sb2.append(l2.val);
        }
        String sum = new StringBuilder()
                .append(Long.parseLong(sb1.reverse().toString()) + Long.parseLong(sb2.reverse().toString()))
                .reverse().toString();
        ListNode listNode = createListNode(sum);
        return listNode;
    }

    public ListNode createListNode(String sum) {
        List<ListNode> list = new LinkedList<>();
        ListNode listNode = new ListNode();
        String[] split = sum.split("");
        listNode.val = Integer.parseInt(split[0]);
        list.add(listNode);
        for (int i = 1; i < sum.length(); i++) {
            list.add(new ListNode(Integer.parseInt(split[i])));
        }

        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }

        return listNode;
    }

    /**
     * -1315
     */
    public int reverse2(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10; //n = -50 + -1 = -51    -510 + -3 = -513   -5130 + -1 = -5131
            x /= 10;             //
        }
        return (int) (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE ? 0 : n);
    }

    public void swap(int[] arr, int left, int right) {
        arr[left] = arr[left] ^ arr[right];
        arr[right] = arr[left] ^ arr[right];
        arr[left] = arr[left] ^ arr[right];
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;

            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        return root.next;
    }

    // 0,1,2,2,3,0,4,2    2
    public int removeElement(int[] nums, int val) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = 0;
            if (nums[i] == val) {

            }
        }

        return count;
    }


    @Test
    public void test006() {
        System.out.println(eratosthenes(100));
//        System.out.println(violence(100));
        System.out.println(isPrime(51));
    }

    public int violence(int n) {
        int count = 0;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("暴力算法开始。。。");
        for (int i = 2; i < n; i++) {
            count += isPrime(i) ? 1 : 0;
        }
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
        return count;
    }

    public boolean isPrime(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 0;
    }

    public int eratosthenes(int n) {
        StopWatch stopWatch = new StopWatch();
        List<Integer> hs = new ArrayList<>();
        List<Integer> prime = new ArrayList<>();
        stopWatch.start("埃筛法开始。。。");
        boolean[] isPrime = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!isPrime[i]) {
                prime.add(i);
                count++;
            }
            // 合数
            for (int j = 2 * i; j < n; j += i) {
                hs.add(j);
                isPrime[j] = true;
            }
        }
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
        System.out.println("素数：：：" + prime);
        System.out.println("合数：：：" + hs);
        return count;
    }

    @Test
    public void test0999() {
        int[] arr = {8, 9, 1, 2 , 5, 7};
        System.out.println(findMin1(arr));
    }

    public int findMin(int[] nums) {
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }

    /**
     * 二分查找
     */
    public int findMin1(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                right--;
            }
        }
        return nums[left];
    }

/*
输入：command = "G()(al)"
输出："Goal"
解释：Goal 解析器解释命令的步骤如下所示：
G -> G
() -> o
(al) -> al
最后连接得到的结果是 "Goal"

示例 1：

输入：command = "G()(al)"
输出："Goal"
解释：Goal 解析器解释命令的步骤如下所示：
G -> G
() -> o
(al) -> al
最后连接得到的结果是 "Goal"
示例 2：

输入：command = "G()()()()(al)"
输出："Gooooal"
示例 3：

输入：command = "(al)G(al)()()G"
输出："alGalooG"
     */
    @Test
    public void test0101() {
        String command = "(al)G(al)()()G";
        String s = "(al)";
        System.out.println(command.split(s));
        System.out.println(interpret(command));
    }


    public String interpret(String command) {
        if (command.contains("G")) {
            command.split("G");
        }

        Map<String, String> map = new HashMap<>();
        map.put("G", "G");
        map.put("()", "o");
        map.put("(al)", "al");

        return "";
    }
}
