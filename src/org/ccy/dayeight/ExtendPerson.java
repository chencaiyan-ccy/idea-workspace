package org.ccy.dayeight;

public class ExtendPerson extends PersonOverload{
    //继承有个特点，就是子类无法访问父类的private字段或者private方法
    //为了让子类可以访问父类的字段，我们需要把private改为protected。用protected修饰的字段可以被子类访问

    private int score;//成绩
    private String school;//学校
    private String address;//地址
    private String subject;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
