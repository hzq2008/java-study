/**
 * 可以用来自动创建文档的注释
 * @auther hzq
 */
public class Hello {
    // main方法
    public static void main(String[] args) {
        intF();
        intF1();
    }
    public static void intF() {
        int n = 100; // 定义变量n，同时赋值为100
        System.out.println("n = " + n); // 打印n的值

        n = 200; // 变量n赋值为200
        System.out.println("n = " + n); // 打印n的值

        int x = n; // 变量x赋值为n（n的值为200，因此赋值后x的值也是200）
        System.out.println("x = " + x); // 打印x的值

        x = x + 100; // 变量x赋值为x+100（x的值为200，因此赋值后x的值是200+100=300）
        System.out.println("x = " + x); // 打印x的值
        System.out.println("n = " + n); // 再次打印n的值，n应该是200还是300？
    }
    public static void intF1() {
        //  整数类型：byte，short，int，long
        //  浮点数类型：float，double
        //  字符类型：char
        //  布尔类型：boolean
        //  1.整数类型
        //  (1个字节)byte：-128 ~ 127
        //  (2个字节)short: -32768 ~ 32767
        //  (4个字节)int: -2147483648 ~ 2147483647
        //  (8个字节)long: -9223372036854775808 ~ 9223372036854775807
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512
        long l = 9000000000000000000L; // long型的结尾需要加L
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(l);

    }
} // class定义结束
