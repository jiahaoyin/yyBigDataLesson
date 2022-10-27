package com.yybd.base2_2;
import java.util.Scanner;

/**
 任务三：实现趣味英语试题 3  关键算法(25  分)
 编写一个程序实现统计一串字符串中的英文小写字母个数！例如： 输入“axZvnNgOuyi”，得到的值应该是 8；
 注意：使用分支语句实现，且有输入输出，直接输出不计分
 */
public class EnglishDemo3 {
    public static void main(String[] args) {
        short tmp=1;
        tmp+=1;
        System.out.println("tmp = " + tmp);
//        tmp=tmp+1;

        //1. 获取用户输入的字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要判断的字符串");
        String inputString = scanner.next();

        int sum=0;
        for (int i = 0; i <inputString.length(); i++) {
            if (inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z') {
                sum+=1;
            }
        }
        System.out.println("sum = " + sum);

    }
}