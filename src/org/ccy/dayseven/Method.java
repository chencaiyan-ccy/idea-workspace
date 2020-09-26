package org.ccy.dayseven;

public class Method {
    public static void main(String[] args) {

        Person person=new Person();//实例化对象
        person.setAge(16);  //设置private属性中的年龄属性
        person.setAddress("郑州市");
        person.setName("ccy");
        person.setSex("女");
        System.out.println(person.getSex());//getSex  获取private属性
        System.out.println(person.getAddress());
        System.out.println(person.getAge());
        System.out.println(person.getName());

        System.out.println(add());//调用方法

    }
    //定义方法
    public static int add(int i){
        int m=7;
        int n=8;
        i=m+n;
        return i;
    }
    public static int add(){
        int m=7;
        int n=8;
        int i=m+n;
        return i;
    }
}
