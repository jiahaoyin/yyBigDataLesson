package com.yybd.base2_6;

import java.util.Scanner;

/**
 * 任务一：实现销售分析功能关键算法(25  分)
 * A  商店准备在今年夏天开始出售西瓜，
 * 西瓜的售价如下， 20  斤以 上的每斤 0.85  元；重于 15  斤轻于等于 20  斤的，
 * 每斤 0.90  元；重 于 10  斤轻于等于 15  斤的， 每斤 0.95  元；
 * 重于 5  斤轻于等于 10  斤 的， 每斤 1.00  元； 轻于或等于 5  斤的， 每斤 1.05  元。
 * 现在为了知道 商店是否会盈利要求 A
 * 公司帮忙设计一个输入西瓜的重量和顾客所付钱数，输出应付货款和应找钱数的程序。
 * 注意：使用分支结构语句实现，结果保留两位小数
 */
public class Xigua1 {
    public static void main(String[] args) {
        //1. 接收西瓜的重量
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入重量");
        double weight = scanner.nextDouble();

        // 定义一个价格变量
        double price=0.0;
        //2. 按照西瓜重量,判断价格
        if (weight<=5) {
            price=1.05;
        } else if (weight > 5 && weight <= 10) {
            price=1.00;
        } else if (weight > 10 && weight <= 15) {
            price=0.95;
        } else if (weight > 15 && weight <= 20) {
            price=0.9;
        } else if (weight > 20) {
            price=0.85;
        }

        double result=weight*price;
        System.out.println("应付金额是:" +result);
        System.out.println("请输入用户输入的钱数:");
        double money = scanner.nextDouble();
        double back=money-result;

        //打印结果精确到两位小数
//        System.out.println("找回的金额是:" +back);
        System.out.printf("找回金额是: %.2f\n", back);

        System.out.println(result);
    }
}
