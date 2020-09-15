package com.itdrrile.groovy.bean.test

/××
 × groovy语法
 ×/

// 声明变量
String name  // 使用java方式
def nick = "jack"  // 使用def方式声明，通过值判断为字符串类型
def age  // 使用def方式声明，未初始化
email = "123@qq.com"  // def可省略

// 方法调用
println(nick)
println nick + "," + email  // 带参数的方法可以省略括号，使用空格分割
println() // 未带参数的方法，括号不可省略

// 断言关键字 assert： 断言失败时抛出异常，成功无返回
assert age == null

// 三种字符串形式
str1 = 'd234dfs234wer'  // 单引号定义了普通字符串
str2 = "id:${str1}"     // 双引号中可以引用变量
str3 = '''code:DDD001
name:lucy
'''                     // 三引号按格式定义字符串
println str1
println str2
println str3
println()

// 使用[]定义集合
emptyList = []
list = ['jack', 'lucy', 14]
emptyList.add('cat')   // 使用java方式添加元素
emptyList << 'dog'     // 自有添加元素方式，相当于emptyList.leftShift('dog')，<<为重载运算符
println emptyList
println list
println list.getClass()  // 使用[]创建的集合类型为ArrayList