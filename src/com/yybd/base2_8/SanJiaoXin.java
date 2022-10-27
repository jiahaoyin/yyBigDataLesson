package com.yybd.base2_8;
import java.util.Scanner;
public class SanJiaoXin {
    public static void main(String[] args) {
        //1 接收用户输入的边长
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a:");
        double a = scanner.nextDouble();
        System.out.println("请输入b:");
        double b = scanner.nextDouble();
        System.out.println("请输入c:");
        double c = scanner.nextDouble();

        //2.判断输入的三个边长是否合法
        boolean isSuccess=(a+b>c) && (a+c>b) && (b+c>a);
        if (!isSuccess) {
            System.out.println("你输入的三个边长不正确");
            return;
        }

        double bianChang=a+b+c;
        System.out.printf("三角形边长是: %.2f",bianChang);
    }
}
