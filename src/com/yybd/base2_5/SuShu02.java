package com.yybd.base2_5;
import java.util.Scanner;
/**
 * 现在公司需要统计出某个范围内哪些数是 素数。
 * 从键盘上输入一个整数 N，输出 1~N  之间的素数。
 */
public class SuShu02 {
    public static void main(String[] args) {
        //1.接收用户的输入
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        //2.遍历输入的变量,找出所有的素数
        for (int i = 2; i <input ; i++) {
            int j=2;
            //让当前值除以所有比它小的值,如果不是整除则j++
            while (i %j!=0) {
                j++;
            }
            //如果最后j一直加到i,都没有整除,那么说明当前数就是素数
            if (i==j) {
                System.out.println("找出素数"+i);
            }
        }
    }
}