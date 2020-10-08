package org.ccy.dayten;

//定义抽象类
 abstract  class Abstra {
     //定义抽象方法：没有方法体，就只有方法
        public abstract void run();//定义抽象方法必须定义抽象类

}

//抽象类：子类继承父类，必须重写父类的抽象方法
class Children extends Abstra {
    @Override
    public void run() {
        System.out.println("chlidren.run");
    }

    public static void main(String[] args) {
        Children c=new Children();
        c.run();
    }
}
