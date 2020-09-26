package org.ccy.dayeight;

public class main {
    public static void main(String[] args) {
        PersonOverload person =new PersonOverload();
        person.setName("xiaoming");
        String s=person.getName();
        System.out.println(s);
        person.setName("chen","caiyan");//调用重载方法setName(String name,Stirng name1)
        String s1=person.getName();
        System.out.println(s1);

    }
}
