package org.ccy.dayten;
//静态字段只有一个共享“空间”，所有实例都会共享该字段
public class JingTai {
    public static void main(String[] args) {
        Person ming=new Person(12);
       ming.setAge(17);
       System.out.println(ming.getAge());//输出17

    }


}

class Person{
    public  static  int age;

    public  int getAge() {
        return age;
    }

    public  void setAge(int age) {
        Person.age = age;
    }
    public Person(){

    }

    public Person(int age){
        this.age=age;

    }


}

