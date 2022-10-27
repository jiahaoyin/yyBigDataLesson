package com.yybd.base2_3;

import java.util.Scanner;

/**
 * 任务一：实现统计元音关键算法(25  分)
 * 输入一个字符串统计每个元音字母(aeiou) 在字符串中出现的次数。对 于结果输出 5  行，格式如下：
 * a:  (a  的个数)
 * e:  (b  的个数)
 * i:  (i  的个数)
 * o:  (o  的个数)
 * u:  (u  的个数)
 */
public class NetExam01 {
    public static void main(String[] args) {
        //第一步,接收用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String next = scanner.next();

        // 第二步把元音字母定义成一个char的数组,方便后面计算,来代替if判断
        char[] yuanArray={'a','e','i','o','u'};

        //用来收集元音字母的数量,要和元音字母对应,所以长度是5
        int[] yuanCount=new int[5];

        //第三步,遍历输入字符串的字符,来进行比较
        for (int i = 0; i < next.length(); i++) {
            char sh = next.charAt(i);
            //把拿出的字符跟元音数组里面的每个值比较,如果有相同,那么就标识找到对应的字符
            for (int j = 0; j <yuanArray.length ; j++) {
                //如果传入的字符是和当前元音字母一样,那么当前元音字母的数量就加一
                if (sh == yuanArray[j]) {
                    yuanCount[j]+=1;
                    break;
                }
            }
        }

        //输出结果:
        for (int i = 0; i <yuanArray.length ; i++) {
            System.out.println(yuanArray[i]+":"+yuanCount[i]);
        }

    }
}
