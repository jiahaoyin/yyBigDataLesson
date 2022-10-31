package com.yybd.base2_3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 任务二：实现 Switch Game  关键算法(25  分)
 * 有 n 盏灯， 编号 1~n (0<n<100)。第 1 个人把所有灯打开，
 * 第 2 个人按下所有编号为 2 的倍数的开关(这些灯将被关掉) ，
 * 第 3 个人 按下所有编号为 3 的倍数的开关(其中关掉的灯将被打开， 开着的灯 将被关闭) ，
 * 依次类推。输入灯数和人数， 输出开着的灯的编号。比如
 * 输入： 10 2 输出最后亮灯的编号： 1,3,5,7,9
 * 注意：使用循环语句实现。
 */
public class SwitchGame2 {
    public static void main(String[] args) {
        //1. 接收用户的参数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入灯数:");
        int dengCount=scanner.nextInt();
        System.out.println("请输入人数");
        int userCount=scanner.nextInt();

        //2. 初始化灯,因为灯都有序号,所以把灯放入一个List中,一般是放入ArrayList
//       因为在运算过程中要使用灯的编号来计算,所以在list要使用int的泛型 Integer
        List<Integer> list = new ArrayList();
        for (int i = 0; i <dengCount ; i++) {
            //默认打开所有的灯
            list.add(1);
        }

        //3.第一个开始打开所有的灯,所以打开开关的人从2开始
        for (int i = 2; i <= userCount; i++) {
            //进来一个人,开始遍历所有的灯
            for (int j = 1; j <= dengCount; j++) {
                //如果灯的编号取余人的顺序为0,则表示匹配,那么就按下开关
                if (j %i==0) {
                    //先获取原来灯的状态
                    Integer integer = list.get(j-1);
                    //对原来灯进行取反操作(开变成关,关变成开)
                    list.set(j-1,integer*-1);
                }
            }
        }
        String result="";
        for (int i = 1; i <=dengCount ; i++) {
            if (list.get(i-1)==1) {
                result=result+i+",";
            }
        }
        System.out.println(result);

        //判断当前字符串最后一位是不是,
        if (result.lastIndexOf(",")==result.length()-1) {
//            如果当前字符串最后一位是逗号,则把最后一位截取掉
            result=result.substring(0,result.length()-1);
        }
        System.out.println("result = " + result);
    }
}