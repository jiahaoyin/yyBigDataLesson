package com.yybd.base2_11;

/**
 * 我们都知道： 1+2+3+ ... + 49 = 1225。现在要求你把其中
 * 两个不相 邻的加号变成乘号，使得结果为 2015。
 *
 *
 * 例如：  1+2+3+...+10*11+12+...+27*28+29+...+49 = 2015
 * 就是符合要求 的答案。请你寻找所有可能的答案，
 * 并把前面的两个数字输出， 如上面 的就是输出(1027)。
 */
public class Password1 {
    public static void main(String[] args) {
        for (int i = 0; i <=48 ; i++) {
            for (int j = 0; j <= 47; j++) {
                //先找出加法里面的常量(结果减去变量的部分)
                int result1=1225-(i+i+1)-(j+j+1);
                //再找出乘法里面的常量(结果减去变量的部分)
                int result2=2015-(i*(i+1))-(j*(j+1));
                boolean isSuccess=(result1==result2);
                if (isSuccess) {
                    System.out.println(i);
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}