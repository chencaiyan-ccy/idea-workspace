package org.ccy.daynine;
//继承Person

public class Student extends Person {
     public String  Address;
     public int score;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    //子类如果定义了一个与父类方法签名完全相同的方法，被称为覆写（Override）。
    @Override
    public int add(int x,int y){
        return  x+y;

    }

}
