package com.yybd.base2_8;
import java.util.Scanner;

/**
 * 任务一：实现图形计算功能 1  关键算法(25  分)
 * 输入一个正方体的变长(a)计算盒子体积。
 * 注意：结果保留两位小数。
 */
public class ZftTiJi {
    public static void main(String[] args) {
        //1 接收正方体体积
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入边长:");
        double v = scanner.nextDouble();
        //计算正方体体积
        double tiJi=Math.pow(v,3);

        //保留两位小数输出
        System.out.printf("体积是 %.2f",tiJi);
    }
}
