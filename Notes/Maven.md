# Maven

## 1.Maven简介

Maven是一款为Java项目管理构建、依赖管理的工具，使用Maven可以自动化构建、测试、打包和发布项目，提高开发效率和质量。

1. 依赖管理:
Maven可以管理项目的依赖，包括自动下载所需依赖库、自动下载依赖需要的依赖并且保证版本没有冲突、
依赖版本管理等。通过Maven，我们可以方便地维护项目所依赖的外部库，避免版本冲突和转换错误等，而
我们仅仅需要编写配置即可。
2. 构建管理：
项目构建是指将源代码、配置文件、资源文件等转化为能够运行或部署的应用程序或库的过程
Maven可以管理项目的编译、测试、打包、部署等构建过程。通过实现标准的构建生命周期，Maven可以确
保每一个构建过程都遵循同样的规则和最佳实践。[同时，Maven的插件机制也使得开发者可以对构建过程进
行扩展和定制。主动触发构建，只需要简单的命令操作即可。

## 2.Maven的安装

安装Scoop之后,在PowerShell窗口输入以下命令即可自动安装Maven最新版本:

该命令来源于Maven官网安装(Installation)教程:

```bash
scoop install main/maven
```

使用此命令安装完成后,Scoop通常会自动将软件的可执行文件添加到Path环境变量中,具体路径是Scoop目录下的shims目录。

## 3.Maven的配置

打开maven下conf目录下的文件settings.xml,添加以下代码:

> 注意添加配置文件代码要么在开始标签下,要么在结束标签前,不能放在中间注释代码中

3.1配置本地仓库

此代码为添加本地仓库的地址

```xml
<localRepository>D:\maven-repository</localRepository>
```

![image-20250522102326122](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522102326122.png)

3.2配置国内镜像

找到<mirrors>标签,添加以下代码配置中央仓库镜像源

```xml
    <mirror>
      <id>alimaven</id>
      <name>aliyun maven</name>
      <url>
     	http://maven.aliyun.com/nexus/content/groups/public/
      </url>
      <mirrorOf>central</mirrorOf>
    </mirror>
```

![image-20250522102855663](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522102855663.png)

3.3配置jdk17版本项目构建

在 <profiles>标签下添加以下代码:

添加的为jdk编译版本

```xml
  <profile>
    <id>jdk-17</id>
  <activation>
    <activeByDefault>true</activeByDefault>
    <jdk>17</jdk>
  </activation>
  <properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
    <maven.compiler.compilerVersion>
        17
     </maven.compiler.compilerVersion>
  </properties>
  </profile>
```

3.4.在IDEA中配置本地Maven软件

打开项目File->settings->Build,Execution,Deployment->Build Tools->Maven

配置Maven home path,User settings file,Local reprository文件地址

![image-20250522104322850](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522104322850.png)

## 4.Maven的GAVP属性

Maven相较于其他的工程项目还多了一组gavp属性来对每个项目在maven仓库中做一个标识,方便于后期项目之间的互相引用依赖等等

GAV遵循以下规则:

1)GroupId格式:com.{公司/BU}.业务线.[子业务线],最多4级。

2)ArtifactID格式：产品线名-模块名。语义不重复不遗漏，先到仓库中心去查证一下。

3)Version版本号格式推荐:主版本号.次版本号.修订号。

Packing为可选项,idea根据packaging值,识别maven项目类型,为自动识别。

## 5.在IDEA创建Maven工程

5.1 构建Maven Java SE工程

新建模块，把Build system选择为Maven选择相应的jdk版本，配置好GA属性，即创建成功一个Maven项目

![image-20250522111558061](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522111558061.png)

创建成功后maven项目结构：

<img src="C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522111821462.png" alt="image-20250522111821462" style="zoom: 80%;" />

右边工具栏会出现一个Maven选项，打开后即可看到该工程项目的Maven配置：

<img src="C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522112005690.png" alt="image-20250522112005690" style="zoom:80%;" />

在pom.xml文件中各部分代码说明，以及添加新的jar包和依赖

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <!--指的是当前pom的版本-->
    <modelVersion>4.0.0</modelVersion>

    <!-- maven工程的坐标-->
    <groupId>com.xu.maven</groupId>
    <artifactId>maven_java</artifactId>
    <version>1.0-SNAPSHOT</version>
    <!-- maven工程的打包方式-->
    <packaging>jar</packaging>

    <properties>
        <maven.compiler.source>23</maven.compiler.source>
        <maven.compiler.target>23</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <!--在<dependencies>标签中新建子标签即为添加新的依赖-->
    <dependencies>
    <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.9.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

</project>
```

5.2 构建Maven Java Web工程（方式一）

新建maven_web项目->pom.xml文件添加<packaging>war</packaging>代码

->Project Settings->创建web.xml->添加到src\main\webapp目录下

![1](C:\Users\xu\Pictures\1.png)

添加完成后，会出现如下结果，

![image-20250522165157721](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522165157721.png)

5.3 构建Maven Java Web工程（方式二）

安装插件JBLJavaToWeb ->新建module->右键找到JBLJavaToWeb，点击即可创建在src\main路径下的webapp文件夹

![image-20250522165655531](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522165655531.png)

![image-20250522165758956](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522165758956.png)

## 6.Maven工程项目结构

Maven是一个强大的构建工具，他提供一种标准化的项目结构

创建的Maven项目结构要符合以下的结构标准

![image-20250522170544240](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522170544240.png)

## 7.Maven项目构建

7.1 命令方式项目构建

打开控制台窗口，进入C:\Users\xu\IdeaProjects\maven_test\maven_java路径下

即存在pom.xml文件的目录下，命令必须在有pom.xml文件中执行

![image-20250523102950314](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250523102950314.png)

使用mvn命令行，进行项目构建

![image-20250522174218290](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522174218290.png)

| 命令        | 描述                        |      |
| ----------- | --------------------------- | ---- |
| mvn site    | 生成站点                    |      |
| mvn test    | 执行测试源码                |      |
| mvn compile | 编译项目，生成target文件    |      |
| mvn package | 打包项目，生成jar或war文件  |      |
| mvn clean   | 清理编译或打包后的项目结构  |      |
| mvn install | 打包后上传到本地maven仓库   |      |
| mvn deploy  | 只打包，上传到maven私服仓库 |      |

> 注意使用mvn test 命令进行测试的测试类，测试类的类名命名要规范
>
> 要使用 功能名+Test或者Test+功能名
>
> 例如：MavenTest或者TestMaven

> 使用命令mvn package生成的jar包和war包中是不会生成测试代码的

> 打包（package）和安装（install）的区别：
>
> 打包是将工程打成jar或者war文件，保存在target目录下
>
> 安装是将当前的工程所生产的jar或者war文件，安装到本地仓库，会按照坐标保存到指定位置，安装到本地仓库之后，本地的其他工程才能添加此依赖并进行使用

通过坐标寻找本地仓库中jar包：找到Maven-repository目录->寻找安装的依赖的名字->一步步目录往下寻找到jar包

7.2 IDEA中可视化项目构建

打开右侧Maven，在Lifecycle中有一系列命令，双击即可执行命令，此方法与使用cmd命令行效果一致

![image-20250523110031855](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250523110031855.png)

在Plugins目录下的一系列插件也可以打开双击使用，效果与上面一致

![image-20250523110223134](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250523110223134.png)

> 注意Lifecycle和cmd命令行构建Maven项目，都是依赖Plugins中的插件