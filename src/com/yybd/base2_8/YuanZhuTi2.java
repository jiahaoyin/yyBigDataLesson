package com.yybd.base2_8;

import java.util.Scanner;

public class YuanZhuTi2 {
    /**
     * 圆柱的表面积公式：S表=2πr²+2πrh。
     * 任务二：实现图形计算功能 2  关键算法(25  分)
     * 输入三个数， 分别是圆柱体底圆的高 h，半径 r，请你编程求出该 圆柱的表面积。
     *
     * 注意： PI = 3.14 ，输出结果保留两位小数。
     */
    private final static double PI=3.14;
    public static void main(String[] args) {
        // 1.接收用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆柱体的高h");
        double h= scanner.nextDouble();
        System.out.println("请输入圆柱体的半径r");
        double r=scanner.nextDouble();

        //2. 获取圆柱体的表面积=上下圆的面积+侧面积
        double area=2*PI*Math.pow(r,2)+2*PI*r*h;

        //3.保留两位小数输出
        System.out.printf("%.2f",area);
    }
}
