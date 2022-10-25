package com.yybd.base2_1;
import java.util.Arrays;
import java.util.Scanner;

/**
 *任务二：实现查数功能关键算法(25  分)
 * 求 n (2<=n<=10) 个整数中倒数第二小的数。每一个整数都独立看 成一个数， 比如， 有三个数分别是 1，1，3，那么， 第二小的数就是 1。 (每个数 均小于 100)
 * 说明： 首先输入一个整数 n，然后输入 n  个数。请输出第 2  小的 数。例如输入：
 * 5
 * -5 - 10 10 50 80
 * 程序输出第 2  小的数： -5
 * 注意：使用循环实现。
 */
public class SceordSort {
    public static void main(String[] args) {
//       测试hello成功,表示java环境和idea(eclipse)没问题
        System.out.println("hello");
        // 1. 定义控制台数据获取scanner
//          Scanncer是一个输入流包装数据获取类,
//          System.in是系统内置的控制台输入流
        Scanner scanner=new Scanner(System.in);

        //2.接收用户输入:
//        next 获取用户控制台输入的字符串,但是以回车或者空格为结束
        System.out.println("请输入数量,用整数");
        int count = scanner.nextInt();
//        System.out.println("你输入的评委数量是: " + count);

        //3 接收每个评委的分数
//          定义一个数组,用来接收评委的分数,数组的长度就是评委的数量
        int[] scoreArray=new int[count];
        for (int i = 0; i <count ; i++) {
            int score = scanner.nextInt();
            scoreArray[i]=score;
//            System.out.println("score = " + score);
        }

        //4,对用户输入的数据继续排序,使用冒泡算法,虽然性能较低,但是考的基本功比较多
        // 图示:https://blog.csdn.net/weixin_44895385/article/details/121709651

        //外循环表示把从第一个数开始,所有的数都要跟后面比较一遍
        for (int i = 0; i < count-1; i++) {
            //内循环 把每个数跟右边的数比较,如果是后面大,就继续交换
            for (int j = 0; j < count-i-1; j++) {
                //把每个数跟右边的数比较,如果是后面大,就继续交换
                if (scoreArray[j] > scoreArray[j + 1]) {
                    int temp = scoreArray[j];
                    scoreArray[j]=scoreArray[j+1];
                    scoreArray[j+1]=temp;
                }
            }
        }
        //4 . 测试下输入分数,打印数组(注意:数组不能直接打印,要遍历或者使用工具类Arrays.toString方法)
        System.out.println("第二小的数是 " + scoreArray[1]);
    }
}