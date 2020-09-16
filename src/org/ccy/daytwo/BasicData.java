package org.ccy.daytwo;

public class BasicData {
//整型:byte、short、int、long
    public  static  void main(String[] args ) {
        //加法运算
        int i=1;
        int m=3;
        i=i+m;
        System.out.println("i ="+i);

        //混合运算
        int n=(90-50+40)*(2)/4;
        System.out.println("n="+n);

        int m1=12/5;///除法    2
        int m2=12%9;///求余    3
        System.out.println("m1="+m1);
        System.out.println("m2="+m2);

        ///byte 范围 -128~127
        byte t=-128;
        byte t1=127;
        System.out.println("t="+t);
        System.out.println("t1="+t1);
        //short范围： -32768 ~ 32767
        short s1=32767;
        System.out.println("s1="+s1);
        //int范围： -2147483648 ~ 2147483647
        int i1=123456578;
        System.out.println("i1="+i1);
        //long范围： -9223372036854775808 ~ 9223372036854775807
        long l = 9000000000000L;
        System.out.println("l="+l);
//浮点:float  double
        float f1=3.1415e32f;
        double d = 1.79e300;
        System.out.println("f1="+f1);
        double d1=1.0+24.0/5;  //1.0+4.8=5.8   两个数其中一个是整型，那么整型可以自动提升到浮点型
        double d2=1.0+24/5;    //1.0+4.0=5.0   两个整数的运算不会出现自动提升的情况
        System.out.println("d1="+d1);
        System.out.println("d2="+d2);

//布尔类型:boolean
        boolean b=5>6;
        System.out.println(b);
//字符类型char
        char a='A';
        System.out.println(a);
//引用数据类型:String
        String s2="String 类型";
        System.out.println("s2="+s2);
//常量final
        final int  f2=1234567;///定义常量后无法进行赋值
//String  字符串连接   通过”+“
        String s3="Hello";
        String s4="World";
        String s5=s3+s4;
        System.out.println(s5);
//String 不可变特性
        String s6="ccy";
        //System.out.println(s6);
        String s7=s6;
        s6="ccy1";
        System.out.println(s7); //输出ccy
//字符串的比较，比较字符串的内容是否相同。必须使用equals()方法而不能用==
        String s8="ccy2";
        String s9="CCY2".toLowerCase();//将大写转换成小写
        String s13="ccy2";
        System.out.println(s8==s9);  //false
        System.out.println(s8.equals(s9));//true

        System.out.println(s8==s13); //true
        System.out.println(s8.equals(s13));//true
        char c=s8.charAt(2);//提取指定位置的字符
        System.out.println(c);
        System.out.println(s8.endsWith("y2")); //是否包含以什么什么结尾
        System.out.println(s8.startsWith("c"));//是否包含以什么什么开始
        System.out.println(s8.indexOf("p"));  //存在返回所在位置的下标，不存在返回-1
        System.out.println(s8.substring(0,3));//截取指定位置的字符串，含头不含尾




    }
}

