package com.yybd.base2_7;
/**
 * 中国古代文献中，曾记载过“大衍数列”,  主要用于解释中国传统 文化中的太极衍生原理。
 * 它的前几项是： 0、2、4、8、12、18、24、32 、 40 、50 ...。
 * 其规律是： 对偶数项， 是序号平方再除 2，奇数项， 是序号 平方减 1  再除 2。投资人决定，
 * 节庆活动抽奖活动的中奖序列按照“大 衍数列”的前 100  项。请你打印出“大衍数列”的前 100  项。
 */
public class DaYan2 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                int result = (i * i) / 2;
                System.out.println( result);
            } else {
                int result = ((i * i)-1 )/ 2;
                System.out.println(result);
            }
        }
    }
}
