package com.yybd.base2_2;
import java.util.Scanner;

/**
 * 判断一个字符串是否是对称字符串， 例如：“abc”不是对称字符串，
 * “aba”、“abba”、“aaa”、“mnanm”是对称字符串。是的话输出 “Yes”，否则输出“No”。
 */
public class EnglishDemo2 {
    public static void main(String[] args) {
        //1. 获取用户输入的字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要判断的字符串");
        String inputString = scanner.next();

        // 2. 对字符串做首尾遍历循环,每次从对称位置的首部和尾部取值,如果相等就继续,否则就失败,退出循环

        //不要在for循环中直接输出状态的判断,而是要在for外面定义一个状态变量,
        // for循环中改变变量值,for循环后输出结果
        boolean isEquals = true;
        for (int i = 0; i < inputString.length() / 2; i++) {
//            判断每个从首部方向拿出的单个字符是否和对称的字符一样,如果一样,就继续
            if (inputString.substring(i, i + 1).equals(inputString.substring(inputString.length() - 1 - i, inputString.length() - i))) {
                continue;//结束当次循环
            } else {
                isEquals = false;
                break;
            }
        }
        if (isEquals) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}