package com.yybd.base2_5;
import java.util.Scanner;
/**
 * 现在公司需要统计某个范围内能被 7  整除的整数的个数， 以及这些能被 7  整除的数的和。
 * 从键盘上输入一个整数 N，输出 1~N 之间能被 7  整除的整数的个数，
 * 以及这些能被 7  整除的数的和
 */
public class SumAndCount1 {
    public static void main(String[] args) {
        //1.定义接收用户的输入
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        //定义这些数的数量变量
        int count=0;
        int sum=0;

//      2.遍历找出1-n之间能被7整除的数
        for (int i = 1; i <input ; i++) {
            if (i%7==0) {
                count++;
                sum+=i;
            }
        }
        System.out.println("能被7整除的数有"+count+"个 它们的和是:"+sum);
    }
}