package com.yybd.base2_4;
import java.util.Scanner;

/**
 * 任务三：实现图形面积大小比较关键算法(25  分)
 * 按顺序输入正方形的边长(a) ，长方形的长(l) 和宽(d) ，以及 圆的半径(r)，
 * 计算并比较它们哪个图形面积更大，输出面积最大的 图形。例如：输入 1 3 4 1，输出：长方形
 */
public class MianJiDemo3 {
    public static void main(String[] args) {
        // 1.接收用户输入的参数
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] array = s.split(" ");
//      正方形面积
        double zfx = Double.parseDouble(array[0]) * Double.parseDouble(array[0]);
//        长方形面积
        double cfx= Double.parseDouble(array[1]) * Double.parseDouble(array[2]);
//        圆的面积
        double yuan = Math.PI * Math.pow(Double.parseDouble(array[3]), 2);
        //比较三个面积,假设三个都不相等
        if (zfx > cfx && zfx > yuan) {
            System.out.println("正方形面积最大");
        } else if (cfx > zfx && cfx > yuan) {
            System.out.println("长方形面积最大");
        }else if (yuan > zfx && yuan > cfx) {
            System.out.println("圆的面积最大");
        }
    }
}