package org.ccy.dayseven;

public class Person {
    private String name;//私密的定义
    private int age;
    private String  address;
    public String sex;//外部可以调用的public
    private  String phone;

//外部代码不能直接读取private字段，但可以通过getName()和getAge()间接获取private字段的值。
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
        //this.age = age;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    //定义private方法    private方法只能内部调用
    private  int cAge(int age1){
       return age1;
    }
    //构造方法
    //会自带一个无参的构造方法
    //如果新增了构造方法，则需要把无参和有参的同时写出来
    //无参数构造方法
    public Person(){

    }
    //
    public Person(String name,int age ){
    this.name=name;
    this.age=age;
    }

}
