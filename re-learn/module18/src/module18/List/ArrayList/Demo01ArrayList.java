package module18.List.ArrayList;

import java.util.ArrayList;

public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        //boolean add(E e)->将元素添加到集合中(尾部),add方法一定能添加成功,所以不用Boolean接收返回值
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list.size());//获取集合元素个数
        System.out.println(list.get(1));//根据索引获取元素
        System.out.println(list);
        list.add(2,"帅哥");//void add(int index,E elment) 在指定位置添加元素
        System.out.println(list);
        list.remove("帅哥");//boolean remove(Object o) 删除指定的元素
        System.out.println(list);
        System.out.println(list.remove(2)); //String remove(int index)删除指定索引的元素,返回的是被删除索引上的元素
        list.set(1,"gg");//将索引上的元素修改成后面的element元素
    }
}
