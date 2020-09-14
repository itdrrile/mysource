package com.itdrrile.groovy.bean

/**
 * 使用groovy创建bean
 ×    1）类名前无权限修饰符public、protected、default、private， 均为公共的public
 ×    2）默认带有具名构造器
 */
class Student {

    private String name //可以省略;，根据行进行判断

    private int age  // private修饰的属性可直接通过 “对象.属性名” 进行赋值和读取

    Map<String, Object> properties; // 非private修饰的属性，默认自动生成getter/setter方法

    String getName() {
        name   // 可以省略return关键字，默认以最后一行作为输出
    }

    void setName(String name) {
        this.name = name
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", properties=" + properties +
                '}';
    }

}
