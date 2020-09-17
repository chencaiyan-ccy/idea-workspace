package org.ccy.daythree;

import java.util.Arrays;

public class MaoPao {
    ///冒泡排序
    public static void main(String[] args) {
        int[] score = new int[]{68, 79, 91, 85, 62};
        ///正序：从小到大排序
        for (int i = 0; i < score.length - 1; i++) {      //下标从0开始
            for (int j = 0; j < score.length - 1 - i; j++) {  //
                if (score[j] > score[j + 1]) {   //如果前一个数大于后一个
                    int temp = score[j];   //将当前的数值先放到临时的位置temp
                    score[j] = score[j + 1];   //将下一个的数的值赋给当前数
                    score[j + 1] = temp;       //将临时存储的当前的数的值赋给下一位
                }

            }

        }
        System.out.println(Arrays.toString(score));





    }
}

