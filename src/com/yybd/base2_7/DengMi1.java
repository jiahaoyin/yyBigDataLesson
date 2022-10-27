package com.yybd.base2_7;
/**
 * 任务一：实现元宵灯谜问题关键算法(25  分)
 * 小明带两个妹妹参加元宵灯会。别人问她们多大了，
 * 她们调皮地说： “我们俩的年龄之积是年龄之和的 6  倍”。小明又补充说：“她们可
 * 不是双胞胎，年龄差肯定也不超过 8  岁啊。”请你编程求出小明的较 小的妹妹的年龄。
 */
public class DengMi1 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j <i ; j++) {
                //如果布尔表达式比较长,那么一般都要用变量代替
                boolean isEquals = ((i * j == (i + j) * 6)) && (((i - j) < 8));
                if (isEquals) {
                    System.out.println("妹妹的年龄是:"+j);
                }
            }
        }
    }
}
