package org.ccy.dayseven;

public class CycleOne {
    public static void main(String[] args) {
//day six学习补充   ：break&continue
        /*int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum = sum + i;
            if(sum==10) {
            break;    ///当和等于10,跳出循环，不再继续执行，若没有break，结果为15
             }
        }

     System.out.println(sum);*/
//双层循环
/*        for (int i=1; i<=10; i++) {
            System.out.println("i = " + i);
            for (int j=1; j<=10; j++) {
                System.out.println("j = " + j);
                if (j >= i) {
                    break;   //break跳出内层循环
                }
            }
            // break跳到这里
            System.out.println("breaked");
        }*/
//continue则是提前结束本次循环，直接继续执行下次循环
/*
        int sum=0;
        for (int i=1;i<=5;i++){

            if(i%2==0){
                continue;
            }
            sum=sum+i;//sum :1+3+5=9
        }
        System.out.println(sum);*/


    }
}
