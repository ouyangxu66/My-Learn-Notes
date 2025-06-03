# MySQL

关系型数据库管理系统

后台服务应用程序,使用结构化查询语句(SQL语句)进行交互

## 一. MySQL 基础配置

### 1. 启动MySQL服务

启动MySQL服务,使用**管理员权限**启动cmd窗口

**(必须使用管理员权限,不然无法启动服务程序)**

使用命令行启动和关闭MySQL服务,默认的MySQL服务名为MySQL80

**(注意一定要区分服务名大小写,不然会启动失败)**

![image-20250525110403672](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250525110403672.png)

### 2. 配置MySQL环境变量

如果在cmd窗口输入mysql命令显示以下报错信息--mysql不是内部或外部命令,则是缺少了MySQL环境变量

![image-20250525111559049](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250525111559049.png)

添加环境变量

打开高级系统设置,设置环境变量,进行如下两步操作

| 环境变量名 | 操作 |        环境变量值         |
| ---------- | ---- | :-----------------------: |
| MYSQL_HOME | 新建 | D:\MySQL\MySQL Server 8.0 |
| Path       | 编辑 |     %MYSQL_HOMEE%\bin     |

添加完成后,再次输入mysql出现如下报错,则添加成功

![image-20250525112047451](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250525112047451.png)

### 3. 连接MySQL服务

打开cmd命令窗口,连接mysql服务命令

```mysql
mysql -u <username> -p <password> -h <hostname <databasename>

-u <username>:用于指定你要连接的MySQL数据库的用户名。
-p<rassword>：表示密码，后面紧跟着密码，中间没有空格。如果你不希望在命令行中显示密码，可以不指定密码，直接-p，然后在提示下手动输入密码。
-h<hostname>：用于指定MySQL服务器的主机名或者IP地址。如果MySQL在本地运行，可以用localhost。
-P<port>：用于指定连接MySQL服务器的端口号，默认情况下是3306。
<databasename>：是你要连接的数据库的名称。连接后会默认使用这个数据库。
```

其他SQL基础命令

```
SQL注释:
单行注释:#注释内容
单行注释:-- 注释内容(其中-- 后面的空格必须要有)
多行注释:/*注释内容*/

查看版本和推出连接:
select version();

exit ->退出连接可以不用加分号;
```



### 4.下载安装可视化界面

Oracle官方提供可视化软件MySQl WorkBench (全英文)-->出的比较迟用的少

我们使用SQLyog community版 ->有中文,但是免费版本有阉割

SQLyog community版如下图

![image-20250525131339705](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250525131339705.png)

### 5.SQL命名规定和规范

前置1: 标识符命名规定:

- 数据库名、表名不得超过30个字符，变量名限制为29个
- 必须只能包含A-Z,a-z,0-9,_共63个字符，而且不能数字开头
- 数据库名、表名、字段名等对象名中间不能包含空格
- 同一个MySQL软件中，数据库不能同名；同一个库中，表不能重名；同一个表中，字段不能重名
- 必须保证你的字段没有和保留字、数据库系统或常用方法冲突。如果坚持使用，请在SQL语句中使用`（着重号）引起来

前置2: 标识符命名规范（基于阿里巴巴规范手册）

- 注释应该清晰、简洁地解释SQL语句的意图、功能和影响。
- 库、表、列名应该使用小写字母，并使用下划线）或驼峰命名法。
- 库、表、字段名应该简洁明了，具有描述性，反映其所存储数据的含义。
- 库名应于对应的程序名一致例如：程序名为EcommercePlatform数据库名命名为ecommerce_platform"
- 表命名最好是遵循“业务名称_表”的作用例如：alipay_task、force_project、trade_config
- 列名应遵循“表实体_属性”的作用例如:product_name或productName

## 二.  数据定义语言DDL

DDL 用于定义和管理数据库的结构,包括库、表、索引、视图等数据库对象的创建修改和删除。

DDL不涉及对数据的操作,而是关注数据库的结构和元数据(容器)

```
DDL关键字

CREATE：用于创建数据库、表、索引、视图等。

ALTER：用于修改数据库对象的结构，如修改表结构、添加列、删除列等。

DROP：用于删除数据库对象，如删除表、删除索引等。
```

### 1.库管理

#### 1.1 创建库

创建库，我们必须指定库名，可能指定字符集或者排序方式！
方式1：创建数据库，使用默认的字符集和排序方式

```mysql
CREATE DATABASE 数据库名;
```

方式2：判断并创建默认字符集库（推荐）

```mysql
CREATE DATABASE IF NOT EXISTS 数据库名;
```

方式3：创建指定字符集库或者排序方式

```mysql
CREATE	DATABASE 据库名 CHARACTER SET 字符集;
CREATE	DATABASE 数据库名 COLLATE 排序规则;
```

方式4：创建指定字符集和排序规则库

```mysql
CREATE DATABASE	数据库名	CHARACTER SET 字符集 COLLATE 排序规则;
```

查看字符集和排序方式

```mysql
SHOW VARIABLE LIKE 'character_set_database';
SHOW VARIABLE LIKE 'collation_database';
```

> 字符集和排序方式要对应:
>
> utf8 对应 utf8 的排序方式
>
> utfmb4 对应 utf8mb4_0900_as_ci(不区分大小写) / utf8mb4_0900_as_cs (区分大小写)的排序方式

练习测试:

指定字符集指定排序方式

```mysql
CREATE DATABASE IF NOT EXISTS ddl_dl CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs;
```

#### 1.2 查看和使用库

使用和查看库，包括展示和切换库等命令
方式1：查看当前所有库

```sql
SHOW DATABASES ;
```

方式2：查看当前使用库

```mysql
SELECT DATABASE();
```

方式3：查看指定库下所有表

```mysql
SHOW TABLES FROM 数据库名;
```

方式4:查看创建库的信息

```mysql
SHOW CREATE DATABASE 数据库名;
```

方式5：切换库/选中库

```mysql
USE 数据库名;
```

> 注意：要操作表格和数据之前必须先说明是对哪个数据库进行操作，先use库

#### 1.3 修改库

方式1：修改库编码字符集

```mysql
ALTER DATABASE 数据库名 CHARACTER SET字符集; #修改字符集gbk utf8
ALTER DATABASE 数据库名 COLLATE 排序方式; #修改排序方式
ALTER DATABASE 数据库名 CHARACTER SET 字符集 COLLATE 排序方式; #修改字符集和排序方式
```

> 注意:
> DATABASE不能改名。一些可视化工具可以改名，它是建新库，把所有表复制到新库，再删旧库完成的

#### 1.4 删除库

**删除数据库前要三思**
方式1：直接删除库

```mysql
DROP DATABASE 数据库名;
```

方式2：判断并删除库（推荐)

```mysql
DROP DATABASE IF EXISTS 数据库名；
```

### 2.表管理

#### 2.1 创建表

```mysql
CREATE TABLE 表名(
	列名 类型[列可选约束],
	列名 类型[列可选约束] [COMMENT'列可选注释'],
	列名 类型[列可选约束] [COMMENT'列可选注释'],
	列名 类型[列可选约束][COMMENT'列可选注释'],
	列名 类型[列可选约束] [COMMENT'列可选注释']
	[列可选约束]
)[表可选约束][COMMENT'表可选注释'];
```

```mysql
CREATE TABLE [IF NOT EXISTS] 表名(
	列名 类型[列可选约束],
	列名 类型[列可选约束] [COMMENT'列可选注释'],
	列名 类型[列可选约束] [COMMENT'列可选注释'],
	列名 类型[列可选约束] [COMMENT'列可选注释'],
	列名 类型[列可选约束][COMMENT'列可选注释']
	[列可选约束]
)[表可选约束][COMMENT'表可选注释'];
```

> 表名、类名和类型必须填写,其他可选;注释不是必须的,但是很有必要;列之间用逗号'  ,  '隔开。

#### 2.2 表中的数据类型

**确定数据值范围，选择符合范围且存储空间占有最小类型**

**不确定数据值范围，选择选择范围较大类型，避免值超范围异常**

MySQL支持多种数据类型,包括整数、浮点数、定点数、字符串、日期时间等。

```mysql
CREATE TABLE IF NOT EXISTS student(
	NAME VARCHAR(10),
	sex CHAR,
	age TINYINT UNSIGNED,
	high DECIMAL(5,2) COMMENT '身高单位为cm',
	birthday DATE COMMENT '生日为年月日',
	register_time DATETIME DEFAULT CURRENT_TIMESTAMP 
    COMMENT '注册时间',
	updatetime DATETIME DEFAULT CURRENT_TIMESTAMP 
    ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' 
);
```

**整数:**

MySQL支持SQL标准整数类型INTEGER (或INT）和 SMALLINT。作为标准的扩展,MySQL还支持整数类型TINYINT 、MEDIUMINT 和BIGINT 。下表显示了每种整数类型所需的存储和范围。

| 类型      | 存储字节 | 范围(有符号)           | 范围(无符号) |
| --------- | -------- | ---------------------- | ------------ |
| TINYINT   | 1        | -128~127               | 0~255        |
| SAMLLINT  | 2        | -32768~32767           | 0~65535      |
| MEDIUMINT | 3        | -8388608~8388607       | 0~16777215   |
| INT       | 4        | -2147483648~2147483647 | 0~4294967295 |
| BIGINT    | 8        | -2^63~(2^63)-1         | (0~2^64)-1   |

> 整数类型都可以添加unsigned修饰符,修饰符添加到类型之后,添加以后对应列数据的范围从0开始

**浮点数:**

MySQL使用4个字节表示单精度值,使用八个字节表示双精度值

| 类型        | 存储字节 | M(小数+整数位数) | D(小数位)   |
| ----------- | -------- | ---------------- | ----------- |
| FLOAT(M,D)  | 4        | M最大值为24      | D最大值为8  |
| DOUBLE(M,D) | 8        | M最大值为53      | D最大值为30 |

> 注意:从 MySQL 8.0.17 开始. 不推荐使用非标准 FLOAT(M.D) 语法DOUBLE(M,D)，未来版本中可能删除对它的支持。
>
> 浮点数支持unsigned修饰，添加修饰，只保留正值范围负值不会迁移到正值！

**定点数:**

DECIMAL类型存储精确的数值数据值。

| 类型         | 存储字节 | M(小数+整数位数) | D(小数位)   |
| ------------ | -------- | ---------------- | ----------- |
| DECIMAL(M,D) | 动态计算 | M最大值为65      | D最大值为30 |

> 注意：DECIMAL类型的存储空间是可变的.它的存储大小受DECIMAL数据类型定义时指定的精度和规模影响。
>
> 如果D小数位数为0,DECIMAL则值不包含小数点或小数部分。

**字符串:**

CHAR和VARCHAR类型都可以存储比较短的字符串

| 字符串(文本) | 特点     | 长度 | 长度范围(字符)             | 存储空间**(utf8mb4)** |
| ------------ | -------- | ---- | -------------------------- | --------------------- |
| CHAR(M)      | 固定长度 | M    | 0<=M<=255                  | M*4个字节             |
| VARCHAR(M)   | 可变长度 | M    | MySQL一行数据最多65535字节 | (M*4+1)               |

> 注意：CHAR(M)类型一般需要预先定义字符串长度。如果不指定（M)，则表示长度默认是1个字符。
>
> 保存数据的实际长度比CHAR类型声明的长度小，则会在右侧填充空格以达到指定的长度。
>
> 当MySQL检索CHAR类型的数据时，CHAR类型的字段会去除尾部的空格。

VARCHAR在声明的时候必须添加m限制 VARCHAR(M),VARCHAR类型中识别空格,插入空格,读取也是空格

**时间类型:**

用于表示时态值的日期和时间数据类型为DATE、TIME、DATETIME、TIMESTAMP和YEAR。每种类型都有一个有效值范围，换一种思路，可以理解时间类型就是特殊格式的字符串

| 类型      | 名称     | 字节 | 日期格式            |
| --------- | -------- | ---- | ------------------- |
| YEAR      | 年       | 1    | YYYY或YY            |
| TIME      | 时间     | 3    | HH:MM:SS            |
| DATE      | 日期     | 3    | YYYY-MM-DD          |
| DATETIME  | 日期时间 | 8    | YYYY-MM-DD HH:MM:SS |
| TIMESTAMP | 日期时间 | 4    | YYYY-MM-DD HH:MM:SS |

```sql
CREATE TABLE t2(
	NAME VARCHAR(20),
	register_time DATETIME DEFAULT CURRENT_TIMESTAMP
    COMMENT '插入自动维护时间',
	update_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '插入自动维护时间,且修改数据自动更新时间'
	
);
```

#### 2.3 修改表

修改表中的列(字段)

```mysql
#修改表，添加一列[可以指定X字段前或者后]
ALTER TABLE 表名 ADD 字段名 字段类型 [FIRST | AFTER 字段名];
#修改表，修改列名
ALTER TABLE 表名 CHANGE 原字段名 字段名 新字段类型 [FIRST | AFTER 字段名]；
#修改表，修改列类型
ALTER TABLE 表名 MODIFY 字段名 新字段类型 [FIRST | AFTER字段名]；
#修改表，除一列
ALTER TABLE 表名 DROP 字段名；
```

修改表名

```mysql
# 修改表名
ALTER TABLE 表名 RENAME [TO] 新表名;
```

删除数据表

删除表和表结构

```sql
DROP TABLE [IF EXISTS] 数据表1[,数据表2,数据表3,...,数据表n];
```

清空表数据

删除表数据,保留表结构

```sql
TRUNCATE TABLE 表名;
```

**删除和清空表数据命令都是无法回滚的!**

**综合练习**

```mysql
要求1：创建表格employees
要求2：将表employees的mobile字段修改到code字段后面。
要求3:将表employees的birth字段改名为birthday;
要求4:修改sex字段，数据类型为char(1)。
要求5：删除字段note;
要求6:增加字段名favoriate_activity,数据类型为varchar(100)；
要求7：将表employees的名称修改为employees_info

/*
	综合练习
*/
CREATE TABLE IF NOT EXISTS employees(
	emp_num INT(11),
	last_name VARCHAR(50),
	first_name VARCHAR(50),
	mobile VARCHAR(25),
	CODE INT,
	job_title VARCHAR(50),
	birth DATE,
	note VARCHAR(255),
	sex VARCHAR(5)
);

DROP TABLE employees;

ALTER TABLE employees MODIFY mobile VARCHAR(25) AFTER CODE;

ALTER TABLE employees CHANGE birth birthday DATE;

ALTER TABLE employees MODIFY sex CHAR(1) ;

ALTER TABLE employees DROP note;

ALTER TABLE employees ADD favoriate_activity VARCHAR(100);

ALTER TABLE employees RENAME employees_info;
```

## 三. 数据操纵语言DML

作用:插入、更新和删除数据,不影响表结构,但是会真正影响数据库数据。

数据操作最基本的单位是行

#### 1.插入数据

```sql
情况1：为表的一行所有字段（列）插入数据
INSERT INTO 表名 VALUES (value1,value2...);
```

值列表中需要为表的每一个字段指定值，并且值的顺序必须和数据表中字段定义时的顺序相同。

```sql
情况2:为表的一行指定字段（列）插入数据(推荐)
INSERT INTO 表名 (列名1.列名2….) VALUES (valueL.value2.….）;
```

值列表中需要为表名后指定的列指定值，并且值的顺序和类型必须和指定的列顺序相同。

```sql
情况3：同时插入多条记录
INSERT INTO 表名 VALUES (value1,value2………),(valueL,value2…);
或者
INSERT INTO 表名 (列名1.列名2……)VALUES(value1,value2.……)…,(value1,value2.…);
```

情况1、情况2都可以转成一次插入多表数据.只需要在values后面写多个(值1,值2...)即可

> 如果是添加默认值,则可以不用写这一个数据,系统自动导入默认值
>
> 如果需要的是空值则需要添加为 null

#### 2.修改数据

```sql
情况1：修改表中所有行数据（全表修改）
UPDATE table_name
SET columnl=value1,column2=value2,...,columnn=valuen
```

更新表中所有行的指定列数据。

```sql
情况2：修改表中符合条件行的数据（条件修改）
UPDATE table_name
SET column1=value1,...,columnn=valuen
[WHERE condition]
```

条件修改只是在后面添加where，where后面指定相关的条件即可。

#### 3.删除数据

不删除表的结构,大部分是条件删除

```sql
情况1：删除表中所有行数据（全表删除）
DELETE FROM table_name;

情况2:删除表中符合条件行的数据（条件删除)
DELETE FROM table_name [WHERE condition]；
```

## 四. 数据查询语句DQL

DQL不影响库表结构和原表中的数据，会**基于原标数据查询出一个虚拟表**。

分为单表查询和多表查询



![image-20250526141124345](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250526141124345.png)

### 1.基础SELECT语法(不指定条件)

```mysql
情况1：非表查询
SELECT 1;
SELECT 9/2;
SELECT VERSIONO:
```

类似Java控制台输出，直接输出结果。

```mysql
情况2：指定表
SELECT 列名1，列名2，列名3 FROM 表名：
或者
SELECT 表名.列名，表名.* FROM 表名;（如果有 * 通配符需要放在SELECT后的第一位）
```

指定表，查询表中的全部或者某些列。
列和列之问使用[，］分割，如果是全部列可以使用*替代

```mysql
情况3：查询列起别名
SELECT 列名1 as 别名，列名2，列名3 as 别名 FROM 表名；
或者
SELECT 列名1 别名，列名2，列名3 别名 FROM 表名；
```

查询列可以起别名，as 可以省略。
起别名的意义主要是简化列名或者对应后期Java数据属性等
如果别名想要区分大小写、可以添加双引号 例如："Name”

```mysql
情况4：去除重复行
SELECT DISTINCT 列名 [列名，列名] FROM 表名；
```

指定列值去重复行，可以指定单列或者多列，但是DISTINCT关键字只写一次且在前面。

```mysql
情况5:查询常数
SELECT'尚硅谷' as corporation，列名，列名┅FROM表名;
```

SELECT查询还可以对常数进行查询。就是在 SELECT查询结果中增加固定的常数列。
这列的取值是我们指定的，而不是从数据表中动态取出的。

> **NULL值参与运算时,做的任何运算结果都为NULL**
>
> ```
> 可以在可能为NULL的值加上
> IFNULL(列,为NULL时你给出的默认值)
> ```

### 2. 显示表结构和条件查询

```mysql
情况1：使用命令查看表结构
DESCRIBE employees;
或
DESC employees;


在没有可视化工具场景下可以查看表结构。
其中，各个字段的含义分别解释如下：
Field：表示字段名称。
Type:表示字段类型。
Null：表示该列是否可以存储NULL值。
Key：表示该列是否已编制索引。
			PRI表示该列是表主键的一部分;
			UNI表示该列是UNIQUE索引I的一部分；
			MUL表示在列中某个给定值允许出现多次。
Default:表示该列是否有默认值，如果有，那么值是多少。
Extra:表示可以获取的与给定列有关的附加信息，例如AUTO_INCREMENT等
```

过滤数据(条件查询)

```mysql
情况1：非全表，添加过滤条件
SELECT 字段1,字段2 FROM 表名
WHERE 过滤条件;
```

where添加以后，就不是全表查询,先过滤条件、符合，再返回指定列。

WHERE 的执行顺序优于 SELECT

### 3.运算符使用

#### 3.1 算术运算符

**%,MOD 模运算、* 乘法运算、+ - 加减运算、/ 浮点除法、DIV整数除法**

运算表达式可以应用在select列位置或者where条件后

**如果出现除以零的情况,通常不会报错,而是返回NULL**

#### 3.2 比较运算符

```mysql
> 大于 >=大于等于 < 小于 <= 小于等于 != <>不等于
```

```mysql
<=> NULL	安全等于运算符（非标准）
IS NULL 	NULL值测试
IS NOT 	NULL NOT NULL值测试
BETWEEN .. AND ...	值是否在值范围内
NOT BETWEEN...AND...	值是否不在值范围内
IN( ) 	值是否在一组值中
NOT IN( ) 	值是否不在一组值中
LIKE 	简单的模式匹配（模糊等于)
NOT LIKE 	否定简单的模式匹配
```

```mysql
情况1：等于对比
mysqI> SELECT 1= 0;->0
mysql>SELECT0'=0;->1
mysql>SELECT 0.0' = 0;->1
mysql>SELECT.01'= 0.01;->1
mysql>SELECT 1 <=> 1,NULL <=> NULL, 1<=>NULL; > 1, 1, 0
mysql>SELECT1 <=>1,NULLISNULL,1ISNULL;->1,1,0
mysql>SELECT 1= 1,NULL=NULL,1=NULL;->1,NULL,NULL
```

注意：<=>进行null在=的基础上，添加了null判断，但是他是`方言`推荐使用is null 或者 is not null。

```
情况2：不等于运算使用
mysql> SELECT '.01'<>"0.01';->1
mysql>SELECT.01<>"0.01';->0
mysql>SELECT 'zapp'<>'zapp';->1
```

注意：如果双方都是字符串，就按照字符串比较，不会转成数字比较值

```mysql
情况3：区间运算使用
#表达式 expr BETWEEN min AND max
#等效于表达式(min<= expr AND expr <=max)
mysql>SELECT 2 BETWEEN 1 AND 3,2 BETWEEN 3 and 1;-> 1,0
mysql>SELECT 1 BETWEEN 2 AND 3;>0
mysql>SELECT 'b'BETWEEN'a'AND'c; >1
mysql> SELECT 2 BETWEEN 2 AND '3';->1
```

注意：字符串就是按照asci编码排序
固定第一个是min值，第二个是max值，不会自动转化
有字符串和数字，会自动值转化

```mysql
情况4：组范围对比

expr IN (value...)

mysql>SELECT2 IN (0,3,5,7); >0
mysql>SELECT wefwf IN(wee",wefwf,weg');->1
mysql>SELECT(3,4)IN(1.2) (3.4):->1
mysql>SELECT (3,4) IN (1.2), (3,5); ->0
mysql>SELECT'a'NOT IN (a,b';c'), 1NOT IN (2,3); ->0,1
```

注意：not in用法和in一样，他只是不等于范围内

```mysql
情况5：简单匹配模式
LIKE运算符主要用来匹配字符串，通常用于模糊匹配，
如果满足条件则返回
1，否则返回0。如果给定的值或者匹配条件为NULL，
则返回结果为NULL。
LIKE运算符通常使用如下通配符：
“%”：匹配0个或多个字符。
”：只能匹配一个字符。
```

#### 3.3 逻辑运算符



将多个条件拼接到一起,最终生成一个结果

| 逻辑运算符 | 描述     |      |
| ---------- | -------- | ---- |
| AND,&&     | 逻辑且   |      |
| NOT,!      | 否定值   |      |
| OR,\|\|    | 逻辑或   |      |
| XOR        | 逻辑异或 |      |

注意:MySQL将任何非零,非NULL值计算为TRUE!

### 4.单行函数和多行函数 

SQL函数分为内置函数和自定义函数

自定义函数包括单行函数和多行函数

多行函数(对多行的某列操作函数,返回结果单一值)---聚合函数

单行函数(对某一行中某列操作函数,返回结果是单一值)---数字函数、日期函数、字符函数、流程函数、信息函数、时间函数

#### 4.1单行函数

**标蓝色的为常用的重点函数**

1)数值函数

![image-20250529164648720](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250529164648720.png)

2)字符串函数

**在MySQL中,字符串的位置是从1开始的**

![image-20250529164737777](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250529164737777.png)

3)时间函数



查看时间

![image-20250529165626460](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250529165626460.png)

![image-20250529165643463](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250529165643463.png)



计算时间

![image-20250529170855227](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250529170855227.png)  

**在DATA_ADD或者ADDDATE中的expr type可以为负值,当其为负值的时候查询的是给定日期之前的时间**,所以DATA_ADD和DATA_SUB只需要记住一个就行了

下面的ADDTIME和SUBTIME中也可以为负值,也只需记住一个就行

![image-20250529170903624](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250529170903624.png)



格式化时间

![image-20250529173619604](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250529173619604.png)

![image-20250529173711120](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250529173711120.png)

4）流程控制函数

IF（） IFNULL（）

![image-20250530104157427](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250530104157427.png)

CASE（）

![image-20250530104233731](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250530104233731.png)

#### 4.2 多行函数（聚合函数）

聚合函数作用与全部或者分组数据进行统计和计算，最终返回一条结果

![image-20250603100346998](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250603100346998.png)

> 聚合函数碰到null是如何处理的？
>
> 聚合函数是冷漠的不计数，不处理的



### 5. 高级查询处理

#### 5.1 分组查询

分组查询概念
先将数据行，按照某一或者多特性列进行分组，最后查询每组的特性，
分组查询的结果只能是分组特性列或者聚合函数！

```mysql
SELECT 分组列，分组列，聚合函数
FROM table
[WHERE condition]
[GROUP BY 分组列，分组列 ... HAVING 分组后条件]
```

**WHERE 在分组前对属性筛选，HAVING 在分组之后对属性筛选；**

**HAVING 必须在GROUP BY之后出现，而且分组后条件一般是聚合函数；**

**HAVING 可以使用SELECT后面查询到的列的名称，而WHERE不能复用SELECT列，WHERE筛选早于SELECT查询。**

#### 5.2 排序查询

排序查询概念
按照某一或者多特性列进行数据排序，不会影响结果条数，只是改变
结果排序！![image-20250603105038762](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250603105038762.png)

例如：商品按照价格排序等等

```mysql
SELECT 列,列,函数
FROM table
[WHERE condition]
[ORDER BY 排序列 ASC|DESC，排序列 ASC|DESC···]
```

ASC为正序（默认值），DESC为倒序
多列排序，只有第一列相同，第二列才会生效以此类推···

#### 5.3 数据切割(分页查询)

数据切割（分页查询）概念
**将查询结果进行分页切割，按照指定的区域一段一段的进行展示！**

![image-20250603105010956](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250603105010956.png)例如：商品分页展示、查询工资前三的员工等

```mysql
SELECT 列，列,函数
FROM table
[WHERE condition]
[LIMIT[位置偏移量，] 行数]
```

位置偏移量：可选参数，位置偏移量，不写默认是O，代表不偏移;
行数：指示返回的记录条数。

**LIMIT必须放在整个SELECT语句的最后**

**分页公式推算:已知page(当前页面从1开始) size(每一页的容量)**

**LIMIT (page-1)*size,size**

#### 5.4 SELECT语句执行过程

关键字的书写顺序不能颠倒:

**SELECT ... FROM ... WHERE ... GROUP BY ... HAVING ... ORDER BY ... LIMIT ...**

SQL语句的执行顺序(MYSQL版本不同可能执行顺序会有不同):

**FROM->WHERE->GROUP BY->HAVING->SELECT->ORDER BY->LIMIT**

**选表->过滤->分组->分组后过滤->选择->排序->切割**

标准SQL中不能在WHERE使用别名,但是在MYSQL 8.0及以后的版本中优化之后是可以在WHERE中使用别名的

## 五. 数据库约束

约束的分类

![image-20250603144549113](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250603144549113.png)

### 1. 域(列)级约束

#### 1.1 非空约束

作用:限定某个字段/列的值不允许为空

关键字: NOT NULL

特点:

默认: 所有类型列默认都可以为null，包括数字类型。
列上添加：非空约束只能添加到列上！
多次使用：一个表中可以有很多列进行非空限定！
空值判定：空字符串不是null,O也不是null!

添加

```mysql
建表时添加
CREATE TABLE 表名称(
字段名数据类型，
字段名数据类型 NOT NULL
字段名数据类型 NOT NULL
);
```

建表后修改

```mysql
alter table 表名称 modify 字段名 数据类型 not null;
```

删除

```mysql
alter table 表名称 modify 字段名 数据类型 NULL;
或
alter table 表名称 modify 字段名 数据类型；
#不加默认允许为 null,
```

#### 1.2 默认值约束

作用:限定某个字段/某列的添加默认值

关键字: DEFAULT 默认值

特点
位置约定: 默认值约束不能添加到唯一或者主键上，其他列都可以。
生效时机: **当插入数据时，没有显示赋值，赋予默认值;如果主动插入null则不会赋予默认值。**
细节特点: 添加约束时，default 默认值，默认值对应正确数据类型！

添加
建表时添加

```mysql
create table 表名称(
字段名 数据类型 default 默认值，
字段名 名数据类型 not null default 默认值);
```

建表后修改

```mysql
alter table 表名称 modify 字段名 数据类型 default 默认值；
#如果这个字段原来有非空约束，你还保留非空约束，那么在加默认值约束时，还得保留非空约束，否则非空约束就被删除了
alter table 表名称 modify 字段名 数据类型 default 默认值 not null;
```

删除

```mysql
alter table 表名称 modify 字段名 数据类型；
#删除默认值约束，也不保留非空约束
alter table 表名称 modify 字段名 数据类型 not null;；
#删除默认值约束，保留非空约束
```

#### 1.3 检查约束

作用:检查某个字段的值是否符合xx要求,一般指的是值的范围

关键字:CHECK(限制表达式)

特点
新特性:	5.7版本不支持check约束，8+版本才支持check约束。
万能约束:	check（表达式），可以自定义表达式，变成任何约束！
**不推荐：不推荐使用check约束，进行数据检查，建议程序级限制！**

添加
建表时添加

```mysql
create table 表名称(
字段名 数据类型,
check (表达式）,#check约束属于表级别，不用添加到列后
字段名 数据类型 not null default 默认值);
```

建表后修改

```mysql
alter table 表名 add constraint 约束名 CHECK(表达式)
# 约束名不能重复
```

删除

```mysql
alter table 表名 drop constraint 约束名;
```

#### 1.4  拓展（查询表约束）：

```mysql
SELECT *
FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS
WHERE TABLE_SCHEMA = 'your_databaSe_name'
AND TABLE_NAME= 'your_table_name';
```

### 2. 实体(行)级约束

#### 2.1 唯一约束

作用:限定某个字段或者组合字段,在表中的数据唯一

关键字:UNIQUE

特点
约束数量:同一个表可以有多个唯一约束。
空值处理:唯一性约束允许列值为空。
约束名称：在创建唯一约束的时候，如果不给唯一约束命名，就默认和列名相同。

添加
建表时添加

```mysql
create table 表名称(
字段名 数据类型 unique,
字段名 数据类型 unique key);


create table 表名称(
字段名 数据类型，
[constraint 约束名] unique key(字段名));
```

建表后修改

```mysql
ALTER TABLE table_name
ADD CONSTRAINT constraint_name UNIQUE(列名,列名);
```

删除
#查看约束

```mysql
SELECT *
FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS
WHERE TABLE_SCHEMA='库名'
AND TABLE_NAME='表名';
```

删除约束

```mysql
ALTER TABLE table_name
DROP CONSTRAINT constraint_name;
```

#### 2.2 主键约束

**什么是主键:**

在任何情况下,要保证表中行数据中至少有一列是不重复的!那么永远不重复的,且不为null的列,我们可以用来唯一标识行数据,就可以称为:主键。

推荐使用自定义主键,人为创建一列专门用来保证数据不重复。

一张表只能有一个主键,主键可以由一个或者多个列复合而成;主键可以为任意类型,只要唯一且不重复即可。

**主键约束:**

针对主键列的数据约束和限制,确保主键列不会出现错误数据(保证唯一且不为空)

没有主键约束的主键也是主键!但是数据的安全性得不到保障。

添加
建表时添加

```mysql
create table 表名称(
字段名 数据类型 primary key,#列级模式
);
create table 表名称(
字段名 数据类型，
[constraint 约束名] primary key(字段名)#表级模式
);
```

建表后修改

```mysql
ALTER TABLE 表名称 ADD PRIMARY KEY(字段列表);
#	字段列表可以是一个字段，也可以是多个字段
```

删除

```mysql
ALTER TABLE table_name DROP primary key;
```

#### 2.3 自增长约束

作用:限定某个整数类型字段,插入数据不显示维护,值自动增长!

关键字:AUTO_INCREMENT

特点
添加位置:	只能添加到键列（主键，唯一），普通列不可以。
约束数量:	每一张表只能有一个自增长约束。
数据类型:	增加自增长约束的列必须是整数类型,每次增长都是从当前最大值基础					  上增长。
特殊情况:	如果给自增长字段设置0或者null，列数据会自增长赋值，如果设置的
					  是非零和非空数据，那么将真实设置值！

添加
建表时添加

```mysql
create table 表名称(
字段名 数据类型 primary key auto_increment,
);

create table 表名称(
字段名 数据类型 unique key auto_increment
);
```

建表后修改

```mysql
alter table 表名称 modify 字段名 数据类 auto_increment;
```

删除

```mysql
alter table 表名称 modify 字段名 数据类型 auto_increment;
#给这个字段增加自增约束
alter table 表名称 modify 字段名 数据类型；
#去掉 auto_increment 相当于删除
```

### 3.引用(外键)约束

#### 3.1 外键约束

外键就是子表中的一列,这一列的值,引用主表的主键的列的值,外键的值应该保证和主键的值范围一致

![image-20250603162107071](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250603162107071.png)

添加

```mysql
建表时添加
create table主表名称(
字段1数据类型primary key
);

#子表中添加主外键约束

create table 子表名称(
字段1 数据类型 primary key.
[CONSTRAINT<外键约束名称>]FOREIGN KEY(外键)
references 主表名(主键) [on update xx][on delete xx]
);
```

建表后修改

```mysql
alter table 从表名 add[CONSTRAINT 约束名] FOREIGN
KEY(从表的字段) references 主表名（被引用字段）[on
update xx][on delete xx];
```

删除

```mysql
（1）第一步先查看约束名和删除外键约束
SELECT * FROM information_schema.table_constraints WHERE table_name=‘表名称‘; #查看某个表的约束名
ALTER TABLE 从表名 DROP FOREIGN KEY 外键约束名；

（2）第二步查看索引名和删除索引。（注意，只能手动删除）
SHOW INDEX FROM 从表名称；#查看某个表的索引名
ALTER TABLE 从表名 DROP INDEX 索引名;
```

#### 3.2 级联动作

级联:对主表的数据进行修改或者删除时,如何影响子表中的数据

![image-20250603164717253](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250603164717253.png)

最好采用:**ON UPDATE CASCADE ON DELETE RESTRICT**的方式

### 4.约束常见的面试题

1.建和不建外键约束有什么区别?

```
答：建外键约束，你的操作（创建表、删除表、添加、修改、删除）会受到限制，从语法层面受到限制。

例如：
在员工表中不可能添加一个员工信息，它的部门的值在部门表中找不到。不建外键约束，你的操作（创建表、删除表、添加、修改、删除）不受限制，要保证数据的引用完整性，只能依靠程序员的自觉，或者是在Java程序中进行限定。例如：在员工表中，可以添加一个员工的信息，它的部门指定为个完全不存在的部门。
```

2.建和不建外键约束对查询有什么影响?

```
答：没有
添加约束可能影响查询速度和效率！
```

3.表中字段为什么不想要null的值?

```mysql
答:(1)不好比较。null是一种特殊值，比较时只能用专门的is null和is not null来比较。碰到运算符，通常返回null。
(2)效率不高。影响提高索引效果。因此，我们往往在建表时not null default ''或default 0
```

4.带AUTO_INCREMENT约束的字段值是从1开始的吗?

```
答：在MySQL中，默认AUTO_INCREMENT的初始值是1，每新增一条记录，字段值自动加1。设置自增属性（AUTO_INCREMENT)的时候，还可以指定第一条插入记录的自增字段的值，这样新插入的记录的自增字段值从初始值开始递增，如在表中插入第一条记录，同时指定id值为5，则以后插入的记录的id值就会从6开始往上增加。添加主键约束时，往往需要设置字段自动增加属性。

除此之外，可以在创建表的时候，指定自增长起始值，
```

5.是不是每个表都可以任意选择存储引擎?

```
答：外键约束(FOREIGNKEY)不能跨引擎使用。
MySQL支持多种存储引擎，每一个表都可以指定一个不同的存储引擎，需要注意的是：外键约束是用来保证数据的参照完整性的，如果表之间需要关联外键，却指定了不同的存储引擎，那么这些表之间是不能创建外键约束的。所以说，存储引擎的选择也不完全是随意的。
```

6.请问你会不会创建数据库时给你的表添加完备的约束呢？

```
答：不会，一般情况下，我们只会添加一些单表的约束（实体约束和域约束）！
不会添加外键和级联操作！
根据阿里开发规范，【强制】不得使用外键与级联，一切外键概念必须在应用层解决。
(概念解释）学生表中的student_id是主键，那么成绩表中的student_id则为外键。如果更新学生表中的student_id，同时触发成绩表中的student_id更新，即为级联更新。外键与级联更新适用于单机低并发，不适合分布式、高并发集群；级联更新是强阻塞，存在数据库更新风暴的风险；外键影响数据库的插入速度
```

## 六. 数据库多表关系&维护

拆表存储数据:根据数据特征分表存储,提高查询效率;防止数据冗余,不同的数据类型存储在不同的表中。

### 1. 多(两)表(数据)关系:

- 一对一:
  两个表之间的每行数据都是唯一的对应关系！
  例如:一个员工与其唯一的员工档案。
- 一对多:
  一个表关联另一个表多行数据，反方向只关联一行数据！
  例如:一个作者与多个文章的关系。
- 多对多:
  两个表中的记录都可以与对方表中的多个记录相关联！
  例如:学生和课程之间的关系一个学生可以选修多门课程，而一门课程也可以由多个学生选修。

> 查询多对多关系时,必须创建一个中间表关系,再进行查询

#### 1.1 一对一关系

同一个外键只能出现一次

![image-20250603172824185](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250603172824185.png)

#### 1.2 一对多关系

同一个外键可以出现多次

![image-20250603172927652](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250603172927652.png)

#### 1.3 多对多关系

![image-20250603173152057](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250603173152057.png)

 
