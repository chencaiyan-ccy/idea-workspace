package org.ccy.dayfour;

import java.util.Scanner;

public class ShuZu {
    public static void main(String[] args) {
        //int数组
        int[] i={};
        int[] s=new  int[6];//定义数组并定义数组的大小
        s[0]=89;//给数组进行赋值
        s[1]=78;
        s[2]=45;
        s[3]=65;
        s[4]=42;
        s[5]=90;
        int[]  n;   //定义数组
        n=new int[]{34,56,78,8,9,90};
        int[]  p=new int[]{56,78};
        //String 数组
        String[] z=new String[]{"你","是","谁"};
        String[] name={"Sam","AMY"};
        String[] str;
        str=new String[]{""};

////输入流 Scanner
        Scanner scanner=new Scanner(System.in);  //从控制台输入内容
        System.out.println("输入内容");
        String ccy=scanner.nextLine();     //读取一行，获取字符串
        System.out.println("输入数字");
        int zs=scanner.nextInt();//

        System.out.println(s[5]);
        System.out.println(s.length);

        ///设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比.
        Scanner scanner1=new Scanner(System.in);
        System.out.print("请输入上一次的成绩：");
        int score_old=scanner1.nextInt();
        System.out.print("请输入本次考试成绩：");
        int score_new=scanner1.nextInt();
        float scoreRate=(score_new-score_old)/(float)score_old;
        System.out.println(scoreRate);

//遍历数组  foreach
       /* int[] sz=new int[]{1,3,5,7,9,11};
        for (int i2:sz) {
            System.out.println(i2);
        }*/

        int[] sz1=new int[]{1,3,5,7,9,11};
        for(int i1=0;i1<sz1.length;i1++){
            int m=sz1[i1];
            System.out.println("m="+m);

        }

    }
}
