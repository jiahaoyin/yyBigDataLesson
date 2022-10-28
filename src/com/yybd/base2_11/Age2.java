package com.yybd.base2_11;

import java.util.HashSet;
import java.util.Set;

/**
 * 美国数学家维纳(N.Wiener)智力早熟， 11  岁就上了大学。
 * 他曾在 1935~1936  年应邀来中国清华大学讲学。一次，
 * 他参加某个重要会议， 年轻的脸孔引人注目。于是有人询问他的年龄，
 * 他回答说：  “我年龄的 立方是个 4  位数。我年龄的 4  次方是个 6  位数。
 * 这 10  个数字正好包 含了从 0  到 9  这 10  个数字， 每个都恰好出现 1  次。
 * ”请你编程计 算，他当时到底有多年轻。
 * 注意：使用循环实现，输出他的年龄在一行
 */
public class Age2 {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            // 得到年龄的立方
            int ageLi=(int)Math.pow(i,3);
            int age4=(int)Math.pow(i,4);

            // 把年龄通过非正式的语法转化成字符串
            String ageLiStr=""+ageLi;

            //通过正式语法把int转化成String
            String age4Str = String.valueOf(age4);

//            System.out.println("ageLiStr = " + ageLiStr);
//            System.out.println("age4Str = " + age4Str);

            boolean isAgeLiLengthOK=(ageLiStr.length()==4);
            boolean isAge4LengthOK=(age4Str.length()==6);

            //拼接年龄的立方和四次方字符串,长度是10位
            String allString=ageLiStr+age4Str;

            //把两个年龄的立方4次方之和的拼接字符串进行遍历,拆分成char类型,放到set集合中,10
            Set<Character> set=new HashSet();
            for (int j = 0; j <allString.length() ; j++) {
                char c = allString.charAt(j);
                set.add(c);
            }

            // 判断集合里面是否有10个值,如果是的话,就表示它里面的放入的char(数字)没有重复
            boolean isAllNumberOk=set.size()==10;

            //判断所有条件是否都成立 3次方长度是4  4次方长度是6 两个字符串拼接只有0-9的10个数字
            boolean isSuccess = isAgeLiLengthOK && isAge4LengthOK && isAllNumberOk;
            if (isSuccess) {
                System.out.println(i);
            }
        }
    }
}
