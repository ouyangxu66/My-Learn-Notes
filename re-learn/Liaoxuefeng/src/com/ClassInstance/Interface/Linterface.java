package com.ClassInstance.Interface;

/*Java的接口（interface）定义了纯抽象规范，一个类可以实现多个接口；

接口也是数据类型，适用于向上转型和向下转型；

接口的所有方法都是抽象方法，接口不能定义实例字段；

接口可以定义default方法（JDK>=1.8）。*/
public class Linterface {
    public static void main(String[] args) {
    interfaceStudent s1=new interfaceStudent("hhh",11);
    s1.run();
        System.out.println(interfaceStudent.getNumber());
    interfaceTeacher t1=new interfaceTeacher();
    t1.run();
    }
}
interface interfacePerson{
    String name();
    int age();
    //因为interface是一个纯抽象类，所以它不能定义实例字段。但是，interface是可以有静态字段的，并且静态字段必须为final类型
    //实际上，因为interface的字段只能是public static final类型，所以我们可以把这些修饰符都去掉
    public static final int Max=100;
    default void run(){
        System.out.println("run");
    };
}
class interfaceStudent implements interfacePerson{
    private String name;
    private int age;
    private static int number=0;
    public interfaceStudent(String name, int age) {
        this.name = name;
        this.age = age;
        number++;
    }
    public static int getNumber(){
        return number;
    }
    @Override
    public String name() {
        return name;
    }
    @Override
    public int age() {
        return age;
    }

}
class interfaceTeacher implements interfacePerson{
    private String name;
    private int age;
    @Override
    public String name() {
        return name;
    }
    @Override
    public int age() {
        return age;
    }
    @Override
    public void run(){
        System.out.println(name + "run" + age);
    }
}

