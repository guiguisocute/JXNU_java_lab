package p4;

/*
假设给定输入：1.2+3.4*（5.6-7.8/（9.0-10））。请借助正则表达式实现：（1）提取出
所有的操作数，并输出； （2）提取出所有的运算符（注意左右括号也视为运算符）；
 */

import java.util.regex.Matcher;

public class App {
    public static void main(String[] args) {
        String str = "1.2+3.4*(5.6-7.8/(9.0-10))";
        String regex1 = "\\d+(\\.)?\\d+"; //匹配操作数
        String regex2 = "[+\\-*/()]"; //匹配运算符

        System.out.println("操作数有：");
        Matcher m1 = java.util.regex.Pattern.compile(regex1).matcher(str);
        while (m1.find()) {
            System.out.print(m1.group() + " ");
        }
        System.out.println("\n运算符有：");
        Matcher m2 = java.util.regex.Pattern.compile(regex2).matcher(str);
        while (m2.find()) {
            System.out.print(m2.group() + " ");
        }
    }
}

