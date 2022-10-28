package com.yybd.base2_10;

import java.util.Scanner;

/**
 * 大家都知道， 手机号是一个 11  位长的数字串， 同时作为学生，
 * 还 可以申请加入校园网， 如果加入成功， 你将另外拥有一个短号。
 * 假设所 有的短号都是 6+手机号的后 5  位，比如号码为 13512345678 的手机，
 * 对应的短号就是 645678。现在，
 * 如果给你一个 11  位长的手机号码，
 * 你 能找出对应的短号吗？要求：输入一个手机号输出对应的手机短号。
 */
public class DuanHao3 {
    public static void main(String[] args) {
        // 第一步 获取用户手机号
        Scanner scanner=new Scanner(System.in);
        System.out.println(" 请输入正确的手机号,共11位整数:");
        String phoneNumber = scanner.next();

        //取出手机号的后六位
        String substring = phoneNumber.substring(6);
        System.out.println("substring = " + substring);

//        得到短号:
        String duanHao ="6"+substring;
        System.out.println("手机短号是:"+duanHao);
    }
}