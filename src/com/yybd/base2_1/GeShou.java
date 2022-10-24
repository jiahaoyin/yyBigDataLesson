package com.yybd.base2_1;
import java.util.Arrays;
import java.util.Scanner;
public class GeShou {
    public static void main(String[] args) {
        /**
         * 任务一：实现计算平均分功能关键算法（25 分）
         * 小明今天参加了“校园歌手大赛”，评委的打分规则是去掉一个最低分和一个最高分后算出剩下分数的平均分，你能帮助小明快速的算出平均分吗？（评委数量必须大于2）
         * 输入说明：首先输入一个整数n，代表评委人数，然后输入n个数。请按照题目的计算规则计算出平均分然后输出。例如输入：
         * 6
         * 100 90 90 80 85 95
         * 按照题目注意计算平均分并输出：
         * 90.0
         * 注意：使用循环和数组实现。
         */
        // 测试hello成功，表示java环境和idea配置没问题
//        System.out.println("hello");
        // 1.定义控制台获取scanner
        // scanner是一个输入流包装数据获取类
        Scanner scanner = new Scanner(System.in); // system.in指的是系统内置的控制台输入流，out指输出流
        // 2.接收用户输入
        // next 获取用户控制台输入的字符串，但是以回车或者空格为结束
        System.out.println("请输入评委的数量，用整数:");
        int count = scanner.nextInt();
        System.out.println("输入评委的数量是:" + count); // 快捷打印，变量名+soutv
        //3.接收每个评委的分数
//        定义一个数组，用来接收评委的分数，数组的长度就就是评委的数量
        int[] scoreArray=new int[count];
        for (int i=0;i<count;i++){
            int score = scanner.nextInt();
            scoreArray[i]=score;
        }

        //对用户输入的数据进行排序，使用冒泡算法，虽然性能低，但是考的基本点很多
        //外循环表示把从第一个数开始，所有的数都要跟后面的数比较一遍
        for (int i=0;i<count-1;i++){
            //内循环  把每个数跟右边的比较，如果是后面的大，就继续交换
            for (int j=0;j<count-i-1;j++){
                // 把每个数跟右边的数比较，如果是后面大，就继续交换
                if (scoreArray[j] > scoreArray[j + 1]) {
                    int temp = scoreArray[j];
                    scoreArray[j]=scoreArray[j+1];
                    scoreArray[j + 1] = temp;
                }
            }
        }
        //4.测试下输入分数，打印数组（注意：数组不能直接打印，要遍历或者使用工具类Arrays）
        System.out.println(Arrays.toString(scoreArray));
    }
}
