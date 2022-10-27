package com.yybd.base2_4;

import java.util.Scanner;

/**
 * 任务一：实现计算体积关键算法(25  分)
 *
 *
 * 根据输入的半径值， 计算球的体积。
 * 输入数据有多组， 每组占一行， 每行包括一个实数， 表示球的半径。
 * 输出对应球的体积，
 * 对于每组输入数据，输出一行，计算结果保留三位小数。注： PI = 3.1415927
 *
 *
 * 球体的体积计算公式：
 *
 * V=(4/3)πr^3
 *
 * 解析：三分之四乘圆周率乘半径的三次方 。
 */
public class QiuDemo01 {
    public static void main(String[] args) {
        //第一步,接收输入半径值的数量
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入球的数量");
        int count = scanner.nextInt();

        //第二步,接收具体的每组球的半径
        double[] qiuArray=new double[count];
        for (int i = 0; i <count ; i++) {
            double v = scanner.nextDouble();
            qiuArray[i]=v;
        }

        //第三步,计算球的体积
        double[] qiuTiJiArray=new double[count];
        for (int i = 0; i < count; i++) {
            double r= qiuArray[i];
            qiuTiJiArray[i]=4.0/3.0*3.1415927*Math.pow(r,3);
            //System.out.println("球的体积是"+qiuTiJiArray[i]);
            //打印保留小数,printf是格式化输出
            System.out.printf("球的体积:%.3f",qiuTiJiArray[i]);
        }

    }
}
