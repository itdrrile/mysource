# c > typedef用法

> 使用 typedef 关键字来定义自己习惯的数据类型名称，来替代系统默认的基本类型名称、数组类型名称、指针类型名称与用户自定义的结构型名称、共用型名称、枚举型名称等。
>
> 一旦用户在程序中定义了自己的数据类型名称，就可以在该程序中用自己的数据类型名称来定义变量的类型、数组的类型、指针变量的类型与函数的类型等。



## typedef的4种用法



#### 1、为基本数据类型定义新的类型名

- 系统默认的所有基本类型都可以利用 typedef 关键字来重新定义类型名

```c
typedef unsigned int COUNT;  // COUNT就代表类型unsigned int
```

- 定义与平台无关的类型，当跨平台移植程序时，只需要修改一下 typedef 的定义即可，而不用对其他源代码做任何修改。

```c
typedef long double REAL;   // 平台1
typedef double REAL;  // 平台2
typedef float REAL;   // 平台3
```

标准库中广泛地使用了这个技巧，比如 size_t 在 V[C++](http://c.biancheng.net/cplus/)2010 的 crtdefs.h 文件中的定义如下所示：

```c
#ifndef _SIZE_T_DEFINED
#ifdef  _WIN64
typedef unsigned __int64    size_t;
#else
typedef _W64 unsigned int   size_t;
#endif
#define _SIZE_T_DEFINED
#endif
```



#### 2、为自定义数据类型（结构体、共用体和枚举类型）定义简洁的类型名称

- 未使用typedef

```c
// 定义一个结构体
struct Point
{
    double x;
    double y;
    double z;
};

// 结构体的调用，保留字struct不能少
struct Point oPoint1 = {100，100，0};
struct Point oPoint2;
```

- 使用typedef

```c
// 结构体的定义及自定义命名
typedef struct tagPoint
{
    double x;
    double y;
    double z;
} Point;

// 结构体的调用，直接使用typedef定义的名称
Point oPoint1={100，100，0};
Point oPoint2;
```

- 结构体中包含指向自己的指针

```c
struct tagNode
{
    char *pItem;
    struct tagNode *pNext;  // 这里不能使用pNode pNext; 因为在结构体类型本身还没有建立完成的时候，编译器不认识typedef创建的别名
};
typedef struct tagNode *pNode;
```



#### 3、为数组定义简洁的类型名称

- 与为基本数据类型定义新的别名方法一样

```c
typedef int INT_ARRAY_100[100];
INT_ARRAY_100 arr;
```



#### 4、为指针定义简洁的名称

```c
typedef char* PCHAR;
PCHAR pa;
```

```
// PFun是我们创建的一个类型别名
typedef int *(*PFun)(int,char*);
// 使用定义的新类型来声明对象，等价于int*(*a[5])(int,char*);
PFun a[5];
```



#### 5、注意

- 无论什么时候，只要为指针声明 typedef，那么就应该在最终的 typedef 名称中加一个 const，以使得该指针本身是常量

```c
typedef char* PCHAR;
int strcmp(const PCHAR,const PCHAR);  // 这里“const PCHAR” 不相当于 “const char*”，而是相当于“char*const”（一个指向char的常量指针）
```

```c
typedef const char* PCHAR; // PCHAR表示了指向常量char的指针
int strcmp(PCHAR， PCHAR);
```

- typedef不能与其他关键字一起使用，如auto、extern、static 和 register 等，因为typedef在语法上它还是一个存储类的关键字（虽然 typedef 并不真正影响对象的存储特性）

```c
typedef static int INT_STATIC;  // typedef不能与static一起使用
```

