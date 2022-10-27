package com.yybd.base2_9;
/**
 * 任务一：实现汽车与摩托问题的关键算法(25  分)
 * 在一个停车场内，汽车、摩托车共停了 48  辆，
 * 其中每辆汽车有 4  个 轮子， 每辆摩托车有 3  个轮子， 这些车共有 172  个轮子，
 * 编程输出停 车场内有汽 车和摩托车的数量。注意：用循环语句实现。
 */
public class QiCheCount {
    public static void main(String[] args) {
        int cheCount=48;
        int lunCount=172;
        for (int i = 0; i <= cheCount; i++) {
            for (int j = 0; j <= cheCount; j++) {
                boolean isSuccess=(((i+j)==cheCount) && (4*i+3*j)==lunCount);
                if (isSuccess) {
                    System.out.println("汽车的数量是:"+i);
                    System.out.println("摩托车的数量是:"+j);
                }
            }
        }
    }
}