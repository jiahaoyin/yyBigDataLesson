package com.yybd.base2_6;

public class QiuShu3 {
    /**
     * 职员小 A  今天犯了一个致命的错误，
     * 他一不小心丢失了 X  项目 的市场调查结果只记得一个公式 xyz+yzz=532，
     * 其中 x 、y 、z  均为一 位数，
     * 现在请你帮忙编写一个程序求出 x 、y 、z  分别代表什么数。
     */
    public static void main(String[] args) {
//        传入的是实参
        printNumber(532);
    }
    //定义的result是形参,是参数的声明,
    public static void printNumber(int result) {
        int x=0;
        int y=0;
        int z=0;
        for ( x = 0; x < 10; x++) {
            for ( y = 0; y < 10; y++) {
                for ( z = 0; z < 10; z++) {
                    if (x * 100 + y * 10 + z + y * 100 + z * 10 + z == result) {
                        System.out.println("x = " + x);
                        System.out.println("y = " + y);
                        System.out.println("z = " + z);
                    }
                }
            }
        }
    }
}
