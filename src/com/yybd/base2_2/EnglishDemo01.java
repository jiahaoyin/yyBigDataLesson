package com.yybd.base2_2;
public class EnglishDemo01 {
        public static void main(String[] args) {
            //定义字符串数组,采用声明式定义,直接内容,不需要长度
            String[] a={"Hello " , "Hello " , "Hello " , "Hello ","Hello "};
            String[] b = {"Jack", "Tom", "Lee", "John", "Alisa"};
            //采用new方法声明数组
            String[] c = new String[a.length];
            //2. 遍历数组a和b,给c赋值
            for (int i = 0; i < a.length; i++) {
                c[i]=a[i]+b[i];
            }
            //打印c数组
            //如果采用Arrays.toString打印,没有题目要求的大括号,双引号,所以不能用下面打印
//        System.out.println(Arrays.toString(c));
            System.out.print("{");
            for (int i = 0; i < c.length; i++) {
//           如果是最后一行,那么值后面打印的是},否则,值后面打印的是逗号,
                if (i == c.length - 1) {
                    //如果需要输出双引号,需要转义符
                    System.out.print("\"" + c[i] + "\"}");
                } else {
                    System.out.print("\"" + c[i] + "\",");
                }
            }
        }
    }
