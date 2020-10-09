package org.ccy.dayeleven;
class   main {
    public static void main(String[] args) {
        Person  cy=new Person();
        cy.run();
        cy.hello();

    }
}
//定义接口
 interface JiChengJieKou {
     void hello();
}
//定义people继承JiChengJieKou
interface  People  extends  JiChengJieKou{
     void run();
     String getName();
}
//定义Student 接口
interface  Student{
     int  getAge();
}

//一个类可以实现多个interface：实现People 和Student接口
class Person implements   People,Student{

    private String name;
    private int age;

    @Override
    public void hello() {
        System.out.println("Hello  ccy");

    }

    @Override
    public void run() {
       System.out.println("年龄是："+getAge());
        System.out.println( "名字是："+getName());


    }

    @Override
    public String getName() {
        name="CCY";
       return name;
    }

    @Override
    public int  getAge() {
        age=18;
        return this.age;
    }
}
