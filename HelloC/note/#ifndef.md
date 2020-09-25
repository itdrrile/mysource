#  #ifndef使用
> - \#ifndef是 if not define 的缩写，一种宏定义。   
> - 它是预处理功能中三种（宏定义，文件包含和条件编译）中的第三种：**条件编译**   
> - \#ifndef和endif要一起使用，不能存在丢失   
> - \#ifndef起到的效果是防止一个源文件两次包含同一个头文件，而不是防止两个源文件包含同一个头文件

- 使用方式
```c
#ifndef X   // 先测试是否被宏定义过
#define X   // 定义X
    程序段1  //如果X没有被宏定义过，定义X，并编译程序段1；
#else
    程序段2  //如果X已经定义过了则编译程序段2 的语句，忽视程序段1.
#endif
```

- 宏定义标识命名
```c
    在理论上来说可以是自由命名的，但每个头文件的这个“标识”都应该是唯一的。   
标识的命名规则一般是头文件名全大写，前后加下划线，并把文件名中的“.”也变成下划线，   
如：stdio.h
    #ifndef _STDIO_H_
    #define _STDIO_H_
    
    ......
    
    #endif
```

- 可嵌套使用

- 最佳实践
```text
    头文件的全部内容都放在#ifndef和#endif中，不管会不会被多个文件引用，最好是都这样做
```