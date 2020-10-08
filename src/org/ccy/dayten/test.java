package org.ccy.dayten;
//父类定义抽象方法  抽象类
abstract class Test {
    double income;//定义总收入
    double basic; //定义基本收入
    double enhance;//定义提成
    public abstract void total();//定义抽象的收入方法
}


//子类继承  并重写父类的抽象方法
class  Shouru  extends Test{
    @Override
    public void total(){
        basic=4250;   //继承父类的属性
        enhance=750*0.9;
        income=basic+enhance;
        System.out.println(income);
    }

    //main
    public static void main(String[] args) {

        Shouru s=new Shouru();//实例化子类
        s.total();//调用子类重写实现的方法
    }
}
