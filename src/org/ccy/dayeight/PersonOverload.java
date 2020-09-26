package org.ccy.dayeight;

public class PersonOverload {
    public int age;
    private String  name;
    private String name1;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
   //方法重载，方法名相同，参数不同
    public void setName(String name,String name1) {
        this.name=name+name1;

    }

}

