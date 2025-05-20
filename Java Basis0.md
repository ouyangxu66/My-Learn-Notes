# 模块一 HELLO WORLD!

### 1.三层结构

页面:与用户交互,发出请求

Controller(表现层):接收请求,回响应

Service(业务层):做业务处理

Dao(持久层):和数据库打交道

### 2.基本设置

###  3.快捷键

​	ALT +回车：*自动修正代码*

​	CTRL + 空格：智能提示/补全

​	CTRL+shift+/：选中代码注释

​	Alt+Ins:插入内容

​    CTRL+左键:点击跳转源码

### 4.注释

 1 ，单行注释 -- // (将光标放置于要注释所在行，使用 `Ctrl + /`)

 2，多行注释 -- /**/(使用 `Ctrl + Shift + /`)

 3，文档注释 --/** */ (在要注解的方法上面输入`/**`，点击“`Enter`”)

​		：文档注释用于解释java类的一个说明

### 5.第一个Java程序

```java
/*
	1，pulic class helloworld ：定义一个类。
	2，class：代表的就是类，类就是Java程序的最基本组成单元。
	3，class后面跟的名字就叫做类名，类名要与文件名保持一致。
*/
public class helloworld {
    /*
    	public static void main（String[] args）
    	叫做main方法，是程序的入口
    	jvm执行代码，会从main方法开始执行
    */
	public static void main(string[] args){
		System.out.println("helloworld!");
        /*
        	print输出不带换行效果
        	println输出自带换行效果
        */
	}
}
```

1,如果class前面带public,此时类名必须要和Java文件名一致.

2,一个文件中可以写多个class类,但是只能有一个类带public,且main方法必须写在public的类中.

# 模块二

## 第一章 **常量**

### 分类

```java
整数常量:所有整数
    System.out.println(10.0/3);
    System.out.println(10/3);
	运行结果分别为:
			3.3333333333333335
			3
     前后的数如果带小数则运算结果也会带小数.
小数常量:所有带小数点的数
字符常量:带单引号的 '' 单引号中有且只能有一个内容
字符串常量:带双引号的 "" 双引号中的内容随意 空或非空都行
布尔常量:true 和 false 这两个单词不需要加双引号 否则不属于布尔常量
空常量:null 代表数据不存在
```

## **第二章 变量

### 分类

1. 字节型--**byte(一个字节)**
2. 短整型--**short(两个字节)**
3. 整型--**int(四个字节)**
4. 长整型--**long(八个字节)**
5. 单精度浮点数--**float(四个字节)**
6. 双精度浮点数--**double(八个字节)**
7. 字符型--**char(两个字节)**
8. 布尔类型--**Boolean(一个字节)**

```Java
1.变量的数据类型:
	基本数据类型:四类八种
        整型:byte short int long
        浮点型:float double
        字符型:char
		布尔型:Boolean
 	引用数据类型:类 数组 接口 枚举 注解
2.概述:在代码运行阶段,值会随着不同情况随时发生变化

```

### 注意事项

```java
注意:
	a.字符串不属于基本数据类型,属于引用数据类型,用String表示
    String是一个类,只不过在定义时可以和基本数据类型格式一样.
	b.在Java中转义字符 \ ,一个转义字符代表转义后面一个字符,			如:n:普通字符 \n:换行符;两个转义字符 \\ 代表一个转义字符 \ 
	c.double 表示的小数位数有15位,float 表示的小数位数位7位,
    实际开发的时候 double 和 float 不要直接参与运算,否则会造成精度损	失.
    d.不同作用域(一个大括号{}就是一个作用域)的变量不能随意访问,否则会	报错.
```



## 第三章 标识符

### 取名方式

```Java
1.给类,方法,变量名取名字
2.注意:
	a.必须遵守
        标识符可以包含"英文字母""数字""$和_";
        标识符不能以数字开头;
        标识符不能是关键字.
	b.书写规范
        给类取名字用大驼峰式-->每个单词的首字母大写;
        给变量和方法取名字用小驼峰式-->从第二个单词开始的往后的字母大		写;
		见名知意,不要用中文.
```

## **第四章 数据类型转换

### 自动类型转换

```java
取值范围小的赋值给取值范围大的类型-->小自动转大
取值范围小的和取值范围大的共同做运算-->小自动转大
    
    int i=1;
	double q=1.2;
	double u=i+q;(相当于 double=double+double)
```



### 强制类型转换

```java
将取值范围大的赋值给取值范围小的-->报错,不兼容的类型,需要强转.
    
例如:    
float i=2.2;(报错,因为小数默认为 double 类型, double 范围大于 float)
解决办法:float i=2.2F;(后面加F指明为 float 类型)
		或者 float i=(float) 2.2;(强制类型转换)

注意事项:
	尽量不要用强制类型转换,可能会造成数据溢出和精度损失,
    char字符提升为int型时,会查找ASCLL码表,将字母转换为数字.
```

# 模块三

### **第一章 运算符

#### 1.算术运算符

```java
加	+(也可以用于字符串拼接)
减	-
乘	*
除	/(若符号前后都为整数,结果取整数.若符号前后有小数,则结果为小数)
取模	%
```

##### 	1.2自增自减运算符(进行减一加一运算)

```java
格式:
	不进行混合使用,符号在前在后都是先进行运算
	变量++
	变量-- :与其他语法混合,使用先使用原值再进行运算
			例如:int i=10;
        			System.out.println(i++);\\输出为10
        			System.out.println(i);\\输出为11
	
	++变量
	--变量:混合使用,先运算再使用运算后的值
```



#### 2.赋值运算符

```java
基本赋值运算符
    = :先看等号右边的值,将右边的数据赋值给左边的变量
符合赋值运算符:
	+= :int i=1;
		i=i+2;	等价于 i+=2;
    -= 
	*= 
	/=:取整数部分
	%=:取余数部分
注意事项:
	byte 和 short 参与复合赋值运算时,虚拟机会自动进行强转
```

#### 3.关系运算符(比较运算符)

```java
1.作用:做条件判断使用
2.结果为 Boolean 类型:要么为 false ,要么为 true
3.符号: < > == <= >= != 比较成立为 true 不成立为 false
```



#### 4.逻辑运算符

```java
作用:连接多个 Boolean 类型
结果为 Boolean 类型
```

| 符号           | 说明                                                   |
| :------------- | :----------------------------------------------------- |
| && (双与,并且) | 全真为真,有假则假,若符号前为false,则符号后判断不会执行 |
| &(单与)        | 若符号前为false,符号后的判断依然会执行                 |
| ! (非.取反)    | 真为假,假为真                                          |
| ^ (异或)       | 一样为假,不一样为真                                    |
| \|\| (双或)    | 有真为真,全假为假,若符号前为true,则符号后判断不会执行  |
| \| (单或)      | 若符号前为true,则符号后判断依然会执行                  |



#### 5.三元运算符

```java
格式: Boolean 表达式?表达式1:表达式2;

执行流程:先执行 Boolean 表达式进行判断,若结果为 true 则进行 ? 号后的表达式1,若结果为 false 则进行 : 后面的表达式2
```

# 模块四

## 重点

```Java
1.会使用Scanner 和Random
2.会使用switch 和知道case的具有的穿透性
3.会使用if条件语句
4.会使用for循环,while循环,和嵌套循环
```

### **第一章 Scanner键盘输入

#### 	1.用法

```java
位置:java.util
使用:a.先导包 import java.util.Scanner ->导入的是哪个包下的哪个类
      --idea自动导包,无需手动
    
	b.创建对象 Scanner 变量名 = new Scanner(System.in);

	c.调用方法,实现键盘录入 
	  变量名.nextInt 输入整数 int 型
	  变量名.next() 输入字符串 String 型	  
        
import java.util.Scanner;

public class hellowolrd {
    // 文件名和类名一致
    /* main是一个方法，是程序的入口*/
    public static void main(String[] args) {
        //创建对象
        Scanner sc =new Scanner(System.in);
        //录入int型整数
        int data1= sc.nextInt();
        //输出
        System.out.println(data1);
        //录入String型字符串
        String data2 =sc.next();
        //输出
        System.out.println(data2);
        }
}
```

#### 2.注意事项

```java
变量名.next() :遇到空格和回车结束输入
变量名.nextLine() :接受空格输入,遇到回车结束输入

录入的数据和要求的数据类型要一致
```

### 第二章 Random随机数

#### 1.随机生成

```java
位置:java.util
使用:a.导包
	  idea自动导包
	b.创建对象
	  Random 变量名1 =new Random();
	c.调用对象
	  int 变量名2 =变量名1.nextInt();--此处的Int表示在Int范围内随机生成一个整数
```

#### 2.指定范围

```java
在指定范围内生成一个数:
变量名.nextInt(int bound) --> 在0-(bound-1)

a.nextInt(10) -> 0-9
b.在1-100之间随机一个数:nextInt(100)+1 ->(0-9)+1 -> 1-10
c.在100-999之间随机一个数:nextInr(900)+100 -> (0-899)+100 ->(100-999)
```

### **第三章 switch选择语句

#### 1.基本使用方法

```java
switch(变量){
	case 常量值1:
		执行语句 2
		break;
	case 常量值2:
		执行语句 2
		break;
	case 常量值3:
		执行语句 3
		break;
	......
	default:
		执行语句n
		break;
}
a.执行流程:变量先匹配 case 后面的常量值,匹配成功后执行冒号':'后面的执行语句,然后 break 结束 switch 语句若无一个匹配项,则执行 default 后的执行语句而后 break 结束 switch 语句;
b.注意: switch 能够匹配的类型:
byte short int char 枚举类型  String 类型

```

2.case的穿透性

```java
case 语句后若无 break ,case 会一直穿透执行下去,知道遇到 break 或者直到 switch 语句执行结束
    
public class hellowolrd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int data =sc.nextInt();
        switch (data){
            case 3:
            case 4:
            case 5:
                System.out.println("春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬");
                break;
            default:
                System.out.println("chucuo");
        }
        }
}

```

### **第四章 if else语句

#### 1.格式

```java
第一种 带括号
	if( Boolean 表达式){
		执行语句1;
	}else if{
		执行语句2
	}else if{
        执行语句3;
    }else{
        执行语句4;
    }
	
第二种	不带括号
	if( Boolean 表达式)
			执行语句1;
		else if
			执行语句2;
		else if
            执行语句3;
		else
            执行语句4;
	
建议使用带括号的格式
```

#### 2.注意事项

```java
最后一种情况没有必要非要用 else,但是要确保所有情况都包括了

switch 和 if 的区别: switch 会直接跳到符合条件的语句;if 会一条一条按顺序寻找符合条件的语句.
```

### **第五章 循环语句(for 和 while)

#### 1.for循环

```java
1.格式:
	for(初始化变量;比较;步进表达式){
        循环语句;
    }
	
2.执行流程
    a.先走初始化变量
    b.再走比较,若比较结果为 true ,走循环语句,走完循环语句后,继续走步进表达式 
    c.步进表达式后继续进行比较,直到比较结果为 false ,结束 for 循环
```

```
快捷键:n.fori (n为需要循环的次数)
```



#### 2.while循环

```java
1.格式:
	初始化变量;
	while(比较){
		循环语句;
		步进表达式;
	}
2.执行流程:先进行比较,比较结果为 true ,则进行循环语句,再进行步进表达式,继续进行比较直到比较结果为 false .
```

#### 3.do  while 循环(不做重点)

```java
1.格式:
	初始化变量;
	do{
		循环语句;
		步进表达式
	}while(比较)
2.执行流程:先初始化变量,再进行循环语句,再进行步进表达式,后再进行比较,结果为 true ,继续进行循环语句,直到比较结果为 false ,结束循环.
3.相较于 while 循环,do while 循环至少执行一次循环语句.
```

#### 4.循环控制关键字

```java
1.break
	a.switch 语句结束
	b.跳出 for 和 while 循环
2.continue
	a.结束当前循环,进入下一次循环,直到结果为 false
```

#### 5.死循环

```java
比较结果一直为 true ,循环一直执行,为死循环
例如:
	int count=0;
	while(true){
		count++;
	}
```

#### 6.嵌套循环

```java
先执行外层循环,再进入内层循环,内层循环执行结束之后再进行外层循环,直至外层循环结束
例如:打印直角三角形
    外层控制行,循环几次就是几行;内层控制列,循环几次就是几列
public class hellowolrd {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int i1 = 0; i1 < i; i1++) {
                //以i作为比较条件,第几行就打印几列
                System.out.print(" * ");//不换行,连续打印
            }
            System.out.println();//打印完一行后进行换行
        }
    }
}
输出结果:
 * 
 *  * 
 *  *  * 
 *  *  *  * 
```

#### 7.总结应用--猜数小游戏(自己写的)

```java
import java.util.Random;
import java.util.Scanner;

public class hellowolrd {
    public static void main(String[] args) {
        //使用Random生成范围在(1-100)的随机数
        Random rd=new Random();
        int rdnum= rd.nextInt(100)+1;
        //使用Scanner实现键盘输入
        Scanner sc=new Scanner(System.in);
  		//使用while(true){}实现一直循环,直到达到条件为止
        while (true){
          //一直输入,一直猜
            int input=sc.nextInt();
            //使用if else语句判断是否猜对数字
            if (input>rdnum){
                System.out.println("猜大了!请重新猜一个数:");
            } else if (input<rdnum) {
                System.out.println("猜小了!请重新猜一个数:");
            }else if(input==rdnum) {
                System.out.println("恭喜你,猜对了!");
                //使用break,满足条件后,跳出while循环
                break;
            }

        }

    }
}

```

# 模块五 数组

## 重点

```java

	1.数组的特点及其定义
        属于引用数据类型,存储数据的容器,可以存放基本数据类型和引用数据类型;定长
	2.数组的操作(存数据,取数据,遍历数据)
            存:数组名[索引值]=值
            取:数组名[索引值]
            遍历:数组名.fori
	3.二维数组(定义,存,取,遍历)
	4.知道内存中的堆和栈
		堆(heap):每new一个对象,堆开辟一个空间
		栈(stack):方法的运行都在栈
```



## 第一章 数组的定义

### 定义

```java
1.数组本身属于引用数据类型,是一个存储数据的容器,一次性可以存储多个数据
2.特点:
		a.既可以存储基本数据类型的数据,还能存储引用类型的数据
		b.定长(定义数组是时长度为多少,最多能存储多少数据)
3.定义:
		a.动态初始化:没有给定具体的数据,但是指定了长度
            
		  数据类型[] 数组名 =new 数据类型[长度];
		  []数据类型 数组名 =new 数据类型[长度];
		例如:int[] arr = new int[10];
		  注:
		  数据类型指定了能存放的数据的类型,前后数据类型要一致;
		  一个括号[]代表了是一维数组,[][]两个括号代表的是二维数组;
		  [长度]指定了能存放多少个数据.
              
		b.静态初始化:定义数组的时候直接给定了数据
            
		  数据类型[] 数组名 =new 数据类型[长度]{元素1,元素2,...};
		  推荐使用简化的静态初始化:
		  数据类型[] 数组名 ={元素1,元素2,...};
		例如:String[] arr ={"给","我","money"};
```

## **第二章 数组的操作

### 1.获取数组的长度

```java
1.格式:
	数组名.length
2.length 是数组的属性,表示数组的长度.
例如:int a=arr.length
```

### 2.索引

```java
1.索引就是数据在数组中存放的位置(下标)
2.索引唯一,且从 0 开始,最大索引为数组长度-1;
3.存取数据,操作数据都得指定索引
```

### 3.存储数据

```java
1.格式:
		数组名[索引值]=值; -->将右边的数据存储进指定索引位置上
		例如:arr[1]=10;
			arr[2]=122;
```

### 4.获取数据

```java
1.格式:
		数组名[索引值]
		例如:System.out.println(arr[1]);
2.注意:
		a.直接输出数组名,会输出数组在内存中的地址值
		b.如果数组中没有存放数据,那么直接获取也能获取一些数据(默认值)
```

### 5.数组遍历

```java
1.格式:
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
2.快捷键:数组名.fori
```

## 第三章 数组练习

### 1.求出数组中最大的元素

```java
定义一个tmp中间值，先存放数组的第一个元素，然后遍历数组一一进行比较，使tmp等于较大的值，最后输出tmp就是最大的元素
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //定义一个数组
        int[] arr1=new int[4];
        //遍历输入数组
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= sc.nextInt();
        }
        //使中间值tmp等于第一个元素
        int tmp=arr1[0];
        //遍历数组，一一进行比较
        for(int i=1;i<arr1.length;i++){
            if(tmp<arr1[i]){
                tmp=arr1[i];
            }
        }
        System.out.println("Max = "+tmp);
    }
}
```

### 2.随机生成数，并找出指定的数

随机生成十个[0-100]的整数，并找出那些既是3的倍数，又是5的倍数，但不是7的倍数。

```java

public class Main {
    public static void main(String[] args) {
       	//创建Random对象和数组
        int[] arr1=new int[20];
        Random rand = new Random();
		//遍历数组，使数组充满随机数
        for (int i = 0; i < arr1.length; i++) {
            int rd1=rand.nextInt(101);
            arr1[i]=rd1;
        }
        int count=0;
        //遍历数组找出符合条件的数
        for (int i = 0; i < arr1.length; i++) {
            	if((arr1[i]%3==0&&arr1[i]%5==0)
                       &&arr1[i]%71!=0){
                System.out.println(arr1[i]);
                count++;
            }
        }
        System.out.println("符合条件的个数为："+count);

    }
}
```

### 3.输入一个数，找出其在数组中的索引值

```java

public class Main{
    public static void main(String[] args) {
    int[] arr1={12,21,25,38,57};
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    //定义一个flag，判断在数组中是否存在这个数
    int flag=0;
        //遍历数组寻找数的索引值
        for (int i = 0; i < arr1.length; i++) {
            //输入值与数组值相同时，输出索引值i
            if(n==arr1[i])
            {
           	  System.out.println("在数组中的位置："+(i+1));
              flag++;
            }
        }
        if(flag==0){
            System.out.println(-1);
        }
    }
}
```

### 4.数组扩容

```java
创建一个新的扩容后的数组，将原数组中的元素放入新的扩容数组中，再将新扩容数组的地址赋值给老数组地址。
	int[] arr1={1,2,3,4};
	int[] arr2=new int[10];
		for(int i=0;i<arr1.lenth;i++){
			arr2[i]=arr1[i];
		}
		arr2=arr1;//将arr1的地址值赋值给arr2
```

## 第四章 内存图

### 1.内存的划分（五类）

```java
a.栈（Stack）（重点）
	主要运行的是方法，方法的运行都会进栈内存，运行完毕之后，需要进行“弹栈”，腾出空间
b.堆（Heap）（重点）
	保存的是对象，每new一次，都会在堆空间中开辟空间，并为这个空间分配一个地址值，堆内存中的数据都有默认值的
c.方法区（Method Area）（重点）
	代码的“预备区”，记录了类的信息，方法区中主要保存class文件以及其中的信息，代码运行之前都要先进内存（方法区）
d.本地方法栈（Native Method Stack）（了解）
	专门运行native方法的栈，本地方法可以理解为堆对Java功能的扩充
e.寄存器（pc register）（了解）>>和cpu有关
```

## 第五章 二维数组

### 1.格式

```java
1.格式：
	a.动态初始化
		数据类型[][] 数组名=new 数据类型[m][n];
		数据类型 数组名[][]=new 数据类型[m][n];
		数据类型[] 数组名[]=new 数据类型[m][n];
	b.静态初始化
		数据类型[][] 数组名=new 数据类型[m][n]{{元素1,元素2...},{元素1,元素2...}...};
		数据类型 数组名[][]=new 数据类型[m][n]{{元素1,元素2...},{元素1,元素2...}...};
		数据类型[] 数组名[]=new 数据类型[m][n]{{元素1,元素2...},{元素1,元素2...}...};
	c.简化静态初始化
		数据类型[][] 数组名={{元素1,元素2...},{元素1,元素2...}...};
		数据类型 数组名[][]={{元素1,元素2...},{元素1,元素2...}...};
		数据类型[] 数组名[]={{元素1,元素2...},{元素1,元素2...}...};
2.解释:
    m:为二维数组的长度
    n:二维数组中一维数组的长度
```

### **2.二维数组操作

```java
1.获取二维数组长度
	二维数组的长度:数组名.length
	一维数组的长度:数组名[i].length i为二维数组的索引值
2.二维数组的存取
	二维数组的存取与一维数组一致
	arr1[0][0]=1;
	System.out.println(arr2[0][0]);
3.二维数组的遍历
	最外层为遍历二维数组,内层为遍历每个二维数组中的一维数组
	


public class Main {
    public static void main(String[] args) {
        int[][] arr1=new int[3][3];//动态初始化
        String[][] arr2={{"鸡鸡","爆","牛逼"},{"超人","强"},{"菲菲","死猪"}};//静态初始化
        System.out.println(arr2.length);//获取二维数组的长度
        System.out.println("---------------------");//分割线
        //获取二维数组中的一维数组长度
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i].length);
        }
        System.out.println("---------------------");//分割线
        //遍历二维数组
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]+",");
            }
            System.out.println();
        }

    }
}
```

# 模块六 方法

## 重点

```
都是重点
```

## 第一章 方法的使用

### 1.定义及其格式

```java
1.方法
	具有功能性代码的代码块,将不同的功能放入不同的方法中,调用方法以实现功能.
2.分类
    a.无参数无返回值方法
	b.有参数无返回值方法
    c.无参数有返回值方法
    d.有参数有返回值方法
3.格式
	修饰符 返回值类型  方法名(参数){
		方法体-->具体实现功能的代码
        return 返回结果;
	}
	3.1 执行流程:调用方法,为参数赋值,参数经过方法体,产生返回结果.
    3.2 有 return 返回结果的有两种调用方法,打印调用sout(方法名()),赋值调用: 数据类型 变量名 =方法名()



public class Main {
    public static void main(String[] args) {
        int a=10;
        int b=30;
        //方法调用 方法名()
        Sum(a,b);
        //实参,调用参数使用的实际参数
        int c=Min(a,b);
        System.out.println(c);
        fa();
    }
    //有参数,无返回值方法
    public static  void Sum(int a,int b){
        int sum=a+b;
        System.out.println("Sum ="+sum);
    }
    //有参数有返回值方法
    public static  int Min(int a,int b) {
        //形参:方法定义时使用的参数
        int min=a-b;
        return min;
        }
    //无参数无返回值方法
    public static  void fa() {
        System.out.println("333");
    }
}
        
```

### 2.注意事项

```java
注意事项
    4.1 void 代表无返回值,void 不能和 [return 结果]共存,但是可以和 return 共存
    	a.return 结果 :代表返回值,结束方法
    	b.return :仅仅代表结束方法,不返回任何值
        c.一个方法只能有一个返回值 
	4.2 方法不调用不执行,方法的执行顺序和调用顺序有关
    4.3 方法之间是平级关系,不能相互嵌套
    4.4 带返回结果要和返回值类型一致
  
```

### 3.调用方法

```java
a.先定义才能调用
	直接调用:方法名() -->只针对于无返回值的方法
	打印调用:sout(方法名()) 或者 sout(方法名(实参))
	赋值调用:数据类型 变量名 =方法名(实参) -->针对于有返回值的方法
b.返回值为引用数据类型时,返回的是一个地址值
```



## 第二章 方法练习

### 1.判断奇偶性(有参数有返回值)

```java
输入一个整数,调用方法判断奇偶性,为偶数输出"偶数",为奇数输出"奇数"
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //有返回值类型的方法,使用赋值调用,创建一个值来接收
        String result =Panduan(n);
        System.out.println("result: " + result);
    }
   	 //创建方法,返回值为String类型
 	public static String Panduan(int n){
        if (n%2==0)
        {
            return "偶数";
        }else {
            return "奇数";
        }
  }
}
```

### 2.返回1-100的和(无参数无返回值)  

```java
public class Main {
    public static void main(String[] args) {
        ff();
    }
public static void ff(){
        int sum=0;
    for (int i = 1; i <= 100; i++) {
        sum+=i;
    }
    System.out.println(sum);
}
}
```

### 3.数组为返回值

```java
输入两个数,返回两个数的和与差
    
当要返回多个数据时,可以使用数组作为返回值,实际返回的是一个地址值

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //创建数组接收方法返回值,实际上返回的是一个地址值
        int[] arr =ff(a,b);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //返回值类型为数组
public static int[] ff(int n,int m){
    int sum=n+m;
    int min=n-m;
    int[] arr1={sum,min};
    //返回数组地址
    return arr1;
}
}
```

## 第三章 方法的重载

### 1.概述及其分类

```java
1.概述:方法名相同,参数列表不相同
参数列表不同分三类: 
	public static void sum(int a,double b){}
	a.参数类型不同
	public static void sum(float a,double b){}
	b.参数类型顺序不同
	public static void sum(double a,int b){}
	c.参数个数不同
	public static void sum(int a,double b,double c)	{}
2.注意事项
    a.重载方法与参数名和返回值无关
    b.实现的功能一样,细节不一样,j

```

# 模块七 面向对象

## 第一章 类和对象

## 1.面向对象思想编程

```
1.面向过程:自己的事情自己做(c语言)

2.面向对象:自己的事情别人帮忙去做(java语言)

3.什么时候使用面向对象编程:当我们调用别人的功能时;在一个类中我们需要调用别的类中的成员;只管调用,不管他具体怎么实现的

4.怎么使用面向对象编程:
	a.先new一个对象,然后再使用
	b.如果方法名中带static则不需要new对象,直接使用即可
```

##  2.类和对象

### 2.1.类

```
类的组成:
		属性(成员变量):
		成员方法:成员方法的使用与方法的使用一致,就是少了一个static
 
```



```java
 描述一个实体类
 创建一个动物类
     public class Cat{
        public String name;
        public int age;
        public void name(String name){
            System.out.println("名字:" +name);
        }
        public int getAge(int age){
            return age;
        }
    }
```

### 2.2对象

```java
1.使用:
	a.导包:import 包名.类名
		如果两个类在同一个包下,想要使用对方的成员不需要导包,如果不在同一个类则需要导包
		
		特殊包:java.lang ->使用lang包下的成员不需要导包
		
	b.创建对象:new
		类名 对象名 =new 类名() ->例如:Person p=new Person();
	
	c.调用成员(成员变量,成员方法)
		对象名.成员变量=值
		对象名.方法名(实参)
		数据类型 变量名=对象名.方法名(实参)
		
```





### 2.3匿名对象

```
格式:
	new 对象().成员;
	
	直接调用类中的成员方法
	
	涉及到赋值的时候不能使用匿名对象
```

## 第二章 成员变量和局部变量

### 1.区别

```
public class Person {
    String name;
    int age;//成员变量
    public void beauty(){
        int institute=1;//局部变量
        System.out.println(institute);
    }
}

a.定义位置不同:局部变量在方法中或参数位置;成员变量在类中方法外
b.作用范围不同:成员变量作用于整个类之中;局部变量只作用于方法中
c.初始化值不同:成员变量不需要初始化,有默认值;局部变量没有默认值,需要初始化,先赋值再使用
d.内存位置不同:成员变量在堆中,跟着对象走;局部变量在栈中,跟着方法走
```

## 第三章 类和对象练习

### 1.定义一个类,并调用属性和方法

```java
定义一个Phone 类
public class Phone {
    //成员属性
    String brand;
    String color;
    int price;
    //成员方法
    public String Message(String Message) {
        return "Message:"+Message;
    }
}

在main中调用Phone 类的属性及其方法
public class Main {

    public static void main(String[] args) {
        Phone p=new Phone();
        p.brand="vivo";
        p.color="red";
        p.price=4000;
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.color);
        String Msg=p.Message("888");
        System.out.println(Msg);
    }
}
```

# 模块八 封装

## 第一章 封装

### 1.封装的介绍

```java
1.面向对象三大特征:封装  继承  多态

2.什么是封装:
	将细节隐藏起来,外部不需要关注细节,对外提供一个公共的接口,供外界使用
	
    将一段功能性代码放入方法中,属于封装
        
```



### 2.封装的使用

```java
将类的成员属性封装起来,禁止外界随便使用
a.使用 private 关键字,使得被修饰的成员只能在本类中使用,在别的类使用不了,保护私有的属性,给外界提供一个公共的接口,间接使用
b.private 使用:修饰成员变量:private 数据类型 变量名
```

### 3.this的使用

```
若有成员变量和局部变量重名时,遵循就近原则,匹配最近一个的重名变量
例如:
	public class PersonP{
    String name;
    public void core(String name){
        name=name;//这两个变量都匹配到局部变变量String name
    }
    }

使用 this 关键字加以区分重名情况,this.变量 代表的一定是局部变量;
哪个对象调用了 this this 就指代的是哪个对象的成员变量
```



### 4.get / set的使用

```java
set:为属性赋值
get:获取属性值

快捷键:alt+insert --->getter and setter  
```



```java

package Test;
public class Test01 {
    public static void main(String[] args) {
        person p=new person();
		//调用set接口,为属性赋值
        p.setAge(19);
        p.setName("天才");
		//调用get接口,获取属性值
        int age=p.getAge();
        String name =p.getName();

        System.out.println(age);
        System.out.println(name);
    }
}



package Test;
public class person {
	//使用private,使成员变量私有化,外界不得改变
    private String name;
    private int age;
	//使用set方法,为外界提供给name传递参数的方法
    //使用this关键字,使用局部变量给成员变量赋值
    public void setName(String name){
        this.name=name;
    }
	//使用get方法,为外界提供调用接口
    public String getName(){
        return name;
    }

    public void setAge(int name){
        this.age=name;
    }

    public int getAge(){
        return age;
    }
    
    public void eat(){
        System.out.println("eat food");
    }
}

```



## 第二章 构造方法

```
方法名和类名一致并能初始化对象的

分类:
	a.无参构造:没有参数
	b.有参构造:有参数,为指定的属性赋值
	c.满参构造:为所有属性赋值
	
特点:没有返回值,也无void;方法名和类名一致
```

### 1.无参构造

```java
1.格式:
	public person(){
	
	}
2.特点:每一个类中默认有一个无参构造,可以写出来,也可以不写,不写jvm会自动提供一个无参构造
3.作用:new对象时调用无参构造
```

### 2.有参构造

```java
1.格式
	public person (形参){
		为属性赋值;
	}
	例如:
	    public person(int age,String name){
        this.age=age;
        this.name=name;
    }
	
2.作用:new对象,初始化对象为属性赋值
```

### 3.JavaBean规范

```java
标准的javabean规范:
	a.类必须是公有的public,具体的,所有成员变量私有化private
	b.必须有构造方法(无参,有参)
	c.具有set和get方法

快速构造get和set方法快捷键:alt+insert -->getter and setter
```



```java
package Test;

public class person {
    private String name;
    private int age;

    public person(){}
    
    public person(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }
}

```

# 模块九 面向对象

## 重点

```
1.会定义和调用静态成员
2.会使用可变参数
3.会二分查找(手撕)
4.会冒泡排序(手撕)
5.会debug的使用
```

## **第一章 static 关键字

### 1.static格式与调用

```java
1.格式
	a.修饰成员变量:static 数据类型 变量名
	b.修饰方法:修饰符 static 数据类型 方法名(形参){
		方法体;
		return 0;
	}
2.特点:
	a.静态成员是类成员,而非对象成员
	b.静态成员优先于非静态成员存在与内存中
	c.静态成员所在的类中的对象都可以g静态成员
    d.静态成员随着类的加载而加载
        
3.调用:类名直接调用 类名.静态成员
    
4.static 内存存在方式 静态变量(静态域)属于类成员存在于堆内存中,可以更好的优化内存释放

```



### 2.static静态成员访问的特点

```
1.不管在不在同一个类中,调用静态成员都可以使用类名调用
	类名.静态成员
2.不管在不在同一个类中,调用非静态成员都可以使用new对象调用
	person p=new person()
3.在反复使用的工具类代码块方法中,可以定义为静态成员,把成员变量设为private私有化
```

```java
package Test;

public class ArraysMin {
    private ArraysMin(){}//private 无参构造
    //定义static方法
    public static int getMin(int[] arr){
        int min=arr[0];
        //出现的报错java.lang.ArrayIndexOutOfBoundsException:数组越界访问,访问数组的索引超过了对象数组的长度,数组的最大长度为length-1;
        for (int i = 1; i <= arr.length-1; i++) {
            if(arr[0]>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}

-----------------------------------------------------------
package Test;
public class Test01 {
    public static void main(String[] args) {
        int[] arr={121,23,314,445,2,123,6};
        //调用静态成员,直接用类名调用:类名.方法()
        int a=ArraysMin.getMin(arr);
        System.out.println(a);
    }
}


```



## 第二章 可变参数

### 1.基本使用

```
1.概述:需要传入不定个数的值
2.格式:数据类型...变量名
3.注意事项:
	a.可变参数本质上是一个数组
	b.可变参数和其他类型参数一起使用时,可变参数要放到参数栏的最后一项

```

```java
package Test;

public class AlterInt {
    //String...s可变参数在参数栏的最后一项
    public static String contact(String target,String...s){
            String str=" ";
            target="--";
            for (int i = 0; i < s.length; i++) {
                str+=s[i]+target;
            }
            return str;
    }
}

------------------------------------------------------------
package Test;
public class Test01 {
    public static void main(String[] args) {
        //"1"为参数String target ,后面三个为可变参数String...s
       String s= AlterInt.contact("1","gg","2","bond");
        System.out.println(s);
    }
}

```

## **第三章 递归

### 1.基本使用

```java
1.方法内部自己调用自己
2.格式:
	a.直接调用
	public static void method(){
		method;
	}
	b.间接调用
	A(){
		B();
	}
	B(){
		C();
	}
	C(){
		A();
	}
3. 注意事项:
	a.递归必须要有出口,否则会"栈内存溢出"(StackOverflowError)
	b.递归次数不能太多
        
示例:
package Test;
public class Test01 {
    public static void main(String[] args) {
      method(3);
    }
    public static void method(int n){
        //递归调用需要有出口,满足条件后退出递归,使用return表示结束方法
        if (n==1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        n--;
        //递归调用
        method(n);
    }
}



```

### 2.练习

#### 2.1 n的阶乘

两种方法,一中使用for循环,一种使用递归

```java
package Test;
import java.util.Scanner;
public class Test01 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      method(n);
      int mul=method01(n);
      System.out.println("multiply02 = "+mul);
    }
	//使用for循环实现
    public static void method(int n){
        int mul=1;
        for (int i = 1; i <=n; i++) {
            mul*=i;
        }
        System.out.println("multiply01 = "+mul);
    }
    //使用阶乘实现 n!=n*(n-1)!
    public static int method01(int n){
        if (n==1) {
            return 1;
        }
        return n*method01(n-1);
    }
    
}

```

#### 2.2 Fibonacci(斐波那契数列)

计算Fibonacci数列的第n个值

Fibonacci数列:一个数等于前两个数之和 1 1 2 3 5 8 13...

```java
method(n)=method(n-1)+method(n-2);


	public static int Fibonacci(int n){
        if (n==1||n==2) {
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

```

## **第四章 数组常见算法

### 1.数组翻转

数组对称索引位置上的元素互换

```java
分析:数组的最小索引min和最大索引max上的值互换,然后min++向右移动,max++向左移动,当min<=max时停止移动.

    实现代码:
package Test;
public class Test01 {
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,66,77};
        AarryReverse(arr);
    }
    public static void AarryReverse(int[] arr){
    //创建中间值,来做为元素互换的容器
        //在for循环分号之间可以有多个句子
        for (int min=0,max=arr.length-1; 
        min<max; min++,max--) {
            int tmp=arr[min];
            arr[min]=arr[max];
            arr[max]=tmp;
        }
        //输出打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    } 
}

```

### 2.冒泡排序

```java
将数组中的元素按从大到小进行排序
数组相邻的两个元素进行比较换位arr[i]和arr[i+1]
  
  public static void Bubble(int[] arr){
  //两层循环,第一层循环j表示数组中有多少个元素需要比较排序,第二层循环i表示每个元素需要比较多少次
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i <arr.length-1-j; i++) {
 //arr.length-1-j代表着需要循环d
                int tmp;
                if (arr[i]>arr[i+1]) {
                    tmp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=tmp;
                }
            }  
        }
        //循环打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

```

### 3.二分查找

```java
a.怎么找中间索引?
	int min=0;
	int max=arr.length-1;
	int mid=(min+max)/2;
b.怎么比较?怎么继续?
	int key;-->要查找的数
	
	if(key>arr[mid]){
		min=mid+1;
        continue;
	}
	if(key<arr[mid]){
		max=mid-1;
        continue;
	}
	if(key==arr[mid]){
		return;
	}
	
c.什么情况下找不到结果了
	if(min>max){
		return;
	}

实现代码:
package Test;
public class Test01 {
    public static void main(String[] args){
        int arr01[]={2,21,32,43,54,64,65};
        String s=Division(arr01, 64);
        System.out.println(s);
    }
    public static String Division(int[] arr,int key){
        //定义三个变量min,max,mid
        int min=0;
        int max=arr.length-1;
        int mid=(min+max)/2;
        //设置循环条件,当min>max时循环结束,每一次循环后重新设置mid=(min+max)/2
        for (; min<=max;mid=(min+max)/2) {
            if (key<arr[mid]) {
                 max=mid-1;
             }else if (key>arr[mid]) {
                 min=mid+1;
             }else{ 
                return key+" index is "+mid;
                }
        }
        return "No Result";
    }
}

```

## 第五章 对象数组

### 1.基本使用

```java
对象数组:
	将对象以数组的方式存储
格式:Person[] arr=new Person[n];



public class Test02 {
    public static void main(String[] args) {
        Person[] arr=new Person[3];
        Person p1=new Person("gg",22);
        Person p3=new Person("bb",44);
        Person p2=new Person("pp",90);
        arr[0]=p1;
        arr[1]=p2;
        arr[2]=p3;
        for (int i = 0; i < arr.length; i++) {
            Person p=arr[i];           System.out.println(p.getName()+"---"+p.getAge());;
        }
    }
}

```

## 第六章 方法参数

### 1.基本数据类型作方法参数

```
基本数据类型作方法参数传递的是值
```

### 2.引用数据类型作方法参数

```
引用数据类型作方法参数传递的是地址值
```

## 第七章 idea其他操作

### 1.快速生成方法

```
a.方法可以先定义再调用也可以先调用再定义
选中先调用的方法,按Alt+回车键,选中create method

b.选中代码块按住CTRL+Alt+M 快速生成方法
```

### 2.debug

```

```

# 学生管理系统

## 思路

```
先有大致框架,和需要实现的功能
具体的功能板块,和细节
```



## 一.Test主程序

```java
创建一个main函数,执行StudentView.start页面
package StudentManagemenSystem;
public class Test {
    public static void main(String[] args) {
        new StudentView().start();
    }
}
```

## 二.Student类

```java
创建Student学生类,标准JavaBean规范
成员属性private私有化,拥有构造方法,和get/set方法
package StudentManagemenSystem;

public class Student {
    //学生的相关属性,private 私有化
    private int age;
    private String name;
    private int id;
    //有参构造
    public  Student(int id,String name,int age){
        this.age=age;
        this.id=id;
        this.name=name;
    }
    //无参构造
    public Student(){}
    //set和get方法
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

```

## 三.StudentView类

### 1.页面功能

```java
 public void start(){
        while (true) {
            System.out.println("------------学生管理系统------------");
            System.out.println("1.添加学生信息");
            System.out.println("2.修改学生信息");
            System.out.println("3.删除学生信息");
            System.out.println("4.查看学生信息");
            System.out.println("5.退出管理系统");
            System.out.println("请选择(1--5):");
            //每次循环都需要重新输入数字才能进行
            int num=sc.nextInt();

            System.out.println("-----------------------------------");
            
            //使用switch语句匹配
            switch (num) {
                case 1:
                    AddStudent();
                    break;
                case 2:
                    UpdateStudent();
                    break;
                case 3:
                    DeleteStudent();
                    break;                
                case 4:
                    FinAllStudent();
                    break;
                case 5:
                //设置一个键盘输入确认退出还是继续
                    System.out.println("确认是否退出学生管理系统?输入0为确认退出,输入9为继续");
                    int a=sc.nextInt();
                    if (a==0) {
                        System.out.println("-----------------------------------");
                        System.out.println("已退出学生管理系统!");
                        //return表示结束方法,退出管理系统
                        return;
                    }else if (a==9) {
                        //break表示退出switch语句继续操作管理系统
                        break;
                    }else{
                        System.out.println("-----------------------------------");
                        System.out.println("不是正确操作!!!");
                    }
                    
            }
        }
    }
```

### 2.添加功能

```java
 private void FinAllStudent() {
        //首先判断数组中是否存在有学生,即判断count是否为0
        if (count==0) {
            System.out.println("班级中没有学生!请添加学生信息!");
        }else{
            System.out.println("学号"+"\t"+"姓名"+"\t"+"年龄");
            //遍历这里要使用count来作为遍历的最大索引
            //使用冒泡排序来对Student对象数组排序然后输出
            /*
             * 排序是为了防止,删除数组元素后,重新查看数组会发生乱序现象
             */
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count-1-i; j++) {
                    //new 一个Student中间值来实现两个对象数组元素的交换
                    Student tmp=new Student();
                    if (Students[j].getId()>Students[j+1].getId()) {
                        //比较的是getId值,交换的是地址值  
                        tmp=Students[j+1];
                        Students[j+1]=Students[j];
                        Students[j]=tmp;
                    }
                }
            }
            for (int i = 0; i <count; i++) {
                System.out.print(Students[i].getId()+"\t"+Students[i].getName()+"\t"+Students[i].getAge());
                System.out.println();
        }
        }
    }
```



### 3.修改功能

```java
    private void UpdateStudent() {
        /*1.键盘录入要修改的学生学号
         * 2.重新输入学生的信息
         */
        if (count==0) {
            System.out.println("班级中没有学生!请添加后再查看!!!");
        }else{
            System.out.println("请输入要修改的学生学号:");
            //不能直接使用学号来作为查询和修改的索引
            //应该根据学号id来找到数组中对应的索引位置
            int updateId=sc.nextInt();
            int updateIdex=ArrayUtils.findIndexByID(Students,updateId,count);
            System.out.println(updateIdex);
    
            //无需修改学号,只需要修改相关信息
            System.out.println("请输入修改后的学生信息:");
            System.out.println("请输入修改后学生姓名:");
            String n=sc.next();
            System.out.println("请输入修改后学生年龄:");
            int a=sc.nextInt();   
            //创建一个Student对象用来存放修改后的数据
            Student student=new Student(updateId,n,a);
            //将新的Student对象赋值给要修改的Students数组
            Students[updateIdex]=student;  
            System.out.println("学生信息修改成功!!!");
        }
       
    }
```



### 4.删除功能

```java
    private void DeleteStudent() {
        System.out.println("请你输入要删除的学生学号:");
        //根据学号找到索引位置
        int removeId=sc.nextInt();
        int removeIndex=ArrayUtils.findIndexByID(Students, removeId, count);
        /*System.arraycopy
        第一个参数是要被复制的数组
        第二个参数是被复制的数字开始复制的下标
        第三个参数是目标数组，也就是要把数据放进来的数组
        第四个参数是从目标数据第几个下标开始放入数据
        第五个参数表示从被复制的数组中拿几个数值放到目标数组中
         */
        //赋值给newStudents被删除元素的前面一部分
        //从Students数组索引0开始,复制removeIndex个数据到newStudents数组也从零开始放
        System.arraycopy(Students, 0, newStudents, 0, removeIndex);
        //赋值给newStudent被删除元素的后面一部分
        System.arraycopy(Students, removeIndex+1, newStudents, removeIndex, Students.length-removeIndex-1);
        Students=newStudents;
        count--;
        System.out.println("删除成功!!!");
    }
```



### 5.查看功能

```java
 private void FinAllStudent() {
        //首先判断数组中是否存在有学生,即判断count是否为0
        if (count==0) {
            System.out.println("班级中没有学生!请添加学生信息!");
        }else{
            System.out.println("学号"+"\t"+"姓名"+"\t"+"年龄");
            //遍历这里要使用count来作为遍历的最大索引
            //使用冒泡排序来对Student对象数组排序然后输出
            /*
             * 排序是为了防止,删除数组元素后,重新查看数组会发生乱序现象
             */
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count-1-i; j++) {
                    //new 一个Student中间值来实现两个对象数组元素的交换
                    Student tmp=new Student();
                    if (Students[j].getId()>Students[j+1].getId()) {
                        //比较的是getId值,交换的是地址值  
                        tmp=Students[j+1];
                        Students[j+1]=Students[j];
                        Students[j]=tmp;
                    }
                }
            }
            for (int i = 0; i <count; i++) {
                System.out.print(Students[i].getId()+"\t"+Students[i].getName()+"\t"+Students[i].getAge());
                System.out.println();
        }
        }
    }
```



### 6.退出功能

```java
 case 5:
                //设置一个键盘输入确认退出还是继续
                    System.out.println("确认是否退出学生管理系统?输入0为确认退出,输入9为继续");
                    int a=sc.nextInt();
                    if (a==0) {
                        System.out.println("-----------------------------------");
                        System.out.println("已退出学生管理系统!");
                        //return表示结束方法,退出管理系统
                        return;
                    }else if (a==9) {
                        //break表示退出switch语句继续操作管理系统
                        break;
                    }else{
                        System.out.println("-----------------------------------");
                        System.out.println("不是正确操作!!!");
                    }
                    
```

## 四.ArrayUtils类

```java
package StudentManagemenSystem;

public class ArrayUtils {
    private ArrayUtils(){}
    //返回学号对应的索引值
    public static int findIndexByID(Student[] Students,int updateId,int count){
        for (int i = 0; i < count; i++) {
            if (updateId==Students[i].getId()) {
                return i; 
            }
        }
        return -1;

    }
}
```

# 模块十 面向对象

## 第一章 继承

### 1.继承概述

```
1.继承的概述:
	子类继承父类,子类可以使用父类的方法和成员
2.怎么继承:
	子类 extends 父类

3.继承内容:
	a.子类可以继承父类中的私有和非私有成员,但是不能使用父类的私有成员
	b.构造方法不能继承
```

### 2.继承的基本使用

```java
成员变量的访问特点:
a.子类只能使用父类的非私有成员
b.父类不能调用子类的特有成员(父类没有的成员)
c.在继承的前提下,成员变量的访问特点:
	(特别是成员变量重名时)
	看创建对象等号左边是谁,先调用谁中单的成员,子类没有找父类(适用于多态)
	Father father =new Father();//调用父类成员
	Son son=new Son();//调用子类成员
	Father father=new Son();//调用父类成员
	

成员方法的访问特点:
a.子类父类方法有重名时,new 的是谁,先调用谁的成员方法,子类没有找父类
```

### 3.方法的重写



```java
1.子类中有一个和父类的方法名和参数列表相同的方法
    使用场景:创建一个新的类加入新的方法,或者修改老的方法
2.前提:继承
3.检测该方法是否为重写,在此方法前加上:@Override 若无报错则是方法重写
    
public class Father {
    public void method(){
        System.out.println("Fmethod");
    }
}


public class Son extends Father{
    @Override
    public void method(){
        System.out.println("Smethod");
    }
}

4.注意事项:子类重写父类方法之后,访问权限必须要保证大于等于父类访问权限
    public(作用范围最大)>protected>默认(不加任何修饰符)>private
    
    私有方法,构造方法,静态方法不能被重写
    
    子类重写父类方法后,返回值类型应该是父类方法返回值类型的子类类型
```

### 4.继承的特点

```
1.继承只支持单继承,不支持多继承
2.继承支持多层继承
3.构造方法不能被继承,也不能重写
  私有方法可以继承,但是不能重写
  静态方法可以继承,但是不能重写(即静态方法和私有方法可以被使用)
4.一个父类可以有多个子类
```



## 第二章 super 和 this

### 1.继承中构造的特点

```
new 子类对象时会先调用父类的无参构造
原因:每个构造方法的第一行,都会默认有一个人super(),jvm自动提供一个
```

### 2.super的具体使用

```java
super()可以调用父类的成员和方法
super()-->父类的无参构造
super(参数)-->父类的有参构造
super.成员方法名-->调用父类方法
super.成员变量名-->调用父类变量
```

### 3.this的具体使用

```
使用:
	a.调用当前对象的构造:this()调用当前对象的无参构造
					  this(参数)调用当前对象的有参构造
					  
	b.调用当前对象的成员变量和成员方法:
			this.成员变量名 this.成员方法名(实参)
			
不管是this还是super,在构造中出现时都要出现在构造的第一行,且不能同时共存
```

### 4.为父类的private属性赋值

```
1.使用公有的set和get方法间接为private属性赋值
2.使用super(参数)有参构造为private属性赋值
```

## 第三章 抽象

### 1.抽象类概述

```java
1.抽象类:抽取共性方法,放到父类中,此方法无法具体实现,因为每个子类对此方法的实现具体细节不一样,此时可以定义为抽象方法
	a.抽象方法所在的类就是抽象类,抽象类中不一定有抽象方法
	b.抽象类中也可以有构造方法,成员变量和成员方法,供子类创建对象时c父类方法使用
	c.子类继承父类是必须要重写父类的所有抽象方法
	d.抽象类不能new对象,只能new抽象类的子类对象
    f.抽象子类继承抽象父类可以不全部重写抽象方法
2.关键字:abstract

	定义抽象方法:修饰符 abstract 返回值类型 方法名();
	抽象方法没有具体实现,所以没有方法体
	需要在子类中具体实现
	定义抽象类:public abstract class 类名(){}
	归属于抽象类的类必须要实现抽象类中的抽象方法
	

package AbstractClass;

public abstract class Animal {
    //抽象方法所在的类必须是抽象类
    public abstract void eat();
    public abstract void voice();
}


package AbstractClass;
public class Dog extends Animal {
    //继承抽象类的子类必须重写抽象方法
    @Override 
    public void eat(){
        System.out.println("shit");
    }
    @Override
    public void voice(){
        System.out.println("wang wang");
    }
}

```

# 模块十一 面向对象

## 第一章 接口

### 1.接口的概述

```java
1.接口:是一个引用数据类型,是一种规则和标准
2.关键字:
	a.interface 接口  
	  public interface 接口名{};
	b.implements 实现
		实现类 implements 接口名{}
3.接口中可以定义的成员:
	a.抽象方法:public abstract
	b.成员变量:public static final 数据类型 变量名=值
	c.默认方法:public default 返回值 方法名(形参){}
	d.静态方法:public static 返回值 方法名(形参){}
	e.私有方法:private 方法
```

### 2.接口实现

```java
1.定义接口:public interface 接口名{}
2.实现public class 实现类类名 implements 接口名{}
3.使用:
	a.实现类实现接口
	b.重写接口中的抽象方法
	c.创建实现类对象
	d.调用重写方法
	
package InterfaceTest;
public interface USB {
    public abstract void open();
    public abstract void close();
}

package InterfaceTest;
public class Mouse implements USB{
    public void open(){
        System.out.println("USB OPEN");
    }
    public void close(){
        System.out.println("USB CLOSE");
    } 
}

```

### 3.接口中的成员

```java
1.抽象方法: 
	public abstract 返回值类型 方法名();
	必须重写
2.默认方法:
	public default 返回值类型 方法名(形参){
		方法体
		return 结果
	}
	
	a.默认方法可重写,可不重写
3.静态方法:
	public static 返回值类型 方法名(形参){
		方法体
		return 结果
	}
	a.接口名直接调用
	b.静态方法和默认方法通常用来实现临时的小功能
4.成员变量:
	public static final 数据类型 变量名=值
        static final 修饰的成员变量需要手动赋值
        接口名直接调用
	被final修饰的变量不能二次赋值,可以视为常量
	不写 public static final 默认也有此修饰
    
```

### 4.接口特点

```
1.接口可以多继承 ->一个接口可以继承多个接口
2.接口可以多实现 ->一个类可以实现多个接口
3.一个子类可以继承一个父类的同时实现多个接口
4.一个类实现多个接口中如果有参数列表相同的方法,只需要重写一次
```

### 5.接口和抽象类的区别

```
相同点:
	a.都是被用于其他类继承或者实现
	b.都不能被new
	c.都包含抽象方法,其子类或者实现类必须重写
不同点:
	a.继承不能多继承,接口可以多实现
	b.抽象类一般作为父类使用,可以有构造方法,成员变量,成员方法,抽象方法
	c.接口成员单一,一般抽取接口,抽取方法,视为功能大集合
```

## 第二章 多态

### 1.多态概述

```java
	a.必须在子父类继承或接口实现,必须有方法重写
	b.new 对象方式不同
		Father a=new Son(); -->double a=10;
		父类引用指向子类对象
        理解为大类型接受了一个小类型的数据
	b.调用的是子类的重写方法,但是不能直接调用子类的特有f
	
```

### 2.多态的使用

#### 2.1基本使用

```java
package PolymorphicTest;
public abstract class Animal {
    public abstract void eat();
}

package PolymorphicTest;
public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Eat shit");
    }
    public void barking(){
        System.out.println("wang wang");
    }
}

package PolymorphicTest;
public class PTest {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.barking();
        Animal animal=new Dog();
        animal.eat();
    }
    
}
```

#### 2.2多态下的成员特点

```
a.成员变量:看等号左边是谁,就是调用谁的成员变量
b.成员方法:看new的是谁,就调用谁的成员方法
```

### 3.多态的好处

```java
1.拓展性好:在方法中,形参传递父类对象,实参可以是其任意的子类对象,实参为哪个子类的对象,就指向哪个子类的对象,调用哪个子类的方法
2.向下转型/向上转型
	向上:Animal animal=new Dog();提升范围
	向下:Dog dog=(Dog)animal;强转
    a.如果等号左右两边不一致,会出现类型转换异常(ClassCastException)
      解决办法:在强转之前,先进行类型判断,使用关键字instanceof
```

## 多态和接口综合练习

```
创建一个USB接口,Mouse和Keyboard实现USB接口,在laptop笔记本中是实现运行和关闭功能以及Mouse和USB设备的开关功能
```

### Laptop

```java
package PolymorphicLeanringObject;

public class Laptop {
    public static void start(){
        System.out.println("Laptop Start");
    }
    public static void stop(){
        System.out.println("Laptop Stop");
    }
    public static  void USB(USB usb){
        if (usb instanceof  Mouse mouse) {
            mouse.open();
            mouse.close();
            mouse.click();
        }
        if (usb instanceof Keyboard) {
            Keyboard keyboard=(Keyboard)usb;
            keyboard.open();
            keyboard.close();
            keyboard.knocking();
        }
    }
}

```

### USB

```java
package PolymorphicLeanringObject;

public interface USB {
    public void open();
    public void close();
}
```

### Mouse和Keyboard

```java
package PolymorphicLeanringObject;

public class Mouse implements USB{
    @Override
    public void open(){
        System.out.println("Mouse Open");
    }
    @Override
    public void close(){
        System.out.println("Mouse Close");
    }
    public void click(){
        System.out.println("Click Mouse");
    }
}


package PolymorphicLeanringObject;

public class Keyboard implements USB{

    @Override
    public void open() {
        System.out.println("Keyboard Open");
    }

    @Override
    public void close() {
        System.out.println("Keyboard Close");
    }
    public void knocking(){
        System.out.println("Keyboard Entry");
    }
}
```

### Test测试类

```java
package PolymorphicLeanringObject;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) { 
            System.out.println("Please input your choice");
            System.out.println("Input 1 represents strat");
            int a=sc.nextInt();
            if (a==1) {
                Laptop.start();
                while (true) { 
                    System.out.println("input 1 represents Mouse function,2 represents Keyboard function,3 represents exit");
                    int b=sc.nextInt();
                    if(b==1){
                        USB usb=new Mouse();
                        Laptop.USB(usb);
                    }else if(b==2){
                        USB usb=new Keyboard();
                        Laptop.USB(usb); 
                    }else if(b==3){
                        break;
                    }
                }
            }
            Laptop.stop();
            break;
        }
    }
}
```

## 第三章 权限修饰符

### **1.权限修饰符概述

```
public:
protected:
default:
private:
public权限最大, private权限最小
构造一般用public,便于new对象
成员方法用public 便于调用
属性一般用private 便于封装
```

|                | public | protected | default | private |
| -------------- | ------ | --------- | ------- | ------- |
| 同类           | Y      | Y         | Y       | Y       |
| 同包不同类     | Y      | Y         | Y       | N       |
| 不同包子父类   | Y      | Y         | N       | N       |
| 不同包非子父类 | Y      | N         | N       | N       |

## 第四章 final关键字

### 1.final概述

```java

1.final修饰类
	格式:
		public final class 类名{}
	特点:
		被final修饰的类不能被继承
2.final修饰方法	
	格式:修饰符 final 返回值类型 方法名(形参){}
	特点:被final修饰的方法不能被重写,且final和abstract不能同时使用
3.final修饰局部变量	
	格式:final 数据类型 变量名=值
	特点:被final修饰的变量不能被二次赋值,相当于常量
4.final修饰对象
	格式:final 数据类型 对象名=new 对象()
		
	特点:被final修饰的对象,地址值不能改变,但是对象中的属性值可以改变
4.final修饰成员变量
	格式:final 数据类型 变量名 =值
		
	特点:必须手动赋值,且不能被二次赋值
			
```

## 第五章 代码块

### 1.构造代码块

```java
a.格式:
	{
		代码	
	}
	代码块优先于构造方法执行,每次new一次调用一次代码块
```

### **2.静态代码块

```java
a.格式:
	static{
		代码
	}
b.静态代码块优先于构造代码块和构造方法优先执行,而且只执行一次
```

### 3.使用场景

```
想要初始化某些数据,且只需要调用一次时使用静态代码块
```

## 第六章 内部类

### 1.静态成员内部类

```java
1.格式:public class A{
	static class B{
	
	}
}
	注意事项:a.内部类可以定义属性,方法,构造等
			b.静态内部类可以被final(不能被继承)或者abstract(不能new)修饰,还可以被四种权限符修饰		
			c.静态内部类不能调用外部的非静态成员
2.调用:
	外部类.内部类 对象名=new 外部类.内部类();
```

### 2.非静态成员内部类

```java
1.格式:public class A{
	 class B{
	
	}
}
	注意事项:a.内部类可以定义属性,方法,构造等
			b.静态内部类可以被final(不能被继承)或者abstract(不能new)修饰,还可以被四种权限符修饰		
			c.静态内部类不能调用外部的非静态成员
2.调用:
	外部类.内部类 对象名=new 外部类().new 内部类();
```

### 3.内外部类成员变量重名

遵循就近原则

```java
package innerclass;

public class Student {
    String name ;
    class Good{
        String name;
        public void Goodname(String name){
            System.out.println(name);//成员方法变量
            System.out.println(this.name);//内部类成员变量
            System.out.println(Student.this.name);//外部类成员变量
        } 
    }
}

```

### 4.局部内部类



```java
1.使用方法:
	a.在方法里new 一个内部类的对象,再调用局部内部类的方法
package com.xu.a_InnerClass;

public class Person {
    public void eat(){
        class  mouth{
            public void chew(){
                System.out.println("snap snap snap");
            }
        }
        new mouth().chew();//在方法内内部类外调用内部类方法
    }
}

package com.xu.a_InnerClass;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
    }
}

b.接口做方法参数时传递的,传递到实际是实现类对象
      接口做方法返回值时,返回的也是实现类对象
        

c.内部类做参数返回值     
package com.xu.b_InnerClass;

public class Test01 {
    public static void main(String[] args) {
        USB usb=method();//USB usb=new Mouse();
        usb.open();
    }
    public static USB method(){
        class Mouse implements USB{
            @Override
            public void open() {
                System.out.println("Mouse open");
            }
        }
        return new Mouse();
    }

}

```

## **5 匿名内部类(重点)

```java
1.不用创建实现类即可调用抽象类和接口的方法
2.格式:
	new 接口/抽象类(){
		重写方法
	}.重写方法名()
	
	接口/抽象类 对象名=new 接口/抽象名(){
		重写方法
	}
	调用:对象名.重写方法名()
```

#### 5.1匿名内部类的复杂用法--当参数传递

```java
package com.xu.b_InnerClass;

public interface USB {
    public void open(); 
}
```



```java
package com.xu.b_InnerClass;

public class Test01 {
    public static void main(String[] args) {
        //匿名内部类当参数传递时,传递的是实现类对象
        method01(new USB() {
            //调用重写的open方法
            	@Override
            	public void open() {
                	System.out.println("usb opened" );
            }
        });//
    }
    public static void method01(USB usb){
        usb.open();
    }

}

```

#### 5.2当返回值返回

```java
package com.xu.b_InnerClass;

public class Test02 {
    public static void main(String[] args) {
        USB usb=method01();
        usb.open();
    }
    public static USB method01(){
        return new USB() {
            @Override
            public void open() {
                System.out.println("opened");
            }
        };
    }
}

```

# 模块十二 异常_Object

```
1.什么是编译时期异常,什么是运行时期异常
2.异常解决方法
3.知道finally关键字的使用场景
4.知道Object以及其中的toString和equals方法重写前后的作用
```

## 第一章 API文档

```
1.API:Application Programming Interface,又称为应用编程接口
2.方便查询开发好的接口以及类,会提供一个相对应的文档,即API文档
3.作用:查询我们要使用的对象以及方法
```

## 第二章 异常(Throwable)

### 1.异常概述

```java
Error(错误):代码出现了重大错误,需要重大改动
Exception(异常):
a.编译时期错误:Exception 及其之类(除 RuntimeException 之外)
	调用方法的时候,该方法的底层抛出了一个异常,导致调用方法时爆红
	当我们一旦触发了这个异常,jvm会将异常信息打印到控制台
b.运行时期异常:语法没有错误,但是一运行就报错,RuntimeException及其子类

当jvm碰见异常无法解决时会一层一层往上抛,当一层一层无法处理异常再次抛到jvm时会将异常信息打印到控制台,然后终止后续程序运行
```

### **2.异常处理方式(重点)

#### 2.1异常处理方式一--throws

```
throws:处理异常,将异常往上抛出,最后给jvm,打印异常信息,终止程序
```



```java
package com.xu.c_Exception;

import java.io.FileNotFoundException;

public class demo01 {
    public static void main(String[] args)
    throws FileNotFoundException {
        String s="a.txt";
        //如果后缀为".txt",则不会抛出异常,后续程序add()继续执行
        multiply(s);
        add();

    }

    private static void multiply(String s)
    throws FileNotFoundException {
    //检查后缀是否为".txt",不为".txt"则主动抛出异常
        if (!s.endsWith(".txt")){
        //主动创建异常
            throw new FileNotFoundException("发生异常");
        }
        System.out.println("无异常");
    }
    
    private static void add() {
        System.out.println("add");
    }
}
```

#### 2.2 异常处理方式一--throws多个异常

```java
1.格式:throws 异常1,异常2,...,异常n
2.如果 throws 的多个异常之间有子父类继承关系,我们可以直接 throws 父类异常
  如果不知道异常的子父类关系,直接 throws Exception ,最大的父类
  相当于多态,父类能接受任意子类的对象
```

```java
package com.xu.c_Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class demo01 {
    public static void main(String[] args)throws Exception{
        String s=null;
        multiply(s);
        add();
    }

    //多个异常存在,直接使用Exception,
    private static void multiply(String s) 
        throws Exception {
        if (s==null){
            throw new IOException("IOException");
        }
        if (!s.endsWith(".txt")){
throw new FileNotFoundException ("FileNotFoundException");
        }
        System.out.println("无异常");
    }

    private static void add() {
        System.out.println("add");
    }

}

```

#### 2.3异常处理方式二--try...catch

```java
1.格式:
	try{
		可能出现异常的代码
	}catch(异常 对象名){//catch用来捕获异常的代码
		处理异常的代码-->会将异常信息保存到日志文件中
     	对象名.printStackTrace();//将详细信息打印到控制台

	}
	如果异常代码块中的异常信息全部被捕获,则后续代码会继续执行
	处理异常的代码一般是将异常代码打印到控制台
```

```java
package com.xu.c_Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class demo01 {
    //使用try...catch方法可以不需要将main方法的异常抛出至jvm
    public static void main(String[] args){
        String s="a.x";
        try{
            multiply(s);//可能出现异常的代码块
        }catch(IOException e){//精准捕获异常信息
            System.out.println(e);//输出异常信息
        }
        //如果异常代码块中的异常信息全部被捕获,则后续代码add()继续执行
        add();
    }

    private static void multiply(String s) throws IOException {
        if (s==null){
            throw new IOException("IOException");
        }
        if (!s.endsWith(".txt")){
            throw new FileNotFoundException("FileNotFoundException");
        }
        System.out.println("无异常");
    }

    private static void add() {
        System.out.println("add");
    }

}

```



#### 2.3异常处理方式二--多个catch

```
1.格式:try{
		可能出现异常的代码
	}catch(异常1 对象名){//catch用来捕获异常的代码
		处理异常的代码-->会将异常信息保存到日志文件中
	}catch(异常2 对象名){//catch用来捕获异常的代码
		处理异常的代码-->会将异常信息保存到日志文件中
	}catch(异常3 对象名){//catch用来捕获异常的代码
		处理异常的代码-->会将异常信息保存到日志文件中
	}
	......
	
	处理多个异常信息
2.catch多个异常之间存在子父类关系,则可以直接throws父类异常
```

```java
package com.xu.c_Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class demo01 {
    public static void main(String[] args){
        String s=null;
        try{
            multiply(s);
        }catch(Exception e){
			e.printStackTrace();//将详细信息打印到控制台
        }
        add();
    }

    private static void multiply(String s) throws IOException,FileNotFoundException {
        if (s==null){
            throw new IOException("IOException");
        }
        if (s.endsWith(".txt")){
            throw new FileNotFoundException("FileNotFoundException");
        }
        System.out.println("无异常");
    }

    private static void add() {
        System.out.println("add");
    }

}

```

### 3.finally关键字

```java
1.不管是否出现异常,都会执行的代码块,catch 捕获到异常之后,先执行finally中的代码,再执行catch中的代码
2.一般和try...catch配合使用
3.格式:
		try{
		可能出现异常的代码
	}catch(异常 对象名){//catch用来捕获异常的代码
		处理异常的代码-->会将异常信息保存到日志文件中
        对象名.printStackTrace
	}finally{
		代码块
	}
4.使用场景:1.关闭资源:如果对象没有用了,GC(垃圾回收器),会回收堆内存中的垃圾,但是有些对象GC不能回收,所以需要我们收到回收,将关闭资源的代码放到finally中
```

```java
   public static void main(String[] args){
        String s=null;
        try{
            multiply(s);
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println("finally");
        }
        add();
    }
```

### 4.抛异常注意事项

编译时期异常必须要处理,

4.1.抛异常在继承时的注意事项

```
1.如果父类中方法抛异常,那么子类可以抛异常也可不抛异常
2.如果父类中方法没有抛异常,则子类不可抛异常
```

4.2try_catch和throws的使用时机

```
1.如果处理异常之后还想让后续代码继续运行,则使用trt_catch
2.如果方法之间是递进关系(调用),可以先用throws,到了最后需要try_catch做一个统一的处理
```

### 5.自定义异常

输入一个用户名,实现登录功能,如果登录失败,抛出LoginNotfindException

```java
package com.xu.c_Exception;

public class LoginNotFindExcepiton extends Throwable {
    public LoginNotFindExcepiton(String message) {
        super(message);
    }
    public LoginNotFindExcepiton() {
    }
}

```

```java
package com.xu.c_Exception;

import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) throws LoginNotFindExcepiton {
        String username="root";
        Scanner sc = new Scanner(System.in);
        System.out.println("input username");
        String input=sc.nextLine();
        if (input.equals(username)) {
            System.out.println("user found");
        }else{
            throw new LoginNotFindExcepiton("user not found");
        }
    }
}


```

```
1.定义一个类,实现自定义异常
2.如果是extends Exception 则是编译时期异常
3,如果是extends RuntimeException 则是运行时期异常
4.提供构造方法,设置异常信息
```

### 6.打印异常的三个方法

```
String toString() :输出异常类型和设置的异常信息
返回此可抛出的简短描述。
String getMessage() :输出异常信息
返回此throwable的详细消息字符串。
void printStackTrace() :打印最全异常信息,包括异常类型,异常信息,和异常所在行处
将此throwable和其追溯打印到标准错误流。 
```

## 第三章 Object类

```
概述:所有类的根类(父类),所有类都会直接或间接继承Object
```

### **1.Object中的toString方法

```java
格式:   
   public String toString() {
        return getClass().getName() + "@" + 	Integer.toHexString(hashCode());
    }
返回该对象的字符串表示形式
    a.如果没有重写Object的toString,直接输出对象,会默认调用对象的toString方法,输出对象的地址值
    b.如果重写了Object中的toString,输出对象的toString,则会调用重写的toSring方法,返回对象内容
    c.总结:如果想输出对象名,而不是地址值,可以重写Object中的toString方法
```

### **2.Object中的equals方法

```java
1.格式:
   public boolean equals(Object obj) {
        return (this == obj);
    }
	Object中的equals方法比较的是两个对象的地址值是否相等
    "=="符号对于基本数据类型,比较的是值大小;对于对象来说比较的是地址值是否相等
a.如果没有重写equals方法,则默认调用Object中的equals方法,比较两个对象的地址值是否相同
b.如果重写了equals方法,则调用重写的equals方法,比较两个对象的内容是否相同   
```

快捷键 alt+insert键快速生成重写equals方法

```java

@Override
    public boolean equals(Object o) {
        //同一类型,直接返回true
        if (this == o) return true;
        //obj为null或者不是同一类型,返回false
        if (o == null || getClass() != o.getClass()) return false;
        //父类向下强转,再进行比较
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }
```

### 3.经典接口

#### 3.1Comparable

```

```

#### 3.2Comparator

```

```

# 模块十四 String

## 第一章 String

### 1.String概述

```java
a.String 类代表字符串。 
Java程序中的所有字符串文字（例如"abc" ）都被实现为此类的实例。
凡是带双引号的都是String的对象
b.字符串不变; 它们的值在创建后不能被更改
        String str="hello";
        str+="world"; ->会产生新对象
c. 因为 String 对象是不可变的，它们可以被共享。
		String str="hello";
        String str1="hello";
        System.out.println(str == str1);
		返回值为ture,代表两对象地址一样
```

### 2.String的实现原理

```java
jdk9开始:底层是一个被final修饰的byte数组-->private final byte[] value
即字符串被定义后,数组被创建好了,且地址无法修改
```

### 3.String的创建

```java
String() --利用String的无参构造创建String对象
String str =new String();

String(String original) --根据字符串创建String对象
String str=new String("abc");

String(char[] value) --根据数组创建String对象
char[] arr={'a','b','c'};
String str=new String(arr);

String(byte[] bytes) 
 byte[] bytes1={-28,-67,-96};
String str=new String(bytes);
通过使用平台(操作系统)的默认字符集解码指定的字节数组来构造新的 String 
操作系统默认字符集GBK:一个中文占2个字节
UTF-8:一个中文占3个字节
idea在启动时,会自动加一个启动参数UTF-8:-Dfile.encoding=UTF-8
    
String(char[] value, int offset, int count) --将部分byte数组的数据,转为String数组
    offset:从哪个开始 count:转多长的数组
    char[] arr={'a','b','c','d','e','f'};
    String str3=new String(arr,1,4);

常用的简化版:String str="字符串 ";
```

### 4.面试题

4.1 地址是否相同

```java
package com.xu.e_String;

public class StrTest02 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        String s3=new String("abc");
        //new出来的对象,新开辟空间,与直接简化版创建String不同地址
        System.out.println(s1==s2);//ture
        System.out.println(s1==s3);//false
        System.out.println(s2==s3);//false
    }
}

```

4.2 创建对象

```java
String s=new String("abc");创建了几个对象?
一个或者两个:如果之前没有创建abc则会创建两个,先创建abc,再创建new
		   如果之前创建了abc,那么只需要创建new,直接将abc共享过来

String s1="hello";
String s2="world";
String s3="helloworld"
String s4="hello"+"world";
String s5=s1+"world";
System.out.println(s3==s4);//ture
System.out.println(s3==s5);//false
字符串拼接:如果右边是字符串的字面值拼接,不会产生新对象;
		  如果等号左边有变量参数拼接,会产生新字符串对象
```

## **第二章 String的方法

### 1.判断方法

```java
boolean equals(String s)-->比较字符串内容,区分大小写
boolean equalsIgnoreCase(String s)-->比较字符串内容,不区分大小写
```

```java
public class StrTest02 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="Abc";
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//ture
    }
}

```

### 2.获取功能

```java
        String s1="0123456";
        //获取字符串长度
        System.out.println(s1.length());
        //字符串拼接,返回新字符串
        System.out.println(s1.concat("78"));
        //根据索引值获取对应的字符
        System.out.println(s1.charAt(2));
        //获取指定字符串在大字符串中第一次出现的索引位置
        System.out.println(s1.indexOf("3"));
        //截取字符串,从指定索引开始截取到最后,返回新字符串
        System.out.println(s1.substring(2));
        //截取字符串,从beginIndex开始到endIndex结束,含头不含尾
        System.out.println(s1.substring(3,5));
```

### 3.转换功能

```java

        String s1="abcdefg";
		//将String字符串转换为char数组
        char[] chars=s1.toCharArray();
        for(int i=0;i<chars.length;i++){
            System.out.print(chars[i]);
        }
        System.out.println();
		//将String字符串转换为byte数组,输出为数字
        byte[] bytes=s1.getBytes();
        for(int i=0;i<bytes.length;i++){
            System.out.print(bytes[i]);
        }
        System.out.println();
		//s.replace方法替换指定字符串,返回一个新的字符串
        System.out.println(s1.replace("a","c"));
		//将字符串按照指定编码方式转换成byte数组
        byte[] bytes1="中文".getBytes("gbk");
        for(int i=0;i<bytes1.length;i++){
            System.out.print(bytes1[i]);
        }
```



### 4.分割功能及其其他功能

```java
按照指定的字符串进行切割
String[] split1 = s.split(",");
split方法中'.'(点)代表任意字符,如果需要以点'.'分割,需要双斜杠'\\'转义
```

```java
public static void main(String[] args) {
        String s="abc,txt";
        String[] split1 = s.split(",");
        for (int i = 0; i < 2; i++) {
            System.out.println(split1[i]);
        }
    }
```

其他功能

```java
boolean contains(String s)--判断老串是否以包含指定的串
boolean endsWith(String s)--判断老串是否以指定的串结尾
boolean startsWith(String s)--判断老串是否以指定的串开头
String toLowerCase()--将字母转成小写
String toUpperCase()--将字母转成大写
String trim()--去掉字符串两端空格
```



### 5.练习

#### 5.1模拟用户登录

实现键盘录入用户密码,判断用户名和密码是否,总共三次登录机会,登录失败会有提示

```java
import java.util.Scanner;

public class StrLoginTest {
    public static void main(String[] args) {
        String user="root";
        String password="abc123";
        int count=3;
        Scanner sc=new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println(count+"-chance");
            System.out.println("Enter username:");
            String inputuser=sc.next();
            System.out.println("Enter password:");
            String inputpassword=sc.next();
            if (user.equals(inputuser) && password.equals(inputpassword)) {
                System.out.println("Login Successed");
                count--;
                break;
            } else if (!(user.equals(inputuser)&&password.equals(inputpassword))) {
                System.out.println("Login falied Usename or Password incorrect");
                count--;
            }
            if (count==0){
                System.out.println("Have no chance,exit!");
            }
        }

    }
}

```

#### 5.2防止空指针比较

```java
import java.util.Objects;
public class StrTest04 {
    public static void main(String[] args) {
        String s1=null;
        String s2="abc";
        method(s1,s2);//different
        method2(s1);//not abc
    }
    public static void method(String str1,String str2) {
        //调用objects.equals工具类,自带防止空指针功能
        if(Objects.equals(str1,str2)){
            System.out.println("same");
        } else
        {
            System.out.println("different");
        }
    }
    public static void method2(String str) {
        //将要被匹配的字符串放在前,要比较的字符串放括号里,可以防止空指针异常
        if ("abc".equals(str)) {
            System.out.println("abc");
        }else {
            System.out.println("not abc");
        }
    }
}

```

#### 5.3遍历字符串

```java
public class StrTest05 {
    public static void main(String[] args) {
        String s1="abcdefg";
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i));
        }
    }
}
```

#### 5.4统计字符串

键盘录入一个字符串,统计该字符串中大写字符,小写字符,数字字符出现的次数(不考虑其他字符)

```
大写字母byte编码在65-90
小写字母97-122
数字0-9byte编码范围48-57
```



```java
import java.util.Scanner;
public class StrTest06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int A=0;
        int a=0;
        int a1=0;
        for (int i = 0; i <ch.length ; i++) {
            if(ch[i]>=48 && ch[i]<=57){
                a1++;
            }else if(ch[i]>=65 && ch[i]<=90){
                A++;
            }else if(ch[i]>=97 && ch[i]<=122){
                a++;
            }
        }
        
        /*也可以直接用单个字符进行比较        
        for (int i = 0; i <ch.length ; i++) {
            if(ch[i]>='0'&& ch[i]<='9'){
                a1++;
            }else if(ch[i]>='A' && ch[i]<='Z'){
                A++;
            }else if(ch[i]>='a' && ch[i]<='z'){
                a++;
            }
        }
        */
        System.out.println("number of capital:"+A);
        System.out.println("number of lowercase:"+a);
        System.out.println("number of digits:"+a1);
    }
}
```

## **第三章StringBuilder类



### 1.StringBuilder概述

```java
1.是一个可变的字符序列,提供了一套与 StringBuffer 兼容的一套API,但是不保证同步
2.主要用于字符串拼接
3.特点:
	a.自带缓冲区, StringBuilder 底层自带一个缓冲区(没有被final修饰的byte数组,默认长度为16),字符串拼接后都会在此缓冲区中保存,不会随意产生新对象,节省内存
	b.如果超出了数组长度,数组会自动扩容
	c.默认每次扩容为老数组的2倍+2,若一次性超出默认的扩容长度,则以实际的放入的数据长度为扩容后的数组长度
```

### 2.StingBuilder的使用

```
1.构造创建对象:
	StringBuilder();--无参构造
	StringBuilder(String str);--有参构造
```

```java
常用方法:
	StringBuilder append(任意数据类型)--字符串拼接,返回的是 StringBuilder 自己
	StringBuilder reverse()--字符串反转,返回的是 StringBuilder 自己
	String toString()--将 StringBuilder 转成String,用 StringBuilder 拼接字符串是为了效率
```

### 3.练习-回文数

```java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //创建StringBuilder对象
        StringBuilder sb=new StringBuilder(str);
        //翻转
        sb.reverse();
        //将StringBuilder对象转换为toString对象
        String s=sb.toString();
        //将键盘输入的String和转换后的String比较内容
        if(str.equals(s)){
            System.out.println("It is Palindrome");
        }else {
            System.out.println("It is not Palindrome");
        }
```

### 4.String和StringBuilder的区别

```java
a.两者用法一样,作用一样
b.String拼接字符串效率低,每拼接一次都会产生新字符串对象,耗费内存资源
c.StringBuilder拼接效率比StringBuffer高,线程不安全,StringBuffer效率比较低,线程安全
拼接效率:StringBuilder>StringBuffer>String
```

# 模块十五 常用API

```
1.会BigInteger和BigDecimal操作
2.会Date和SimpleDateFormat操作
3.会System中的常用方法->主要是数组复制
4.会Arrays中的常用方法
5.会利用包装类定义一个标准的JavaBean
6.会包装类和String之间的转换
```



## 第一章. Math类

```
1.概述:数学工具类,包含基础的数学函数
2.主要用于数学运算
3.特点:构造方法私有化,方法都是静态Static
4.使用:类名直接调用
```

Math类使用

```java
 public static void main(String[] args) {
        //求两个数的最大值最小max,min
        System.out.println(Math.max(10,23));
        System.out.println(Math.min(14,32));
        //向上取整,向下取整
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.floor(2.1));
        //求参数绝对值
        System.out.println(Math.abs(-19));
        //四舍五入
        System.out.println(Math.round(5.3));
    }
```

## 第二章 BigInteger类

```java
1.处理超大整数的类
2.构造:BigInteger(String val)->参数格式必须是数字形式
3.方法:
	BigInteger add(BigInteger val)--返回值为 (this + val) 的BigInteger。 
	BigInteger subtract(BigInteger val)--返回值为 (this - val) 的BigInteger。 
	BigInteger multiply(BigInteger val)--返回值为 (this * val) 的BigInteger。 
	BigInteger divide(BigInteger val)--返回值为 (this / val) 的BigInteger。 
```

```java
int intValue()将BigInteger转换为int类型
long longValue()将BigInteger转换为long类型
    可以认为BigInteger无上限
```

## 第三章 BigDecimal类型

```java
1.解决float和double类型直接参与运算所产生的精度损失问题
2.构造方法:	
	BIgDecimal(String val)-->val必须为数字形式(构造方法不能直接传double型,会产生错误)
3.常用方法:
	static BigDecimal valueOf(double val)-->此方法初始化小数时,可以传入double数据
	BigDecimal add(BigDecimal  val)--返回值为 (this + val) 的BigDecimal 。 
	BigDecimal  subtract(BigDecimal  val)--返回值为 (this - val) 的BigDecimal 。 
	BigDecimal multiply(BigDecimal  val)--返回值为 (this * val) 的BigDecimal 。 
   	BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode) 
        divisor:除号后面的那个数
		scale:指定保留几位小数
		roundingMode:取舍方式
            	roundingMode ROUND_UP--向上加一
            	roundingMode ROUND_DOWN--直接舍去
            	roundingMode ROUND_HALF_UP--四舍五入
            		
5.注意:
	如果除不尽会报错,出现运算异常
    如果方法过时了方法成员会被划横线,底层会有一个@Deprecated修饰,但是过时的方法成员仍然可以使用,只是不推荐使用了
```

## **第四章 Date日期类

### 1.Date类的介绍

```
1.概述:表示特定的瞬间,精确到毫秒
2.a.1000ms=1s
  b.时间原点:1970年1月1日 0时0分0秒(unix系统起始时间)也叫格林威治时间
```

### 2.Date类的使用

```java
     //Date()-->获取当前系统时间
        Date date = new Date();
        System.out.println(date);
     //Date(Long time)-->获取指定时间,传递毫秒值-->从时间原点开始算
        Date date1 = new Date(1000L);//传入Long型
        System.out.println(date1);
```

```java
    private static void date1() {
        Date date = new Date();
        //设置时间,传递毫秒值
        date.setTime(1000L);
        //获取时间返回毫秒值
        System.out.println(date.getTime());
    }
```

## **第五章 Calendar日历类

### 1.Calendar介绍

```java
1.概述:抽象类,日历类
2.获取:
	Calendar中的方法:static Calendar getInstance()
```

```java
常用方法:
	Calendar calendar = Calendar.getInstance();//多态,父类指向子类对象
        //int get(int field)-->返回给定日历字段的值
        int year=calendar.get(Calendar.YEAR);
        System.out.println(year);

        //void set(int field,int value)-->将给定的日历字段设置成指定的值
        calendar.set(calendar.YEAR,2019);
        System.out.println(calendar.get(Calendar.YEAR));

        //void add(int field,int amount)-->根据日历规则,为给定的日历字段添加或者减去指定的时间
        calendar.add(calendar.YEAR,-1);
        System.out.println(calendar.get(Calendar.YEAR));

        //Date getTime()-->将Calendar转换为Date对象
        Date date=calendar.getTime();
        System.out.println("date = " + date);
```

### 2.Calendar判断闰年

```java
void set(int yeat,int month,int day)//使用此方法实现闰年判断
    
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year=scanner.nextInt();
   		//创建Calendar对象
        Calendar calendar = Calendar.getInstance();
    //设置年月日
        calendar.set(year,2,1);//2代表3月份
    //将日设置为3月份-1天即是2月份的最后一天
        calendar.add(Calendar.DAY_OF_MONTH,-1);
    //获取Calendar类
        int day=calendar.get(Calendar.DAY_OF_MONTH);
    //判断
        if(day==29){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }
    }
```

## **第六章 SimpleDateFormat日期格式化类

#### 1.介绍及其使用

```java
1.概述:日期格式化类
2.构造:SimpleDateFormat(String pattern)
	pattern代表我们指定的日期格式,字母不能变,但是中间的连接符可以改变
    String format(Date date)->将Date对象按照指定格式转成String
    Date parse(String source)->将符合日期格式的字符串转成Date对象
3.SimpleDateFormats
public static void main(String[] args) throws ParseException {
        //创建SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将Date对象按照指定的格式转换为String
        String date = sdf.format(new Date());
        System.out.println("date = " + date);
        //Date parse(String source)->将符合日期格式的字符串转成Date对象
        String time="2021-12-14 19:23:13";
        Date date2= sdf.parse(time);//此处parse会抛出编译异常
        System.out.println("date2 = " + date2);

    }
```

## 第七章 JDK8新日期类

### 1.LocalDate对象



```
1.概述:LocalDate是一个不可变的日期时间对象,表示日期
```



```java
   //static LocalDate now()-->创建LocalDate对象 年月日
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
   //static LocalDate of(int year,int month,int dayofMonth)
   //创建LocalDate对象,设置年月日
        LocalDate localDate2 = LocalDate.of(2020, 1, 1);
        System.out.println("localDate2 = " + localDate2);
```

### 2.LocalDateTime对象

```
比LocalDate更加精确的的日期,精确到时分秒
```



```java
//创建LocalDateTime对象
LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
//创建对象并设置日期时间
        LocalDateTime localDateTime1=LocalDateTime.of(2020,1,1,1,1);
        System.out.println("localDateTime1 = " + localDateTime1);
```

#### 2.1 get和with方法以及日期偏移

```java
get方法:
LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        
with方法(修改日期):        
LocalDate localDate = LocalDate.now();
        //调用withYear只改变year
        LocalDate localDate1=localDate.withYear(2010);
        System.out.println(localDate1);
        LocalDate localDate2=localDate.withMonth(3);
        System.out.println("localDate2 = " + localDate2);
        //采用链式调用,改变年月日
        LocalDate localDate3=localDate.withYear(2019).withMonth(3).withDayOfMonth(23);
        System.out.println("localDate3 = " + localDate3);

日期偏移:
minus向后偏移,plus向前偏移
LocalDate localDate = LocalDate.now();
        LocalDate localDate1=localDate.plusYears(1);
        System.out.println(localDate1);
        LocalDate localDate2=localDate.minusYears(1);
        System.out.println(localDate2);
```

### 3.Period和Duration

#### 3.1 Period计算日期之间的偏差(年月日)

```java
static Period between(LocalDate d1,LocalDate d2)
计算两个日期之间的差值

获取相差的年,月,日,两个日期的年与年相减,月与月相减,日与日相减
getYear();
getMonths();
getDays();
```

####  3.2 Duration计算日期之间的偏差(时分秒)

```java
1.static Duration between(Temporal startInclusive,Temporal endExclusive)
Temporal是一个接口,注意要传递LocalDateTime,Duration才能精确计算时间偏差
2.toDays(),toHours(),toMinutes(),toMillis().获取相差的时分秒
```

### 4.DateTimeFormatter日期格式化类



```

```

## **第八章 System工具类

```java
system类是一个工具类,构造私有化不能利用构造方法new对象,方法都是静态的

static long currentTimeMillis() 
返回当前时间（以毫秒为单位）。

static void exit(int status) 
终止当前运行的Java虚拟机。

static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
    src:源数组
    srcPos:从源数组哪个索引开始复制
    dest:目标数组
    destPos:从目标数组的哪个索引开始粘贴
    length:复制多少个元素
将指定源数组中的数组从指定位置复制到目标数组的指定位置
```

## **第九章 Arrays数组工具类

```java
1.数组工具类,构造私有,方法静态,类名直接调用

static String toString(Object[] a) 
返回指定数组的内容的字符串表示形式。 

static void sort(int[] a) -->可以为任意类型数组
按照数字顺序排列指定的数组。 

static int binarySearch(int[] a, int key) ->必须是升序数组
使用二叉搜索算法搜索指定的int数组的指定值。

static int[] copyOf(int[] original, int newLength) 
数组扩容,复制指定的数组，返回新的数组,用零截取或填充（如有必要），以便复制具有指定的长度。 
```

## 第十章 包装类

### 1.基本数据类型对应的引用数据类型(包装类)

```
将基本类型转换成包装类,让基本类型拥有类的特性,这样就可以调用包装类中的方法操作数据

如果传入的基本数据类型在缓存对象范围之内,则创建的包装类对象共享内存空间,如若不在此范围之内则开辟新的空间
```

| 基本类型 | 包装类(引用数据类型) | 缓存对象    |
| -------- | -------------------- | ----------- |
| byte     | Byte                 | -128~127    |
| short    | Short                | -128~127    |
| int      | Integer              | -128~127    |
| long     | Long                 | -128~127    |
| float    | Float                | 无          |
| double   | Double               | 无          |
| char     | Charactor            | 0~127       |
| boolean  | Boolean              | true和false |

### **2.以Integer为例介绍使用包装类

```java
	包装类构造:
		//Integer(int value)--过时了,不推荐使用
        Integer i1=new Integer(10);
        System.out.println(i1);
		
		//Integer(String str)--过时
        Integer i2=new Integer("10");
        System.out.println(i2);
```

```java
推荐使用:
装箱:将基本类型转换成对应的包装类
static Integer valueOf(int i) 
返回一个 Integer指定的 int值的 Integer实例

static Integer valueOf(String s) 
返回一个 Integer对象，保存指定的值为 String 

拆箱:将包装类型转换为基本类型
int intValue() 
将 Integer的值作为 int 。
    
大部分情况装箱和拆箱都是自动完成的
```

### 3.String与基本数据类型之间的转换

```java
1.String中的静态方法:static String valueOf(int i)
```

<img src="C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20241112144006173.png" alt="image-20241112144006173" style="zoom: 150%;" />

### **4.标准JavaBean

```java
将JavaBean中的基本数据类型属性变为包装类型,方便后续sql语句操作,也可以调用包装类中的方法
public class User {
    private Integer uid;
    private String username;
    private Integer password;

    public User(Integer password, Integer uid, String username) {
        this.password = password;
        this.uid = uid;
        this.username = username;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }
}

```

# 模块十六 多线程

```java
1.会使用多线程方法,主要是start()
2.会使用继承Thread的方式创建多线程
3.会使用Runnable接口的方式实现多线程
4.会使用同步代码块解决线程不安全问题
5.会使用同步代码块解决线程不安全问题
```



## 第一章 多线程基础



### 1.进程和线程

```
进程:进入到内存中执行的应用程序

线程:进程中最小的执行单元
线程作用:负责当前进程中程序的运行,一个进程中至少用一个线程,一个进程还可以有多个线程,这样的程序称为多线程

```

### 2.并发和并行

```
并行:同一时刻,有多个指令在多个cpu中同时执行

并发:同一时刻,有多个指令在单个cpu交替执行
```

### 3.cpu调度

```
分时调度:指的是所有线程轮流获取cpu使用权,并且平均分配每个线程占用的cpu时间片
抢占式调度:多个线程轮流抢占cpu使用权,优先级高的先抢占执行
```

### 4.主线程

```
主线程:cpu和内存之间专门为main方法服务开辟的线程
```

## 第二章 创建线程的方式(重点)

### 1.extend Thread方法

```
1.定义一个类,继承Thread
2.重写run方法,在run方法中设置线程任务(即此线程具体要干的事情,具体执行代码)
3.创建自定义线程类对象
4.调用Thread中的start方法,开启线程,jvm自动调用run方法
```

```java
public class MyThread extends Thread {
   @Override
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread 执行了" + i);
        }
    }
}

public class Test001 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.run();
        //如果直接调用run方法(),会先跑完run方法才会执行main线程
        t1.start();
        //调用start方法,开启线程,jvm自动调用run方法
        //主线程和run方法交替执行
        for (int i = 0; i < 10; i++) {
            System.out.println("main Thread "+i);
        }

    }
}
```

### 2.多线程在内存中的运行原理

```
开启一个线程,会开启一个栈空间,并运行相应线程代码
同一个线程不能连续调用多个start方法,如果要多次调用则需要new一个新的线程对象
```

### **3.Thread类中的方法

```java
void start() 
导致此线程开始执行; Java虚拟机调用此线程的run方法。 
    
void run() 
如果这个线程使用单独的Runnable运行对象构造，则调用该Runnable对象的run方法; 否则，此方法不执行任何操作并返回。 
    
String getName() 
返回此线程的名称。 
    
void setName(String name) 
给线程设置名字
    
static Thread currentThread() 
获取正在执行的线程对象 
    
static void sleep(long millis) 
线程睡眠,睡眠结束后继续执行,使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行），具体取决于系统定时器和调度程序的精度和准确性。  
```

线程睡眠:

```java
public class MyThread extends Thread {
   @Override
    public void run()
    {
        for (int i = 0; i < 10; i++) {
        //自建线程在重写的run方法中,因为父类Thread类中没有抛异常,所以使用try_catch捕获异常,不能用throws
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName() +"执行了--"+ i);
        }
    }
}


public class Test001 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.setName("GGbond");
        t1.start();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000L);  //主线程中可以抛出异常 
            System.out.println(Thread.currentThread().getName()+"执行了--"+i);
        }
    }
}
```

### 4.Thread中的其他方法

```java
void setPriority(int newPriority) 
设置线程的优先级。  
void setDaemon(boolean on) 
将此线程标记为 守护线程,非守护线程结束的时候,守护线程也一起结束 ,但不是立即结束,在系统通知守护线程的过程中,守护线程会再执行一段时间
void join() 
插队线程,等待这个线程死亡 
static void yield() 
礼让线程,当前线程r   
```

##### 4.1线程优先级

```java
       /* 获取线程优先级
            1 为最小优先级,2 为默认优先级,10 为最大优先级
        */
        System.out.println(mythread1.getPriority());
        System.out.println(mythread2.getPriority());

        //设置优先级,优先级高的先执行
        mythread1.setPriority(1);
        mythread2.setPriority(10);
```

##### 4.2守护线程

```java
public class Test1 {
    public static void main(String[] args) {
        Mythread1 mythread1 = new Mythread1();
        mythread1.setName("mythread1");

        Mythread2 mythread2 = new Mythread2();
        mythread2.setName("mythread2");

        mythread2.setDaemon(true);

        mythread1.start();
        mythread2.start();


    }
}
//Mythread1 设置循环十次 Mythread2 设置循环五十次
//当Mythread执行完毕时,Mythread2执行结束
mythread2  run--0
mythread2  run--1
mythread2  run--2
mythread2  run--3
mythread2  run--4
mythread2  run--5
mythread2  run--6
mythread2  run--7
mythread1  run--0
mythread2  run--8
mythread1  run--1
mythread2  run--9
mythread1  run--2
mythread1  run--3
mythread1  run--4
mythread1  run--5
mythread1  run--6
mythread1  run--7
mythread2  run--10
mythread1  run--8
mythread2  run--11
mythread1  run--9
mythread2  run--12
mythread2  run--13
mythread2  run--14
mythread2  run--15
mythread2  run--16
```

### 5.第二种方式_实现Runnable接口

```
1.创建一个类,实现Runnable接口
2.重写run()方法,设置线程任务
3.利用Thread类的构造方法:Thread(Runnable target),创建Thread对象(线程对象),将自定义的类当参数传递到Thread构造中
4.调用Thread中的start方法,开启线程,jvm自动调用run方法
```

```java
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "  run--" + i);
        }
    }
}


public class Test01 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        //将Runnable对象传入Thread中创建线程
        Thread t1 = new Thread(myRunnable);

        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "  run--" + i);
        }
    }
}

```

### 6.第三种方式_匿名内部类创建线程

```java
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"  run--"+i);
                }
            }
        }.start();
```

## **第三章 线程安全

```
当一个资源被多个线程调用,会产生数据问题
```

### 1.线程安全问题--线程不安全的代码

```java
public class MyTicket implements Runnable{
    int ticket=20;
    @Override
    public void run() {
        while(true){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+"抢到了第"+ticket+"张票");
                ticket--;
            }
        }
    }

}

public class Test {
    public static void main(String[] args) {
        MyTicket myTicket = new MyTicket();

        Thread t1 = new Thread(myTicket);
        Thread t2 = new Thread(myTicket);
        Thread t3 = new Thread(myTicket);

        t1.setName("张三");
        t2.setName("李四");
        t3.setName("王五");

        t1.start();
        t2.start();
        t3.start();
    }
}
```

### 2.使用synchronized解决线程安全问题(同步代码块)

```java
1.格式:
	synchronized(任意对象){
		有线程安全问题的代码;
	}
2.任意对象:就是我们的锁对象
3.执行:一个线程拿到锁之后,会进入到同步代码块中执行,在此期间,其他线程拿不到锁,就进不去同步代码块,需要在同步代码块我们排队等待.
public class MyTicket implements Runnable{
    int ticket=20;
    //任意对象用做锁对象
    Object lock=new Object();
    @Override
    public void run() {
        while(true){
            //while循环执行太快看不出区别,使用sleep降低速度
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock){
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"抢到了第"+ticket+"张票");
                    ticket--;
                }
            }

        }
    }

}
```

### 3.使用普通同步方法

```java
1.格式:修饰符synchronized 返回值类型 方法名(参数){
	方法体
	return 结果
}
2.默认锁:this

```

```java
public class MyTicket implements Runnable{
    int ticket=20;

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           //method1();
            method2();
        }
    }
    //使用synchronized关键字定义方法
    public synchronized void  method1(){
            if(ticket>0){          System.out.println(Thread.currentThread().getName()+"抢到了第"+ticket+"张票");
                ticket--;
            }
    }
    //普通方法
    public  void method2(){
        //调用默认锁
        synchronized (this){
            if(ticket>0){           System.out.println(Thread.currentThread().getName()+"抢到了第"+ticket+"张票");
            ticket--;
        }}
    }

}
```

### 4.静态同步方法

```java
1.格式:修饰符 static synchronized 返回值类型 方法名(参数){
	方法体
	return 结果
}
2.默认锁:class对象

```

```java
package com.xu.i_synchronized2;

public class MyTicket implements Runnable{
    //静态方法内调用静态变量
    static int ticket=20;

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           method1();
           method2();
        }
    }
    public static synchronized void  method1(){
            if(ticket>0){               System.out.println(Thread.currentThread().getName()+"抢到了第"+ticket+"张票");
                ticket--;
            }
    }
    public static void method2(){
        //默认锁为c
        synchronized (MyTicket.class){
            if(ticket>0){          System.out.println(Thread.currentThread().getName()+"抢到了第"+ticket+"张票");
            ticket--;
        }}

    }

}

```

## 第四章 线程状态

### 1.线程状态介绍

```java
BLOCKED 
线程在获取一个对象锁时,该对象锁被其他线程占用;当该线程持有锁时,变为Runnable状态.
NEW 
线程被创建,但线程尚未启动的线程状态,还没有调用start方法。  
RUNNABLE 
可运行线程的线程状态。  
TERMINATED 
终止线程的线程状态。  
TIMED_WAITING 
具有指定等待时间的等待线程的线程状态。  
WAITING 
等待线程的线程状态,无法自动唤醒,必须等待另一个线程调用notify或者notifyall方法才能唤醒.
```

### 2.线程状态图

<img src="C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20241205163918346.png" alt="image-20241205163918346" style="zoom: 200%;" />

![image-20241205163953480](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20241205163953480.png)

# 模块 十七 多线程

## 第一章 等待唤醒机制

### 1.等待唤醒案例分析(线程之间通信)

```
要求:一个线程生产,一个线程消费,不能连续生产和消费-->等待唤醒机制(生产者,消费者)
```

| 方法             | 说明                                                         |
| ---------------- | ------------------------------------------------------------ |
| void wait()      | 线程等待,等待的过程中线程会释放锁,需要被其他线程调用notify方法将其唤醒,重新抢锁执行 |
| void notify()    | 线程唤醒,一次唤醒一个等待线程;如果有多条线程等待,则随机唤醒一条等待线程 |
| void notifyall() | 唤醒所有等待线程                                             |

```
流程分析步骤:列出要解决的问题-->逐个分析如何解决问题,列出解决问题的方法-->d
```

```java
问题1:怎么表示生产包子,怎么表示消费包子?
a.如果是生产包子:count++
b,如果是消费包子:直接输出count
问题2:怎么证明有没有包子?
a.如果flag = true;证明有包子,就要消费包子
b.如果flag =false;证明没有包子,就要生产包子
问题3:如何防止生产到一半,CPU切换到消费线程去了?
加锁
问题4:即使加锁,也不能保证生产一个就消费一个如何防止连续生产,连续消费?wait和notify方法
    
如果flag=true,证明有包子,生产线程wait,唤醒消费线程notify;否则证明没有包子,要生产包子,将flag=true,证明生产完了,有包子了.

如果flag=false,证明没有包子,消费线程wait,唤醒生产线程notify;否则证明有包子,要消费包子,将flag=false,证明消费完了,,没有包子了.
```



### 2.等待唤醒案例实现

```java
package com.xu.a_wait_notify;

public class Test {
    public static void main(String[] args) {
        //创建锁对象
        Baozipu baozipu = new Baozipu();
        //创建Consumer和Productor对象
        Consumer consumer = new Consumer(baozipu);
        Productor productor = new Productor(baozipu);
        //创建Consumer和Productor线程
        Thread t1 = new Thread(productor);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
    }
}

```

```java
package com.xu.a_wait_notify;

public class Baozipu {
    private boolean flag;
    private int count;

    public Baozipu() {
    }

    public Baozipu(boolean flag, int count) {
        this.flag = flag;
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    /*
        将getCount设置为消费包子的方法
        直接输出count
     */
    public void  getCount() {
        System.out.println("consume.......the "+count+"baozi");
    }
    /*
        将setCount设置为生产包子的方法
        count++
     */
    public void setCount() {
        count++;
        System.out.println("product.......the "+count+"baozi");

    }
}

```

```java
package com.xu.a_wait_notify;

public class Consumer implements Runnable {
    private Baozipu baozipu;

    public Consumer(Baozipu baozipu) {
        this.baozipu=baozipu;
    }
    @Override
    public void run() {
        while (true) {
            //降低循环的运行速度
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (baozipu) {
                //1.如果flag=false,则证明没有包子,消费线程等待
                if(baozipu.isFlag()==false){
                    try {
                        //无限等待状态会释放锁
                        baozipu.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                //2.如果flag=true,则证明有包子,唤醒消费线程
                baozipu.getCount();
                //3.改变flag状态为flase,证明没有包子
                baozipu.setFlag(false);
                //4.唤醒生产线程
                baozipu.notify();
            }
        }
    }
}

```

```java
package com.xu.a_wait_notify;

public class Productor implements Runnable {
    private Baozipu baozipu;

    public Productor(Baozipu baozipu) {
        this.baozipu=baozipu;
    }
    @Override
    public void run() {
        while (true) {
            //降低循环的运行速度
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (baozipu) {
                //1.如果flag=true,则证明有包子,需要消费包子,生产线程等待
                if(baozipu.isFlag()==true){
                    try {
                        //无限等待状态会释放锁
                        baozipu.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                //2.如果flag=false,则证明没有包子,需要生产包子,唤醒生产线程
                baozipu.setCount();
                //3.生产完包子后,改变flag状态,证明有包子
                baozipu.setFlag(true);
                //4.唤醒消费线程
                baozipu.notify();
            }
        }
    }
}

```

# 模块 十八 集合

## 第一章. 框架集合(单列集合)

```java
集合的特点:
a.只能存储引用数据类型的数据
b.长度可变(可删可填)
c.集合中有大量方法,方便我们操作

分类:
a.单列集合:一个元素就一个组成部分:
list.add("张三")
b.双列集合:一个元素有两部分构成:key 和 value
map.put("gg","bond")->key,value叫做键值对
    
学会集合的特点和使用
```

![image-20250507091449296](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250507091449296.png)

![image-20250507091846414](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250507091846414.png)

![image-20250507091906928](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250507091906928.png)

## 第二章. Collection接口

```
单列集合的顶级接口
使用:
a.创建Collection<E> 对象名 =new 实现类对象<E>()
b.<E>:泛型,决定了集合中能存储什么类型的数据,可以统一元素类型
		泛型中只能写引用数据类型,如果不写.默认为Object类型
```

```java
 Collection<String> collection= new ArrayList<>();
        collection.add("a");
//boolean add(E e)给定的元素添加到当前集合中
        collection.add("b");
        System.out.println(collection);
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("ggbond");
        collection1.add("happy");
        collection1.addAll(collection);
//boolean addAll() 将一个集合添加到另外一个集合
        System.out.println(collection1);
        collection1.clear();
// void clear()清除所有元素
        collection.contains("a");
// boolean contains(Object o)判断是否包含指定元素
        System.out.println(collection1.isEmpty());
//boolean isEmpty()判断集合元素是否为空
        collection.remove("a");
//boolean remove(Object o)移除集合中的指定元素
        System.out.println(collection);
        System.out.println(collection.size());
//int size()集合中的元素个数
        Object[] objects = collection.toArray();
//Object[] toArray()把集合中的元素添加到数组
        System.out.println(Arrays.toString(objects));
```



## 第三章. 迭代器**

### 1. 迭代器的基本使用

```java
Iterator接口
作用:遍历集合
获取:Collection中的方法
Iterator<E> iterator()
方法:
boolean hasNext() ->判断集合中是否有下一个元素
    
E next() ->获取下一个元素
next()方法不要一次多个的连续使用,否则会出现NoSuchElementExcetion

public class Demo01Iterator {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //获取迭代器对象
        Iterator<String> iterator =list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        
    }
}
```

### 2.迭代器的底层原理

```
1.获取Iterator的时候怎么获取的
Iterator<String> iterator =list.iterator();
Iterator是一个接口,等号右边一定是它的实现类对象
Iterator接收的是ArrayList的内部类Itr对象
```

<img src="C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250507160636888.png" alt="image-20250507160636888" style="zoom: 80%;" />

注意:ArrayList返回的是Itr对象,其他的集合返回的不一定是内部类Itr对象

### 3. 并发修改异常

```java
ConcurrentModificationException
原因:当前预期操作次数和实际操作次数不相等
最终原因:我们调用了add方法,而add方法底层只给modCount++,但是再次调用next方法的时候,并没有给修改后的modCount重新赋值给expetedModCount,导致next方法底层的判断出实际操作次数和预期操作次数不相等了,所以抛出了"并发修改异常"

示例代码:
public class Demo02Iterator {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            if ("c".equals(s)) {
                list.add("d");
            }
        }
        System.out.println(list);
    }
}
```

> 使用迭代器迭代集合的过程中,不要随意修改集合的长度,容易出现并发异常

## 第四章. 数据结构

### 1.栈

```
特点:先进后出
```

### 2.队列

```
特点:先进先出
```

### 3.数组

```
特点:查询快,增删慢
快:因为有索引,我们可以直接通过索引操作元素
慢:添加和删除元素都要创建新的数组,通过复制数组来进行增删
```

### 4.链表

```java
分为两种单向链表和双向链表
1.单向链表:
	节点:一个节点分为两部分
	第一部分:数据域(存储数据)
	第二部分:指针域(保存下一个节点地址)
	特点:前面的节点记录后面节点的地址,但是后面节点地址不记录前面节点的地址	
双向链表:
	节点:一个节点分为三部分
	第一部分:指针域(保存上一节点地址)
	第二部分:数据域(存储数据)
	第三部分:指针域(保存下一个节点地址)
	特点:前面的节点记录后面节点的地址,后面节点地址也记录前面节点的地址	

链表结构特点:查询慢,增删快
```

## 第五章. List接口及实现类**

### 1.ArrayList集合使用

#### 1.1ArrayList特点及其常见方法

```java
特点:
a.元素有序->按照什么顺序存的,就按照什么顺序取
b.元素可重复
c.有索引->可以利用索引去操作元素
d.线程不安全
数据结构:数组  

常用方法:
public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        //boolean add(E e)->将元素添加到集合中(尾部),add方法一定能添加成功,所以不用Boolean接收返回值
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list.size());
        //获取集合元素个数
        System.out.println(list.get(1));
        //根据索引获取元素
        System.out.println(list);
        list.add(2,"帅哥");
        //void add(int index,E elment) 在指定位置添加元素
        System.out.println(list);
        list.remove("帅哥");
        //boolean remove(Object o) 删除指定的元素
        System.out.println(list);
        System.out.println(list.remove(2)); 
        //String remove(int index)删除指定索引的元素,返回的是被删除索引上的元素
        list.set(1,"gg");
        //将索引上的元素修改成后面的element元素
    }
}
```

#### 1.2ArrayList元素遍历

```java
 ArrayList<String> list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        //使用迭代器遍历
        Iterator<String> iterator =list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /*
        * 遍历集合元素的快捷键:集合名.fori
        * */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
```

#### 1.3ArrayList底层源码分析

```java
1.ArrayList构造方法:
a.ArrayList() 构造一个初始容量为10的空列表
b.有参构造ArrayList(int capacity) 构造一个拥有指定初始容量的空列表
实例:ArrayList<String> list = new ArrayList(3);指定长度为3

2.ArrayList底层源码总结:
a.不是一new就会创建初始容量为10的空列表,而是第一次add的时候才会创建初始化容量为10的空列表
b.ArrayList底层是数组,为啥还说集合长度可变呢
  原因:ArrayList底层会自动扩容->Arrays.copyof,每次扩容为1.5倍
```

#### 1.4 注意

> ArrayList<string> list=new ArrayList<string>()->现在我们想用都是new
>
> 但是将来开发不会想使用就new集合,都是调用一个方法,查询出很多数据来,此方法返回一个集合,自动将查询出来的数据放到集合中,我们想在页面上展示数据,遍历集合而且将来调用方法,返回的集合类型,一般都是接口类型List<泛型>list =对象.查询方法()

## 第六章 LinkedList集合**

### 1.LinkedList概述与基本使用

```java
1.概述:LinkedList是List接口的实现类2.特点:
a.元素有序b.元素可重复
c.有索引->这里说的有索引仅仅指的是有操作索引的方法,不代表本质上具有索引
d.线程不安全
    
3.数据结构:双向链表
    
4.方法:有大量直接操作首尾元素的方法
public void addFirst(E e):将指定元素插入此列表的开头。
public void addLast(E e):将指定元素添加到此列表的结尾。
public E getFirst():返回此列表的第一个元素。-
public E getLast():返回此列表的最后一个元素。
public E removeFirst():移除并返回此列表的第一个元素。public E removeLast():移除并返回此列表的最后一个元素。2-public E pop():从此列表所表示的堆栈处弹出一个元素。public void push(E e):将元素推入此列表所表示的堆栈。
public boolean isEmpty():如果列表没有元素，则返回true.
```

```
//public E pop():从列表所表示的堆栈处栈顶弹出一个元素        list.pop(); 
//public void push(E e):将此元素推入此列表所表示的堆栈的栈顶
list.push("5");

```

### 2.底层源码分析

```java
1.LinkedList底层成员
transient int size =0;元素个数
transient Node<E> first;第一个节点对象
transient Node<E> last;最后一个节点对象
2.Node代表的是节点对象
private static class Node<E>{
	E item;//节点上的元素
	Node<E> next;//记录着下一个节点地址
	Node<E> prev;//记录着上一个节点地址
	Node(Node<E> prev,E element, Node<E> next){
	this.item = element;
	this.next = next;
	this.prev = prev;
		}
}
```

## 第七章 增强for(for-each)

### 1.基本使用

```
1.作用:遍历集合或者数组

2.格式:for(元素类型 变量名:要遍历的集合名或者数组名){变量名代替每一个元素}
3.遍历数组底层使用的是普通for循环
  遍历集合底层使用的是Iterator迭代器
4.注意:不管是使用增强for还是Iterator都不要随意修改集合的长度
```

```java
public class Demo01Foreach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        for (String s : list) {
            System.out.println(s);
        }
                System.out.println("================================");
        int[] arr = {1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
```



# 模块十九 集合

```java
重点:
1.Collections集合工具类的常用方法
2.会使用泛型
3.知道HashSet和LinkedSet的特点及其使用
4.知道HashSet的重复过程
```

## 第一章.Collections集合工具类

```java
1.概述:集合工具类
2.特点:
	a.构造私有
	b.方法都是静态的
3.类名直接调用
4.方法:
static <T> boolean addA11(co1lection<? super T> c,T... elements)->批量添加元素
static void shuffle(List<?> 1ist)->将集合中的元素顺序打乱
static <T> void sort(List<T> 1ist)->将集合中的元素按照默认规则排序static <T> void sort(List<T> 1ist，Comparator<?super T> c)->将集合中的元素按照指定规则排序
    
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "n", "a", "c", "d", "k", "s");//添加任意的元素个数
        Collections.sort(list);//按照默认规则将元素排序,即按照ASCII码表
        System.out.println(list);
        Collections.shuffle(list);//打乱集合中的元素排序

    }
}
```

```java
方法:static <T> void sort(List<T> 1ist，Comparator<?super T> c)->将集合中的元素按照指定规则排序
    
2.Comparator比较器
a.方法:
直接重写compare方法:
int compare(T ol,T o2)
    o1-02 -> 升序
    o2-01 -> 降序
    或者:
	实现了Comparable接口
	this.-o.升序
    o.-this.降序
```

```java

public class Student implements Comparable<Student> {
    public String name;
    public int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
```



## 第二章. 泛型

### 1.为什么要使用泛型

```
1.泛型:<>
2.作用:
统一数据类型,防止将来的数据转换异常3.注意:
a.泛型中的类型必须是引用类型b.如果泛型不写,默认类型为object
```

```java
不使用泛型实例:会出现ClassCastException异常
public class Demo01Genericity {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(true);
        arrayList.add("ss");
        for (Object o : arrayList) {
            String s = (String) o;
            System.out.println(o);
        }
    }
}
```

### 2.泛型的定义

#### 2.1 含有泛型的类

```java
1.定义:
pubic class 类名<E>{

}
2.什么时候确定类型:new对象的时候确定类型
```



```java
public class MyArrayList<E> {
    //定义一个数组充当ArrayList底层的数组,长度规定为10
    Object[] obj=new Object[10];
    //定义size,代表集合的个数
    int size;
    //定义一个add方法,参数类型需要和泛型保持一致,数据类型为E,变量名随便取
    public boolean add(E e) {
        obj[size]=e;
        size++;
        return true;
    }
    //定义一个get方法根据索引获取元素
    public E get(int index) {return (E) obj[index];}
    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
```

```java
public class Demo02Genericity {
    public static void main(String[] args) {
        MyArrayList<String> list1 = new MyArrayList<>();
        list1.add("22");
        list1.add("99");
        list1.add("33");
        String s=list1.get(2);
        System.out.println(s);
        System.out.println(list1);//直接输出变量名,默认调用toString
    }
}
```



#### 2.2 含有泛型的方法

```java
public class ListUtils {
    //自定义一个静态方法addAll,添加多个集合的元素
    public static <E> void addAll(ArrayList<E> list, E...elements) {
        for (E e : elements) {
            list.add(e);
        }
    }
}
```

```java
public class Demo03Genericity {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ListUtils.addAll(list1,"12","tt","223");
        System.out.println(list1);
    }
}
```

#### 2.3 含有泛型的接口

```java
1.格式:
public interface 接囗名<E>{
2.什么时候确定类型:
a.在实现类的时候还没有确定类型,只能在new实现类的时候确定类型了
    ->比如 ArrayList
```

```java
public interface Mylist <E>{
	public boolean add(E e);
}
```

### 3.泛型通配符

```java
1.作用:可以规定泛型的范围
2.上限:
a.格式:<?extends 类型>
b.含义:?只能接收extends后面的本类类型以及子类类型
3.下限:
a.格式:<?super 类型>
b.含义:?只能接收super后面的本类类型以及父类类型
```



## 第三章. 斗地主案例(扩展案例)

```
1.创建ArrayList集合->color ->专门存花色
2.创建一个ArrayList集合 ->number -> 专门存牌号
3.创建一个ArrayList集合->ppker ->专门存花色和牌号组合好的牌面
4.打乱poker
5.创建4个ArrayList集合,分别代表三个玩家,以及存储一个底牌
6.如果index为最后三张,往dipai集合中存
7.如果index%3==0 给p1
8.如果index%3==1 给p2
9.如果index%3==2 给p3
10.遍历看牌
```

### 1.使用ArrayList存储扑克牌

```java
package module19.c_poker;

import java.util.ArrayList;
import java.util.Collections;

public class poker {
    public static void main(String[] args) {
        //1.创建ArrayList集合->color ->专门存花色
        ArrayList<String> color = new ArrayList<>();
        color.add("♠");
        color.add("♥");
        color.add("♣");
        color.add("♦");
        //2.创建一个ArrayList集合 ->number -> 专门存牌号
        ArrayList<String> number = new ArrayList<>();
        for (int i = 2; i <=10; i++) {
            number.add(String.valueOf(i));
        }
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");
        //3.创建一个ArrayList集合->poker ->专门存花色和牌号组合好的牌面
        ArrayList<String> poker = new ArrayList<>();
        for (String c : color) {
            for (String n : number) {
                String pokerNumber = c + n;
                poker.add(pokerNumber);
            }
        }
        poker.add("☺");
        poker.add("😊");
        //4.打乱poker
        Collections.shuffle(poker);
        //5.创建4个ArrayList集合,分别代表三个玩家,以及存储一个底牌
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        //6.如果index为最后三张,往dipai集合中存
        for (int i = 0; i < poker.size(); i++) {
            if (i >=51) {
                dipai.add(poker.get(i));
            } else if (i%3==0) {
                p1.add(poker.get(i));
                //7.如果index%3==0 给p1
            } else if (i%3==1) {
                p2.add(poker.get(i));
                //8.如果index%3==1 给p2
            }else if (i%3==2) {
                p3.add(poker.get(i));
                //9.如果index%3==2 给p3
            }
        }
        //10.遍历看
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(dipai);
    }
}

```

### 2.使用split分隔存储扑克牌

```java
package module19.c_poker;

import java.util.ArrayList;
import java.util.Collections;

public class poker {
    public static void main(String[] args) {
        //1.创建ArrayList集合->color ->专门存花色
        String[] color = "♠-♥-♣-♦".split("-");
        //2.创建一个ArrayList集合 ->number -> 专门存牌号
        String[] number = "2-3-4-5-6-7-8-9-10-A-J-Q-K".split("-");
        //3.创建一个ArrayList集合->poker ->专门存花色和牌号组合好的牌面
        ArrayList<String> poker = new ArrayList<>();
        for (String c : color) {
            for (String n : number) {
                String pokerNumber = c + n;
                poker.add(pokerNumber);
            }
        }
        poker.add("☺");
        poker.add("😊");
        //4.打乱poker
        Collections.shuffle(poker);
        //5.创建4个ArrayList集合,分别代表三个玩家,以及存储一个底牌
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        //6.如果index为最后三张,往dipai集合中存
        for (int i = 0; i < poker.size(); i++) {
            if (i >=51) {
                dipai.add(poker.get(i));
            } else if (i%3==0) {
                p1.add(poker.get(i));
                //7.如果index%3==0 给p1
            } else if (i%3==1) {
                p2.add(poker.get(i));
                //8.如果index%3==1 给p2
            }else if (i%3==2) {
                p3.add(poker.get(i));
                //9.如果index%3==2 给p3
            }
        }
        //10.遍历看
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(dipai);
    }
}

```



## 第四章.红黑树(了解)

```
集合添加红黑树的目的就是为了提高查询效率
```



## 第五章.Set集合

```
1.Set接口并没有对Collection接口功能上的扩充,而且对所有Set集合底层都是依靠Map实现
```

Set![image-20250509093747248](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250509093747248.png)Collections<img src="C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250509093602768.png" alt="image-20250509093602768"  />

### 1.Set集合介绍

```
Set和Map密切相关的
Map的遍历需要先变成单列集合,只能变成set集合
```

### 2.HashSet集合的介绍和使用

```
1.概述:Hashset是set接口的实现类
2.特点:
	a.元素唯一
	b.元素无序
	c.无索引
	d.线程不安全
3.数据结构:哈希表
	a.jdk8之前:哈希表 = 数组+链表
	b.jdk8之后:哈希表 = 数组+链表+红黑树
		加入红黑树目的:查询快
4.方法:和co11ection一样
5.遍历:
	a.增强for
	b.迭代器
```

```java
public class Demo01HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
    }
}
```

### 3.LinkedHashSet的介绍和使用

```java
1.概述:LinkedHashset extends Hashset
2.特点:
a.元素唯一
b.元素有序
c.无索引
d.线程不安全
3.数据结构:
哈希表+双向链表
4.使用:和Hashset一样
```

```java
public class Demo01HashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("我是");
        set.add("公关部");
        set.add("的");
        set.add("狗");
        set.add("kk");
        set.add("和");
        set.add("警察");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
    }
}
```

### 4. 哈希值

```java
1.概述：是由计算机算出来的一个十进制数，可以看做是对象的地址值
2.获取对象的哈希值，使用的是object中的方法
	public native int hashcode()
    
3.注意：如果不重写hashCode方法,默认计算对象的哈希值
    如果重写hashCode方法,计算的是对象内容的哈希值
    
4.总结：
	a.哈希值不一样，内容肯定不一样
	b.哈希值一样，内容也有可能不一样
```

```java
package module19.e_hash;

import java.util.Objects;

public class Person {
    String name;
    int age;
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

```

```java
public class Demo01Hash {
    public static void main(String[] args) {
        Person p1 = new Person("oyx",20);
        Person p2 = new Person("ggb",32);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
//        System.out.println(Integer.toHexString(p1.hashCode()));输出的值为p1的地址值
//        System.out.println(Integer.toHexString(p2.hashCode()));输出的值为p2的地址值

    }
}
```

### 5.字符串的哈希值如何计算的



```java
    public int hashCode() {
        int h = hash;
        if (h == 0 && !hashIsZero) {
            h = isLatin1() ? StringLatin1.hashCode(value)
                           : StringUTF16.hashCode(value);
            if (h == 0) {
                hashIsZero = true;
            } else {
                hash = h;
            }
        }
        return h;
    }
-----------------------------------------------
    
    StringLatin1.hashCode(value)源码中调用的计算方法:
    
        public static int hashCodeOfUnsigned(byte[] a, int fromIndex, int length, int initialValue) {
        return switch (length) {
            case 0 -> initialValue;
            case 1 -> 31 * initialValue + Byte.toUnsignedInt(a[fromIndex]);
            default -> vectorizedHashCode(a, fromIndex, length, initialValue, T_BOOLEAN);
        };
    }
```

```
直接跑到StringLatin1.hashCode(value)底层源码中计算哈希值

问题：在计算哈希值的时候，有一个定值就是31，为啥？
	31是一个质数，31这个数通过大量的计算，统计，认为用31，可以尽量降低内容不一样但是哈希值一样的情况
	内容不一样，哈希值一样（哈希冲突，哈希碰撞）
```

### 6. HashSet的存储去重复过程

```
1.先计算元素的哈希值（重写hashcode方法)，再比较内容（重写equals方法)
2.先比较哈希值，如果哈希值不一样，存
3.如果哈希值一样，再比较内容
a.如果哈希值一样，内容不一样，存
b。如果哈希值一样，内容也一样，去重复 
```



```java
public class Test01 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("通话");
        set.add("重地");
        set.add("abc");
        System.out.println(set);//[通话, 重地, abc]
    }
}
```

### 7.自定义类型如何去重复

```java
package module19.e_hash;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

```

```
总结：
1.如果HashSet存储自定义类型，如何去重复呢?重写hashCode和equals方法，让HashSet比较属性的哈希值以及属性的内容
2.如果不重写hashcode和equals方法，默认调用的是object中的，不同的对象，肯定哈希值不一样，equals比较对象的地址值也不一样，所以此时即使对象的属性值一样，也不能去重复
```

# 模块二十 Map双列集合

```
重点:
1.会使用HashMap和LinkedHashMap及了解其特点
2.会使用Properties属性集
3.会操作集合嵌套
4.知道哈希表结构存储元素过程

```

## 第一章. Map集合

### 1.Map介绍

<img src="C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250510092311877.png" alt="image-20250510092311877" style="zoom:150%;" />

### 2.HashMap和LinkedHashMap(重点)

```
HashMap:key值唯一,value可重复
特点:无序-无索引-线程不安全-可以存null键null值
数据结构:哈希表
```

```java
LinkedHashMap:key值唯一,value可重复
特点:有序-无索引-线程不安全-可以存null键null值
数据结构:哈希表+双向链表
使用与HashMap一样
    
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("疯狂", "鸡");
        map.put("无敌", "狗");
        map.put("超级", "羊");
        map.put("无敌", "猪");//key值一样value会被覆盖
        System.out.println(map);

    }
}
```

### 3.HashMap的两种遍历方式(重点)

#### 3.1 通过Set集合获取key再遍历

```java
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("疯狂", "鸡");
        map.put("无敌", "狗");
        map.put("超级", "羊");
        map.put("究极","马");
        map.put("无敌", "猪");//key值一样value会被覆盖

        Set<String> keySet = map.keySet();//获取所有的key放入set
        for (String key : keySet) {
            System.out.println(key + ":" + map.get(key));
        }

    }
}
```

#### 3.2 通过map内部类map.entrySet()获取键值对

```java
public class Demo01HashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("疯狂", "鸡");
        map.put("无敌", "狗");
        map.put("超级", "羊");
        map.put("究极","马");
        map.put("无敌", "猪");
/*
Set集合中保存的都是"结婚证"->Map.Entry
我们需要将“结婚证"从set集合中遍历出来
 */
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "--" + value);
        }
    }
}
```

### 4.Map存储自定义对象时如何去重复

```java
public class Person {
    private String name;
    private Integer age;

    public Person() {}
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

```



```java
public class Demo03HashMap {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("喜羊羊",23),"中国");
        map.put(new Person("三上",33),"日本");
        map.put(new Person("皮特",33),"美国");
        System.out.println(map);
    }
}
```



```
如果key为自定义类型，去重复的话，重写hashcode和equals方法，去重复过程和set一样一样的
因为set集合的元素到了底层都是保存到了map的key位置上
```

### 5.Map练习

```
判断每一个字符出现的次数
```

```java
public class Test01 {
    public static void main(String[] args) {
        //1.创建Scanner和HashMap
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        String data=sc.next();
        //2.遍历字符串，将每一个字符获取出来
        char[] chars = data.toCharArray();
        for (char aChar : chars) {
            String key = aChar + "";
            //3.判断，map中是否包含遍历出来的字符->containsKey
            //4.如果不包含，证明此字符第一次出现，直接将此字符和1存储到map中
            if (!map.containsKey(key)) {
                map.put(key, 1);
            }else {
                //5.如果包含，根据字符获取对应的value,让value++
                //6.将此字符和改变后的value重新保存到map集合中
                Integer value = map.get(key);//map.get(key)返回的时对应的value
                value++;
                map.put(key, value);
            }
        }
        //7.输出
        System.out.println(map);
    }
}
```

## 第二章.哈希表存储过程(重点)

<img src="file:///C:\Users\xu\Documents\Tencent Files\484547374\nt_qq\nt_data\Pic\2025-05\Ori\46e808381dd7441a4747cd176becbaf9.png" alt="img" style="zoom:150%;" />

```
1.HashMap底层数据数据结构:哈希表
2.jdk7:哈希表=数组+链表
  jdk8:哈希表＝数组+链表+红黑树
3.
	先算哈希值，此哈希值在HashMap底层经过了特殊的计算得出
	如果哈希值不一样，直接存
	如果哈希值一样，再去比较内容，如果内容不一样，也存
	如果哈希值一样，内容也一样，直接去重复（后面的value将前面的value覆盖)
	哈希值一样，内容不一样->哈希冲突（哈希碰撞)
4.要知道的点：
	a.在不指定长度时，哈希表中的数组默认长度为16，HashMap创建出来，一开始没有创建长度为16的数组
	b.什么时候创建的长度为16的数组呢?在第一次put的时候，底层会创建长度为16的数组
	c.哈希表中有一个数据加[加载因子]->默认为0.75（加载因子）->代表当元素存储到百分之75的时候要扩容了->2倍
	d.如果对个元素出现了哈希值一样，内容不一样时，就会在同一个索引上以链表的形式存储，当链表长度达到8并且当前数
	组长度>=64时，链表就会改成使用红黑树存储
	如果后续删除元素，那么在同一个索引位置上的元素个数小于6，红黑树会变回链表
e.加入红黑树目的：查询快
```

```java
外面笔试时可能会问到的变量
default_initial_capacity:HashMap默认容量 16
default_load_factor:HashMap默认加载因子 0.75f
threshold:扩容的临界值 等于 容量*0.75=12
第一次扩容
treeify_threshold:链表长度默认值，转为红黑树：8
min_treeify_capacity:链表被树化时最小的数组容量：64
```

```
HashMap无序LinkedHashMap有序的原因:
1.问题:哈希表中有数组的存在，但是为啥说没有索引呢？
哈希表中虽然有数组，但是set和map却没有索引，因为存数据的时候有可能在同一个索引下形成链表，如
果2素引上有一条链表，那么我们要是按照索引2获取，咱们获取哪个元素呢?所以就取消了按照索引操作的机制
2.问题:为啥说HashMap是无序的,LinkedHashMap是有序的呢?
原因:HashMap底层哈希表为单向链表
	而LinkedHashMap底层哈希表为双向链表
```

<img src="C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250510104214960.png" alt="image-20250510104214960" style="zoom:150%;" />

> HashMap的单向链表结构

![image-20250510103948733](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250510103948733.png)

> LinkedHashMap的双向链表结构

## 第三章. TreeSet

```
1. 概述:TreeSet是Set的实现类
2.特点:
a.对元素进行排序
b.无索引
c.不能存null
d.线程不安全
e.元素唯一
3.数据结构∶红黑树
```

```java
构造:
	TreeSet()->构造一个新的空树集，根据其元素的自然顺序进行排序。
	TreeSet(Comparator<? super E> comparator)->构造一个新的空树集，根据指定的比较器进行排序。
```

```java
public class Demo01TreeMap {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("A");
        treeSet1.add("C");
        treeSet1.add("N");
        treeSet1.add("B");
        treeSet1.add("D");
        System.out.println(treeSet1);//有序,默认按照ASCII码表排序
        
        TreeSet<Person> treeSet2 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });//可以重写comparetor比较器,确定比较关系
        treeSet2.add(new Person("喝水", 18));
        treeSet2.add(new Person("乌鸦", 22));
        treeSet2.add(new Person("荷塘", 12));
        treeSet2.add(new Person("月色", 82));
        System.out.println(treeSet2);
    }
}
```



## 第四章. TreeMap

```
1.概述:TreeMap是Map的实现类
2.特点:
a.对key进行排序
b.无索引
c.key唯一
d.线程不安全
e.不能存nul1
3.数据结构:红黑树
```

```
构造:
	TreeMap()->构造一个新的空树映射，使用其键的自然顺序。
	TreeMap(Comparator<? super E> comparator)->构造一个新的空树映射，根据给定的比较器排序。
```

```java
public class Demo02TreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("a","hhhh");
        treeMap.put("h","qqqq");
        treeMap.put("o","wqqq");
        treeMap.put("c","wrrqq");
        treeMap.put("k","lklqq");
        treeMap.put("b","qqqq");
        System.out.println(treeMap);

        TreeMap<Person, String> treeMap1 = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        treeMap1.put(new Person("鱼鱼", 18), "hhhh");
        treeMap1.put(new Person("狗", 13), "hhhh");
        treeMap1.put(new Person("鸡鸡", 43), "hhhh");
        treeMap1.put(new Person("猪猪", 99), "hhhh");
        System.out.println(treeMap1);
    }
}

```



## 第五章. Hashtable和Vector集合(了解)

### 1.Hashtable

```
1.概述:Hashtable是Map的实现类
2.特点:
a.key唯一,value可重复
b.无序
c.无索引
d.线程安全 I
e.不能存储nul1键，nul1值
3.数据结构：哈希表
4.使用方法和HashMap差不多
```

> ### HashMap和Hashtable的区别:
>
> 相同点：元素无序，无索引，,key唯一
> 不同点:HashMap线程不安全,Hashtable线程安全
> HashMap可以存储null键null值;Hashtable不能

### 2.Vector集合

```

```



## 第六章. Properties集合(属性集)(重点)

```java
概述:Properties继承自Hashtable
2.特点:
a.key唯一,value可重复
b.无序
c.无索引
d.线程安全
e.不能存null键，nul1值
f.Properties的key和value类型默认为string
3.数据结构：哈希表
4.特有方法：
object setProperty(string key, String value) -> 存键值对
String getProperty(String key) ->根据key获取value的
Set<String>stringPropertyNames->获取所有的key,保存到set集合中，相当于keySet方法
voidload(InputstreaminStream)->将流中的数据加载到Properties集合中(Io部分讲)
```

```java
public class Demo01Propeties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        // object setProperty(string key, String value) -> 存键值对
        properties.setProperty("22","22");
        properties.setProperty("11","44");
        properties.setProperty("33","55");
        properties.setProperty("44","66");
        System.out.println(properties);
    // String getProperty(String key) ->根据key获取value的
        System.out.println(properties.getProperty("22"));
    // Set<String>stringPropertyNames->获取所有的key,保存到set集合中，相当于keySet方法
        Set<String>set= properties.stringPropertyNames();
        for (String s : set) {
            System.out.println(s);
        }
    }
}
```

## 第七章. 集合嵌套

### 1.List In List

```java
需求:创建2个List集合,每个集合中分别存储一些字符串,将2个集合存储到第3个List集合中
import java.util.ArrayList;

public class Demo01LisnInList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("花花");
        list1.add("草草");
        list1.add("树");
        list1.add("地皮");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("鸡");
        list2.add("狗");
        list2.add("猪");
        list2.add("羊");
        
        //list中的元素是两个ArrayList<String>,所以合并数组的泛型就是ArrayList<String>
        ArrayList<ArrayList<String>> list3 = new ArrayList<>();
        list3.add(list1);
        list3.add(list2);
        System.out.println(list3);
        
        //先遍历每一个ArrayList,再遍历ArrayList中的每一个元素取出元素
        for (ArrayList<String> arrayList : list3) {
            for (String string : arrayList) {
                System.out.println(string);
            }
        }
    }
}

```

### 2.Map In List

```java
将两个map集合添加到list集合中并且遍历取出元素
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02ListInMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("虎虎", 1);
        map1.put("省委", 2);
        map1.put("卡卡", 3);
        map1.put("飘飘", 4);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("丽丽",33);
        map2.put("飘飘",11);
        map2.put("勾勾",22);
        map2.put("侵权",44);
        ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
        arrayList.add(map1);
        arrayList.add(map2);
        System.out.println(arrayList);
        for (HashMap<String, Integer> map : arrayList) {
            Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
            for (Map.Entry<String, Integer> entry : entrySet) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}

```

### 3.Map In Map

```java
package com.learn.e_list_in_list;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo03MapInMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        map1.put("zhangsan", 1);
        map1.put("lisi", 2);
        map2.put("wuangwu",3);
        map2.put("zhaoliu",3);
        HashMap<String, HashMap<String, Integer>> mapHashMap = new HashMap<>();
        mapHashMap.put("11", map1);
        mapHashMap.put("22", map2);
        //使用HashMap的内部类entrySet,将HashMap中的键值对存储到Set集合
        Set<Map.Entry<String, HashMap<String, Integer>>> entrySet = mapHashMap.entrySet();
        //对Set集合中的元素进行遍历
        for (Map.Entry<String, HashMap<String, Integer>> entry : entrySet) {
            //new一个HashMap存储合并后HashMap的value值,即map1,map2
            HashMap<String, Integer> hashMap = entry.getValue();
            //这里换一种遍历方法,使用HashMap的keySet方法,将hashMap中的key值存储
            Set<String> set = hashMap.keySet();
            //最后再遍历key和value
            for (String s : set) {
                System.out.println(s+":"+hashMap.get(s));
            }

        }

    }
}

```

# 模块二十一 IO流

```
重点:
1.分清楚IO流的流向
2.会字节流和字符流的读写操作
```



## 第一章. File类

### 1.File类

```java
计算机常识：
1.以.jpg结尾的一定是图片吗?
	不一定，有可能是文件夹
2.什么是文本文档?
	用记事本打开，人能看懂的文件->txthtmlcss
3.E:\Idea\io\1.jpg中的1.jpg的父路径是谁?
	E:\Idea\io
4.分隔符：
	a.路径名称分隔符：
	windows:\
	linux: /
  路径分隔符：一个路径和其他路径之间的分隔符->;
```

```java
1.概述：文件和目录（文件夹）路径名的抽象表示
2.简单理解：
我们在创建File对象的时候，需要传递一个路径，这个路径定为到哪个文件或者文件夹上，我们的File就代表哪个对象
	File file = new File("E:\Idea\io\1.jpg")

```

### 2.File的静态成员

```java
static final String pathSeparator
系统相关的路径分隔符字符，以字符串表示以方便使用。

static final String separator
系统相关的默认名称分隔符字符，以字符串表示以方便使用。
```



```java
package com.learn.a_file;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        file01();
        file02();
    }

    private static void file02() {
        String path = "C:\\Users\\user\\Desktop\\";
        System.out.println(path);
        String path1="C:"+File.separator+"Desktop"+File.separator+"Demo01File.java";
        System.out.println(path1);
    }

    private static void file01() {
        //路径分隔符pathSeparate->;
        String pathSeparator = File.pathSeparator;
        //路径分隔符Separate->\
        String separator = File.separator;
        System.out.println(pathSeparator);
        System.out.println(separator);
    }
}

```

### 3.File的构造方法

```java
File(stringparent，Stringchild) 根据所填写的路径创建File对象
	parent:父路径
	child:子路径
File(Fileparent, String child) 根据所填写的路径创建File对象
	parent:父路径，是一个File对象
    child:子路径
File(String pathname) 根据所填写的路径创建File对象
	pathname：直接指定路径
```

```java
public class Demo02File {
    public static void main(String[] args) {
        File file01 = new File("C:\\Users\\xu\\Desktop\\javaresource","1.jgp");
        File file02 = new File("C:\\Users\\xu\\Desktop\\javaresource\\1.jgp");
        System.out.println(file02);
        System.out.println(file01);
    }
}
```

> 创建File对象的时候,传递的路径可以是不存在的,但是传递不存在的路径没有啥意义



### 4.File的获取方法

```java
String getAbsolutePath()
返回这个抽象路径名的绝对路径名字符串。

String getName()
返回由这个抽象路径名表示的文件或目录的名称。

String getPath()
将这个抽象路径名转换为路径名字符串。

long length()
返回由这个抽象路径名表示的文件的长度。
```



```java
public class Demo03File {
    public static void main(String[] args) {
        File file01 = new File("1.txt");
        System.out.println(file01.getAbsolutePath());
        //获取绝对路径

        File file02 = new File("C:\\Users\\xu\\Desktop\\javaresource","1.jpg");
        System.out.println(file02.getName());
        //获取文件或文件夹名称,定位到最后一个文件或文件夹

        File file03 = new File("io\\1.txt");
        System.out.println(file03.getPath());
        //获取封装路径,new File对象时是啥路径就获取啥路径

        File file4 = new File("C:\\Users\\xu\\Desktop\\javaresource\\1.txt");
        System.out.println(file4.length());
        //获取文件的字节数
    }
}

```

### 5.File的创建方法

```java
boolean createNewFile()
如果不存在此文件,则创建新的文件,返回true;如果存在此文件,则创建失败,返回false

boolean mkdirs()
如果不存在此文件夹,则创建新的文件夹,返回true;如果存在此文件夹,则创建失败,返回false
```

```java
public class Demo04File {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\xu\\Desktop\\javaresource\\1.txt");
        System.out.println(file.createNewFile());
        //创建文件

        File file1 = new File("C:\\Users\\xu\\Desktop\\javaresource\\haha\\hehe\\xixi");
        System.out.println(file1.mkdirs());
        //创建单级或多级文件夹
    }
}
```

### 6.File的删除方法

```
boolean delete()
删除由这个抽象路径名表示的文件或目录。

注意:1.删除文件后不走回收站,直接删除
    2.删除文件夹必须是空文件夹,否则删除失败,也是不走回收站
```



```java
    private static void file1() {
//      File file = new File("C:\\Users\\xu\\Desktop\\javaresource\\1.txt");
        File file = new File("C:\\Users\\xu\\Desktop\\javaresource\\haha");
        System.out.println(file.delete());//false

    }
```

### 7.File的判断方法

```java
boolean isDirectory()->判断是否为文件夹
boolean isFile() ->判断是否为文件
boolean exists()->判l断文件或者文件夹是否存在
```

```java
    private static void file03() {
        File file = new File("C:\\Users\\xu\\Desktop\\javaresource\\1.txt");
        System.out.println(file.isFile());//true
        System.out.println(file.isDirectory());//false
        System.out.println(file.exists());//true
    }
```

### 8.File的遍历方法

```java
String[] list() -> 遍历指定的文件夹,返回的是String数组
File[] listFiles() ->遍历指定的文件夹,返回的是File数组 -> 推荐使用

细节：listFiles方法底层还是list方法,调用1ist方法，遍历文件夹，返回一个stirng数组，遍历数组，将数组中的内容一个一个封装到File对象中，然后再
将File对象放到File数组中
```



```java
    private static void file04() {
        File file = new File("C:\\Users\\xu\\Desktop\\javaresource\\haha");
        String[] files = file.list();
        //String[] list() -> 遍历指定的文件夹,返回的是String数组
        for (String s : files) {
            System.out.println(s);
        }
        System.out.println("=================================");
        File[] files1 = file.listFiles();
        //File[] listFiles() ->遍历指定的文件夹,返回的是File数组 -> 推荐使用
        for (File f : files1) {
            System.out.println(f);
        }

    }
```

### 9.File练习

```
遍历将文件夹中的所有.jpg和.jpeg文件
```

```java
public class Demo05File {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\xu\\Desktop\\javaresource");
        method(file);
    }
    private static void method(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            String name = f.getName();
            if (f.isFile()) {
                if (name.endsWith(".jpg")||name.endsWith(".jpeg")) {
                    System.out.println(name);
                }
            }else {
                method(f);
            }
        }
    }
}
```

### 10.相对路径和绝对路径

```
1.绝对路径：从盘符开始写的路径
	E:llideallioll1.txt
2.相对路径：不从盘符名开始写的路径
3.针对idea中写相对路径：
	a.口诀：哪个路径是参照路径，哪个路径就可以省略不写，剩下的就是在idea中的相对路径写法
在idea中参照路径其实就是当前project的绝对路径
b.比如:在module21下创建了一个1.txt
	先找1.txt的绝对路		径:E:\Idea\idea2022\workspace\javasemodule21\1.txt
	再找参照路径:E:\Idea\idea2022\workspace\javase
	参照路径可以省略：module21\1.txt
4.总结：
	在idea中写的相对路径，其实就是从模块名开始写
5.注意:
	如果直接写一个文件名1.txt，它所在的位置默认是在当前project下
```



## 第二章. 字节流

### 1.IO流介绍以及输入输出以及流向的介绍

```
1.IO流:
将一个设备上的数据传输到另外一个设备上，称之为IO流技术
2.为啥要学IO流呢?
之前学了一个集合以及数组，可以保存数据，但是这两个都是临时存储（代码运行完毕，集合和数组会从内存中消失，从而数据就不存在了），所以集合和数组达不到永久保存的目的，我们希望咱们的数据永久保存起来，所以我们就可以将数据保存到硬盘上，此时我们就可以随时想拿到硬盘上的数据就随时拿

而且我们将来传输数据，必然要用到输入，输出动作
```

### 2.IO流的流向

```java
IO是指Input/Output，即输入和输出。以内存为中心：

Input--指从外部读入数据到内存，例如，把文件从磁盘读取到内存，从网络读取数据到内存等等。
Output--指把数据从内存输出到外部，例如，把数据从内存写入到文件，把数据从内存输出到网络等等。
```

### 3.IO流分类

```java
字节流：万能流，一切皆字节
	字节输出流：Outputstream抽象类
	字节输入流：Inputstream抽象类
字符流：专门操作文本文档
	字符输出流:Writer抽象类
	字符输入流:Reader抽象类
```

### 4.OutputStream中的子类FileOutputStream的介绍和使用

```java
1.概述：字节输出流，outputstream是一个抽象类
	子类：Fileoutputstream
2.作用：往硬盘上写数据
3.构造：
	FileOutputStream(File file)
	Fileoutputstream(string name)
4.特点:
	a.指定的文件如果没有，输出流会自动创建
	b，每执行一次，默认都会创建一个新的文件，覆盖老文件
5.方法:
	void write(int b) 一次写一个字节
	void write(byte[] b) 一次写一个字节数组
	void write(byte[] b, int off, int len) 一次写一个字节数组一部分 b:写的数组 off：从数组的哪个索引开始写 len:写多少个 void close ->关闭资源
```

```java
    private static void method01() throws IOException {
        FileOutputStream stream = new FileOutputStream("module21\\1.txt");
        stream.write(97);//一次写入一个字节
        byte[] bytes={97,98,99,100,101};
        stream.write(bytes);//一次写入一个数组
        stream.write(bytes,2,2);//一次写入数组一部分
        stream.close();
    }
```

叠加写入内容,不覆盖

```java
FileOutputStream(String name, boolean append)
创建一个文件输出流以写入具有指定名称的文件。

    private static void method02() throws IOException {
        FileOutputStream stream = new FileOutputStream("module21\\1.txt",true);
        stream.write("床前明月光\n".getBytes());
        stream.write("疑似地上霜\n".getBytes());
        stream.write("举头望明月\n".getBytes());
        stream.write("低头思故乡\n".getBytes());

    }
```

### 5.InputStream子类[FileInputStream]的介绍和方法使用

```java
1.概述:字节输入流Inputstream，是一个抽象类
	子类:FileInputStream
2.作用：读数据，将数据从硬盘上读到内存中来
3.构造:
	FileInputStream(File file)
	FileInputstream(string path)
4.方法:
	int read()
	一次读一个字节，返回的是读取的字节
	intread(byte[]b)一次读取一个字节数组,返回的是读取的字节个数
	intread(byte[]b，intoff，int1en)一次读取一个字节数组一部分，返回的是读取的字节个数
	void close关闭资源
```

### 6.一次读取一个字节

```java
    private static void method001() throws IOException {
        FileInputStream stream = new FileInputStream("module21\\1.txt");
        int a=stream.read();
        int b=stream.read();
        System.out.println(a);
        System.out.println(b);
            int len;
            while ((len = stream.read()) != -1) {//当读取的值为-1时,说明已经读取完了文本内容
                System.out.print((char) len);//将读出的int强制转型为char
            }
    }
```

> 一个流对象读完之后就不能再读了,除非重新new一个新的对象
>
> 流对象关闭之后,流对象就不能再使用了

### 7.读取-1的问题

```
每个文件末尾都会有一个”结束标记”，这个”结束标记”我们看不见，摸不着
而readO方法规定，如果读到了文件的结束标记，方法直接返回-1
```

### 8.一次性读取一个数组

```java
int read(byte[] b)一次读取一个数组,返回的时读取的字节个数

创建一个数组：byte[]
1.创建的数组相当于一个临时存储区域，我们要读取的内容会临时保存到数组中
然后我们再从数组中将数据获取
2.数组长度定为多少，每次读取多少个，一般情况下数组长度定为1024或者1024的倍数
如果剩下的字节不够数组长度了，那么就最后有多少读多少
```

```java
private static void method002() throws IOException {
        FileInputStream stream = new FileInputStream("module21\\1.txt");
        byte[] bytes = new byte[2];
//        int length1 = stream.read(bytes);
//        int length2 = stream.read(bytes);
//        int length3 = stream.read(bytes);
//        System.out.println(length1);
//        System.out.println(new String(bytes, 0, length1));
//        System.out.println(length2);
//        System.out.println(new String(bytes, 0, length2));
//        System.out.println(length3);
//        System.out.println(new String(bytes, 0, length3));
        int len;
        while ((len = stream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        stream.close();
    }
```

### 9.文件或图片复制

```java
public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        //1.创建InputStream
        FileInputStream input = new FileInputStream("C:\\Users\\xu\\Desktop\\javaresource\\3.jpg");
        //2.创建OutputStream指定复制到的位置
        FileOutputStream output = new FileOutputStream("C:\\Users\\xu\\Desktop\\javaresource\\十五.jpg");
        //3.创建bytes[] 指定每次传输的字节数
        byte[] bytes = new byte[1024];
        //4.创建变量len用来接收inputStream的字节个数
        int len;
        while((len=input.read(bytes))!=-1){
        //5.input输入读取,output输出写入    
            output.write(bytes, 0, len);
        }
    }
}
```



## 第三章. 字符流

### 1.文件读取中文的问题

```java
1.注意:
	字节流是万能流，更侧重于文件复制，但是尽量不要边读边看
2.原因：
	UTF-8：一个汉字占3个字节
	GBK:一个中文占2个字节
	如果按照字节读取，每次读取的字节没有构成一个汉字的字节数，就直接输出，汉字是显示不了的
     使用字符流读取的时候和写入编码方式要一样才能不出现乱码
3.解决:
	将文本文档中的内容，按照字符去操作
```

### 2.FileReader的介绍和方法使用

```
字符流专门用来操作文本文档的,但是复制操作不要用字符流,要用字节流
```

```java
1.概述:字符输入流->Reader->是一个抽象类
	子类:FileReader
2.作用：将文本文档中的内容读取到内存中来
3.构造：
	FileReader(File file)
	FileReader(String path)
4.方法:
	intread(->一次读取一个字符，返回的是读取字符对应的int值
	intread(char[]cbuf)->一次读取一个字符数组，返回的是读取个数
	intread(char[]cbuf，intoff，intlen)->一次读取一个字符数组一部分，返回的是读取个数
		cbuf:读取的数组
		off：从数组的哪个索引开始读
		len:读多少个
	void close -> 关闭资源
```

```java
private static void method06() throws IOException {
        FileReader fileReader = new FileReader("module21\\1.txt");
        int len;
        while ((len=fileReader.read())!=-1){
            System.out.println((char)len);
        }
        fileReader.close();
    }

    private static void method05() throws IOException {
        FileReader fileReader = new FileReader("module21\\1.txt");
        int len1=fileReader.read();
        System.out.println((char) len1);
        fileReader.close();
    }

}
```

### 3.FileWriter的介绍和使用

```java
1.概述:字符输出流->Writer->抽象类
	子类:Filewriter
2.作用：将数据写到文件中
3.构造:
	FileWriter(File file)
	Filewriter(String fileName)
	Filewriter(string fileName, boolean append) -> 追加,续写
4.方法:
	void write(int c)一次写一个字符
	void write(char[]cbuf)一次写一个字符数组
	void write(char[]cbuf，int off，intlen)一次写一个字符数组一部分
	void write(stringstr)直接写一个字符串
	void close 关流
I
5.注意：Filewriterr底层自带一个缓冲区，我们写的数据会先保存到缓冲区中，所以我们需要将缓冲区中的数据刷到文件中
```

### 4.FileWriter的刷新和关闭功能

```
f1ush()：将缓冲区中的数据刷到文件中，后续流对象还能继续使用
close()：先刷新后关闭，后续流对象不能使用了
```

```java
public class Demo02FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("module21\\2.txt");
        fileWriter.write("唧唧复唧唧\r\n");
        fileWriter.write("木兰当户织\r\n");
        fileWriter.flush();
        fileWriter.write("我是大帅逼\r\n");
        fileWriter.close();
    }
}
```

### 5.IO流的异常处理

```
一般使用try catch捕获异常
```



```java
public class Demo01Exception {
    public static void main(String[] args) {
        FileWriter fileWriter=null;//作用域问题,如果在try里面new对象赋值,在finally将会不可用,所以要在try之前赋默认值
        try {
            fileWriter = new FileWriter("module21\\3.txt");
            fileWriter.write("你");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileWriter!=null){
                try {
                    //如果fileWriter不为null,证明new出来了所以需要close;相反则不需要close
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
```

### 6.JDK7之后的IO异常处理方式

```java
1.格式:
	try(Io 对象){
		可能出现异常的代码
	}catch(异常类型对象名){
		处理异常
	}
2.注意:
	以上格式处理IO异常，会自动关流
```

```java
public class Demo02Exception {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("module21\\4.txt");){
            fw.write("世界大团结");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

# 模块二十二 IO流

```
重点:
1.会使用缓冲流：字节和字符
2.会使用转换流
3.会实现序列化接口，以及使用序列化流
4.会使用Properties集合，读取配置文件中的内容
```



## 第一章 字节缓冲流

### 1.字节缓冲流介绍和使用

```java
1.为啥要学字节缓冲流
之前所写FileOutputStream,FileInputStream,FileReader,FileWriter这都叫做基本类,其中FileInputStream和FileOutputStream的读写方法都是本地方法(方法声明上带native)，本地方法是和系统以及硬盘打交道的，也就是说这两个对象的读和写都是在硬盘之间进行读写的，效率不高；
	缓冲流中底层带一个长度为8192的数组（缓冲区），此时读和写都是在内存中完成的（在缓冲区之间完成），内存中的读写效率非常高
	使用之前需要将基本流包装成缓冲流，其实就new对象时，传递基本流
2.字节缓冲流
a.Bufferedoutputstream:字节缓冲输出流
	构造:Bufferedoutputstream(outputstream out)
	使用:和FileoutputStream一样
b.BufferedInputStream:字节缓冲输入流
	构造:BufferedInputStream(InputStream in)
	使用:和FileInputStream一样
```

```java
package com.learn.a_buffered;

import java.io.*;

public class Demo01BufferedInputStream {
    public static void main(String[] args) throws IOException {
        method01();//3.78s
        method02();//0.10s
    }

    private static void method02() throws IOException {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("C:\\Users\\xu\\Desktop\\javaresource\\4.jpg");
        BufferedInputStream bis=new BufferedInputStream(fis);

        FileOutputStream fos=new FileOutputStream("C:\\Users\\xu\\Desktop\\javaresource\\db.jpg");
        BufferedOutputStream bos=new BufferedOutputStream(fos);

        int len;
        while ((len=bis.read())!=-1){
            bos.write(len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        bos.close();
        bis.close();
    }

    private static void method01() throws IOException {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("C:\\Users\\xu\\Desktop\\javaresource\\4.jpg");
        FileOutputStream fos=new FileOutputStream("C:\\Users\\xu\\Desktop\\javaresource\\db.jpg");

        int len;
        while ((len=fis.read())!=-1){
            fos.write(len);
        }

        long end = System.currentTimeMillis();

        System.out.println(end-start);

        fis.close();
        fos.close();
    }
}

```

### 2.缓冲流底层原理

> 细节：
> 问题1:使用缓冲流的时候，为啥只需要关闭缓冲流，不用单独关闭基本流呢？
> 原因：缓冲流的close方法底层会自动关闭基本流/?
> 问题2：缓冲流底层有数组(缓冲区）都是在内存之间进行读写，那么缓中流读写的过程是啥样的呢
>
> 注意：先依靠基本流将数据读出来，然后交给缓冲流，由于缓冲流缓冲区是8192，所以每次读取8192个字节放到缓冲区中，然后再将输入流缓冲区中的数据交给输出流缓冲区，然后再利用基本流将数据写到硬盘上
>
> ​		那么在操作代码时Ien是干啥的呢？其实主要是在两个缓冲区中倒腾数据，将输入流缓冲区中的数据读到，然后写到输出流缓冲区中，等待输出流缓冲区满了，再依靠基本流写到硬盘上；如果输入流缓冲区中的数据读不到了，重新从硬盘上读8192个字节，进入到输入流缓冲区中，继续利用len在两个缓冲区中来回倒腾数据

<img src="file:///C:\Users\xu\Documents\Tencent Files\484547374\nt_qq\nt_data\Pic\2025-05\Ori\c8517428834c6dca61c01894e5e89fe9.png" alt="img" style="zoom:150%;" />





## 第二章 字符缓冲流 (重点)

### 1.BufferedWriter

```java
public class Demo02BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("module22\\1.txt",true));
        bw.write("计算机");
        bw.newLine();
        bw.write("神武");
        bw.newLine();
        bw.write("急急急");
        bw.close();
    }
}
```

### 2.BufferedReader

```
1.构造：
	BufferedReader(Reader r)
2.方法:
	用法和FileReader一样
3.特有方法：
	String readLine()->一次读一行，如果读到结束标记,返回的是null
```



```java
public class Demo03BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("module22\\1.txt"));
//       String a=br.readLine();
//       String b=br.readLine();
//       System.out.println(a);
//       System.out.println(b);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
```



## 第三章 转换流(重点)

### 1.字符编码

就是一套自然语言的字符与二进制数之间的对应规则

### 2.字符集

**字符集**:也叫编码表。是一个系统支持的所有字符的集合,包括各个国家的文字、标点符号、数字等

下面是常见的字符编码和对应的字符集,可见当确定了字符编码时字符集就确定了

![image-20250512190818270](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250512190818270.png)

```
1.想要不乱码，编码和解码遵循的规则（字符编码）要一致T>想要不乱码，最重要的是先知道这个字符按照什么编码去存
的
2.UTF-8中一个汉字占3个字节
  GBK中一个汉字占2个字节
```

### 3.转换流InputStreamReader

```java
1.概述：是字节流通向字符流的桥梁->读数据
2.构造：
	InputStreamReader(InputStream in,String charsetName)
				charsetName:指定编码，不区分大小写
3.作用：
	可以直接指定编码，按照指定的编码去读内容
4.用法：
	基本用法和FileReader一样
```



```java
public class Demo01InputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("module22\\1.txt"),"utf-8");
        int c= isr.read();
        System.out.println((char)c);
        isr.close();
    }
}
```



### 4.转换流OutputstreamWriter

```java
1.概述：是字符流通向字节流的桥梁
2.构造：
	OutputStreamWriter(OutputStream out,String charsetName)
3.作用：
	按照指定的编码规则去存数据
4.用法：
	和Filewriter一样
```



```java
public class Demo02OutputStreamReader {
    public static void main(String[] args) throws Exception {
        OutputStreamWriter osw= new OutputStreamWriter(new FileOutputStream("module22\\1.txt"),"utf-8");
        osw.write("你好世界");
        osw.close();
    }
}
```

## 第四章 序列化流

### 1.序列化流和反序列化流

```java
1.作用:读写对象
2.两个对象:
	a.ObjectOutputStream->序列化流->写对象
	b.ObjectInputStream->反序列化流->读对象
3.注意:
我们将对象序列化到文件中，我们打开文件看不懂，这就对了，很多时候，我们操作的数据不能随便让别人看懂，不然别人就随意改动了，我们只需要将这些看不懂的内容成功读回来即可
```

### 2.序列化流ObjectOutputStream

```java
1.作用：写对象
2.构造:
	ObjectOutputStream(OutputStream out)
3.方法:
	WriteObject(Object obj) -> 写对象
4.注意:
	想要将对象序列化到文件中，被序列化的对象需要实现Serializable接口
```

```java
package com.learn.c_serializable;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

```

```java
    private static void writer() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream("module22\\person.txt"));
        Person p1 = new Person("勾勾", 12);
        oos.writeObject(p1);
        oos.close();
    }
```

### 3.反序列化流ObjectInputStream

```java
1.作用:读对象
2.构造：
	ObjectInputStream(InputStream in)
3.方法:
	Object readObjectO
```

```java
    private static void reader() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(
            new FileInputStream("module22\\person.txt"));
        Person p=(Person) ois.readObject();
        System.out.println(p);
        ois.close();
    }
```

> 如果想要某些属性不被反序列化
>
> 则在属性修饰符后加上关键字:transient
>
> ```java
> private transient int  age;
> ```

### 4.反序列化时出现的InvalidClassException异常

```java
问题描述：
	序列化之后，修改源码，修改完之后没有重新序列化，直接反序列化了，就会出现了序列号冲实问题：
	InvalidClassException
解决办法:给自定义对象加上自定义序列号
    	public static final long serialVersionUID = 2L;
```

<img src="C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250512203337045.png" alt="image-20250512203337045" style="zoom:150%;" />

```java
package com.learn.c_serializable;

import java.io.Serializable;

public class Person implements Serializable {
    public static final long serialVersionUID = 2L;
    private String name;
    private transient int  age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

```

### 5.经验问题

```
当存储的次数和读取的次数不一致时会出现EOFException异常

解决办法:多个数据读入,首先先将这多个数据添加到同一个List集合中,再将List集合写入,最后读取的时候只需要遍历集合list即可
```



```java
public class Demo01Serilizable {
    public static void main(String[] args) throws Exception{
        writer();
        reader();
    }
    //反序列化流
    private static void reader() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("module22\\person.txt"));
        ArrayList<Person> list = (ArrayList<Person>) ois.readObject();
        for (Person person : list) {
            System.out.println(person);
        }
        ois.close();
    }
    //序列化流
    private static void writer() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("module22\\person.txt"));
        Person p1 = new Person("jj", 12);
        Person p2 = new Person("bb", 32);
        Person p3 = new Person("pp", 22);
        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        oos.writeObject(list);
        oos.close();
    }
}
```

## 第五章 打印流PrintStream(了解)

### 1.PrintStream打印流基本使用

```
构造：
	PrintStream(String fileName)
2.方法:
	a.println()：原样输出，自带换行效果
	b.print():原样输出，不带换行效
```

```java
public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("module22\\printstream.txt");
        ps.println("Hello World");
        ps.print("You");
        ps.println("Me");
        ps.close();
    }
}
```

```java
改变流向:
1.什么叫做改变流向：
	System.out.println()->本身是输出到控制台上改变流向：可以让输出语句从控制台上输出改变成往指定文件中输出
2.方法:System中的方法:
	static void setOut(PrintStream out)->改变流向->让输出语句从控制台输出转移到指定文件中
	
使用场景：
	可以将输出的内容以及详细信息放到日志文件中，永久保存。
	以后我们希望将输出的内容永久保存，但是输出语句会将结果输出到控制台上，控制台是临时显示，如果有新的程序运行，新程序的运行结果会覆盖之前的结果，这样无法达到永久保存，到时候我们想看看之前的运行结果信息就看不到了，所以我们需要将输出的结果保存到日志文件中，就可以使用setOut改变流向
```

```java
public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
      PrintStream ps = new PrintStream("module22\\log.txt");
        //改变流向
        System.setOut(ps);
        ps.println("这条错误的发送时间时五月十二号下午四点");
        ps.println("发生在Main.java文件中");
        ps.println("错误的原因是反序列化异常");
        ps.close();
    }
}
```

### 2.PrintStream打印流续写

```java
PrintStream(OutputStream out)-->可以依靠OutputStream的续写功能完成打印流续写
使用指定的输出流创建一个新的打印流，不自动刷新行。
```

```java
public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("module22\\log.txt",true));
        //改变流向
        System.setOut(ps);
        ps.println("这条错误的发送时间时五月十二号下午四点");
        ps.println("发生在Main.java文件中");
        ps.println("错误的原因是反序列化异常");
        ps.close();
    }
}
```

## 第六章 Properties集合(重点)

### 1.Properties结合IO流使用方法

```java
1.概述:Properties extends Hashtable
2.特点:
	a.无序，无索引
	b.key唯一,value可重复
	c.线程安全
	d.key和value默认类型都是string
3.特有方法:
	setProperty(String key,String value)存键值对
	getProperty(String key)-> 根据key获取value
	stringPropertyNames()->获取所有的key存放到set集合中
	load(InputStream in)->将流中的数据加载到Properties集合中
```

```java
public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        //创建propertise对象
        Properties properties = new Properties();
        //创建字符输入流对象,将硬盘文件加载到内存
        FileInputStream fis = new FileInputStream("module22\\jdbc.properties");
        //使用load()方法从流中加载数据
        properties.load(fis);
        //将获取的所有的key放入set集合中
        Set<String> set = properties.stringPropertyNames();
        //遍历set集合打印
        for (String key : set) {
            System.out.println(key+"="+properties.getProperty(key));
        }
        fis.close();
    }
}

```

```java
创建配置文件：
1.在模块下右键->file->取名为xxx.properties
2.在xxx.properties文件中写配置数据
a.key和value都是key=value形式
b.key和value都是string的，但是不要加双引号
c.每个键值对写完之后，需要换行再写下一对
d.键值对之间最好不要有空格（空格可以有，但是不建议写）
e.键值对中建议不要使用中文（中文可以有，但是直接读取会乱码，需要转换流转码）
```



## 第七章 Commons-io工具包

### 1.添加第三方jar包

```java
1.jar包：本身是一个压缩包，里面转的都是class文件，我们想使用jar包中的工具类，就需要将相应的jar包解压到我们的当前项目下
2.怎么引入jar包
	a.在当前模块下创建文件夹，取名为1ib或者libs
	b.将准备好的jar包，放到此文件夹下
	c.对着jar包，右键->add as library（如果我们想将lib下所有的jar包一起解压，我们就直接对着lib文件夹右键)
	d.1evel可以选择module，此时上面叫做name的输入框会变成空的，不用管
	e.直接点ok
```

### 2.工具包的使用

```
IOUtils类
-静态方法:IOUtils.copy(InputStream in,OutputStream out)传递字节流，实现文件复制。
-静态方法：IOUtils.closeQuietly(任意流对象)悄悄的释放资源，自动处理closeO方法抛出的异常
```

```JAVA
public class Demo01IOUtils {
    public static void main(String[] args) throws IOException {
        IOUtils.copy(new FileInputStream("C:\\Users\\xu\\Desktop\\javaresource\\6.jpg")
                ,new FileOutputStream("C:\\Users\\xu\\Desktop\\javaresource\\ldr.jpg" ));
        FileWriter fw = new FileWriter("C:\\Users\\xu\\Desktop\\javaresource\\1.txt");
        fw.write("你好世界");
        IOUtils.closeQuietly(fw);
    }
}
```

```java
FileUtils类
- 静态方法: FileUtils.copyDirectoryToDirectory(File src,File dest);
传递Fi1e类型的目录，进行整个目录的复制，自动进行递归遍历。
参数:
src:要复制的文件夹路径
dest:要将文件夹粘贴到哪里去
-静态方法:writeStringToFile(File file,String str)写字符串到文本文件中。
静态方法：String readFileToString(File file)读取文本文件，返回字符串。
```

```java
public class Demo02FileUtils {
    public static void main(String[] args) throws IOException {
        FileUtils.copyDirectoryToDirectory(new File("C:\\Users\\xu\\Desktop\\javaresource\\haha")
                ,new File("C:\\Users\\xu\\Desktop\\javaresource\\hehe"));
        FileUtils.writeStringToFile(new File("module22\\commons.txt"),"我是超级大帅逼");
        String s=FileUtils.readFileToString(new File("module22\\commons.txt"));
        System.out.println(s);
    }
}
```

## 第八章 如何快速记忆IO流



![img](file:///C:\Users\xu\Documents\Tencent Files\484547374\nt_qq\nt_data\Pic\2025-05\Ori\2aa6883f5981e01430010a39d34fd710.png)

# 模块二十三 网络编程&正则表达式&设计模式

```
重点:
	1.了解三次握手和四次挥手
	2.客户端和服务端的交互过程
	3.会使用TCP协议写一个简单的程序
	4.知道正则表达式的基本使用
	5.会单例模式
	6.会Lombok的使用
```

## 第一章 网络编程

### 1.网络编程基础

```
软件结构: 
	C\S结构:Client-Serve 客户端-服务器模式
	B\S结构:Browser-Serve 浏览器-服务器模式

通信三要素:
	IP地址:计算机的唯一标识,用于两台计算机之间的连接
		  IPV4:三十二位二进制数,四个字节数表示为a b c d(范围0-255)
		  IPV6:128位二进制数,十六个字节一组,ABCD:EF01
		  localhost:本机地址,固定不变 127.0.0.1
		  
	协议:TCP:面向连接协议
			需要先确认连接,才能进行数据交互
			传输效率低,但是传输稳定安全
			三次握手:
				第一次握手，客户端向服务器端发出连接请求，等待服务器确认。
				第二次握手，服务器端向客户端回送一个响应，通知客户端收到了连接请求。
				第三次握手，客户端再次向服务器端发送确认信息，确认连接。
		UDP:面向无连接协议
			传输效率高,但是传输不安全容易丢失数据包
			
	端口号:每一个应用程序的唯一标识
	
```

> TCP中的三次握手和四次挥手
>
> ```
> 三次握手:
> 		第一次握手，客户端向服务器端发出连接请求，等待服务器确认。
> 		第二次握手，服务器端向客户端回送一个响应，通知客户端收到了连接请求。
> 		第三次握手，客户端再次向服务器端发送确认信息，确认连接。
> ```
>
> ```
> 四次挥手:
> 		第一次挥手：客户端向服务器端提出结束连接，让服务器做最后的准备工作。此时，客户端处于半关闭状态，即表示不再向服务器发送数据了，但是还可以接受数据。
> 		第二次挥手：服务器接收到客户端释放连接的请求后，会将最后的数据发给客户端。并告知上层的应用进程不再接收数据。
> 		第三次挥手：服务器发送完数据后，会给客户端发送一个释放连接的报文。那么客户端接收后就知道可以正式释放连接了。
> 		第四次挥手：客户端接收到服务器最后的释放连接报文后，要回复一个彻底断开的报文。这样服务器收到后才会彻底释放连接。这里客户端，发送完最后的报文后，会等待2MSL，因为有可能服务器没有收到最后的报文，那么服务器迟迟没收到，就会再次给客户端发送释放连接的报文，此时客户端在等待时间范围内接收到，会重新发送最后的报
> 文，并重新计时。如果等待2MSL后，没有收到，那么彻底断开。
> ```

### 2.UDP协议编程(重点)

DatagramSocket->好比寄快递找的快递公司

DatagramPacket->好比快递公司打包

#### 2.1发送端(客户端)

```
创建要发送的数据,ip地址,端口号
将数据打包
调用send方法,传输数据
释放资源
```

```java
public class Send {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        //创建要发送的数据,ip地址,端口号
        byte[] bytes = "Hello, World!".getBytes();
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        int port = 6666;
        //将数据打包
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, ip,port);
        //调用send方法,传输数据
        socket.send(packet);
        //释放资源
        socket.close();
    }
}
```

> 直接执行发现,发送端在没有接收端的情况下,不会报错,因为UDP协议是面向无连接协议,不管有没有接收端都照发不误

#### 2.2接收端(服务端)

```
1.创建Datagramsocket对象，指定服务端的端口号
2.接收数据包
3.解析数据包
4.释放资源
```

```java
public class Receive {
    public static void main(String[] args) throws Exception {
        //创建DatagramSocket对象,指定服务端的的端口号
        DatagramSocket socket = new DatagramSocket(6666);
        //接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        socket.receive(packet);
        //解析数据
        int length = packet.getLength();//数据包中获取数据的个数
        byte[] data=packet.getData();//接收的数据
        InetAddress address = packet.getAddress();//获取发送端的主机
        int port = packet.getPort();//发送端的端口号
        //打印
        System.out.println(new String(data,0,length));
        System.out.println(address+":"+port);
        //释放资源
        socket.close();
    }
}

```

### 3.TCP协议编程(重点)

```
客户端先写(从硬盘写入内存)再读(写入的数据读取到服务端)
服务端先读(先读取客户端发送的数据)再写(从内存写入硬盘)
```



#### 3.1客户端

```
1.创建Socket对象,指明服务端的ip和端口号
2.调用Socket中的OutputStream,往服务端发送请求
3.调用Socket中的InputStream,读取服务端响应回来的数据
4.关流
```



```java
public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建Socket对象,指明服务端的ip和端口号
        Socket socket = new Socket("127.0.0.1", 6666);
        //2.调用Socket中的OutputStream,往服务端发送请求
        OutputStream os = socket.getOutputStream();
        os.write("Hello, World!".getBytes());
        //3.调用Socket中的InputStream,读取服务端响应回来的数据
        InputStream is = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int len = is.read(buffer);
        System.out.println(new String(buffer,0,len));
        //4.关流
        is.close();
        os.close();
        socket.close();
    }
}
```

#### 3.2服务端

```java
1.创建 ServerSocket 对象,设置端口号
2.调用 ServerSocket 中的 accept 方法,等待客户端连接,返回Socket对象
3.调用 socket 中的 getInputStream ,用于读取客户端发送来的数据
4.调用 Socket 中的 getOutputStream ,用于给客户端响应数据
5.关流
```



```java
public class Server {
    public static void main(String[] args) throws IOException {
        //1.创建ServerSocket对象,设置端口号
        ServerSocket server = new ServerSocket(6666);//端口号要对应
        //2.调用ServerSocket中的accept方法,等待客户端连接,返回Socket对象
        Socket socket = server.accept();
        //3.调用socket中的getInputStream,用于读取客户端发送来的数据
        InputStream is = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int len = is.read(buffer);
        System.out.println(new String(buffer,0,len));
        //4.调用Socket中的getOutputStream,用于给客户端响应数据
        OutputStream os = socket.getOutputStream();
        os.write("Hello, World too!".getBytes());
        //5.关流
        is.close();
        os.close();
        socket.close();
    }
}
```

### 4.文件上传

<img src="C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250513163631518.png" alt="image-20250513163631518" style="zoom: 80%;" />

```java
package com.learn.c_upload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建Socket对象,指明服务端的ip和端口号
        Socket socket = new Socket("127.0.0.1", 6666);

        //2.创建FileInputStream,从本地硬盘中读取文件
        FileInputStream fis = new FileInputStream("C:\\Users\\xu\\Desktop\\javaresource\\3.jpg");

        //3.用于将读取的本地文件发送到服务端
        OutputStream os = socket.getOutputStream();

        //4.边读边写
        byte[] buf = new byte[1024];
        int len;
        while ((len = fis.read(buf)) != -1) {
            os.write(buf, 0, len);
        }

        //给服务端传输一个结束标记,服务端才能结束接收
        socket.shutdownOutput();

        System.out.println("=========以下代码是读取响应的结果=========");

        //5.调用getInputStream,读取响应结果
        InputStream is = socket.getInputStream();
        byte[] buf1 = new byte[1024];
        int len1=is.read(buf1);
        System.out.println(new String(buf1,0,len1));

        //6.关流
        is.close();
        fis.close();
        os.close();
        socket.close();
    }
}

```

```java
package com.learn.c_upload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.创建ServerSocket对象
        ServerSocket server = new ServerSocket(6666);
        //2.调用accept等待客户端连接
        Socket socket = server.accept();
        //3.用于读取客户端发送的文件
        InputStream is = socket.getInputStream();
        /*
            使用工具类UUID.randomUUID生成s随机数,来实现命名不重复即实现文件不覆盖
         */
        String s =UUID.randomUUID().toString();
        String name=s+System.currentTimeMillis();
        //4.用于将客户端文件写入服务端硬盘中
        FileOutputStream fos = new FileOutputStream("C:\\Users\\xu\\Desktop\\javaresource\\haha\\"+name+".jpg");
        byte[] buf = new byte[1024];
        int len;
        while ((len = is.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
        //5.调用getOutputStream给客户端响应结果
        System.out.println("=========以下代码为给客户端的响应结果=========");
        OutputStream os = socket.getOutputStream();
        os.write("上传成功".getBytes());
        //5.关流
        os.close();
        fos.close();
        is.close();
        socket.close();
        server.close();
    }
}

```

### 5.文件上传服务端实现(多线程)

```java
package com.learn.c_upload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class ServerThread {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(6666);
        while(true){
            Socket socket=ss.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    InputStream is=null;
                    FileOutputStream fos=null;
                    OutputStream os=null;
                    try{
                        //3.用于读取客户端发送的文件
                        is = socket.getInputStream();
        /*
            使用工具类UUID.randomUUID生成s随机数,来实现命名不重复即实现文件不覆盖
         */
                        String s = UUID.randomUUID().toString();
                        String name=s+System.currentTimeMillis();
                        //4.用于将客户端文件写入服务端硬盘中
                        fos = new FileOutputStream("C:\\Users\\xu\\Desktop\\javaresource\\haha\\"+name+".jpg");
                        byte[] buf = new byte[1024];
                        int len;
                        while ((len = is.read(buf)) != -1) {
                            fos.write(buf, 0, len);
                        }
                        //5.调用getOutputStream给客户端响应结果
                        System.out.println("=========以下代码为给客户端的响应结果=========");
                        os = socket.getOutputStream();
                        os.write("上传成功".getBytes());

                    }catch (Exception e){
                        e.printStackTrace();
                    }finally {
                       CloseUtils.close(socket,fos,is,os);
                    }
                }
            }).start();
        }
    }
}

```

```java
package com.learn.c_upload;


import java.io.*;
import java.net.Socket;

public class CloseUtils {
    private CloseUtils() {}
    public static void close(Socket socket, FileOutputStream fos, InputStream is, OutputStream os) {
        //5.关流
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (fos != null) {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

```



## 第二章 正则表达式

### 1. 正则表达式的基本字符匹配

#### 1.1 单个字符匹配规则如下:

| 正则表达式 | 规则                     | 可以匹配                       |
| ---------- | ------------------------ | ------------------------------ |
| `A`        | 指定字符                 | `A`                            |
| `\u548c`   | 指定Unicode字符          | `和`                           |
| `.`        | 任意字符                 | `a`，`b`，`&`，`0`             |
| `\d`       | 数字0~9                  | `0`~`9`                        |
| `\w`       | 大小写字母，数字和下划线 | `a`~`z`，`A`~`Z`，`0`~`9`，`_` |
| `\s`       | 空格、Tab键              | 空格，Tab                      |
| `\D`       | 非数字                   | `a`，`A`，`&`，`_`，……         |
| `\W`       | 非\w                     | `&`，`@`，`中`，……             |
| `\S`       | 非\s                     | `a`，`A`，`&`，`_`，……         |

#### 1.2 多个字符的匹配规则如下：

| 正则表达式 | 规则             | 可以匹配                 |
| ---------- | ---------------- | ------------------------ |
| `A*`       | 任意个数字符     | 空，`A`，`AA`，`AAA`，…… |
| `A+`       | 至少1个字符      | `A`，`AA`，`AAA`，……     |
| `A?`       | 0个或1个字符     | 空，`A`                  |
| `A{3}`     | 指定个数字符     | `AAA`                    |
| `A{2,3}`   | 指定范围个数字符 | `AA`，`AAA`              |
| `A{2,}`    | 至少n个字符      | `AA`，`AAA`，`AAAA`，……  |
| `A{0,3}`   | 最多n个字符      | 空，`A`，`AA`，`AAA`     |

### 2.复杂匹配规则

#### 2.1 字符类

```java
java.util.regex.Pattern:正则表达式的编译表示形式。
正则表达式-字符类：门表示一个区间，范围可以自己定义
语法示例：
1.[abc]：代表a或者b，或者c字符中的一个。
2. [∧abc]:代表除a,b,c以外的任何字符。
3.[a-z]：代表a-z的所有小写字符中的一个。
4.[A-Z]：代表A-Z的所有大写字符中的一个。
5.[0-9]：代表0-9之间的某一个数字字符。
6.[a-zA-Z0-9]：代表a-z或者A-Z或者0-9之间的任意一个字符。
7. [a-dm-p]:a到d或m到p之间的任意一个字符
```



```java
    //字符类
    private static void method01() {
        boolean re = "had".matches("[h][aeiou][d]");
        boolean re1 = "oyx".matches("[^a-f][xy][xyz]");
        System.out.println(re1);
        System.out.println(re);
    }
```

#### 2.2 逻辑类

```java
    //逻辑运算类
    private static void metho02() {
        boolean re = "oyx".matches("[a-z]&&[^aeiou][a][d]");// && 与
        boolean re1 = "oyx".matches("[^a-f][xy][x]|[^a-f][xy][y]");// | 或
        System.out.println(re);
    }
```

#### 2. 3预定义字符

```
正则表达式-预定义字符
语法示例：
1."."匹配任何字符。(重点) 不能加[]
2."\\d"：任何数字[0-9]的简写;（重点)
3."\\D"：任何非数字[^0-9]的简写：
4."\\s":空白字符:[\t\n|xOB\f\r]的简写
5."\\S"：非空白字符:[^\s]的简写
6."\\w"：单词字符：[a-zA-Z_0-9]的简写（重点）
7."\\W"：非单词字符：[A\w]
```

#### 2.4 分组括号

```
分组括号 (abc)是一组的必须同时出现
```

```java
    private static void metho03() {
        boolean re="abcabcabc".matches("(abc)*");
        System.out.println(re);
    }
```

## 第三章 设计模式

### 1.模板方法设计模式

```
模板方法（TemplateMethod）模式：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。明确了一部分功能，而另一部分功能不明确,需要延伸到子类中实现
例如饭店中吃饭：点菜，吃菜和买单三个步骤。点菜和买单基本上一致的，但是吃菜不同，吃法也不同。明确了一部分功能，而另一部分功能不明确。
```

```java
package com.learn.e_design;

public abstract class Hotel {
    public  void eat(){
        System.out.println("diandan");
        eatCai();
        System.out.println("maidan");
    }
    public abstract  void eatCai();
}

```

```java
package com.learn.e_design;

public class QuanJuDe extends Hotel {

    @Override
    public void eatCai(){
        System.out.println("倒辣椒");
        System.out.println("吃辣椒");
    }
}
```

```java
package com.learn.e_design;

public class Test01 {
    public static void main(String[] args) {
        QuanJuDe quanJuDe = new QuanJuDe();
        quanJuDe.eat();
    }
}

```

### 2.单例模式(重点)

```
构造私有
对象私有且为静态
什么时候new对象取决于是懒汉式还是饿汉式
```

#### 2.1 饿汉式

```java
public class Singleton {
    //为了防止外界随意使用构造方法new对象,我们需要把构造私有化
    private Singleton() {}

    //为了赶紧new对象，我们new对象的时候变成静态的，让其随着类的加载而加载
    //为了不让外界随便使用类名调用此静态对象，我们将其变成private
    private static Singleton singleton=new Singleton();

    //为了将内部new出来的对象给外界
    //我们可以定义一个方法，将内部的对象返回给外界
    public static Singleton getSingleton(){
        return singleton;
    };
}
```

#### 2.2懒汉式

```java
public class Singleton1 {
    //不让外界使用构造方法
    private Singleton1() {}

    //懒汉式不着急new对象,先赋默认值
    private static Singleton1 singleton1=null;

    //为了将内部new出来的对象给外界
    //定义了一个方法,将内部的new出来的对象返回
    public static Singleton1 getSingleton1() {
        //如果singleton1不是null就没有必要抢锁了,直接返回,是null再抢锁
        if(singleton1==null) {
            synchronized(Singleton1.class){
                if(singleton1==null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}
```



## 第四章 Lombok(重点)

### 1.Lombok使用介绍

```
1.作用:简化javabean开发
2.使用:
a.下插件->如果是idea2022及后续版本不用下载了，自带
b.导lombok的jar包
c.修改设置
```

修改设置如下图:

![image-20250515090209765](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250515090209765.png)![image-20250515090247316](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250515090247316.png)

### 2.Lombok常用注解

#### @Getter和@Setter

作用：生成成员变量的get和set方法。
写在成员变量上，指对当前成员变量有效。
写在类上，对所有成员变量有效。
注意：静态成员变量无效。

#### @ToString

作用：生成toString()方法。
注解只能写在类上。

#### @NoArgsConstructor和@AllArgsConstructor

@NoArgsConstructor：无参数构造方法。
@AllArgsConstructor:满参数构造方法。
注解只能写在类上。

#### @EqualsAndHashCode

作用：生成hashCode(和equals)方法。
注解只能写在类上。

```java
import lombok.*;
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private int age;
}
```

#### @Data

作用:生成get/set,toString,hashCode,equals，无参构造方法
注解只能写在类上。

# 模块 二十四 函数式编程(jdk新特性)

```
重点:
Lambda表达式
Stream流
```

## 第一章 Lambda表达式(重点)

### 1.Lambda使用介绍

```
1.面向对象思想：是Java的核心编程思想
	强调的是找对象，帮我们做事儿
	比如：去北京->强调的是怎么去，火车，高铁，飞机，汽车，自行车，腿儿
2.jdk8开始又了个新的思想：函数式编程思想：
	强调的是结果，不强调过程
	比如：去北京->只强调去了还是没去
3.Lambda表达式:
	a.定义格式:
	()->{}
	b.各部分解释：
	()：重写方法的参数位置
	->：将参数传递到方法体中
	{}：重写方法的方法体
```

```java
public class Demo01Lambda {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Hello, World!");
        }).start();
    }
}
```

### 2.Lambda使用前提

```
1.必须是函数式接口做方法参数传递
2.啥叫函数式接口：(单抽象方法接口)
	有且只有一个抽象方法的接口，用@FunctionalInterface去检测
```

```java
@FunctionalInterface
public interface USB {
    void start();
}

```

### 3.Lambda表达式省略规则

```
1.Lambda表达式怎么写(涛哥给的新手秘籍）
	a.观察是否是函数式接口做方法参数传递
	b.如果是，考虑使用Lambda表达式
	c.调用方法，以匿名内部类的形式传递实参
	d，从new接口开始到重写方法的方法名结束，选中，删除，别忘记再删除一个右半个大括号
	e，在重写方法的参数后面，方法体的大括号前面加上->
2.省略规则：
	a.重写方法的参数类型可以干掉
	b.如果重写方法只有一个参数，所在的小括号可以干掉
 	c.如果方法体中只有一句话，那么所在的大括号以及分号可以干掉
	d.如果方法体中只有一句话并且带return的，那么所在的大括号，分号以及return可以干掉
```

```java
public class Demo03Lambda {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("zhangsan",23));
        people.add(new Person("lisi",24));
        people.add(new Person("wangwu",13));
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println("========下面为Lambda简化形式==========");
        Collections.sort(people,(o1, o2)->o1.getAge()-o2.getAge());
        System.out.println(people.toString());
    }
}
```

## 第二章 函数式接口

### 1.Supplier

```
1.Supplier接口
	java.util.function.Supplier<T>接口，它意味着"供给"->我们想要什么就给什么
2.方法:
	T get()->我们想要什么，get方法就可以返回什么
3.需求:
	使用Supplier接口作为方法的参数
	用Lambda表达式求出int数组中的最大值
4.泛型:
	<引用数据类型>->规定了我们操作的数据是什么类型
	<>中只能写引用数据类型，不能写基本数据类型
```

```java
public class Demo01Interface {
    public static void main(String[] args) {
        method01(()->{
                int arr[]={23,34,5123,5634,2321,1};
                Arrays.sort(arr);
                return arr[arr.length-1];
        });
    }
    private static void method01(Supplier<Integer> supplier) {
        Integer max = supplier.get();//获取最大值
        System.out.println("max= "+max);
    }
}
```

```
main()->调用method01(),传递参数Spplier<Integer>->调用方法supplier.get()->调用method01()中的重写方法.get()->返回结果
```



### 2.Consumer

```java
java.uti1.function.Consumer<T>->消费型接口->操作
方法:
	void accept(T t)，意为消费一个指定泛型的数据
	"消费"就是"操作"，至于怎么操作，就看重写accept方法之后，方法体怎么写了
```

```java
public class Demo04Consumer {
    public static void main(String[] args) {
        method(s-> System.out.println(s.length()),"hello");
    }

    private static void method(Consumer<String> c,String s) {
        c.accept(s);
    }
}
```

### 3.Function

```java
java.uti1.function.Function<T，R>接口用来根据一个类型的数据得到另一个类型的数据
方法:
	R apply(T t)根据类型T参数获取类型R的结果
```

```java
public class Demo03Function {
    public static void main(String[] args) {
        method(integer->integer+"",1002);
    }

    private static void method(Function<Integer, String> f,Integer i) {
        String s = f.apply(i);
        System.out.println("s=" + (s+1));
    }
}
```

```
调用方法method01()->传递参数Function和Integer->调用重写的apply方法接收返回值
```

### 4.Predicate

```java
java.uti1.function.Predicate<T>接口。->判断型接口
boolean test(T t)->用于判断的方法，返回值为boolean型
```

```java
public class Demo05Predicate {
    public static void main(String[] args) {
        method(p-> p.length()==2,"dasfadfasf");
    }

    private static void method(Predicate<String> p,String s) {
        boolean b=p.test(s);
        System.out.println(b);
    }
}
```

## 第三章 Stream流(重点)

### 	1.Stream流的介绍和使用

```
Stream流中的流不是"IO流",它是一种"流式编程"(编程方式),可以看做是"流水线"
```



```java
package com.learn.c_stream;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo01Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张伟");
        list.add("刘晓伟");
        list.add("刘大伟");
        list.add("吴迪");


     ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")){
                list1.add(s);
            }
        }

      for (String s : list1) {
            System.out.println(s);
        }
        System.out.println("============Stream===========");
        Stream<String> stream = list.stream();//把对象变成流
        stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.startsWith("张");
            }
        }).filter(new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.length()==3;
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });
        System.out.println("==========Lambda==========");
        list.stream()
                .filter(t->t.startsWith("张"))
                .filter(t -> t.length()==3)
                .forEach(s->System.out.println(s));

    }
}

```

### 2.Stream流的获取

```java
1.针对集合:Collection中的方法
Stream<E> stream()
2.针对数组：Stream接口中的静态方法：
static <T> Stream<T> of(T... Values)
```



```java
public class Demo02Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Stream<String> stream = list.stream();
        System.out.println(stream);

        Stream<String> stream1=Stream.of("a","b","c","d");
        System.out.println(stream1);

    }
}
```

### 3.Stream流的方法

#### 3.1 Stream流中的forEach方法

```java
void forEach(Consumer<? super T> action)
forEach：逐一处理->遍历
	void forEach(Consumer<? super T> action);
注意：forEach方法是一个终结加法，使用完之后，Stream流就被关闭了不能用了
```



```java
public class Demo03Stream {
    public static void main(String[] args) {
        Stream<String> stream
            =Stream.of("卧槽","你这个","害死人");
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("===========================");
        stream.forEach(s->System.out.println(s));
    }
}
```

#### 3.2 Stream流中的Long Count方法

```
1.作用:统计元素个数
2.注意:count也是一个终结方法
```

```java
        long count=stream.count();
        System.out.println(count);
```

#### 3.3 Stream流中的Stream<T> filter(Predicate<? super T> predicate)方法

```java
1.方法:Stream<T> filter(Predicate<? super T> predicate)方法,返回一个新的stream流对象
2.作用：根据某个条件进行元素过滤
```

```java
    private static void filter() {
        Stream<String> stream
            =Stream.of("卧槽","你这个","害死人","真的");
        stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()==3;
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("===================");
        stream.filter(s -> s.length()==3).forEach(s-> System.out.println(s));
    }
```

#### 3.4 Stream<T>limit(long maxSize)

```java
获取Stream流对象中的前n个元素,返回一个新的Stream流对象
```

```java
    private static void limit() {
        Stream<String> stream
            =Stream.of("卧槽","你这个","害死人","真的");
        stream.limit(3).forEach(s->System.out.println(s));
    }
```

#### 3.5 Stream<T>skip(long n)

```
跳过Stream流对象中的前n个元素,返回一个新的Stream流对象
```

```java
    private static void skip() {
        Stream<String> stream
            =Stream.of("卧槽","你这个","害死人","真的");
        stream.skip(2).forEach(s->System.out.println(s));
    }
```

#### 3.6 static <T> Stream<T> contac(Stream<? extends T> s, Stream<? T extends> b))

```
合并两个Stream流组合
```



```java
    private static void concat() {
        Stream<String> stream
            =Stream.of("卧槽","你这个","害死人","真的");
        Stream<String> stream1
            =Stream.of("卧槽1","你这2个","害死3人","真4的");
        Stream.concat(stream,stream1).forEach(System.out::println);

    }
```

#### 3.7 将Stream流变成集合

```
使用Stream接口方法collec将Stream集合转换成集合对象
```

```java
    private static void collect() {
        Stream<String> stream
            =Stream.of("卧槽","你这个","害死人","真的");
        List<String> list = stream.collect(Collectors.toList());
        System.out.println(list);
    }
```

#### 3.8 distinct方法

```
Stream<T> distinct()
元素去重复,依赖hashCode和equals方法
```

```java
    private static void distinct() {
       Stream<String> stream
        =Stream.of("卧槽","你这个","害死人","真的","真的");
       stream.distinct().forEach(s->System.out.println(s));
        Stream<Person> stream
                = Stream.of(new Person("张三",23),new Person("李四",13),new Person("张三",23));
        stream.distinct().forEach(System.out::println);
    }
```

#### 3.9 转换流中的类型

```
Stream<R> map(Function <T,R> mapper)->转换流中的数据类型
```

```java
    private static void map() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer+"";
            }
        }).forEach(s->System.out.println(s+1));
    }
```

#### 3.10 Stream流练习

```
1，第一个队伍只要名字为3个字的成员姓名；//filter

2，第一个队伍筛选之后只要前3个人；//limit

3，第二个队伍只要姓张的成员姓名；//filter

4，第二个队伍筛选之后不要前2个人；//skip

5，将两个队伍合并为一个队伍；//contac

6，打印整个队伍的姓名信息。//forEach
```

```java
package com.learn.c_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("123");
        list1.add("223");
        list1.add("3345");
        list1.add("41");
        list1.add("52");
        list1.add("62");
        list1.add("73");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("11");
        list2.add("22");
        list2.add("32");
        list2.add("44");
        list2.add("55");
        list2.add("66");
        list2.add("77");
        //将list集合转变为Stream流对象
        Stream<String> team1 = list1.stream();
        Stream<String> team2 = list2.stream();
        //对Stream流对象进行操作
        Stream<String> listA = team1.filter(s -> s.length() == 3).limit(3);
        Stream<String> listB = team2.filter(s -> s.startsWith("2")).skip(2);
        //合并
        Stream<String> team3 = Stream.concat(listA, listB);
        team3.forEach(s->System.out.println(s));
    }
}

```



## 第四章 方法引用

### 1.方法引用的介绍和使用

```
1.概述:引用方法
2.啥时候使用：
	a.被引用的方法要写在重写方法里面
	b.被引用的方法从参数上，返回值上要和所在重写方法一致，而且引用的方法最好是操作重写方法的参数值的
	c.干掉重写方法的参数；干掉->;干掉被引用方法的参数->将被引用方法的，改成：：
```

```java
public class Demo01Method {
    public static void main(String[] args) {
        Stream<String> stream 
        = Stream.of("a", "b", "c", "d", "e", "f", "g", "h");
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        stream.forEach(s-> System.out.println(s));
        stream.forEach(System.out::println);
    }
}
```

### 2.对象名--引用成员方法

```
1.使用对象名引用成员方法
	格式：
		对象::成员方法名

2.需求:
	函数式接口:Supplier
		java.util.function.Supplier<T>接口
抽象方法:
	T get()。用来获取一个泛型参数指定类型的对象数据。
	Supplier接口使用什么泛型，就可以使用get方法获取一个什么类型的数据
```

### 3.类名--引用静态方法

```
格式: 
	类名::静态成员方法
```

### 4.类--构造引用

```
1，类--构造方法引用
	格式：
		构造方法名称：:new
2.需求:
	函数式接口：Function
			java.util.function.Function<T,R>接口
抽象方法:
	R app1y（T t)，根据类型T的参数获取类型R的结果。用于数类型转换
```

### 5.数组--数组引用

```java
数组--数组引用
格式：
	数组的数据类型[]：:new
	int[]::new	创建一个int型的数组
	double[]::new	创建于一个double型的数组
```

```java
package com.learn.d_method;

import java.util.function.Function;

public class Demo02Method {
    public static void main(String[] args) {
        method(new Function<Integer, int[]>() {
            @Override
            public int[] apply(Integer integer) {
                return new int[integer];
            }
            
        },10);

        method((integer)->new int[integer],10);

        method(int[]::new,10);
    }
    public static void method(Function<Integer, int[]> f,Integer len) {
        int[] arr = new int[len];
        System.out.println(arr.length);
    }
}

```

## 第五章 JDK 8后的部分新特性(了解)

### 1.try...catch升级

JDK1.9又对trywith-resources的语法升级了
	该资源必须实现java.io.Closeable接口
	在try子句中声明并初始化资源对象，也可以直接使用已初始化的资源对象
	该资源对象必须是final的	

```
IO流对象1声明和初始化;
IO流对象2声明和初始化;

try(IO流对象1;IO流对象2){
	可能出现异常的代码
}catch(异常类型对象名){
	异常处理方案
}
```



```java
package com.learn.f_new;

import java.io.FileWriter;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        method01();
        method02();
    }
    //java 8之后
    private static void method02() throws IOException {
        FileWriter fw = new FileWriter("module24\\1.txt");
        try (fw){
            fw.write("hello");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    //java8之前
    public static void method01() {
        try(FileWriter fw = new FileWriter("module24\\1.txt")) {
            fw.write("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

### 2.局部变量类型自动判断

jdk10之前，我们定义局部变量都必须要明确数据的数据类型，

但是到了JDK10，出现了一个最为重要的特性，就是局部变量类型推断，顾名思义，就是定义局部变时，不用先确定具体的数据类型了，可以直接根据具体数据推断出所属的数据类型。

```
var 变量名=值;
```

```java
public class Test02 {
    public static void main(String[] args) {
        var a=10;
        System.out.println(a);

        var b="Hello World";
        System.out.println(b);
    }
}
```

### 3.java 13的switch语句

Java13提出了第二个switch表达式预览，引I入了yield语句，用于返回值。这意味着，switch表达式(返回值)应该使用yield语句，switch语句(不返回值)应该使用break语句。
案例需求：判断季节。

```java
package com.learn.f_new;

public class Test03 {
    public static void main(String[] args) {
        method01();
        method02();
    }

    //java 13之后
    private static void method02() {
        int month=10;
       var a= switch(month) {
            case 12,1,2->{
                yield "winter";
            }
            case 3,4,5-> {
                yield "Spring";
            }
            case 6,7,8-> {
                yield "Summer";
            }
            case 9,10,11->{
                yield "fall";
            }
            default -> {
                yield "null";
            }
        };
       System.out.println(a);
    }
    //Java 13之前
    private static void method01() {
        int month=10;
        switch(month) {
            case 12,1,2-> System.out.println("冬季");
            case 3,4,5-> System.out.println("春季");
            case 6,7,8-> System.out.println("夏季");
            case 9,10,11-> System.out.println("秋季");
            default -> System.out.println("没有");
        }
    }
}

```

### 4.文本块

```java
使用三引号"""  """来接收字符串内容,里面的内容无需转义字符,原封不动的输入输出,但是两个三引号不能在同一行要分开
格式: 
 	String s="""
 				hello
 				""";
```

```java
        String str = """
                hello World
                    nihaoshijie
                """;
        System.out.println(str);
```

# 模块 二十五 反射_注解

```
模块25重点:
1.会使用Junit单元测试
2.知道反射是干啥的
3.会使用反射中的API去操作class对象（构造，方法，属性）
4.通过涛哥设计的案例，体会反射代码写出来的好处->多用于框架中
5.会使用注解
```

## 第一章 Junit单元测试(重点)

### 1.Junit介绍

```
1.概述：Junit是一个单元测试框架，可以代替main方法去执行其他的方法
2.作用：可以单独执行一个方法，测试该方法是否能跑通
3.注意：Junit是第三方工具，所以使用之前需要导入jar包

```

### 2.Junit基本使用(重点)

```
1.导入Junit的jar包
	或者
2.定义一个方法，在方法上写注解：@Test
3.执行方法:
	a.点击该方法左边的绿色按钮，点击run执行->单独执行一个指定的方法
	b.如果想要执行所有带@Test的方法，点击类名左边绿色按钮，点击run执行->执行当前类中所有带@Test的方法
```



```java
import org.junit.Test;

public class Demo01Junit {
    @Test
    public void test() {
        System.out.println("这是一个测试方法");
    }
    @Test
    public void delete() {
        System.out.println("这是一个delete测试方法");
    }
    @Test
    public void add() {
        System.out.println("这是一个add测试方法");
    }
}
```

### 3.Junit注意事项

```
1.@Test不能修饰static方法
2.@Test不能修饰带参数的方法
3.@Test不能修饰带返回值的方法
```

![image-20250516105534946](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250516105534946.png)

### 4.Junit相关注解

```java
@Before：在@Test之前执行，有多少个@Test执行，@Before就执行多少次->都是用作初始化一些数据
@After:在@Test之后执行，有多少个@Test执行，@After就执行多少次->都是用作释放资源使用
@BeforeClass：在@Test之前执行，只执行一次，可以修饰静态方法
@AfterClass：@Test之后执征，只执行一次，可以修饰静态方法
```

```java
package com.learn.a_junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo02Junit {
    @Before
    public void before() {
        System.out.println("这是一条before测试");
    }
    @Test
    public void add() {
        System.out.println("这是add");
    }
    @Test
    public void delete() {
        System.out.println("这是delete");
    }
    @After
    public void after() {
        System.out.println("这是after");
    }
}
```



## 第二章 类的加载时机

```java
什么时候会加载class文件
1.new对象
2.new子类对象(new子类对象先初始化父类）
3.执行main方法
4.调用静态成员
5.反射，创建class对象
```

```
jvm利用IO流技术将class文件加载到内存,但是不是jvm直接插手,而是"类加载器"->ClassLoader
```

![image-20250516111648277](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250516111648277.png)

### 1.类加载器_ClassLoader(了解)

```
基于jdk8了解
```

```java
1.概述:
在jvm中，负责将本地上的class文件加载到内存的对象_classLoader
2.分类：
	BootStrapSlassLoader:根类加载器->C语言写的，我们是获取不到的也称之为引导类加载器，负责Java的核心类加载的
		比如:System,String等
		jre/lib/rt.jar下的类都是核心类
		
	ExtclassLoader:扩展类加载器
		负责jre的扩展目录中的jar包的加载
		在jdk中jre的lib目录下的ext目录
		
	AppclassLoader:系统类加载器
		负责在jvm启动时加载来自java命令的class文件(自定义类)，以及classPath环境变量所指定的jar包（第三方jar包）
		
		不同的类加载器负责加载不同的类
3.三者的关系(从类加载机制层面):
	AppclassLoader的父类加载器ExtClassLoader
	ExtClassLoader的父类加载器是BootStrapClassLoader
	但是：他们从代码级别上来看，没有子父类继承关系->他们都有一个共同的父类-习classLoader
	
4.获取类加载器对象:
	getclassLoaderO是class对象中的方法
	类名.class.getclassLoader()
	
5.获取类加载器对象对应的父类加载器
	classLoader类中的方法:ClassLoader
	getParent()->没啥用
	
6.双亲委派（全盘负责委托机制）
	a.Person类中有一个String
		Person本身是AppclassLoader加载
		String是BootStrapClassLoader加载
	b.加载顺序：
		Person本身是App加载，按道理来说string也是App加载
		但是App加载String的时候，先问一间Ext，说：Ext你加载这个String吗?
		Ext说：我不加载，我负责加载的是扩展类，但是app你别着急，我问问我爹去->boot
		Ext说:boot,你加载string吗?
		boot说：正好我加载核心类，行吧，我加载吧！
7.类加载器的cache（缓存）机制（扩展）：一个类加载到内存之后，缓存中也会保存一份儿，后面如果再使用此类，如果缓存中保存了这个类，就直接返回他，如果没有才加载这个类，下一次如果有其他类在使用的时候就不会重新加载了，直接去缓存
中拿，保证了类在内存中的唯一性

8.所以：类加载器的双亲委派和缓存机制共同造就了加载类的特点：保证了类在内存中的唯一性
```

```java
package com.learn.b_classloader;

public class Demo01ClassLoader {
    public static void main(String[] args) {
        //appClassLoader
        //app();
        //extClassLoader
       // ext();
        boot();
    }

    private static void boot() {
        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println("classLoader = "+classLoader);
    }


    private static void ext() {

}

private static void app() {
        ClassLoader classLoader = Demo01ClassLoader.class.getClassLoader();
        System.out.println("classLoader = "+classLoader);
    }

}

```



## 第三章 反射（重点）

### 1.Class对象 

```java
万物皆对象：
Class文件->有对象->class对象->描述class对象的类叫做Class类
    
成员变量->有对象->Field对象->描述Field对象的类叫做Field类

成员方法->有对象->Method对象->描述Method对象的类叫做Method类

构造方法->有对象->Constructor对象->描述Constructor对象的类叫做Constructor类
```

用反射的好处就是让代码变得更加灵活通用

### 2.反射之获取Class类对象

```java
1.方式1:调用object中的getclass方法:
	class <?> getclass ()
2.方式2：
	不管是基本类型还是引用类型，jvm都为其提供了一个静态成员：class
3.方式3:Class类中的静态方法:
	static Class<?> forName(String className)
		className:传递的是类的全限定名（包名.类名)
```

> 获取类的全限定名小技巧,找到需要的类->右键复制路径->复制引用
>
> ![image-20250518105017455](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250518105017455.png)

```java
    public void testGetClass() throws Exception {
        Person person = new Person("Alice", 25);
        Class<? extends Person> class1 = person.getClass();
        System.out.println("class1 = " + class1);

        System.out.println("==============================");
        Class<? extends Person> class2 = Person.class;
        System.out.println("class2 = " + class2);

        System.out.println("==============================");
        Class<?> class3
            =Class.forName("com.learn.c_reflect.Person");
        System.out.println("class3 = " + class3);
    }
```

#### 2.1 三种获取Class对象的方式最通用的一种

```java
1．方式3:Class类中的静态方法:
	static Class<?> forName(String className)
		className：传递的是类的全限定名（包名.类名）
2.原因:参数为string形式，可以和properties文件结合使用
```

```java
className=com.learn.c_reflect.Person
```

```java
public class Demo02GetClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties properties = new Properties();
        FileInputStream in = new FileInputStream("module25\\pro.properties");
        properties.load(in);

        String className=properties.getProperty("className");
        System.out.println("className = " + className);

        System.out.println("==============================");
        Class<?> aClass = Class.forName(className);
        System.out.println("className = " + aClass);
    }
}

```

#### 2.2 三种获取Class对象的方式中最常用的一种

```
直接类名.class-->最方便使用
```

### 3.获取Class对象中的构造方法

#### 3.1获取所有public的构造方法

```
Constructor<?>[] getConstructors() ->获取所有public的构造
```

```java
public class Demo03Constructor {
    public static void main(String[] args) {
        Class<Person> aClass  = Person.class;
        //获取所有public构造器
        Constructor<?>[] constructors = aClass.getConstructors();// get all constructors
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.toString());
        }
    }
}
```

#### 3.2 获取空参构造_public

```java
1.Constructor<T> getConstructor(Class<?>... parameterTypes)
-->获取指定的public构造
	parameterTypes 为可变参数
		a.如果获取的是空参构造：参数不用写
		b.如果获取的是有参构造：参数写参数类型的class对象
2.constructor类中的方法:
	T newInstance(object...initargs)-> 创建对象
					initargs：传递的是构造方法的实参
a.如果根据无参构造new对象,initargs不写于
b.如果根据有参构造new对象，initargs传递实参
```

```java
public class Demo03Constructor {
    public static void main(String[] args) throws Exception {
        Class<Person> aClass  = Person.class;
        //获取所有public构造器
        Constructor<Person> constructor 
            = aClass.getConstructor();
        System.out.println("constructor = " + constructor);
        
        Person person = constructor.newInstance();
        System.out.println("person = " + person);
    }
}
```

#### 3.3 利用空参构造创建对象的快捷方式_public

```java
Class类中的方法
 T newInstance() ->根据空参构造创建对象(jdk 17之后过时的方法)
    
前提:
	被反射的类中必须要public构造方法
```

#### 3.4  利用反射获取有参构造并创建对象_public

```java
public class Demo04Constructor {
    public static void main(String[] args) throws Exception {
        Class<Person> aClass = Person.class;

        Constructor<Person> constructor = aClass.getConstructor(String.class, Integer.class);
        System.out.println("constructor = " + constructor);

        //下面好比是->Person alice = new Person("Alice", 25);
        Person person = constructor.newInstance("Alice", 25);

        //好比是直接输出Person对象，默认调用的是toString()
        System.out.println("person = " + person);

    }
}
```

#### 3.5 利用反射获取私有构造(暴力反射)

```java
1.Constructor<?>[] getDeclaredConstructors()
返回一个包含反映由此Class对象表示的类隐式或显式声明的所有构造函数的Constructor对象的数组。 -->获取所有构造方法,包括private
    
2.Constructor<T> getDeclaredConstructor
    (Class<?>... parameterTypes) -->获取指定的构造,包括private
返回一个反映由此Class对象表示的类的指定构造函数的Constructor对象。
    
3.Constructor有一个父类叫做Accessibleobject，里面有一个方法
void setAccessible(booleanflag)I->修改访问权限
flag为true:解除私有权限
```

```java

public class Demo05Constructor {
    public static void main(String[] args) throws Exception {
        Class<Person> aClass = Person.class;
        Constructor<Person> dc = aClass.getDeclaredConstructor(String.class);
        //解除私有权限,暴力反射
        dc.setAccessible(true);
        Person person = dc.newInstance("woc");
        System.out.println("person = " + person);
    }
}

```

### 4.反射方法

#### 4.1 利用反射获取所有的成员方法_public

```java
1.Class类中的方法:
	Method[] getMethods()->获取所有public方法,包括父类中的public方法
```



```java
public class Demo06GetMethod {
    public static void main(String[] args) {
        Class<Person> aClass = Person.class;
        //获取所有的公共方法
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }
    }
}
```

#### 4.2 反射之获取指定方法(有参,无参)_public

```java
1.格式:
  Method getMethod (String name, Class<?>... parameterTypes)
    			name:传递方法名
                parameterTypes:传递方法参数类型的class对象
返回一个反映由此Class对象表示的类或接口的指定公共成员方法的Method对象。

2.调用方法:Method对象中的方法
	Object invoke(Object obj, Object... args)
	在指定对象上调用由此Method对象表示的基础方法，使用指定的参数。
                   
```

```java
    private static void method02() throws Exception {
        Class<Person> aClass = Person.class;
        Method setName = aClass.getMethod("setName", String.class);
        Person person = aClass.newInstance();
        //相当于调用person.setName()
        setName.invoke(person,"杀杀杀");
        //调用person.toString
        System.out.println("person = " + person);
    }
```

#### 4.3 反射之获取私有方法

```java
Method[] getDeclaredMethods() -->获取指定方法,包括私有方法
    
Method getDeclaredMethod(String name, Class<?>... parameterTypes) -->获取所有方法,包括私有方法
    

```

```java
    private static void method03() throws NoSuchMethodException {
        Class<Person> aClass = Person.class;
        //获取所有的方法,包括私有方法
        Method[] methods =aClass.getDeclaredMethods() ;
        for (Method method : methods) {
            System.out.println("method = " + method);
        }
        //调用指定的私有方法
        System.out.println("===========================");
        Method dm=aClass.getDeclaredMethod("eat");
        System.out.println("dm = " + dm);
    }
```

```java
   private static void method04() throws Exception {
        Class<Person> aClass = Person.class;
        Person person = aClass.newInstance();
        Method method = aClass.getDeclaredMethod("eat");
        method.setAccessible(true);
        method.invoke(person);
    }
```

### 5.反射成员变量

#### 5.1 获取所有属性

```java
1.Class类中的方法:
	Field[] getFields() -->获取所有Public属性

	Field[] getDeclaredFields() -->获取所有属性,包括private属性
```

```java
    private static void method01() {
        Class<Student> aClass = Student.class;
        //获取所有public属性
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
        //获取所有属性,包括private属性
        Field[] dfs = aClass.getDeclaredFields();
        for (Field f : dfs) {
            System.out.println("f = " + f);
        }
    }
```

#### 5.2 获取指定属性

```java
1.Class中的方法:
	Field[] getField() -->获取指定Public属性

	Field[] getDeclaredField() -->获取指定属性,包括private属性
```

```java
    private static void method02() throws Exception {
        Class<Student> aClass = Student.class;
        Student student = aClass.newInstance();
        //获取私有属性
        Field name = aClass.getDeclaredField("name");
        //解除私有权限
        name.setAccessible(true);
        //调用set方法为属性复制
        name.set(student,"公关部");
        //调用get方法获取属性值,相当于Javabean中的get方法
        Object object = name.get(student);
        System.out.println(object);
    }
```

### 6.反射练习

```java
步骤：
1.创建properties配置文件，配置信息
	a.问题：properties配置文件放到哪里?
		将来我们开发完之后给用户的是out路径下的class文件，将class文件打包，如果将配置文件直接放到模块下
		那么out路径下是不会生成这个配置文件的，如果没有配置文件，程序也就运行不起来了
	a.解决：我们可以将配置文件放到src下，放到src下，out路径下就会出现配置文件
	
	b.问题：将配置文件放到src下，out路径下会自动生成配置文件，但是如果我们将来将所有的配置文件都放到src下，那么src下面会显得特别乱
	
	b.解决：我们可以单独创建一个文件夹，将所有的配置文件放到此文件夹下，将此文件夹改成资源目录，取名为resources
	
2.读取配置文件，解析配置文件
	a.问题：如果将配置文件放到resources资源目录下，我们怎么读取
newFileInputstream("模块名\\resources\\properties文件名")->这样不行,out路径下没有resources -> 相当于写死了
	b.问题解决:用类加载器
classLoader classLoader =当前类.class.getclassLoader

Inputstreamin=classLoader.getResourceAsStream("文件名")
//自动扫描resources下的文件->可以简单理解为扫描out路径下的配置文件

3.根据解析出来的className，创建class对象

4.根据解析出来的methodName，获取对应的方法

5.执行方法
```



```java
public class Demo01Reflect {
    public static void main(String [] args) throws Exception {

        Properties properties = new Properties();

        InputStream in = Demo01Reflect.class.getClassLoader().getResourceAsStream("pro.properties");
        properties.load(in);
        //System.out.println(properties);

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class<?> aClass = Class.forName(className);

        Object o = aClass.newInstance();

        Method method = aClass.getMethod(methodName);

        method.invoke(o);
    }
}

```

## 第四章 注解

### 1.注解的介绍

```java
1.引用数据类型：
		类 	数组 	接口 	枚举 	注解
1.jdk1.5版本的新特性	->一个引用数据类型和类，接口，枚举是同一个层次的

	引用数据类型:类	数组	接口	枚举	注解
2.作用：
	说明：对代码进行说明，生成doc文档(API文档）
	检查:检查代码是否符合条件@Override(会用)@FunctionalInterface
	分析：对代码进行分析，起到了代替配置文件的作用（会用）
3.JDK中的注解：
	@override->检测此方法是否为重写方法
		jdk1.5版本，支持父类的方法重写
		jdk1.6版本，支持接口的方法重写
	@Deprecated->方法已经过时，不推荐使用
				调用方法的时候，方法上会有横线，但是能用
	@Suppresswarnings->消除警告@Suppresswarnings("al1")
```

### 2.注解的定义以及属性的定义格式

```java
大家需要知道的是，咱们这里说的注解属性，其实本质上是抽象方法，但是我们按照属性来理解，好理解，因为到时候使用注解的时候，需要用 = 为其赋值
1.定义:
	public @interface注解名{
		
	}
2.定义属性：增强注解的作用
	数据类型	属性名()->此属性没有默认值，需要在使用注解的时候为其赋值
	数据类型	属性名()	default	值->此属性有默认值，如果有需要，还可以二次赋值
3.注解中能定义什么类型的属性呢？
	a.8种基本类型
	b.String类型，class类型，枚举类型，注解类型
	c.以及以上类型的一维数组
```

```java
public @interface Book {
    //书名
    String name();
    //作者
    String[] authors();
    //价格
    int price();
    //库存
    int quantity() default 100;
    
}
```

### 3.注解的使用

```
1.注解的使用：
说白了就是为注解中的属性赋值
2.使用位置上：
在类上使用，方法上使用，成员变量上使用，局部变量上使用，参数位置使用等
3.使用格式：
a.@注解名(属性名=值，属性名=值...)
b.如果属性中有数组：
@注解名(属性名={元素1,元素2..})
```



```java
public @interface Book {
    //书名
    String name();
    //作者
    String[] authors();
    //价格
    int price();
    //库存
    int quantity() default 100;
    
}
```

```java
@Book(name="红楼梦",authors = {"11","22"},price = 100,quantity = 10)
public class BookShelf {

}
```

> 注解注意事项：
> 1.空注解可以直接使用->空注解就是注解中没有任何的属性
> 2.不同的位置可以使用一样的注解，但是同样的位置不能使用一样的注解
> 3.使用注解时，如果此注解中有属性，注解中的属性一定要赋值，如果有多个属性，用，隔开
> 如果注解中的属性有数组，使用
> 4.如果注解中的属性值有默认值，那么我们不必要写，也不用重新赋值，反之必须写上
> 5.如果注解中只有一个属性，并且属性名叫value，那么使用注解的时候，属性名不用写，直接写值
> （包括单个类型，还包括数组）

### 4.注解解析的方法-->AnnotatedElement接口

```java
注解的解析：说白了就是将注解中的属性值获取出来
1.注解解析涉及到的接口:AnnotatedElement接口
	实现类: Accessibleobject, class, Constructor, Executable, Field, Method, Package,Parameter
	
2.解析思路：先判断指定位置上有没有使用指定的注解，如果有，获取指定的注解，获取注解中的属性值

	a.boolean	isAnnotationPresent
	(class<? extends Annotation> annotationclass)->判断指定位置上有没有指定的注解
	比如:判断Bookshelf上有没有Book注解
		class bookshelf = Bookshelf.class
		bookshelf.isAnnotationPresent(Book.class)
		
b.getAnnotation (class <T> annotationclass)->获取指定的注解，岖回值类型为获取的注解类型
	比如:获取BookShelf上的Book注解
		class bookshelf = Bookshelf.class
		boolean result 
		= bookshelf.isAnnotationPresent(Book.class)
		如果result为true,证明Bookshelf上有Book注解，那就获取
		Book book = bookshelf.getAnnotation(Book.class)
```

```java
public class Test01 {
    public static void main(String[] args) {
        Class<BookShelf> bookShelfClass = BookShelf.class;
        //判断是否有book注解
        boolean b 
           = bookShelfClass.isAnnotationPresent(Book.class);
        System.out.println(b);
        if (b){
            //获取book注解
            Book book 
               = bookShelfClass.getAnnotation(Book.class);
            System.out.println(book.name());
            System.out.println(Arrays.toString(book.authors()));
            System.out.println(book.price());
            System.out.println(book.quantity());
        }
    }
}
```

> 上述代码解析失败，原因可能是Book注解为加载进内存

## 第五章 元注解

```java
1.概述注解就是管理注解的注解
3.怎么使用：
a.@Target:控制注解的使用位置
	属性:ElementType[]valueO;
			ElementType是一个枚举，里面的成员可以类名直接调用
			ElementType中的成员：
		TYPE：控制注解能使用在类上
		FIELD：控制注解能使用在属性上
		METHOD:控制注解能使用在方法上
		PARAMETER:控制注解能使用在参数上
		CONSTRUCTOR:控制注解能使用在构造上
		LOCAL_VARIABLE:控制注解能使用在局部变量上
		
b.@Retention:控制注解的生命周期(加载位置)
	属性:RetentionPolicyvalueO;
		RetentionPolicy是一个枚举，里面的成员可以类名直接调用
		RetentionPolicy中的成员:
			SOURCE:控制注解能在源码中出现->默认
			CLASS:控制注解能在class文件中出现
			RUNTIME：控制注解能在内存中出现
```

```java
package com.learn.f_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
    //书名
    String name();
    //作者
    String[] authors();
    //价格
    int price();
    //库存
    int quantity() default 100;

}

```



## 第六章 枚举

### 1.类名直接调用

```java
1.概述：五大引用数据类型：
类	数组	接口	注解	枚举
2.定义:
	public enum枚举类名{
	
	}
	所有的枚举类父类都是Enum
3.定义枚举值：
a.枚举值特点：都是static final，但是定义的时候不要写出来，写出来报错
	写完所有的枚举值之后，最后加个;
	枚举值名字要大写->开发习惯
	
b.使用：类名直接调用
4.构造和成员变量
        都是private类型
```

```java
public enum State {
    //相当于State WEIFUKUAN=new State();new了一个本类对象
    WEIFUKUAN("未付款"),
    YIFUKUAN("已付款"),
    WEIFAHUO("未发货"),
    YIFAHUO("已发货");

    private String name;
    private State(String name) {
        this.name=name;
    }

    String getName(){
        return name;
    }
}
```



```java
public class Demo01Enum {
    public static void main(String[] args) {
        State weifahuo = State.WEIFAHUO;
        System.out.println(weifahuo.getName());
    }
}
```

### 2.枚举的方法_Enum

```
toString -->
values[] -->返回所有枚举值
valueOf(String str) -->将String转变为枚举值
```



```java
public class Demo01Enum {
    public static void main(String[] args) {
        State weifahuo = State.WEIFAHUO;
        System.out.println(weifahuo.getName());

        System.out.println("===========================");
        String yifahuo = State.YIFUKUAN.toString();
        System.out.println(yifahuo);

        System.out.println("===========================");
        State[] values = State.values();
        for (State value : values) {
            System.out.println(value.getName());
        }

        System.out.println("===========================");
        State s=State.valueOf("YIFUKUAN");
        System.out.println(s);
    }
}
```



# Re-Learn

## 一. 面向对象编程

### 1. 面向对象基础

#### 1)包

Java内建的`package`机制是为了避免`class`命名冲突；

JDK的核心类使用`java.lang`包，编译器会自动导入；

JDK的其它常用类定义在`java.util.*`，`java.math.*`，`java.text.*`，……；

包名推荐使用倒置的域名，例如`org.apache`。

package 表示当前文件名(当前文件路径),包命名要准确,包没有父子关系

import 用来导入其他的包,引用其他的类

#### 2)作用域

如果不确定是否需要`public`，就不声明为`public`，即尽可能少地暴露对外的字段和方法。

把方法定义为`package`权限有助于测试，因为测试类和被测试类只要位于同一个`package`，测试代码就可以访问被测试类的`package`权限方法。

一个`.java`文件只能包含一个`public`类，但可以包含多个非`public`类。如果有`public`类，文件名必须和`public`类的名字相同。

Java内建的访问权限包括`public`、`protected`、`private`和`package`权限；

Java在方法内部定义的变量是局部变量，局部变量的作用域从变量声明开始，到一个块结束；

`final`修饰符不是访问权限，它可以修饰`class`、`field`和`method`；

#### 3)内部类

Java的内部类可分为Inner Class、Anonymous Class和Static Nested Class三种；

Inner Class和Anonymous Class本质上是相同的，都必须依附于Outer Class的实例，即隐含地持有`Outer.this`实例，并拥有Outer Class的`private`访问权限；

Static Nested Class是独立类，但拥有Outer Class的`private`访问权限。

### 2. Java核心类

#### 1)字符串和编码

Java字符串`String`是不可变对象；

字符串操作不改变原字符串内容，而是返回新字符串；

常用的字符串操作：提取子串、查找、替换、大小写转换等；

Java使用Unicode编码表示`String`和`char`；

转换编码就是将`String`和`byte[]`转换，需要指定编码；

转换为`byte[]`时，始终优先考虑`UTF-8`编码。

#### 2)StringBuilder

`StringBuilder`是可变对象，用来高效拼接字符串；

`StringBuilder`可以支持链式操作，实现链式操作的关键是返回实例本身；

`StringBuffer`是`StringBuilder`的线程安全版本，现在很少使用。

#### 3)包装类型

Java核心库提供的包装类型可以把基本类型包装为`class`；

自动装箱和自动拆箱都是在编译期完成的（JDK>=1.5）；

装箱和拆箱会影响执行效率，且拆箱时可能发生`NullPointerException`；

包装类型的比较必须使用`equals()`；

整数和浮点数的包装类型都继承自`Number`；

包装类型提供了大量实用方法。

#### 4)JavaBean

JavaBean是一种符合命名规范的`class`，它通过`getter`和`setter`来定义属性；

属性是一种通用的叫法，并非Java语法规定；

可以利用IDE快速生成`getter`和`setter`；

使用`Introspector.getBeanInfo()`可以获取属性列表。

#### 5)枚举类

Java使用`enum`定义枚举类型，它被编译器编译为`final class Xxx extends Enum { … }`；

通过`name()`获取常量定义的字符串，注意不要使用`toString()`；

通过`ordinal()`返回常量定义的顺序（无实质意义）；

可以为`enum`编写构造方法、字段和方法

`enum`的构造方法要声明为`private`，字段强烈建议声明为`final`；

`enum`适合用在`switch`语句中。

使用`String`、`Integer`等类型的时候，这些类型都是不变类，一个不变类具有以下特点：

1. 定义class时使用`final`，无法派生子类；
2. 每个字段使用`final`，保证创建实例后无法修改任何字段。

#### 6)记录类

从Java 14开始，提供新的`record`关键字，可以非常方便地定义Data Class：

除了用`final`修饰class以及每个字段外，编译器还自动为我们创建了构造方法，和字段名同名的方法，以及覆写`toString()`、`equals()`和`hashCode()`方法。

换句话说，使用`record`关键字，可以一行写出一个不变类。

- 使用`record`定义的是不变类；
- 可以编写Compact Constructor对参数进行验证；
- 可以定义静态方法。

## 二. 异常处理

#### 1)Java的异常

Java使用异常来表示错误，并通过`try ... catch`捕获异常；

Java的异常是`class`，并且从`Throwable`继承；

`Error`是无需捕获的严重错误，`Exception`是应该捕获的可处理的错误；

`RuntimeException`无需强制捕获，非`RuntimeException`（Checked Exception）需强制捕获，或者用`throws`声明；

不推荐捕获了异常但不进行任何处理。

只要是方法声明的Checked Exception，不在调用层捕获，也必须在更高的调用层捕获。所有未捕获的异常，最终也必须在`main()`方法中捕获，不会出现漏写`try`的情况。这是由编译器保证的。`main()`方法也是最后捕获`Exception`的机会

#### 2)捕获异常

在Java中，凡是可能抛出异常的语句，都可以用`try ... catch`捕获。把可能发生异常的语句放在`try { ... }`中，然后使用`catch`捕获对应的`Exception`及其子类。多个`catch`语句只有一个能被执行。

捕获异常时，多个`catch`语句的匹配顺序非常重要，子类必须放在前面；

`finally`语句保证了有无异常都会执行，它是可选的；

一个`catch`语句也可以匹配多个非继承关系的异常。

#### 3)抛出异常

调用`printStackTrace()`可以打印异常的传播栈，对于调试非常有用；

捕获异常并再次抛出新的异常时，应该持有原始异常信息；

通常不要在`finally`中抛出异常。如果在`finally`中抛出异常，应该原始异常加入到原有异常中。调用方可通过`Throwable.getSuppressed()`获取所有添加的`Suppressed Exception`

#### 4)NPE

`NullPointerException`是Java代码常见的逻辑错误，应当早暴露，早修复；

可以启用Java 14的增强异常信息来查看`NullPointerException`的详细错误信息。

#### 5)JDK Logging

那什么是日志？日志就是Logging，它的目的是为了取代`System.out.println()`

从严重到普通分为7个级别(默认为INFO级别,INFO以下的级别不会被打印出来)

SEVERE >WARNING >INFO >CONFIG >FINE >FINER >FINEST



日志是为了替代`System.out.println()`，可以定义格式，重定向到文件等；

日志可以存档，便于追踪问题；

日志记录可以按级别分类，便于打开或关闭某些级别；

可以根据配置文件调整日志，无需修改代码；

Java标准库提供了`java.util.logging`来实现日志功能。

#### 6)Commons Logging

Commons Logging的特色是，它可以挂接不同的日志系统，并通过配置文件指定挂接的日志系统。默认情况下，Commons Loggin自动搜索并使用Log4j（Log4j是另一个流行的日志系统），如果没有找到Log4j，再使用JDK Logging。

有6个级别

FATAL> ERROR> WARNING> INFO(默认级别)> DEBUG> TRACE

```java
使用Commons Logging只需要和两个类打交道，并且只有两步：

第一步，通过`LogFactory`获取`Log`类的实例； 
第二步，使用`Log`实例的方法打日志
    
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(Main.class);
        log.info("start...");
        log.warn("end.");
    }
}

```

Commons Logging是一个第三方库,需要下载之后使用;下载解压之后将文件commons-logging-1.3.5.jar 右键添加到库,然后直接import导入使用即可

## 三. 反射

#### 1)Class类

JVM为每个加载的`class`及`interface`创建了对应的`Class`实例来保存`class`及`interface`的所有信息；

获取一个`class`对应的`Class`实例后，就可以获取该`class`的所有信息；

通过Class实例获取`class`信息的方法称为反射（Reflection）；

JVM总是动态加载`class`，并不是一次性把所有用到的class全部加载到内存，而是第一次需要用到class时才加载,也可以在运行期根据条件来控制加载class。
