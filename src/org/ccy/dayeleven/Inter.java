package org.ccy.dayeleven;

import java.util.Scanner;

class Inter {
    //main方法
    public static void main(String[] args) {
       Student student=new Student();
       student.run();  ///调用run方法即可

    }

    //定义接口   接口内只能定义方法  不能有方法体
    interface Person{
        void run();//运行
        int add();//求和

    }
//定义实现类Student实现接口
    static class Student implements Person{
        private int  sum;
        private int  m;
        private  int n;


        @Override
        public void run() {
            System.out.println(add());//调用求和add方法

        }
//add实现逻辑  进行求和
        @Override
        public int add() {
            System.out.print("请输入m：");
            Scanner scanner=new Scanner(System.in);
            m=scanner.nextInt();
            System.out.print("请输入n:");
            n=scanner.nextInt();
            sum=m+n;
            System.out.print("sum=");
            return sum;

        }
    }
}
