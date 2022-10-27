package com.yybd.base2_6;


/**
 * 任务二：实现销售量分析功能关键算法(25  分)
 * KJ 学院为全校同学设计一套校服，A  公司有意招标为 A  学校设 计服装，职员小 C  在 A  校排队时偷偷的看了一眼发现
 * A  学校学生， 5  人一行余 2  人， 7  人一行余 3  人， 3  人一行余 1  人，
 * 编写一个程 序求该校的学生人数。
 * 因为结果比较多,最好学校的人数有个范围,譬如,大于1900
 */
public class XiaoFu2 {

public static void main(String[] args) {
        for (int i = 0; i < 2000; i++) {
        if ((i % 5 == 2) && (i % 7 == 3) && (i % 3 == 1)) {
        System.out.println("学校人数:"+i);
        }
        }
        }
}
