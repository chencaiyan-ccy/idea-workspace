package org.ccy.daynine;

public class Override1 {
    public static void main(String[] args) {
        Person p=new Student();
        Student stu=new Student();  //实例化Student对象,可调用非private的方法以及字段
        stu.setScore(67);
        stu.setBanJi("1班");
        int scor=stu.getScore();
        String banji=stu.getBanJi();
        System.out.println(scor);
        System.out.println(banji);
        p.setName("ccy");
        p.setAge(18);
       int i= p.add(1,2);
        System.out.println(i);


    }
}
