package org.ccy.dayfive;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        //if -else
        Scanner scanner=new Scanner(System.in);
       /* System.out.print("请输入成绩:");
       int score = scanner.nextInt();
        if (score>60){
            System.out.println("该生及格");
        }else{
            System.out.println("该生不及格");
        }*/
//用于计算体质指数BMI，并打印结果。
//
//BMI = 体重(kg)除以身高(m)的平方
//
//BMI结果：
//
//过轻：低于18.5
//正常：18.5-25
//过重：25-28
//肥胖：28-32
//非常肥胖：高于32
        float BMI,weight,Height;
        Scanner scanner1 =new Scanner(System.in);
        System.out.print("请输入体重(kg)：");
         weight=scanner1.nextFloat();
        System.out.print("请输入身高（m）：");
        Height=scanner1.nextFloat();
        BMI=(float)weight/(Height*Height);
        if(BMI<18.5){
            System.out.println("过轻");
        }else if(BMI>=18.5&&BMI<25){
            System.out.println("正常");
        }else if(BMI>=25&&BMI<28){
            System.out.println("过重");

        }else if (BMI>=28&&BMI<32){
            System.out.println("肥胖");
        }else{
            System.out.println("非常肥胖");
        }





    }



}
