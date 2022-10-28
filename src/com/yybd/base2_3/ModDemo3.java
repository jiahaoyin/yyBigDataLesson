package com.yybd.base2_3;

import java.util.Scanner;

public class ModDemo3 {
    public static void main(String[] args) {
        // 接收用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数n：");
        int n = scanner.nextInt();

        //开始遍历，来寻找最小的x，使用for循环做一个无限循环
        int x = 1;

        // 定义一个每次遍历的结果，来保存每次乘以2的值，其实就是2的几次方
        int result = 1;
        for (;;x++){
            // result=result*2;传统写法，如果result和int类型不一致，可能会报错
            result *= 2; //简略写法，包含了隐式转化，这样的代码安全性比较高
            if (result %n == 1) {
                System.out.println("2^"+x+"mod"+n+"=1");
                break;
            }
            if (x == n) {
                System.out.println("2^？"+"mod"+n+"=1");
            }
        }
    }
}
