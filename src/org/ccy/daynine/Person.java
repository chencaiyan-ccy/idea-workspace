package org.ccy.daynine;

public class Person {
    public  String name;
    public int age;
    public String School;
    public String BanJi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getBanJi() {
        return BanJi;
    }

    public void setBanJi(String banJi) {
        BanJi = banJi;
    }
    public int add(int x,int y){
         return  x+y;
    }
}
