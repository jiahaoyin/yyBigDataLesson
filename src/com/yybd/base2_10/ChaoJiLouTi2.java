package com.yybd.base2_10;

import java.util.Scanner;

/**
 * 有一楼梯共 M  级， 刚开始时你在第一级，
 * 若每次只能跨上一级或 二级，要走上第 M 级，共有多少种走法？
 * 输入一个整数 M(1<=M<=40), 表示楼梯的级数。
 */
public class ChaoJiLouTi2 {
    public static void main(String[] args) {
        System.out.println("请输入需要计算的整数");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        if (inputNumber>=40 || inputNumber<1) {
            System.out.println(" 你输入的数据格式不正确,输入数的范围为  1=<x<=40");
            return;
        }
        int result=fibonacci(inputNumber+1);
        System.out.println(result);
    }

    /**
     * 本地本质上就是考的斐波那契数列,默认使用递归比较好,默认递归的三个条件
     *  1. 函数自己调用自己
     *  2. 递归必须有退出条件
     *  3. 每次递归都会改变触发条件,方便到达退出条件
     */
    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int result = fibonacci(number - 1) + fibonacci(number - 2);
        return result;
    }
}