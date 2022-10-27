package com.yybd.base2_10;

import java.util.Scanner;

/**
 * 任务一：实现细胞繁衍关键算法(25  分)
 * 有一种细胞， 从诞生第二天开始就能每天分裂出一个新的细胞，
 * 新 的细胞在第二天又开始繁衍。假设在第一天，
 * 有一个这样的细胞， 请问， 在第 N  天晚上， 细胞的数量是多少？
 * 输入一个整数 N (0 < N < 20)， 请编程求解第 N  天该细胞的数量。例如输入 5，输出答案为 32。
 * 注意：使用循环或者递归完成
 */
public class XiBao1 {
    public static void main(String[] args) {
        //先接收n天
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入天数:");
        int days = scanner.nextInt();

        if (days >= 20) {
            System.out.println("必须输入0-20之间的数量");
            return;
        }

        // 定义一个变量,用来存储每次细胞分裂后的值
        int sum=1;
        for (int i = 0; i <days ; i++) {
            sum=sum*2;
        }
        System.out.println("细胞输出的结果是:"+sum);
    }
}