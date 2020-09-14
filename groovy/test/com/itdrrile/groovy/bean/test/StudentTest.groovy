package com.itdrrile.groovy.bean.test

import com.itdrrile.groovy.bean.Student

// groovy脚本形式进行测试

Student student = new Student();

// 测试省略return
student.setName("张三")
println student.getName() // 调用方法可以省略()，方法名后面直接跟参数，使用空格隔开

// 测试非private修饰的属性，默认自动生成getter/setter方法
student.setProperties(new HashMap<String, Object>(){{put("id", 1)}})
println student.getProperties()

// 测试private修饰的属性可直接通过 对象.属性名 进行赋值和读取
student.age = 18;
println student.age

// 测试默认带有具名构造器
Student student1 = new Student(name: "李四", age: 30)
Student student2 = new Student(name: "王五", age: 45, properties: new HashMap<String, Object>(){{put("id", 2)}})
println student1
println student2