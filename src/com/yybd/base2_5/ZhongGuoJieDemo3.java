package com.yybd.base2_5;

import java.util.Scanner;

/**
 * 由于中国结的形状是菱形图案， 所以现在公司需要设计一个打印菱 形的方法。从键盘输入一个整数 N，打印出有 N*2- 1  行的菱形。例如
 * 输入整数 4 ，则屏幕输出如下菱形。
 *
 * 现要求输入整数为 7 ，在屏幕中输出相应的菱形
 */
public class ZhongGuoJieDemo3 {
    public static void main(String[] args) {
        // 1. 接收用户输入整数
        Scanner scanner = new Scanner(System.in);
        //分析:中国结可以认为是上下两个三角形合并,总行数是2n-1 分为上下两部分,上下两部分的分割行数是n
        // 上部分是*号按照2i-1递增,下部分是按照*号2i-1递减
        System.out.println("请输入要打印的层数:");
        int n=scanner.nextInt();

        //开始打印,打印的总层数是2n-1
        for (int i = 1; i<=2*n-1;i++) {
            //先打印上半部分
            if (i <= n) {
                //先打印左边空格部分
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
//                再打印右边*部分
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
                //打印中国结的下半部分
            } else {
                //先打印左边空格的倒三角部分
                for (int j = 1; j <=i-n ; j++) {
                    System.out.print(" ");
                }

                //再打印下半部分的倒三角的*号,因为上半部分按照2n-1打印,但包含最长的中间值n
//               所以下半部分打印不能包含中间值n, 所以下半部分的开始打印的*的数量是2n-1-1
                for (int j = 2*n-2; j >(i-n) *2-1; j--) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}