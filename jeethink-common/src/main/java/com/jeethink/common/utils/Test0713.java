package com.jeethink.common.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test0713 {
    /**
     * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
     * 1 4 1
     * 4 2 7
     * 3 4 1
     * 说明：每次只能向下或者向右移动一步。
     */


    public static void main(String[] args) {
        int[] m = new int[3];
        int[] x = new int[3];
        int[] n = new int[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入：");
            m[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入：");
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入：");
            n[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        list.add(m[0]);
        if (m[1] > x[0]) {
            list.add(x[0]);
            if (x[1] > n[0]) {
                list.add(n[0]);
                list.add(n[1]);
                list.add(n[2]);
            }
        } else {
            list.add(m[1]);
            if (m[2] > x[1]) {
                list.add(x[1]);
                if (x[2] > n[1]) {
                    list.add(n[1]);
                    list.add(n[2]);
                }
            } else {
                list.add(m[2]);
                list.add(x[2]);
                list.add(n[2]);
            }
        }
        System.out.println(list);
    }

    @Test
    public void test2() {
        int[][] grid = new int[4][6];
        grid[0][0] = 1;
        grid[0][1] = 1;
        grid[3][2] = 1;
        grid[2][1] = 1;
        grid[1][1] = 1;
        System.out.println(grid.length);
        System.out.println(grid[1].length);
    }

    /**
     * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
     * 1 4 1
     * 4 2 7
     * 3 4 1
     * 说明：每次只能向下或者向右移动一步。
     */
    public int minPathSum(int[][] grid) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        if (grid[1][0] > grid[0][1]) {
            list1.add(grid[0][1]);
        } else if (grid[1][0] == grid[0][1]) {
            list1.add(grid[1][0]);
            List<Integer> list2 = new ArrayList<>(list1);
            list2.add(grid[0][1]);
        } else {
            list1.add(grid[1][0]);
        }


        for (int i = 0; i < grid.length; i++) {
            for (int j = i; j < grid[0].length; j++) {
                if (i == 0) {
                    break;
                }
            }
        }
        int length = grid.length;

        return 1;
    }

    @Test
    public void test1() {
        int[] m = new int[3];
        int[] x = new int[3];
        int[] n = new int[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入：");
            m[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入：");
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入：");
            n[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        list.add(m[0]);
        if (m[1] > x[0]) {
            list.add(x[0]);
            if (x[1] > n[0]) {
                list.add(n[0]);
                list.add(n[1]);
                list.add(n[2]);
            }
        } else {
            list.add(m[1]);
            if (m[2] > x[1]) {
                list.add(x[1]);
                if (x[2] > n[1]) {
                    list.add(n[1]);
                    list.add(n[2]);
                }
            } else {
                list.add(m[2]);
                list.add(x[2]);
                list.add(n[2]);
            }
        }
        System.out.println(list);
    }

    /**
     * 1 4 1   1 4 1
     * 4 2 7   4 6
     * 3 4 1   3
     */
    public int minPathSum1(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int map[][] = new int[m][n];
        map[0][0] = grid[0][0]; //（0，0）赋初值grid[0][0]
        for (int i = 1; i < m; i++) { //初始化第一列
            map[i][0] = grid[i][0] + map[i - 1][0];
        }
        for (int i = 1; i < n; i++) {//初始化第一行
            map[0][i] = grid[0][i] + map[0][i - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                map[i][j] = Math.min(map[i - 1][j] + grid[i][j], map[i][j - 1] + grid[i][j]);
            }
        }
        return map[m - 1][n - 1];
    }
}
