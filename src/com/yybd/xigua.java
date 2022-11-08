package com.yybd;

import java.util.Scanner;

public class xigua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入西瓜的重量：");
        double height = scanner.nextDouble();
        System.out.println("请输入顾客的钱数：");
        double pay =scanner.nextDouble();

        double sum =0;
        double price =0.00;
        if (height>20) {
            price = 0.85;
        } else if (height>15 && height<=20) {
            price =0.90;
        }else if (height>10 && height <=15){
            price=0.95;
        }else if (height>5 && height<=10){
            price=1.00;
        } else if (height<=5) {
            price=1.05;
        }
        sum = height*price;
        System.out.println("西瓜应付金额为："+sum+"元");
        double back=pay-sum;
        System.out.printf("应找金额：%.2f\n", back);
    }
}
