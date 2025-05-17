package module18.Collection.Itrator;

import java.util.ArrayList;
import java.util.Iterator;

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
