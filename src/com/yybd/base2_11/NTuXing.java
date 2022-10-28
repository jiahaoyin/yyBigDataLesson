package com.yybd.base2_11;

import java.util.Scanner;

/**
 * 小米打算把图标设计成下面这样， 但是他不知道几层最合适， 于是
 * 想写个程序，打印出不同层的图标，请你帮帮他。
 * *
 * ***
 * *****
 * *******
 * 注意：输入 n，打印 n  层高度的图标，如图是 4  层
 */
public class NTuXing {
    public static void main(String[] args) {
        // 1.接收用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图形的层数");
        int count= scanner.nextInt();

        //开始打印
        for (int i = 1; i <=count; i++) {
            //打印第一部分空格的占位符
            for (int j = count; j >i ; j--) {
                System.out.print(" ");
            }

            //打印第二部分的直角三角形
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }

            //打印第三部分的直角三角形
            for (int j = 1; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}