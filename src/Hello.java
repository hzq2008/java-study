/**
 * 可以用来自动创建文档的注释
 * @auther hzq
 */
public class Hello {
    // main方法
    public static void main(String[] args) {

    }
    /**
     * 基本数据类型
     */
    public static void baseType() {
        //  字节（byte），一个字节就是一个8位二进制数，即8个bit。它的二进制表示范围从00000000~11111111，换算成十进制是0~255，换算成十六进制是00~ff。
        //  整数类型：byte，short，int，long
        //  浮点数类型：float，double
        //  字符类型：char
        //  布尔类型：boolean
        /*
         *   一.整型
         */
        // 对于整型类型，Java只定义了带符号的整型，因此，最高位的bit表示符号位（0表示正数，1表示负数）。各种整型能表示的最大范围如下：
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
        /*
         *  二.浮点型
         */
        // 浮点类型的数就是小数，因为小数用科学计数法表示的时候，小数点是可以“浮动”的，如1234.5可以表示成12.345x102，也可以表示成1.2345x103，所以称为浮点数。
        // 对于float类型，需要加上f后缀。
        // 浮点数可表示的范围非常大，(4个字节)float类型可最大表示3.4x1038，而(8个字节)double类型可最大表示1.79x10308。
        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
        /*
         * 三.布尔类型(4字节整数)
         */
        // 布尔类型boolean只有true和false两个值，
        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3; // 计算结果为true
        int age = 12;
        boolean isAdult = age >= 18; // 计算结果为false
        /*
         * 四.字符类型(2个字节)
         */
        // 字符类型char表示一个字符。Java的char类型除了可表示标准的ASCII外，还可以表示一个Unicode字符：
        char a = 'A';
        char zh = '中';
    }
    /**
     * 引用数据类型
     */
    public static void referenceType() {
        // 引用类型的变量类似于C语言的指针，它内部存储一个“地址”，指向某个对象在内存的位置
        /*
         * 一.String字符串
         */
        String s = "hello";
    }

    public static void others() {
        /*
         * 一.常量
         */
        // 定义变量的时候，如果加上final修饰符，这个变量就变成了常量
        // 常量在定义时进行初始化后就不可再次赋值，再次赋值会导致编译错误。
        // 常量的作用是用有意义的变量名来避免魔术数字（Magic number），例如，不要在代码中到处写3.14，而是定义一个常量。如果将来需要提高计算精度，我们只需要在常量的定义处修改，例如，改成3.1416，而不必在所有地方替换3.14。
        // 根据习惯，常量名通常全部大写。
        final double PI = 3.14; // PI是一个常量
        double r = 5.0;
        double area = PI * r * r;
        // PI = 300; // compile error!
        /*
         * 二.var关键字
         */
        // 有些时候，类型的名字太长，写起来比较麻烦。例如： StringBuilder sb = new StringBuilder();
        // 如果想省略变量类型，可以使用var关键字： var sb = new StringBuilder();
        // 编译器会根据赋值语句自动推断出变量sb的类型是StringBuilder。

    }
} // class定义结束
