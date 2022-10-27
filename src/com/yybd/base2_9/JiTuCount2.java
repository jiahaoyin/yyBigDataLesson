package com.yybd.base2_9;

import java.util.Scanner;

/**
 * 任务二：实现鸡兔同笼问题的关键算法(25  分)
 * 已知鸡和兔的总数量为n,总腿数为m。输入 n  和 m,依次输出鸡 和兔的数目，
 * 如果无解，则输出“Noanswer”(不要引号)。
 * 注意：用循环语句实现。
 */
public class JiTuCount2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入鸡和兔的总数量:");
        int allCount=scanner.nextInt();
        System.out.println("请输入鸡和兔的总的腿的数量:");
        int allLegCount=scanner.nextInt();
        boolean isSuccess=false;
        for (int i = 0; i <allCount ; i++) {
            int tu=allCount-i;
            isSuccess=((i*2+tu*4)==allLegCount);
            if (isSuccess) {
                System.out.println("鸡的数量是:" + i);
                System.out.println("兔的数量是:" + tu);
            }
        }
        if (!isSuccess) {
            System.out.println("No  Answer");
        }

    }
}