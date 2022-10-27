package com.yybd.base2_4;

import java.util.Scanner;

/**
 * 任务二：实现坐标求长度关键算法(25  分)
 * 输入两点坐标(X1,Y1) ,  (X2,Y2) ,计算并输出两点间的距离。
 * 输 入数据有多组，每组占一行，由4个实数组成，分别表示 x1,y1,x2,y2, 数据之间用空格隔开。
 * 例如输入：  1 3 4 6  则输出： 4.24
 * 注意：结果保留两位小数。
 */
public class ChangDuDemo2 {
    public static void main(String[] args) {
        //1.接收两个坐标,四个值
        Scanner scanner = new Scanner(System.in);
        //如果要获取一行的完整的值,其中包含了空格,就不能使用next,而要使用nextLine
        String inputString = scanner.nextLine();
        System.out.println("next = " + inputString);
//     2. 把接收到的字符串通过空格切分成数组,然后转化成对应的double类型的坐标
        String[] s = inputString.split(" ");
        double x1= Double.parseDouble(s[0]);
        double y1= Double.parseDouble(s[1]);
        double x2= Double.parseDouble(s[2]);
        double y2= Double.parseDouble(s[3]);
//      3.计算长度,原理上勾股定理,斜边的值等于其余两边的平方之和的平方根
        double result = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        System.out.printf("坐标的长度是 %.2f",result);
    }
}