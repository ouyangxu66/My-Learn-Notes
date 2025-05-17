package module18.Collection.Demo1Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo1Collection {
    public static void main(String[] args) {
        Collection<String> collection= new ArrayList<>();
        collection.add("a");//boolean add(E e)给定的元素添加到当前集合中
        collection.add("b");
        System.out.println(collection);
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("ggbond");
        collection1.add("happy");
        collection1.addAll(collection);//boolean addAll() 将一个集合添加到另外一个集合
        System.out.println(collection1);
        collection1.clear();// void clear()清除所有元素
        collection.contains("a");// boolean contains(Object o)判断是否包含指定元素
        System.out.println(collection1.isEmpty());//boolean isEmpty()判断集合元素是否为空
        collection.remove("a");//boolean remove(Object o)移除集合中的指定元素
        System.out.println(collection);
        System.out.println(collection.size());//int size()集合中的元素个数
        Object[] objects = collection.toArray();//Object[] toArray()把集合中的元素添加到数组
        System.out.println(Arrays.toString(objects));
    }
}
