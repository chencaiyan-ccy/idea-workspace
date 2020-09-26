package org.ccy.dayeight;

public class JiCheng {
    public static void main(String[] args) {
        ExtendPerson ePerson=new ExtendPerson();
        ePerson.setScore(78);//调用子类的方法
        int i=ePerson.getScore();
        System.out.println("成绩为："+i);
        ePerson.setName("ccy");//调用父类的public方法
        String s=ePerson.getName();
        System.out.println("首字母简写为："+s);
        ePerson.setAge(19);
        ePerson.setName("陈","彩艳");
        String s1=ePerson.getName();
        System.out.println("全名为："+s1);
        ePerson.setSubject("数学");
        String s2=ePerson.getSubject();
        System.out.println("科目为："+s2);
        ePerson.setSchool("北大");
        String s3=ePerson.getSchool();
        System.out.println("学校为："+s3);

    }

}
