package org.ccy.daysix;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        //switch case:是根据某个表达式的结果，分别去执行不同的分支
        //使用switch时，case语句并没有花括号{}，case语句具有“穿透性”（当不写break语句时）
       /* Scanner scanner=new Scanner(System.in);
        System.out.print("1、名字\n"+"2、家乡\n"+"3、性别\n"+"4、爱好\n"+"请输入数字，得到你想知道的内容：");
        int option=scanner.nextInt();
        switch (option){
            case 1:
                System.out.print("She is ccy ");
                break;
            case 2:
                System.out.print("She is from Henan");
                break;
            case 3:
                System.out.print("She is a girl");
                break;
            case 4:
                System.out.print("She likes listening to music");
                break;
            default:
                System.out.print("没有你要的内容");
                break;
        }*/



        //while 循环:while循环是先判断循环条件，再循环，因此，有可能一次循环都不做。
        //计算1—100的和
        /*int sam=0;
        int i=1;
        //正常循环
        while (i<=100){
            sam=sam+i;
            i++;
        }
        System.out.print(sam);
        //一次循环都不做
        while(i<1){
            sam=sam+i;
            i++;
        }
        System.out.print(sam);*/
/*使用while计算从m到n的和
        int m=1;  //定义开始的数
        int n=100;//定义尾数
        int sam=0 ;//定义和数
        int i=m;  //定义循环的次数
        while(i<=n){
            sam=sam+i;
            i++;
        }
        System.out.print(sam);*/
//do while循环则是先执行循环，再判断条件，条件满足时继续循环，条件不满足时退出，do while 至少执行一次
       /* int sam1=0;
        int n=1;
        do {
            sam1=sam1+n;
            n++;

        }while(n<100);
        System.out.print(sam1);*/
/*使用do while循环计算从m到n的和。
        int m=20;
        int n=23;
        int sam=0;
        do{
            sam=sam+m;
            m++;
        }while(m<=n);
        System.out.print(sam);*/
/*for计算1-100
        int sum=0;
        int i;
        for(i=1;i<=100;i++){
            sum=sum+i;

        }
        System.out.print(sum);*/
/*累加数组
        int[] sz=new int[] { 1, 2,3,4,5,6,7,8,9,10};//定义数组
        int sum=0;//定义和
        for (int i=0; i<sz.length; i++) {  //数组的下标是从0开始，所以i初始化为0；i循环次数<数组长度，不可等
            System.out.println("i = " + i + ", ns[i] = " + sz[i]);
            sum = sum +sz[i];
        }
        System.out.println("sum = " + sum);*/
/*
//若循环次数等于数组长度   会报下标溢出的错误
        int[] sz=new int[] { 1, 2,3,4,5,6,7,8,9,10};//定义数组
        int sum=0;//定义和
        for (int i=0; i<=sz.length; i++) {  //数组的下标是从0开始，所以i初始化为0；i循环次数<数组长度，不可等
            System.out.println("i = " + i + ", ns[i] = " + sz[i]);
            sum = sum +sz[i];
        }
        System.out.println("sum = " + sum);*/

        int[] sz1 = { 1, 2, 3, 4, 5 };
        for (int i=0; i<sz1.length; i++) {
            System.out.println(sz1[i]);
            i = i + 1;//在循环体内修改循环次数
        }
    }
}
