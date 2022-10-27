package com.yybd.base2_9;

/**
 * 任务三：实现合格电视机问题的关键算法(25  分)
 *
 *
 * 某电视机厂每天生产电视 500  台，在质量评比中，每生产一台合 格电视机记 5  分，
 * 每生产一台不合格电视机扣 18  分。如果四天得了
 * 9931  分，编程计算这四天生产的合格电视机的台数，并输出。 注意：用循环语句实现。
 */
public class TV3 {
    public static void main(String[] args) {
        //电视机的总量是2000
        int tvCount=2000;
        //假设i就是合格的电视机的数量
        for (int i = 0; i <tvCount ; i++) {
            //假设j就是不合格的计算机的数量
            for (int j = 0; j <tvCount ; j++) {
                //把布尔表达式抽取成一个变量,最好用小括号声明优先级
                boolean isSuccess=(((i+j)==tvCount) && ((i*5-j*18)==9931));
                //如果表达式为真,则说明找到了合适的合格电视机盒不合格电视机
                if (isSuccess) {
                    System.out.println("4天产生的合格的计算机的数量是:"+i);
                }
            }
        }
    }
}