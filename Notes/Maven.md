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

### 3.1配置本地仓库

此代码为添加本地仓库的地址

```xml
<localRepository>D:\maven-repository</localRepository>
```

![image-20250522102326122](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522102326122.png)

### 3.2配置国内镜像

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

### 3.3配置jdk17版本项目构建

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

### 3.4.在IDEA中配置本地Maven软件

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

### 5.1 构建Maven Java SE工程

新建模块，把Build system选择为Maven选择相应的jdk版本，配置好GA属性，即创建成功一个Maven项目

![image-20250522111558061](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522111558061.png)

创建成功后maven项目结构：

<img src="C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522111821462.png" alt="image-20250522111821462" style="zoom: 80%;" />

右边工具栏会出现一个Maven选项，打开后即可看到该工程项目的Maven配置：

<img src="C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522112005690.png" alt="image-20250522112005690" style="zoom:80%;" />

在pom.xml文件中各部分代码说明，以及添加新的jar包和依赖

> 每次添加完新的jar包和依赖之后都要重新Reload All Maven Projects

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

### 5.2 构建Maven Java Web工程（方式一）

新建maven_web项目->pom.xml文件添加<packaging>war</packaging>代码

->Project Settings->创建web.xml->添加到src\main\webapp目录下

![1](C:\Users\xu\Pictures\1.png)

添加完成后，会出现如下结果，

![image-20250522165157721](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522165157721.png)

### 5.3 构建Maven Java Web工程（方式二）

安装插件JBLJavaToWeb ->新建module->右键找到JBLJavaToWeb，点击即可创建在src\main路径下的webapp文件夹

![image-20250522165655531](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522165655531.png)

![image-20250522165758956](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522165758956.png)

## 6.Maven工程项目结构

Maven是一个强大的构建工具，他提供一种标准化的项目结构

创建的Maven项目结构要符合以下的结构标准

![image-20250522170544240](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250522170544240.png)

## 7.Maven项目构建

### 7.1 命令方式项目构建

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

### 7.2 IDEA中可视化项目构建

打开右侧Maven，在Lifecycle中有一系列命令，双击即可执行命令，此方法与使用cmd命令行效果一致

![image-20250523110031855](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250523110031855.png)

在Plugins目录下的一系列插件也可以打开双击使用，效果与上面一致

![image-20250523110223134](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250523110223134.png)

> 注意Lifecycle和cmd命令行构建Maven项目，都是依赖Plugins中的插件
>
> 生命周期->包含若干命令->包含若干插件。使用周期命令构建,简化构建过程,最终进行构建的都是插件

## 8.Maven工程依赖管理

### 8.1 Maven工程依赖管理配置

通过设置坐标的依赖范围(scope),可以设置对应的jar包的作用范围:编译环境,测试环境(test)和运行环境(打包)

| 依赖范围     | 描述                                                         |
| ------------ | :----------------------------------------------------------- |
| import       | 导入依赖范围，该依赖范围只能与dependencyManagement元素配合使用，其功能是将目标pom.xml 文件中 dependencyManagement的配置导入合并到当前pom.xml的dependencyManagement 中。 |
| **compile**  | 编译依赖范围，scope元素的缺省值。使用此依赖范围的Maven依赖，对于三种classpath均有效，即该Maven依赖在上述三种classpath均会被引入。例如，log4j在编译、测试、运行过程都是必须的。 |
| **test**     | 测试依赖范围。使用此依赖范围的Maven依赖，只对测试classpath有效。例如，Junit依赖只有在测试阶段才需要。 |
| **provided** | 已提供依赖范围。即是最终版本由服务器来提供。使用比依赖范围的Maven依赖，只对编译classpath和测试classpath有效。例如，servlet-api依赖对于编译、测试阶段而言是需要的，但是运行阶段，由于外部容器已经提供，故不需要Maven重复引入该依赖 |
| runtime      | 运行时依赖范围。使用此依赖范围的Maven依赖，只对测试classpath、运行classpath有效。例如，JDBC驱动实现依赖，其在编译时只需JDK提供的JDBC接口即可，只有测试、运行阶段才需要实现了JDBC接口的驱动。 |
| system       | 系统依赖范围，其效果与provided的依赖范围一致。其用于添加非Maven仓库的本地依赖，通过依赖元素dependency中的systemPath元素指定本地依赖的路径。鉴于使用其会导致项目的可移植性降低，一般不推荐使用。 |



```xml
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.9.2</version>
            <!--依赖范围-->
            <scope>test</scope>
        </dependency>
```

**在pom.xml文件中的<properties>便签中自定义属性,通常是自定义版本号属性**

原因:通常依赖的坐标是不能改变的,依赖范围<scope>也不建议改变,所以能改变的只有是版本号,而且当依赖和jar包越来越多的时候,每次修改版本号找起来就很麻烦,所以我们可以直接在<properties>中修改自定义版本号就行。

```xml
    <properties>
        <maven.compiler.source>23</maven.compiler.source>
        <maven.compiler.target>23</maven.compiler.target>
        <project.build.sourceEncoding>
        	UTF-8
        </project.build.sourceEncoding>
        <!--自定义版本号-->
        <spring.versioin>6.2.6</spring.versioin>
    </properties>
```

**使用<build>标签构建配置**

在<build>标签中可以,指定打包名称,指定打包文件以及自定义插件

```xml
    <build>
        <!--自定义打包名称(不要忘了后缀.jar或者.war)-->
        <finalName>maven_web-1.0.war</finalName>
    </build>
```

### 8.2 Maven工程依赖下载失败错误解决

在使用Maven构建项目时，可能会发生依赖项下载错误的情况，主要原因有以下几种：
	1.下载依赖时出现网络故障或仓库服务器启机等原因，导致无法连接至Maven仓库，从而无法下载依赖。

​	2.依赖项的版本号或配置文件中的版本号错误，或者依赖项没有正确定义，导致Maven下载的依赖项与实际需要的不一致，从而引发错误。

> 不要随意的修改版本号和仓库坐标

​	3.本地Maven仓库或缓存被污染或损坏，导致Maven无法正确地使用现有的依赖项。

解决方案：
	1.检查网络连接和Maven仓库服务器状态。

​	2.确保依赖项的版本号与项目对应的版本号匹配，并检查POM文件中的依赖项是否正确。

​	3.清除本地Maven仓库缓存(lastUpdated文件)，因为只要存在lastupdated缓存文件，刷新也不会重新下载。本地仓库中，根据依赖的gav属性依次向下查找文件夹，最终删除内部的文件，刷新重新下载即可！

> 如果下载了但是下载失败了,会在本地Maven仓库生成缓存文件,系统在运行Maven项目时会检测是否存在缓存文件,如果存在缓存文件则不会重新下载,需要先手动清除本地仓库的缓存文件之后再下载

## 9. Maven依赖传递和依赖冲突

### 9.1 依赖的传递性

maven_A中添加了maven_B依赖,maven_B中添加了Druid依赖,在maven_A项目中可以使用Druid依赖,无需再额外在maven_A中添加Druid依赖,在左侧Maven工具栏中也有体现--maven_A中没有添加Druid依赖但是却有Druid依赖

<img src="C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250523172226735.png" alt="image-20250523172226735" style="zoom:80%;" />



**传递的原则:**

在A依赖B，B依赖C的前提下，C是否能够传递到A，取决于B依赖C时使用的依赖范围以及配置:

1. B依赖C时使用compile范围：可以传递

2. B依赖C时使用test或provided范围：不能传递，所以需要这样的jar包时，就必须在需要的地方明确配置依赖才可以。

3. B依赖C时，若配置了以下标签<optional>，则不能传递

   ```xml
    <dependency>
      <groupId>com.alibaba</groupId>
      <artifactId>druid-parent</artifactId>
      <version>1.2.23</version>
      <optional>true</optional>
   </dependency>
   ```

**依赖传递终止:**

- 非compile范围进行依赖传递

- 使用optional配置进行终止

- 依赖冲突(传递的依赖已经存在)

### 9.2 依赖的冲突特性

**解决冲突依赖的方案:**

1)系统自动解决方案

路径最短者优先原则(第一原则)

- A-E-F-B-X(version 1.0)

- A-E-X(version 1.1)

- 

则依赖于X(version 1.1)

依赖路径相同的情况下,则"先声明优先"(第二原则):

- A-E-X(version 1.0)

- A-E-X(version 1.1)

  在<dependencies></dependencies>中,路径相同的,会优先选择

![image-20250523174448990](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250523174448990.png)

2)手动解决方案

在依赖方<dependency>标签中添加<exclusion>标签来排除依赖

```xml
        <dependency>
            <groupId>com.xu.maven</groupId>
            <artifactId>maven_B</artifactId>
            <version>1.0-SNAPSHOT</version>
            <!--依赖排除-->
            <exclusions>
                <exclusion>
                    <groupId>com.alibaba</groupId>
                    <artifactId>druid</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
```

添加之后maven_A中无法使用<exclusion>中的依赖

![image-20250523180003139](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250523180003139.png)

## 10. Maven工程中继承和聚合关系

### 10.1 Maven工程中的继承

在父工程下新建子工程,子工程自动继承父工程的配置信息,子工程的pom.xml文件自动生成以下代码即父工程坐标

```xml
    <modelVersion>4.0.0</modelVersion>
    <!--设置父工程的坐标-->
    <parent>
        <groupId>com.xu.maven</groupId>
        <artifactId>maven_parent</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>

    <artifactId>maven_son</artifactId>

```

**如果父工程使用的是<dependencies>,则子工程即可无条件继承父工程下的依赖:**

在父工程下添加jar包和依赖,子工程中无需再添加,即可使用父工程下添加的jar包和依赖,如下图所示:

> 只要是父工程中的依赖,子工程都可以无条件的继承,不管使用范围scope是什么

![](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250523182919372.png)

**如果父工程使用的是<dependencyManagement>则子工程需要手动选择所需的依赖:**

```xml
<dependencies>
    <dependency>
        <groupId>com.alibaba</groupId>
        <artifactId>druid</artifactId>
    </dependency>
</dependencies>
```

手动添加所需要的依赖,只需要GA属性,可以不用添加版本号,这样整个项目的版本号就可以统一由父工程控制

![image-20250523183948898](C:\Users\xu\AppData\Roaming\Typora\typora-user-images\image-20250523183948898.png)