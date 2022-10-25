package com.yybd.base2_1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 任务三：实现分数排序功能关键算法(25  分)
 小明的老师今天教了冒泡排序， 但是小明在网上找到一种更加方便 的排序， 但是小明不会使用， 你能帮帮他吗？ 定义一个 n  输入 n (0<n<1000)然后输入 n  正整数，输出从小到大输入结果。
 注意：按照题目描述完成程序，使用 sort  方法实现。
 */
public class SortDemo {
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

        //5 .自己写的算法性能较差,并且有bug,一般排序其实使用是的JDK自带的Arrays.sort方法
        Arrays.sort(scoreArray);

        //4 . 测试下输入分数,打印数组(注意:数组不能直接打印,要遍历或者使用工具类Arrays.toString方法)
        System.out.println("排序后的值是:"+Arrays.toString(scoreArray));
    }
}
